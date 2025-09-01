#include <grpcpp/grpcpp.h>
#include "gridfs.grpc.pb.h"
#include <iostream>

using grpc::Channel;
using grpc::ClientContext;
using grpc::Status;

using gridfs::NameNode;
using gridfs::GetPlanRequest;
using gridfs::GetPlanResponse;

class NameNodeClient {
    std::unique_ptr<NameNode::Stub> stub_;

public:
    explicit NameNodeClient(std::shared_ptr<Channel> channel)
        : stub_(NameNode::NewStub(channel)) {}

    void GetPlan(const std::string& filename, uint64_t filesize) {
        GetPlanRequest req;
        req.set_filename(filename);
        req.set_filesize(filesize);

        GetPlanResponse resp;
        ClientContext ctx;

        Status status = stub_->GetPlan(&ctx, req, &resp);
        if (!status.ok()) {
            std::cerr << "❌ GetPlan failed: "
                      << status.error_message() << std::endl;
            return;
        }

        for (const auto& block : resp.assignments()) {
            std::cout << "📦 Block " << block.block_id()
                      << " → " << block.host() << ":" << block.data_port()
                      << " size=" << block.size() << std::endl;
        }
    }
};

int main() {
    NameNodeClient client(
        grpc::CreateChannel("localhost:50051",
                            grpc::InsecureChannelCredentials()));

    client.GetPlan("test.txt", 12345);
    return 0;
}
