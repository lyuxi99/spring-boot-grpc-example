// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo.proto

package com.xi.demo.grpc.lib;

public interface CreatePatientRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.xi.demo.grpc.CreatePatientResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 statusCode = 1;</code>
   * @return The statusCode.
   */
  long getStatusCode();

  /**
   * <code>optional .com.xi.demo.grpc.PatientType patient = 2;</code>
   * @return Whether the patient field is set.
   */
  boolean hasPatient();
  /**
   * <code>optional .com.xi.demo.grpc.PatientType patient = 2;</code>
   * @return The patient.
   */
  com.xi.demo.grpc.lib.PatientType getPatient();
  /**
   * <code>optional .com.xi.demo.grpc.PatientType patient = 2;</code>
   */
  com.xi.demo.grpc.lib.PatientTypeOrBuilder getPatientOrBuilder();
}
