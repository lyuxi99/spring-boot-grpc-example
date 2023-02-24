package com.xi.demo.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The demo service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: demo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DemoGrpcServiceGrpc {

  private DemoGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "com.xi.demo.grpc.DemoGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.CreateHospitalReq,
      com.xi.demo.grpc.lib.CreateHospitalResp> getCreateHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHospital",
      requestType = com.xi.demo.grpc.lib.CreateHospitalReq.class,
      responseType = com.xi.demo.grpc.lib.CreateHospitalResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.CreateHospitalReq,
      com.xi.demo.grpc.lib.CreateHospitalResp> getCreateHospitalMethod() {
    io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.CreateHospitalReq, com.xi.demo.grpc.lib.CreateHospitalResp> getCreateHospitalMethod;
    if ((getCreateHospitalMethod = DemoGrpcServiceGrpc.getCreateHospitalMethod) == null) {
      synchronized (DemoGrpcServiceGrpc.class) {
        if ((getCreateHospitalMethod = DemoGrpcServiceGrpc.getCreateHospitalMethod) == null) {
          DemoGrpcServiceGrpc.getCreateHospitalMethod = getCreateHospitalMethod =
              io.grpc.MethodDescriptor.<com.xi.demo.grpc.lib.CreateHospitalReq, com.xi.demo.grpc.lib.CreateHospitalResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.CreateHospitalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.CreateHospitalResp.getDefaultInstance()))
              .setSchemaDescriptor(new DemoGrpcServiceMethodDescriptorSupplier("CreateHospital"))
              .build();
        }
      }
    }
    return getCreateHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.UpdateHospitalReq,
      com.xi.demo.grpc.lib.UpdateHospitalResp> getUpdateHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHospital",
      requestType = com.xi.demo.grpc.lib.UpdateHospitalReq.class,
      responseType = com.xi.demo.grpc.lib.UpdateHospitalResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.UpdateHospitalReq,
      com.xi.demo.grpc.lib.UpdateHospitalResp> getUpdateHospitalMethod() {
    io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.UpdateHospitalReq, com.xi.demo.grpc.lib.UpdateHospitalResp> getUpdateHospitalMethod;
    if ((getUpdateHospitalMethod = DemoGrpcServiceGrpc.getUpdateHospitalMethod) == null) {
      synchronized (DemoGrpcServiceGrpc.class) {
        if ((getUpdateHospitalMethod = DemoGrpcServiceGrpc.getUpdateHospitalMethod) == null) {
          DemoGrpcServiceGrpc.getUpdateHospitalMethod = getUpdateHospitalMethod =
              io.grpc.MethodDescriptor.<com.xi.demo.grpc.lib.UpdateHospitalReq, com.xi.demo.grpc.lib.UpdateHospitalResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.UpdateHospitalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.UpdateHospitalResp.getDefaultInstance()))
              .setSchemaDescriptor(new DemoGrpcServiceMethodDescriptorSupplier("UpdateHospital"))
              .build();
        }
      }
    }
    return getUpdateHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.DeleteHospitalReq,
      com.xi.demo.grpc.lib.DeleteHospitalResp> getDeleteHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHospital",
      requestType = com.xi.demo.grpc.lib.DeleteHospitalReq.class,
      responseType = com.xi.demo.grpc.lib.DeleteHospitalResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.DeleteHospitalReq,
      com.xi.demo.grpc.lib.DeleteHospitalResp> getDeleteHospitalMethod() {
    io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.DeleteHospitalReq, com.xi.demo.grpc.lib.DeleteHospitalResp> getDeleteHospitalMethod;
    if ((getDeleteHospitalMethod = DemoGrpcServiceGrpc.getDeleteHospitalMethod) == null) {
      synchronized (DemoGrpcServiceGrpc.class) {
        if ((getDeleteHospitalMethod = DemoGrpcServiceGrpc.getDeleteHospitalMethod) == null) {
          DemoGrpcServiceGrpc.getDeleteHospitalMethod = getDeleteHospitalMethod =
              io.grpc.MethodDescriptor.<com.xi.demo.grpc.lib.DeleteHospitalReq, com.xi.demo.grpc.lib.DeleteHospitalResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.DeleteHospitalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.DeleteHospitalResp.getDefaultInstance()))
              .setSchemaDescriptor(new DemoGrpcServiceMethodDescriptorSupplier("DeleteHospital"))
              .build();
        }
      }
    }
    return getDeleteHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.GetHospitalReq,
      com.xi.demo.grpc.lib.GetHospitalResp> getGetHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHospital",
      requestType = com.xi.demo.grpc.lib.GetHospitalReq.class,
      responseType = com.xi.demo.grpc.lib.GetHospitalResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.GetHospitalReq,
      com.xi.demo.grpc.lib.GetHospitalResp> getGetHospitalMethod() {
    io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.GetHospitalReq, com.xi.demo.grpc.lib.GetHospitalResp> getGetHospitalMethod;
    if ((getGetHospitalMethod = DemoGrpcServiceGrpc.getGetHospitalMethod) == null) {
      synchronized (DemoGrpcServiceGrpc.class) {
        if ((getGetHospitalMethod = DemoGrpcServiceGrpc.getGetHospitalMethod) == null) {
          DemoGrpcServiceGrpc.getGetHospitalMethod = getGetHospitalMethod =
              io.grpc.MethodDescriptor.<com.xi.demo.grpc.lib.GetHospitalReq, com.xi.demo.grpc.lib.GetHospitalResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.GetHospitalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.GetHospitalResp.getDefaultInstance()))
              .setSchemaDescriptor(new DemoGrpcServiceMethodDescriptorSupplier("GetHospital"))
              .build();
        }
      }
    }
    return getGetHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.CreatePatientReq,
      com.xi.demo.grpc.lib.CreatePatientResp> getCreatePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePatient",
      requestType = com.xi.demo.grpc.lib.CreatePatientReq.class,
      responseType = com.xi.demo.grpc.lib.CreatePatientResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.CreatePatientReq,
      com.xi.demo.grpc.lib.CreatePatientResp> getCreatePatientMethod() {
    io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.CreatePatientReq, com.xi.demo.grpc.lib.CreatePatientResp> getCreatePatientMethod;
    if ((getCreatePatientMethod = DemoGrpcServiceGrpc.getCreatePatientMethod) == null) {
      synchronized (DemoGrpcServiceGrpc.class) {
        if ((getCreatePatientMethod = DemoGrpcServiceGrpc.getCreatePatientMethod) == null) {
          DemoGrpcServiceGrpc.getCreatePatientMethod = getCreatePatientMethod =
              io.grpc.MethodDescriptor.<com.xi.demo.grpc.lib.CreatePatientReq, com.xi.demo.grpc.lib.CreatePatientResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.CreatePatientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.CreatePatientResp.getDefaultInstance()))
              .setSchemaDescriptor(new DemoGrpcServiceMethodDescriptorSupplier("CreatePatient"))
              .build();
        }
      }
    }
    return getCreatePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.UpdatePatientReq,
      com.xi.demo.grpc.lib.UpdatePatientResp> getUpdatePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePatient",
      requestType = com.xi.demo.grpc.lib.UpdatePatientReq.class,
      responseType = com.xi.demo.grpc.lib.UpdatePatientResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.UpdatePatientReq,
      com.xi.demo.grpc.lib.UpdatePatientResp> getUpdatePatientMethod() {
    io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.UpdatePatientReq, com.xi.demo.grpc.lib.UpdatePatientResp> getUpdatePatientMethod;
    if ((getUpdatePatientMethod = DemoGrpcServiceGrpc.getUpdatePatientMethod) == null) {
      synchronized (DemoGrpcServiceGrpc.class) {
        if ((getUpdatePatientMethod = DemoGrpcServiceGrpc.getUpdatePatientMethod) == null) {
          DemoGrpcServiceGrpc.getUpdatePatientMethod = getUpdatePatientMethod =
              io.grpc.MethodDescriptor.<com.xi.demo.grpc.lib.UpdatePatientReq, com.xi.demo.grpc.lib.UpdatePatientResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.UpdatePatientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.UpdatePatientResp.getDefaultInstance()))
              .setSchemaDescriptor(new DemoGrpcServiceMethodDescriptorSupplier("UpdatePatient"))
              .build();
        }
      }
    }
    return getUpdatePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.DeletePatientReq,
      com.xi.demo.grpc.lib.DeletePatientResp> getDeletePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePatient",
      requestType = com.xi.demo.grpc.lib.DeletePatientReq.class,
      responseType = com.xi.demo.grpc.lib.DeletePatientResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.DeletePatientReq,
      com.xi.demo.grpc.lib.DeletePatientResp> getDeletePatientMethod() {
    io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.DeletePatientReq, com.xi.demo.grpc.lib.DeletePatientResp> getDeletePatientMethod;
    if ((getDeletePatientMethod = DemoGrpcServiceGrpc.getDeletePatientMethod) == null) {
      synchronized (DemoGrpcServiceGrpc.class) {
        if ((getDeletePatientMethod = DemoGrpcServiceGrpc.getDeletePatientMethod) == null) {
          DemoGrpcServiceGrpc.getDeletePatientMethod = getDeletePatientMethod =
              io.grpc.MethodDescriptor.<com.xi.demo.grpc.lib.DeletePatientReq, com.xi.demo.grpc.lib.DeletePatientResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.DeletePatientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.DeletePatientResp.getDefaultInstance()))
              .setSchemaDescriptor(new DemoGrpcServiceMethodDescriptorSupplier("DeletePatient"))
              .build();
        }
      }
    }
    return getDeletePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.GetPatientReq,
      com.xi.demo.grpc.lib.GetPatientResp> getGetPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPatient",
      requestType = com.xi.demo.grpc.lib.GetPatientReq.class,
      responseType = com.xi.demo.grpc.lib.GetPatientResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.GetPatientReq,
      com.xi.demo.grpc.lib.GetPatientResp> getGetPatientMethod() {
    io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.GetPatientReq, com.xi.demo.grpc.lib.GetPatientResp> getGetPatientMethod;
    if ((getGetPatientMethod = DemoGrpcServiceGrpc.getGetPatientMethod) == null) {
      synchronized (DemoGrpcServiceGrpc.class) {
        if ((getGetPatientMethod = DemoGrpcServiceGrpc.getGetPatientMethod) == null) {
          DemoGrpcServiceGrpc.getGetPatientMethod = getGetPatientMethod =
              io.grpc.MethodDescriptor.<com.xi.demo.grpc.lib.GetPatientReq, com.xi.demo.grpc.lib.GetPatientResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.GetPatientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.GetPatientResp.getDefaultInstance()))
              .setSchemaDescriptor(new DemoGrpcServiceMethodDescriptorSupplier("GetPatient"))
              .build();
        }
      }
    }
    return getGetPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.RegisterPatientReq,
      com.xi.demo.grpc.lib.RegisterPatientResp> getRegisterPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPatient",
      requestType = com.xi.demo.grpc.lib.RegisterPatientReq.class,
      responseType = com.xi.demo.grpc.lib.RegisterPatientResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.RegisterPatientReq,
      com.xi.demo.grpc.lib.RegisterPatientResp> getRegisterPatientMethod() {
    io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.RegisterPatientReq, com.xi.demo.grpc.lib.RegisterPatientResp> getRegisterPatientMethod;
    if ((getRegisterPatientMethod = DemoGrpcServiceGrpc.getRegisterPatientMethod) == null) {
      synchronized (DemoGrpcServiceGrpc.class) {
        if ((getRegisterPatientMethod = DemoGrpcServiceGrpc.getRegisterPatientMethod) == null) {
          DemoGrpcServiceGrpc.getRegisterPatientMethod = getRegisterPatientMethod =
              io.grpc.MethodDescriptor.<com.xi.demo.grpc.lib.RegisterPatientReq, com.xi.demo.grpc.lib.RegisterPatientResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.RegisterPatientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.RegisterPatientResp.getDefaultInstance()))
              .setSchemaDescriptor(new DemoGrpcServiceMethodDescriptorSupplier("RegisterPatient"))
              .build();
        }
      }
    }
    return getRegisterPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.UnregisterPatientReq,
      com.xi.demo.grpc.lib.UnregisterPatientResp> getUnregisterPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnregisterPatient",
      requestType = com.xi.demo.grpc.lib.UnregisterPatientReq.class,
      responseType = com.xi.demo.grpc.lib.UnregisterPatientResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.UnregisterPatientReq,
      com.xi.demo.grpc.lib.UnregisterPatientResp> getUnregisterPatientMethod() {
    io.grpc.MethodDescriptor<com.xi.demo.grpc.lib.UnregisterPatientReq, com.xi.demo.grpc.lib.UnregisterPatientResp> getUnregisterPatientMethod;
    if ((getUnregisterPatientMethod = DemoGrpcServiceGrpc.getUnregisterPatientMethod) == null) {
      synchronized (DemoGrpcServiceGrpc.class) {
        if ((getUnregisterPatientMethod = DemoGrpcServiceGrpc.getUnregisterPatientMethod) == null) {
          DemoGrpcServiceGrpc.getUnregisterPatientMethod = getUnregisterPatientMethod =
              io.grpc.MethodDescriptor.<com.xi.demo.grpc.lib.UnregisterPatientReq, com.xi.demo.grpc.lib.UnregisterPatientResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnregisterPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.UnregisterPatientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xi.demo.grpc.lib.UnregisterPatientResp.getDefaultInstance()))
              .setSchemaDescriptor(new DemoGrpcServiceMethodDescriptorSupplier("UnregisterPatient"))
              .build();
        }
      }
    }
    return getUnregisterPatientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DemoGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceStub>() {
        @java.lang.Override
        public DemoGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoGrpcServiceStub(channel, callOptions);
        }
      };
    return DemoGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DemoGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceBlockingStub>() {
        @java.lang.Override
        public DemoGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return DemoGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DemoGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceFutureStub>() {
        @java.lang.Override
        public DemoGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return DemoGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The demo service definition.
   * </pre>
   */
  public static abstract class DemoGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a hospital.
     * </pre>
     */
    public void createHospital(com.xi.demo.grpc.lib.CreateHospitalReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.CreateHospitalResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHospitalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the hospital.
     * </pre>
     */
    public void updateHospital(com.xi.demo.grpc.lib.UpdateHospitalReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.UpdateHospitalResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHospitalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete the hospital.
     * </pre>
     */
    public void deleteHospital(com.xi.demo.grpc.lib.DeleteHospitalReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.DeleteHospitalResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHospitalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the hospital with all registered patients.
     * </pre>
     */
    public void getHospital(com.xi.demo.grpc.lib.GetHospitalReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.GetHospitalResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHospitalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a patient.
     * </pre>
     */
    public void createPatient(com.xi.demo.grpc.lib.CreatePatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.CreatePatientResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePatientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the patient.
     * </pre>
     */
    public void updatePatient(com.xi.demo.grpc.lib.UpdatePatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.UpdatePatientResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePatientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete the patient.
     * </pre>
     */
    public void deletePatient(com.xi.demo.grpc.lib.DeletePatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.DeletePatientResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePatientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the patient with all hospitals registered.
     * </pre>
     */
    public void getPatient(com.xi.demo.grpc.lib.GetPatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.GetPatientResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPatientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Register the patient in the hospital.
     * </pre>
     */
    public void registerPatient(com.xi.demo.grpc.lib.RegisterPatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.RegisterPatientResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPatientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unregister the patient from the hospital.
     * </pre>
     */
    public void unregisterPatient(com.xi.demo.grpc.lib.UnregisterPatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.UnregisterPatientResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnregisterPatientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xi.demo.grpc.lib.CreateHospitalReq,
                com.xi.demo.grpc.lib.CreateHospitalResp>(
                  this, METHODID_CREATE_HOSPITAL)))
          .addMethod(
            getUpdateHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xi.demo.grpc.lib.UpdateHospitalReq,
                com.xi.demo.grpc.lib.UpdateHospitalResp>(
                  this, METHODID_UPDATE_HOSPITAL)))
          .addMethod(
            getDeleteHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xi.demo.grpc.lib.DeleteHospitalReq,
                com.xi.demo.grpc.lib.DeleteHospitalResp>(
                  this, METHODID_DELETE_HOSPITAL)))
          .addMethod(
            getGetHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xi.demo.grpc.lib.GetHospitalReq,
                com.xi.demo.grpc.lib.GetHospitalResp>(
                  this, METHODID_GET_HOSPITAL)))
          .addMethod(
            getCreatePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xi.demo.grpc.lib.CreatePatientReq,
                com.xi.demo.grpc.lib.CreatePatientResp>(
                  this, METHODID_CREATE_PATIENT)))
          .addMethod(
            getUpdatePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xi.demo.grpc.lib.UpdatePatientReq,
                com.xi.demo.grpc.lib.UpdatePatientResp>(
                  this, METHODID_UPDATE_PATIENT)))
          .addMethod(
            getDeletePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xi.demo.grpc.lib.DeletePatientReq,
                com.xi.demo.grpc.lib.DeletePatientResp>(
                  this, METHODID_DELETE_PATIENT)))
          .addMethod(
            getGetPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xi.demo.grpc.lib.GetPatientReq,
                com.xi.demo.grpc.lib.GetPatientResp>(
                  this, METHODID_GET_PATIENT)))
          .addMethod(
            getRegisterPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xi.demo.grpc.lib.RegisterPatientReq,
                com.xi.demo.grpc.lib.RegisterPatientResp>(
                  this, METHODID_REGISTER_PATIENT)))
          .addMethod(
            getUnregisterPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xi.demo.grpc.lib.UnregisterPatientReq,
                com.xi.demo.grpc.lib.UnregisterPatientResp>(
                  this, METHODID_UNREGISTER_PATIENT)))
          .build();
    }
  }

  /**
   * <pre>
   * The demo service definition.
   * </pre>
   */
  public static final class DemoGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<DemoGrpcServiceStub> {
    private DemoGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoGrpcServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a hospital.
     * </pre>
     */
    public void createHospital(com.xi.demo.grpc.lib.CreateHospitalReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.CreateHospitalResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the hospital.
     * </pre>
     */
    public void updateHospital(com.xi.demo.grpc.lib.UpdateHospitalReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.UpdateHospitalResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete the hospital.
     * </pre>
     */
    public void deleteHospital(com.xi.demo.grpc.lib.DeleteHospitalReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.DeleteHospitalResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the hospital with all registered patients.
     * </pre>
     */
    public void getHospital(com.xi.demo.grpc.lib.GetHospitalReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.GetHospitalResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a patient.
     * </pre>
     */
    public void createPatient(com.xi.demo.grpc.lib.CreatePatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.CreatePatientResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the patient.
     * </pre>
     */
    public void updatePatient(com.xi.demo.grpc.lib.UpdatePatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.UpdatePatientResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete the patient.
     * </pre>
     */
    public void deletePatient(com.xi.demo.grpc.lib.DeletePatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.DeletePatientResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the patient with all hospitals registered.
     * </pre>
     */
    public void getPatient(com.xi.demo.grpc.lib.GetPatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.GetPatientResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Register the patient in the hospital.
     * </pre>
     */
    public void registerPatient(com.xi.demo.grpc.lib.RegisterPatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.RegisterPatientResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unregister the patient from the hospital.
     * </pre>
     */
    public void unregisterPatient(com.xi.demo.grpc.lib.UnregisterPatientReq request,
        io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.UnregisterPatientResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnregisterPatientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The demo service definition.
   * </pre>
   */
  public static final class DemoGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DemoGrpcServiceBlockingStub> {
    private DemoGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a hospital.
     * </pre>
     */
    public com.xi.demo.grpc.lib.CreateHospitalResp createHospital(com.xi.demo.grpc.lib.CreateHospitalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHospitalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the hospital.
     * </pre>
     */
    public com.xi.demo.grpc.lib.UpdateHospitalResp updateHospital(com.xi.demo.grpc.lib.UpdateHospitalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHospitalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete the hospital.
     * </pre>
     */
    public com.xi.demo.grpc.lib.DeleteHospitalResp deleteHospital(com.xi.demo.grpc.lib.DeleteHospitalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHospitalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the hospital with all registered patients.
     * </pre>
     */
    public com.xi.demo.grpc.lib.GetHospitalResp getHospital(com.xi.demo.grpc.lib.GetHospitalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHospitalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a patient.
     * </pre>
     */
    public com.xi.demo.grpc.lib.CreatePatientResp createPatient(com.xi.demo.grpc.lib.CreatePatientReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the patient.
     * </pre>
     */
    public com.xi.demo.grpc.lib.UpdatePatientResp updatePatient(com.xi.demo.grpc.lib.UpdatePatientReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete the patient.
     * </pre>
     */
    public com.xi.demo.grpc.lib.DeletePatientResp deletePatient(com.xi.demo.grpc.lib.DeletePatientReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the patient with all hospitals registered.
     * </pre>
     */
    public com.xi.demo.grpc.lib.GetPatientResp getPatient(com.xi.demo.grpc.lib.GetPatientReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Register the patient in the hospital.
     * </pre>
     */
    public com.xi.demo.grpc.lib.RegisterPatientResp registerPatient(com.xi.demo.grpc.lib.RegisterPatientReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unregister the patient from the hospital.
     * </pre>
     */
    public com.xi.demo.grpc.lib.UnregisterPatientResp unregisterPatient(com.xi.demo.grpc.lib.UnregisterPatientReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnregisterPatientMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The demo service definition.
   * </pre>
   */
  public static final class DemoGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DemoGrpcServiceFutureStub> {
    private DemoGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a hospital.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xi.demo.grpc.lib.CreateHospitalResp> createHospital(
        com.xi.demo.grpc.lib.CreateHospitalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHospitalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the hospital.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xi.demo.grpc.lib.UpdateHospitalResp> updateHospital(
        com.xi.demo.grpc.lib.UpdateHospitalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHospitalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete the hospital.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xi.demo.grpc.lib.DeleteHospitalResp> deleteHospital(
        com.xi.demo.grpc.lib.DeleteHospitalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHospitalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the hospital with all registered patients.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xi.demo.grpc.lib.GetHospitalResp> getHospital(
        com.xi.demo.grpc.lib.GetHospitalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHospitalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a patient.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xi.demo.grpc.lib.CreatePatientResp> createPatient(
        com.xi.demo.grpc.lib.CreatePatientReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the patient.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xi.demo.grpc.lib.UpdatePatientResp> updatePatient(
        com.xi.demo.grpc.lib.UpdatePatientReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete the patient.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xi.demo.grpc.lib.DeletePatientResp> deletePatient(
        com.xi.demo.grpc.lib.DeletePatientReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the patient with all hospitals registered.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xi.demo.grpc.lib.GetPatientResp> getPatient(
        com.xi.demo.grpc.lib.GetPatientReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Register the patient in the hospital.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xi.demo.grpc.lib.RegisterPatientResp> registerPatient(
        com.xi.demo.grpc.lib.RegisterPatientReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unregister the patient from the hospital.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xi.demo.grpc.lib.UnregisterPatientResp> unregisterPatient(
        com.xi.demo.grpc.lib.UnregisterPatientReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnregisterPatientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_HOSPITAL = 0;
  private static final int METHODID_UPDATE_HOSPITAL = 1;
  private static final int METHODID_DELETE_HOSPITAL = 2;
  private static final int METHODID_GET_HOSPITAL = 3;
  private static final int METHODID_CREATE_PATIENT = 4;
  private static final int METHODID_UPDATE_PATIENT = 5;
  private static final int METHODID_DELETE_PATIENT = 6;
  private static final int METHODID_GET_PATIENT = 7;
  private static final int METHODID_REGISTER_PATIENT = 8;
  private static final int METHODID_UNREGISTER_PATIENT = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DemoGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DemoGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_HOSPITAL:
          serviceImpl.createHospital((com.xi.demo.grpc.lib.CreateHospitalReq) request,
              (io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.CreateHospitalResp>) responseObserver);
          break;
        case METHODID_UPDATE_HOSPITAL:
          serviceImpl.updateHospital((com.xi.demo.grpc.lib.UpdateHospitalReq) request,
              (io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.UpdateHospitalResp>) responseObserver);
          break;
        case METHODID_DELETE_HOSPITAL:
          serviceImpl.deleteHospital((com.xi.demo.grpc.lib.DeleteHospitalReq) request,
              (io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.DeleteHospitalResp>) responseObserver);
          break;
        case METHODID_GET_HOSPITAL:
          serviceImpl.getHospital((com.xi.demo.grpc.lib.GetHospitalReq) request,
              (io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.GetHospitalResp>) responseObserver);
          break;
        case METHODID_CREATE_PATIENT:
          serviceImpl.createPatient((com.xi.demo.grpc.lib.CreatePatientReq) request,
              (io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.CreatePatientResp>) responseObserver);
          break;
        case METHODID_UPDATE_PATIENT:
          serviceImpl.updatePatient((com.xi.demo.grpc.lib.UpdatePatientReq) request,
              (io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.UpdatePatientResp>) responseObserver);
          break;
        case METHODID_DELETE_PATIENT:
          serviceImpl.deletePatient((com.xi.demo.grpc.lib.DeletePatientReq) request,
              (io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.DeletePatientResp>) responseObserver);
          break;
        case METHODID_GET_PATIENT:
          serviceImpl.getPatient((com.xi.demo.grpc.lib.GetPatientReq) request,
              (io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.GetPatientResp>) responseObserver);
          break;
        case METHODID_REGISTER_PATIENT:
          serviceImpl.registerPatient((com.xi.demo.grpc.lib.RegisterPatientReq) request,
              (io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.RegisterPatientResp>) responseObserver);
          break;
        case METHODID_UNREGISTER_PATIENT:
          serviceImpl.unregisterPatient((com.xi.demo.grpc.lib.UnregisterPatientReq) request,
              (io.grpc.stub.StreamObserver<com.xi.demo.grpc.lib.UnregisterPatientResp>) responseObserver);
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

  private static abstract class DemoGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DemoGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xi.demo.grpc.lib.DemoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DemoGrpcService");
    }
  }

  private static final class DemoGrpcServiceFileDescriptorSupplier
      extends DemoGrpcServiceBaseDescriptorSupplier {
    DemoGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class DemoGrpcServiceMethodDescriptorSupplier
      extends DemoGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DemoGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DemoGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DemoGrpcServiceFileDescriptorSupplier())
              .addMethod(getCreateHospitalMethod())
              .addMethod(getUpdateHospitalMethod())
              .addMethod(getDeleteHospitalMethod())
              .addMethod(getGetHospitalMethod())
              .addMethod(getCreatePatientMethod())
              .addMethod(getUpdatePatientMethod())
              .addMethod(getDeletePatientMethod())
              .addMethod(getGetPatientMethod())
              .addMethod(getRegisterPatientMethod())
              .addMethod(getUnregisterPatientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
