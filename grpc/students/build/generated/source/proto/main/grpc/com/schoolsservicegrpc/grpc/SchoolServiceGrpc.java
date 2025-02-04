package com.schoolsservicegrpc.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SchoolServiceGrpc {

  private SchoolServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SchoolService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.schoolsservicegrpc.grpc.SchoolId,
      com.schoolsservicegrpc.grpc.SchoolObject> getGetOneByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOneByID",
      requestType = com.schoolsservicegrpc.grpc.SchoolId.class,
      responseType = com.schoolsservicegrpc.grpc.SchoolObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.schoolsservicegrpc.grpc.SchoolId,
      com.schoolsservicegrpc.grpc.SchoolObject> getGetOneByIDMethod() {
    io.grpc.MethodDescriptor<com.schoolsservicegrpc.grpc.SchoolId, com.schoolsservicegrpc.grpc.SchoolObject> getGetOneByIDMethod;
    if ((getGetOneByIDMethod = SchoolServiceGrpc.getGetOneByIDMethod) == null) {
      synchronized (SchoolServiceGrpc.class) {
        if ((getGetOneByIDMethod = SchoolServiceGrpc.getGetOneByIDMethod) == null) {
          SchoolServiceGrpc.getGetOneByIDMethod = getGetOneByIDMethod =
              io.grpc.MethodDescriptor.<com.schoolsservicegrpc.grpc.SchoolId, com.schoolsservicegrpc.grpc.SchoolObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOneByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.schoolsservicegrpc.grpc.SchoolId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.schoolsservicegrpc.grpc.SchoolObject.getDefaultInstance()))
              .setSchemaDescriptor(new SchoolServiceMethodDescriptorSupplier("getOneByID"))
              .build();
        }
      }
    }
    return getGetOneByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.schoolsservicegrpc.grpc.Empty,
      com.schoolsservicegrpc.grpc.SchoolsList> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.schoolsservicegrpc.grpc.Empty.class,
      responseType = com.schoolsservicegrpc.grpc.SchoolsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.schoolsservicegrpc.grpc.Empty,
      com.schoolsservicegrpc.grpc.SchoolsList> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.schoolsservicegrpc.grpc.Empty, com.schoolsservicegrpc.grpc.SchoolsList> getGetAllMethod;
    if ((getGetAllMethod = SchoolServiceGrpc.getGetAllMethod) == null) {
      synchronized (SchoolServiceGrpc.class) {
        if ((getGetAllMethod = SchoolServiceGrpc.getGetAllMethod) == null) {
          SchoolServiceGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.schoolsservicegrpc.grpc.Empty, com.schoolsservicegrpc.grpc.SchoolsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.schoolsservicegrpc.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.schoolsservicegrpc.grpc.SchoolsList.getDefaultInstance()))
              .setSchemaDescriptor(new SchoolServiceMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SchoolServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchoolServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchoolServiceStub>() {
        @java.lang.Override
        public SchoolServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchoolServiceStub(channel, callOptions);
        }
      };
    return SchoolServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SchoolServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchoolServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchoolServiceBlockingStub>() {
        @java.lang.Override
        public SchoolServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchoolServiceBlockingStub(channel, callOptions);
        }
      };
    return SchoolServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SchoolServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchoolServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchoolServiceFutureStub>() {
        @java.lang.Override
        public SchoolServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchoolServiceFutureStub(channel, callOptions);
        }
      };
    return SchoolServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getOneByID(com.schoolsservicegrpc.grpc.SchoolId request,
        io.grpc.stub.StreamObserver<com.schoolsservicegrpc.grpc.SchoolObject> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOneByIDMethod(), responseObserver);
    }

    /**
     */
    default void getAll(com.schoolsservicegrpc.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.schoolsservicegrpc.grpc.SchoolsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SchoolService.
   */
  public static abstract class SchoolServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SchoolServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SchoolService.
   */
  public static final class SchoolServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SchoolServiceStub> {
    private SchoolServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchoolServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchoolServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOneByID(com.schoolsservicegrpc.grpc.SchoolId request,
        io.grpc.stub.StreamObserver<com.schoolsservicegrpc.grpc.SchoolObject> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOneByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.schoolsservicegrpc.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.schoolsservicegrpc.grpc.SchoolsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SchoolService.
   */
  public static final class SchoolServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SchoolServiceBlockingStub> {
    private SchoolServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchoolServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchoolServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.schoolsservicegrpc.grpc.SchoolObject getOneByID(com.schoolsservicegrpc.grpc.SchoolId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOneByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.schoolsservicegrpc.grpc.SchoolsList getAll(com.schoolsservicegrpc.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SchoolService.
   */
  public static final class SchoolServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SchoolServiceFutureStub> {
    private SchoolServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchoolServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchoolServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.schoolsservicegrpc.grpc.SchoolObject> getOneByID(
        com.schoolsservicegrpc.grpc.SchoolId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOneByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.schoolsservicegrpc.grpc.SchoolsList> getAll(
        com.schoolsservicegrpc.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ONE_BY_ID = 0;
  private static final int METHODID_GET_ALL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ONE_BY_ID:
          serviceImpl.getOneByID((com.schoolsservicegrpc.grpc.SchoolId) request,
              (io.grpc.stub.StreamObserver<com.schoolsservicegrpc.grpc.SchoolObject>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.schoolsservicegrpc.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.schoolsservicegrpc.grpc.SchoolsList>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetOneByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.schoolsservicegrpc.grpc.SchoolId,
              com.schoolsservicegrpc.grpc.SchoolObject>(
                service, METHODID_GET_ONE_BY_ID)))
        .addMethod(
          getGetAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.schoolsservicegrpc.grpc.Empty,
              com.schoolsservicegrpc.grpc.SchoolsList>(
                service, METHODID_GET_ALL)))
        .build();
  }

  private static abstract class SchoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SchoolServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.schoolsservicegrpc.grpc.SchoolsGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SchoolService");
    }
  }

  private static final class SchoolServiceFileDescriptorSupplier
      extends SchoolServiceBaseDescriptorSupplier {
    SchoolServiceFileDescriptorSupplier() {}
  }

  private static final class SchoolServiceMethodDescriptorSupplier
      extends SchoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SchoolServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SchoolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SchoolServiceFileDescriptorSupplier())
              .addMethod(getGetOneByIDMethod())
              .addMethod(getGetAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
