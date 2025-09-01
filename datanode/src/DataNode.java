import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import gridfs.NameNodeGrpc;
import gridfs.RegisterRequest;
import gridfs.RegisterResponse;

public class DataNode {
    public static void main(String[] args) {
        String nnHost = "127.0.0.1";  // IP del NameNode
        int nnPort = 50051;           // puerto gRPC del NameNode

        // Crear canal hacia NameNode
        ManagedChannel channel = ManagedChannelBuilder
            .forAddress(nnHost, nnPort)
            .usePlaintext()
            .build();

        // Crear stub (cliente gRPC)
        NameNodeGrpc.NameNodeBlockingStub stub = NameNodeGrpc.newBlockingStub(channel);

        // Registrar este DataNode
        RegisterRequest req = RegisterRequest.newBuilder()
            .setHost("127.0.0.1")   // host propio
            .setDataPort(6001)      // puerto TCP donde servirá bloques (lo harás después)
            .setCapacity(1024 * 1024 * 1024) // 1 GB
            .build();

        RegisterResponse resp = stub.registerDataNode(req);

        if (resp.getSuccess()) {
            System.out.println("✅ Registered in NameNode with ID: " + resp.getDatanodeId());
        } else {
            System.out.println("❌ Failed to register DataNode");
        }

        channel.shutdown();
    }
}
