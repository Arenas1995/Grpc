// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SchoolsGrpc.proto

// Protobuf Java Version: 3.25.5
package com.schoolsservicegrpc.grpc;

public interface SchoolsListOrBuilder extends
        // @@protoc_insertion_point(interface_extends:SchoolsList)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .SchoolObject school = 1;</code>
     */
    java.util.List<com.schoolsservicegrpc.grpc.SchoolObject>
    getSchoolList();

    /**
     * <code>repeated .SchoolObject school = 1;</code>
     */
    com.schoolsservicegrpc.grpc.SchoolObject getSchool(int index);

    /**
     * <code>repeated .SchoolObject school = 1;</code>
     */
    int getSchoolCount();

    /**
     * <code>repeated .SchoolObject school = 1;</code>
     */
    java.util.List<? extends com.schoolsservicegrpc.grpc.SchoolObjectOrBuilder>
    getSchoolOrBuilderList();

    /**
     * <code>repeated .SchoolObject school = 1;</code>
     */
    com.schoolsservicegrpc.grpc.SchoolObjectOrBuilder getSchoolOrBuilder(
            int index);
}
