// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: justtest.proto

package cn.cocowwy.grpcjava.heartdemo.api;

public final class GRPCServerApi {
  private GRPCServerApi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_cocowwy_grpcserver_api_RPCDateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cn_cocowwy_grpcserver_api_RPCDateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_cocowwy_grpcserver_api_RPCDateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cn_cocowwy_grpcserver_api_RPCDateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016justtest.proto\022\031cn.cocowwy.grpcserver." +
      "api\"L\n\016RPCDateRequest\022\n\n\002id\030\001 \001(\005\022\020\n\010use" +
      "rName\030\002 \001(\t\022\017\n\007message\030\003 \001(\t\022\013\n\003age\030\004 \001(" +
      "\005\"%\n\017RPCDateResponse\022\022\n\nserverDate\030\001 \001(\t" +
      "2t\n\016RPCDateService\022b\n\007getDate\022).cn.cocow" +
      "wy.grpcserver.api.RPCDateRequest\032*.cn.co" +
      "cowwy.grpcserver.api.RPCDateResponse\"\000B," +
      "\n\031cn.cocowwy.grpcserver.apiB\rGRPCServerA" +
      "piP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_cn_cocowwy_grpcserver_api_RPCDateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cn_cocowwy_grpcserver_api_RPCDateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cn_cocowwy_grpcserver_api_RPCDateRequest_descriptor,
        new java.lang.String[] { "Id", "UserName", "Message", "Age", });
    internal_static_cn_cocowwy_grpcserver_api_RPCDateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cn_cocowwy_grpcserver_api_RPCDateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cn_cocowwy_grpcserver_api_RPCDateResponse_descriptor,
        new java.lang.String[] { "ServerDate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}