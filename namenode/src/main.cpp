#include <grpcpp/grpcpp.h>
#include "gridfs.grpc.pb.h"
#include <iostream>
#include <unordered_map>

using grpc::Server;
using grpc::ServerBuilder;
using grpc::ServerContext;
using grpc::Status;

using gridfs::NameNode;
using gridfs::RegisterRequest;
using gridfs::RegisterResponse;
using gridfs::GetPlanRequest;
using gridfs::GetPlanResponse;
using gridfs::BlockAssignment;

struct DataNodeInfo {
    std::string host;
    uint32_t port;
    uint64_t capacity;
};

class NameNodeServiceImpl final : public NameNode::Service {
    std::unordered_map<std::string, DataNodeInfo> datanodes_;
    int dn_counter_ = 0;

    Status RegisterDataNode(ServerContext* ctx,
                            const RegisterRequest* req,
                            RegisterResponse* resp) override {
        std::string id = "dn-" + std::to_string(++dn_counter_);
        datanodes_[id] = {req->host(), req->data_port(), req->capacity()};
        resp->set_datanode_id(id);
        resp->set_success(true);

        std::cout << "✅ Registered DataNode " << id
                  << " at " << req->host() << ":" << req->data_port()
                  << " capacity=" << req->capacity() << std::endl;

        return Status::OK;
    }

    Status GetPlan(ServerContext* ctx,
                   const GetPlanRequest* req,
                   GetPlanResponse* resp) override {
        if (datanodes_.empty()) {
            std::cerr << "❌ No DataNodes available!" << std::endl;
            return Status::CANCELLED;
        }

        // Asignar el archivo completo al primer DataNode (demo simple)
        auto it = datanodes_.begin();
        BlockAssignment* assign = resp->add_assignments();
        assign->set_block_id("block-1");
        assign->set_host(it->second.host);
        assign->set_data_port(it->second.port);
        assign->set_size(req->filesize());

        std::cout << "📦 Assigned file '" << req->filename()
                  << "' to DataNode " << it->first << std::endl;

        return Status::OK;
    }
};

void RunServer() {
    std::string address("0.0.0.0:50051");
    NameNodeServiceImpl service;

    ServerBuilder builder;
    builder.AddListeningPort(address, grpc::InsecureServerCredentials());
    builder.RegisterService(&service);

    std::unique_ptr<Server> server(builder.BuildAndStart());
    std::cout << "🚀 NameNode listening on " << address << std::endl;
    server->Wait();
}

int main() {
    RunServer();
    return 0;
}
