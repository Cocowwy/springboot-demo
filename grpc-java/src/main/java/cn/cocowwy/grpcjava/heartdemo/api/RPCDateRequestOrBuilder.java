// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: justtest.proto

package cn.cocowwy.grpcjava.heartdemo.api;

public interface RPCDateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.cocowwy.grpcserver.api.RPCDateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>optional string userName = 2;</code>
   */
  java.lang.String getUserName();
  /**
   * <code>optional string userName = 2;</code>
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>optional string message = 3;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>optional string message = 3;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>optional int32 age = 4;</code>
   */
  int getAge();
}
