// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.example.models;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 1 - 15: 1 byte (use them for frequently used fields)
   * 16 - 2047: 2 bytes (use them for rarer used fields)
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 1 - 15: 1 byte (use them for frequently used fields)
   * 16 - 2047: 2 bytes (use them for rarer used fields)
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   * @return Whether the age field is set.
   */
  boolean hasAge();
  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   * @return The age.
   */
  com.google.protobuf.Int32Value getAge();
  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getAgeOrBuilder();

  /**
   * <code>repeated .common.Car car = 3;</code>
   */
  java.util.List<com.example.models.Car> 
      getCarList();
  /**
   * <code>repeated .common.Car car = 3;</code>
   */
  com.example.models.Car getCar(int index);
  /**
   * <code>repeated .common.Car car = 3;</code>
   */
  int getCarCount();
  /**
   * <code>repeated .common.Car car = 3;</code>
   */
  java.util.List<? extends com.example.models.CarOrBuilder> 
      getCarOrBuilderList();
  /**
   * <code>repeated .common.Car car = 3;</code>
   */
  com.example.models.CarOrBuilder getCarOrBuilder(
      int index);

  /**
   * <code>.common.Address address = 4;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.common.Address address = 4;</code>
   * @return The address.
   */
  com.example.models.Address getAddress();
  /**
   * <code>.common.Address address = 4;</code>
   */
  com.example.models.AddressOrBuilder getAddressOrBuilder();
}
