package org.radar.services.stubs;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: RadarServiceBuffer.proto")
public final class RadarServiceGrpc {

  private RadarServiceGrpc() {}

  public static final String SERVICE_NAME = "RadarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.radar.services.stubs.RadarServiceBuffer.RadarRequest,
      org.radar.services.stubs.RadarServiceBuffer.Vehicle> getGetVehicleInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicleInfo",
      requestType = org.radar.services.stubs.RadarServiceBuffer.RadarRequest.class,
      responseType = org.radar.services.stubs.RadarServiceBuffer.Vehicle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.radar.services.stubs.RadarServiceBuffer.RadarRequest,
      org.radar.services.stubs.RadarServiceBuffer.Vehicle> getGetVehicleInfoMethod() {
    io.grpc.MethodDescriptor<org.radar.services.stubs.RadarServiceBuffer.RadarRequest, org.radar.services.stubs.RadarServiceBuffer.Vehicle> getGetVehicleInfoMethod;
    if ((getGetVehicleInfoMethod = RadarServiceGrpc.getGetVehicleInfoMethod) == null) {
      synchronized (RadarServiceGrpc.class) {
        if ((getGetVehicleInfoMethod = RadarServiceGrpc.getGetVehicleInfoMethod) == null) {
          RadarServiceGrpc.getGetVehicleInfoMethod = getGetVehicleInfoMethod = 
              io.grpc.MethodDescriptor.<org.radar.services.stubs.RadarServiceBuffer.RadarRequest, org.radar.services.stubs.RadarServiceBuffer.Vehicle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarService", "getVehicleInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.radar.services.stubs.RadarServiceBuffer.RadarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.radar.services.stubs.RadarServiceBuffer.Vehicle.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServiceMethodDescriptorSupplier("getVehicleInfo"))
                  .build();
          }
        }
     }
     return getGetVehicleInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.radar.services.stubs.RadarServiceBuffer.RadarRequest,
      org.radar.services.stubs.RadarServiceBuffer.InfractionResponse> getAddInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addInfraction",
      requestType = org.radar.services.stubs.RadarServiceBuffer.RadarRequest.class,
      responseType = org.radar.services.stubs.RadarServiceBuffer.InfractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.radar.services.stubs.RadarServiceBuffer.RadarRequest,
      org.radar.services.stubs.RadarServiceBuffer.InfractionResponse> getAddInfractionMethod() {
    io.grpc.MethodDescriptor<org.radar.services.stubs.RadarServiceBuffer.RadarRequest, org.radar.services.stubs.RadarServiceBuffer.InfractionResponse> getAddInfractionMethod;
    if ((getAddInfractionMethod = RadarServiceGrpc.getAddInfractionMethod) == null) {
      synchronized (RadarServiceGrpc.class) {
        if ((getAddInfractionMethod = RadarServiceGrpc.getAddInfractionMethod) == null) {
          RadarServiceGrpc.getAddInfractionMethod = getAddInfractionMethod = 
              io.grpc.MethodDescriptor.<org.radar.services.stubs.RadarServiceBuffer.RadarRequest, org.radar.services.stubs.RadarServiceBuffer.InfractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarService", "addInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.radar.services.stubs.RadarServiceBuffer.RadarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.radar.services.stubs.RadarServiceBuffer.InfractionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServiceMethodDescriptorSupplier("addInfraction"))
                  .build();
          }
        }
     }
     return getAddInfractionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadarServiceStub newStub(io.grpc.Channel channel) {
    return new RadarServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadarServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadarServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RadarServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVehicleInfo(org.radar.services.stubs.RadarServiceBuffer.RadarRequest request,
        io.grpc.stub.StreamObserver<org.radar.services.stubs.RadarServiceBuffer.Vehicle> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehicleInfoMethod(), responseObserver);
    }

    /**
     */
    public void addInfraction(org.radar.services.stubs.RadarServiceBuffer.RadarRequest request,
        io.grpc.stub.StreamObserver<org.radar.services.stubs.RadarServiceBuffer.InfractionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddInfractionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVehicleInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.radar.services.stubs.RadarServiceBuffer.RadarRequest,
                org.radar.services.stubs.RadarServiceBuffer.Vehicle>(
                  this, METHODID_GET_VEHICLE_INFO)))
          .addMethod(
            getAddInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.radar.services.stubs.RadarServiceBuffer.RadarRequest,
                org.radar.services.stubs.RadarServiceBuffer.InfractionResponse>(
                  this, METHODID_ADD_INFRACTION)))
          .build();
    }
  }

  /**
   */
  public static final class RadarServiceStub extends io.grpc.stub.AbstractStub<RadarServiceStub> {
    private RadarServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVehicleInfo(org.radar.services.stubs.RadarServiceBuffer.RadarRequest request,
        io.grpc.stub.StreamObserver<org.radar.services.stubs.RadarServiceBuffer.Vehicle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehicleInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addInfraction(org.radar.services.stubs.RadarServiceBuffer.RadarRequest request,
        io.grpc.stub.StreamObserver<org.radar.services.stubs.RadarServiceBuffer.InfractionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddInfractionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RadarServiceBlockingStub extends io.grpc.stub.AbstractStub<RadarServiceBlockingStub> {
    private RadarServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.radar.services.stubs.RadarServiceBuffer.Vehicle getVehicleInfo(org.radar.services.stubs.RadarServiceBuffer.RadarRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehicleInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.radar.services.stubs.RadarServiceBuffer.InfractionResponse addInfraction(org.radar.services.stubs.RadarServiceBuffer.RadarRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddInfractionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RadarServiceFutureStub extends io.grpc.stub.AbstractStub<RadarServiceFutureStub> {
    private RadarServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.radar.services.stubs.RadarServiceBuffer.Vehicle> getVehicleInfo(
        org.radar.services.stubs.RadarServiceBuffer.RadarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehicleInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.radar.services.stubs.RadarServiceBuffer.InfractionResponse> addInfraction(
        org.radar.services.stubs.RadarServiceBuffer.RadarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddInfractionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEHICLE_INFO = 0;
  private static final int METHODID_ADD_INFRACTION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadarServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadarServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEHICLE_INFO:
          serviceImpl.getVehicleInfo((org.radar.services.stubs.RadarServiceBuffer.RadarRequest) request,
              (io.grpc.stub.StreamObserver<org.radar.services.stubs.RadarServiceBuffer.Vehicle>) responseObserver);
          break;
        case METHODID_ADD_INFRACTION:
          serviceImpl.addInfraction((org.radar.services.stubs.RadarServiceBuffer.RadarRequest) request,
              (io.grpc.stub.StreamObserver<org.radar.services.stubs.RadarServiceBuffer.InfractionResponse>) responseObserver);
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

  private static abstract class RadarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadarServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.radar.services.stubs.RadarServiceBuffer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadarService");
    }
  }

  private static final class RadarServiceFileDescriptorSupplier
      extends RadarServiceBaseDescriptorSupplier {
    RadarServiceFileDescriptorSupplier() {}
  }

  private static final class RadarServiceMethodDescriptorSupplier
      extends RadarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadarServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadarServiceFileDescriptorSupplier())
              .addMethod(getGetVehicleInfoMethod())
              .addMethod(getAddInfractionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
