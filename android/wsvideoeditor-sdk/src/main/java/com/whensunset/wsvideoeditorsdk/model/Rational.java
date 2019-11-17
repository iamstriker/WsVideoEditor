// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ws_video_editor_sdk.proto

package com.whensunset.wsvideoeditorsdk.model;

/**
 * Protobuf type {@code whensunset.wsvideoeditor.model.Rational}
 */
public  final class Rational extends
    com.google.protobuf.GeneratedMessageLite<
        Rational, Rational.Builder> implements
    // @@protoc_insertion_point(message_implements:whensunset.wsvideoeditor.model.Rational)
    RationalOrBuilder {
  private Rational() {
  }
  public static final int NUM_FIELD_NUMBER = 1;
  private long num_;
  /**
   * <code>optional int64 num = 1;</code>
   */
  public long getNum() {
    return num_;
  }
  /**
   * <code>optional int64 num = 1;</code>
   */
  private void setNum(long value) {
    
    num_ = value;
  }
  /**
   * <code>optional int64 num = 1;</code>
   */
  private void clearNum() {
    
    num_ = 0L;
  }

  public static final int DEN_FIELD_NUMBER = 2;
  private long den_;
  /**
   * <code>optional int64 den = 2;</code>
   */
  public long getDen() {
    return den_;
  }
  /**
   * <code>optional int64 den = 2;</code>
   */
  private void setDen(long value) {
    
    den_ = value;
  }
  /**
   * <code>optional int64 den = 2;</code>
   */
  private void clearDen() {
    
    den_ = 0L;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (num_ != 0L) {
      output.writeInt64(1, num_);
    }
    if (den_ != 0L) {
      output.writeInt64(2, den_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (num_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, num_);
    }
    if (den_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, den_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.whensunset.wsvideoeditorsdk.model.Rational parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.whensunset.wsvideoeditorsdk.model.Rational parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.whensunset.wsvideoeditorsdk.model.Rational parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.whensunset.wsvideoeditorsdk.model.Rational parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.whensunset.wsvideoeditorsdk.model.Rational parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.whensunset.wsvideoeditorsdk.model.Rational parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.whensunset.wsvideoeditorsdk.model.Rational parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.whensunset.wsvideoeditorsdk.model.Rational parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.whensunset.wsvideoeditorsdk.model.Rational parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.whensunset.wsvideoeditorsdk.model.Rational parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.whensunset.wsvideoeditorsdk.model.Rational prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code whensunset.wsvideoeditor.model.Rational}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.whensunset.wsvideoeditorsdk.model.Rational, Builder> implements
      // @@protoc_insertion_point(builder_implements:whensunset.wsvideoeditor.model.Rational)
      com.whensunset.wsvideoeditorsdk.model.RationalOrBuilder {
    // Construct using com.whensunset.wsvideoeditorsdk.model.Rational.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional int64 num = 1;</code>
     */
    public long getNum() {
      return instance.getNum();
    }
    /**
     * <code>optional int64 num = 1;</code>
     */
    public Builder setNum(long value) {
      copyOnWrite();
      instance.setNum(value);
      return this;
    }
    /**
     * <code>optional int64 num = 1;</code>
     */
    public Builder clearNum() {
      copyOnWrite();
      instance.clearNum();
      return this;
    }

    /**
     * <code>optional int64 den = 2;</code>
     */
    public long getDen() {
      return instance.getDen();
    }
    /**
     * <code>optional int64 den = 2;</code>
     */
    public Builder setDen(long value) {
      copyOnWrite();
      instance.setDen(value);
      return this;
    }
    /**
     * <code>optional int64 den = 2;</code>
     */
    public Builder clearDen() {
      copyOnWrite();
      instance.clearDen();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:whensunset.wsvideoeditor.model.Rational)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.whensunset.wsvideoeditorsdk.model.Rational();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.whensunset.wsvideoeditorsdk.model.Rational other = (com.whensunset.wsvideoeditorsdk.model.Rational) arg1;
        num_ = visitor.visitLong(num_ != 0L, num_,
            other.num_ != 0L, other.num_);
        den_ = visitor.visitLong(den_ != 0L, den_,
            other.den_ != 0L, other.den_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 8: {

                num_ = input.readInt64();
                break;
              }
              case 16: {

                den_ = input.readInt64();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.whensunset.wsvideoeditorsdk.model.Rational.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:whensunset.wsvideoeditor.model.Rational)
  private static final com.whensunset.wsvideoeditorsdk.model.Rational DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Rational();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.whensunset.wsvideoeditorsdk.model.Rational getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Rational> PARSER;

  public static com.google.protobuf.Parser<Rational> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

