package gridfs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Servicio NameNode
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.1)",
    comments = "Source: gridfs.proto")
public final class NameNodeGrpc {

  private NameNodeGrpc() {}

  public static final String SERVICE_NAME = "gridfs.NameNode";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gridfs.Gridfs.RegisterRequest,
      gridfs.Gridfs.RegisterResponse> getRegisterDataNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterDataNode",
      requestType = gridfs.Gridfs.RegisterRequest.class,
      responseType = gridfs.Gridfs.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gridfs.Gridfs.RegisterRequest,
      gridfs.Gridfs.RegisterResponse> getRegisterDataNodeMethod() {
    io.grpc.MethodDescriptor<gridfs.Gridfs.RegisterRequest, gridfs.Gridfs.RegisterResponse> getRegisterDataNodeMethod;
    if ((getRegisterDataNodeMethod = NameNodeGrpc.getRegisterDataNodeMethod) == null) {
      synchronized (NameNodeGrpc.class) {
        if ((getRegisterDataNodeMethod = NameNodeGrpc.getRegisterDataNodeMethod) == null) {
          NameNodeGrpc.getRegisterDataNodeMethod = getRegisterDataNodeMethod =
              io.grpc.MethodDescriptor.<gridfs.Gridfs.RegisterRequest, gridfs.Gridfs.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterDataNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gridfs.Gridfs.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gridfs.Gridfs.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NameNodeMethodDescriptorSupplier("RegisterDataNode"))
              .build();
        }
      }
    }
    return getRegisterDataNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gridfs.Gridfs.GetPlanRequest,
      gridfs.Gridfs.GetPlanResponse> getGetPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlan",
      requestType = gridfs.Gridfs.GetPlanRequest.class,
      responseType = gridfs.Gridfs.GetPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gridfs.Gridfs.GetPlanRequest,
      gridfs.Gridfs.GetPlanResponse> getGetPlanMethod() {
    io.grpc.MethodDescriptor<gridfs.Gridfs.GetPlanRequest, gridfs.Gridfs.GetPlanResponse> getGetPlanMethod;
    if ((getGetPlanMethod = NameNodeGrpc.getGetPlanMethod) == null) {
      synchronized (NameNodeGrpc.class) {
        if ((getGetPlanMethod = NameNodeGrpc.getGetPlanMethod) == null) {
          NameNodeGrpc.getGetPlanMethod = getGetPlanMethod =
              io.grpc.MethodDescriptor.<gridfs.Gridfs.GetPlanRequest, gridfs.Gridfs.GetPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gridfs.Gridfs.GetPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gridfs.Gridfs.GetPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NameNodeMethodDescriptorSupplier("GetPlan"))
              .build();
        }
      }
    }
    return getGetPlanMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NameNodeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameNodeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameNodeStub>() {
        @java.lang.Override
        public NameNodeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameNodeStub(channel, callOptions);
        }
      };
    return NameNodeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NameNodeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameNodeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameNodeBlockingStub>() {
        @java.lang.Override
        public NameNodeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameNodeBlockingStub(channel, callOptions);
        }
      };
    return NameNodeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NameNodeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameNodeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameNodeFutureStub>() {
        @java.lang.Override
        public NameNodeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameNodeFutureStub(channel, callOptions);
        }
      };
    return NameNodeFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Servicio NameNode
   * </pre>
   */
  public static abstract class NameNodeImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerDataNode(gridfs.Gridfs.RegisterRequest request,
        io.grpc.stub.StreamObserver<gridfs.Gridfs.RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterDataNodeMethod(), responseObserver);
    }

    /**
     */
    public void getPlan(gridfs.Gridfs.GetPlanRequest request,
        io.grpc.stub.StreamObserver<gridfs.Gridfs.GetPlanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlanMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterDataNodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gridfs.Gridfs.RegisterRequest,
                gridfs.Gridfs.RegisterResponse>(
                  this, METHODID_REGISTER_DATA_NODE)))
          .addMethod(
            getGetPlanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gridfs.Gridfs.GetPlanRequest,
                gridfs.Gridfs.GetPlanResponse>(
                  this, METHODID_GET_PLAN)))
          .build();
    }
  }

  /**
   * <pre>
   * Servicio NameNode
   * </pre>
   */
  public static final class NameNodeStub extends io.grpc.stub.AbstractAsyncStub<NameNodeStub> {
    private NameNodeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameNodeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameNodeStub(channel, callOptions);
    }

    /**
     */
    public void registerDataNode(gridfs.Gridfs.RegisterRequest request,
        io.grpc.stub.StreamObserver<gridfs.Gridfs.RegisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterDataNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlan(gridfs.Gridfs.GetPlanRequest request,
        io.grpc.stub.StreamObserver<gridfs.Gridfs.GetPlanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlanMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Servicio NameNode
   * </pre>
   */
  public static final class NameNodeBlockingStub extends io.grpc.stub.AbstractBlockingStub<NameNodeBlockingStub> {
    private NameNodeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameNodeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameNodeBlockingStub(channel, callOptions);
    }

    /**
     */
    public gridfs.Gridfs.RegisterResponse registerDataNode(gridfs.Gridfs.RegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterDataNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public gridfs.Gridfs.GetPlanResponse getPlan(gridfs.Gridfs.GetPlanRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlanMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Servicio NameNode
   * </pre>
   */
  public static final class NameNodeFutureStub extends io.grpc.stub.AbstractFutureStub<NameNodeFutureStub> {
    private NameNodeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameNodeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameNodeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gridfs.Gridfs.RegisterResponse> registerDataNode(
        gridfs.Gridfs.RegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterDataNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gridfs.Gridfs.GetPlanResponse> getPlan(
        gridfs.Gridfs.GetPlanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlanMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_DATA_NODE = 0;
  private static final int METHODID_GET_PLAN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NameNodeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NameNodeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_DATA_NODE:
          serviceImpl.registerDataNode((gridfs.Gridfs.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<gridfs.Gridfs.RegisterResponse>) responseObserver);
          break;
        case METHODID_GET_PLAN:
          serviceImpl.getPlan((gridfs.Gridfs.GetPlanRequest) request,
              (io.grpc.stub.StreamObserver<gridfs.Gridfs.GetPlanResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NameNodeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NameNodeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gridfs.Gridfs.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NameNode");
    }
  }

  private static final class NameNodeFileDescriptorSupplier
      extends NameNodeBaseDescriptorSupplier {
    NameNodeFileDescriptorSupplier() {}
  }

  private static final class NameNodeMethodDescriptorSupplier
      extends NameNodeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NameNodeMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NameNodeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NameNodeFileDescriptorSupplier())
              .addMethod(getRegisterDataNodeMethod())
              .addMethod(getGetPlanMethod())
              .build();
        }
      }
    }
    return result;
  }
}
