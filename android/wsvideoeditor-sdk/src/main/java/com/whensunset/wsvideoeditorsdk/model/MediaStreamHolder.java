// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ws_video_editor_sdk.proto

package com.whensunset.wsvideoeditorsdk.model;

/**
 * <pre>
 * 一个多媒体文件的一个多媒体数据流的信息
 * </pre>
 *
 * Protobuf type {@code whensunset.wsvideoeditor.model.MediaStreamHolder}
 */
public  final class MediaStreamHolder extends
    com.google.protobuf.GeneratedMessageLite<
        MediaStreamHolder, MediaStreamHolder.Builder> implements
    // @@protoc_insertion_point(message_implements:whensunset.wsvideoeditor.model.MediaStreamHolder)
    MediaStreamHolderOrBuilder {
  private MediaStreamHolder() {
    codecType_ = "";
  }
  public static final int WIDTH_FIELD_NUMBER = 1;
  private int width_;
  /**
   * <pre>
   * 视频的长和宽
   * </pre>
   *
   * <code>optional int32 width = 1;</code>
   */
  public int getWidth() {
    return width_;
  }
  /**
   * <pre>
   * 视频的长和宽
   * </pre>
   *
   * <code>optional int32 width = 1;</code>
   */
  private void setWidth(int value) {
    
    width_ = value;
  }
  /**
   * <pre>
   * 视频的长和宽
   * </pre>
   *
   * <code>optional int32 width = 1;</code>
   */
  private void clearWidth() {
    
    width_ = 0;
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private int height_;
  /**
   * <code>optional int32 height = 2;</code>
   */
  public int getHeight() {
    return height_;
  }
  /**
   * <code>optional int32 height = 2;</code>
   */
  private void setHeight(int value) {
    
    height_ = value;
  }
  /**
   * <code>optional int32 height = 2;</code>
   */
  private void clearHeight() {
    
    height_ = 0;
  }

  public static final int CODEC_TYPE_FIELD_NUMBER = 3;
  private java.lang.String codecType_;
  /**
   * <pre>
   * 编解码器的名称
   * </pre>
   *
   * <code>optional string codec_type = 3;</code>
   */
  public java.lang.String getCodecType() {
    return codecType_;
  }
  /**
   * <pre>
   * 编解码器的名称
   * </pre>
   *
   * <code>optional string codec_type = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCodecTypeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(codecType_);
  }
  /**
   * <pre>
   * 编解码器的名称
   * </pre>
   *
   * <code>optional string codec_type = 3;</code>
   */
  private void setCodecType(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    codecType_ = value;
  }
  /**
   * <pre>
   * 编解码器的名称
   * </pre>
   *
   * <code>optional string codec_type = 3;</code>
   */
  private void clearCodecType() {
    
    codecType_ = getDefaultInstance().getCodecType();
  }
  /**
   * <pre>
   * 编解码器的名称
   * </pre>
   *
   * <code>optional string codec_type = 3;</code>
   */
  private void setCodecTypeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    codecType_ = value.toStringUtf8();
  }
  
  public static final int AVG_FRAME_RATE_FIELD_NUMBER = 4;
  private com.whensunset.wsvideoeditorsdk.model.Rational avgFrameRate_;
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
   */
  public boolean hasAvgFrameRate() {
    return avgFrameRate_ != null;
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
   */
  public com.whensunset.wsvideoeditorsdk.model.Rational getAvgFrameRate() {
    return avgFrameRate_ == null ? com.whensunset.wsvideoeditorsdk.model.Rational.getDefaultInstance() : avgFrameRate_;
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
   */
  private void setAvgFrameRate(com.whensunset.wsvideoeditorsdk.model.Rational value) {
    if (value == null) {
      throw new NullPointerException();
    }
    avgFrameRate_ = value;
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
   */
  private void setAvgFrameRate(
      com.whensunset.wsvideoeditorsdk.model.Rational.Builder builderForValue) {
    avgFrameRate_ = builderForValue.build();
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
   */
  private void mergeAvgFrameRate(com.whensunset.wsvideoeditorsdk.model.Rational value) {
    if (avgFrameRate_ != null &&
        avgFrameRate_ != com.whensunset.wsvideoeditorsdk.model.Rational.getDefaultInstance()) {
      avgFrameRate_ =
          com.whensunset.wsvideoeditorsdk.model.Rational.newBuilder(avgFrameRate_).mergeFrom(value).buildPartial();
    } else {
      avgFrameRate_ = value;
    }
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
   */
  private void clearAvgFrameRate() {
    avgFrameRate_ = null;
    
  }
  
  public static final int TIME_BASE_FIELD_NUMBER = 5;
  private com.whensunset.wsvideoeditorsdk.model.Rational timeBase_;
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
   */
  public boolean hasTimeBase() {
    return timeBase_ != null;
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
   */
  public com.whensunset.wsvideoeditorsdk.model.Rational getTimeBase() {
    return timeBase_ == null ? com.whensunset.wsvideoeditorsdk.model.Rational.getDefaultInstance() : timeBase_;
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
   */
  private void setTimeBase(com.whensunset.wsvideoeditorsdk.model.Rational value) {
    if (value == null) {
      throw new NullPointerException();
    }
    timeBase_ = value;
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
   */
  private void setTimeBase(
      com.whensunset.wsvideoeditorsdk.model.Rational.Builder builderForValue) {
    timeBase_ = builderForValue.build();
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
   */
  private void mergeTimeBase(com.whensunset.wsvideoeditorsdk.model.Rational value) {
    if (timeBase_ != null &&
        timeBase_ != com.whensunset.wsvideoeditorsdk.model.Rational.getDefaultInstance()) {
      timeBase_ =
          com.whensunset.wsvideoeditorsdk.model.Rational.newBuilder(timeBase_).mergeFrom(value).buildPartial();
    } else {
      timeBase_ = value;
    }
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
   */
  private void clearTimeBase() {
    timeBase_ = null;
    
  }
  
  public static final int DURATION_TS_FIELD_NUMBER = 6;
  private long durationTs_;
  
  /**
   * <code>optional int64 duration_ts = 6;</code>
   */
  public long getDurationTs() {
    return durationTs_;
  }
  
  /**
   * <code>optional int64 duration_ts = 6;</code>
   */
  private void setDurationTs(long value) {
    
    durationTs_ = value;
  }
  
  /**
   * <code>optional int64 duration_ts = 6;</code>
   */
  private void clearDurationTs() {
    
    durationTs_ = 0L;
  }
  
  public static final int ROTATION_FIELD_NUMBER = 7;
  private int rotation_;
  /**
   * <pre>
   * 视频的旋转角度
   * </pre>
   *
   * <code>optional int32 rotation = 7;</code>
   */
  public int getRotation() {
    return rotation_;
  }
  /**
   * <pre>
   * 视频的旋转角度
   * </pre>
   *
   * <code>optional int32 rotation = 7;</code>
   */
  private void setRotation(int value) {
    
    rotation_ = value;
  }
  /**
   * <pre>
   * 视频的旋转角度
   * </pre>
   *
   * <code>optional int32 rotation = 7;</code>
   */
  private void clearRotation() {
    
    rotation_ = 0;
  }
  
  public static final int SAMPLE_ASPECT_RATIO_FIELD_NUMBER = 8;
  private com.whensunset.wsvideoeditorsdk.model.Rational sampleAspectRatio_;
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
   */
  public boolean hasSampleAspectRatio() {
    return sampleAspectRatio_ != null;
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
   */
  public com.whensunset.wsvideoeditorsdk.model.Rational getSampleAspectRatio() {
    return sampleAspectRatio_ == null ? com.whensunset.wsvideoeditorsdk.model.Rational.getDefaultInstance() : sampleAspectRatio_;
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
   */
  private void setSampleAspectRatio(com.whensunset.wsvideoeditorsdk.model.Rational value) {
    if (value == null) {
      throw new NullPointerException();
    }
    sampleAspectRatio_ = value;
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
   */
  private void setSampleAspectRatio(
      com.whensunset.wsvideoeditorsdk.model.Rational.Builder builderForValue) {
    sampleAspectRatio_ = builderForValue.build();
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
   */
  private void mergeSampleAspectRatio(com.whensunset.wsvideoeditorsdk.model.Rational value) {
    if (sampleAspectRatio_ != null &&
        sampleAspectRatio_ != com.whensunset.wsvideoeditorsdk.model.Rational.getDefaultInstance()) {
      sampleAspectRatio_ =
          com.whensunset.wsvideoeditorsdk.model.Rational.newBuilder(sampleAspectRatio_).mergeFrom(value).buildPartial();
    } else {
      sampleAspectRatio_ = value;
    }
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
   */
  private void clearSampleAspectRatio() {
    sampleAspectRatio_ = null;
    
  }
  
  public static final int GUESSED_FRAME_RATE_FIELD_NUMBER = 9;
  private com.whensunset.wsvideoeditorsdk.model.Rational guessedFrameRate_;
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
   */
  public boolean hasGuessedFrameRate() {
    return guessedFrameRate_ != null;
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
   */
  public com.whensunset.wsvideoeditorsdk.model.Rational getGuessedFrameRate() {
    return guessedFrameRate_ == null ? com.whensunset.wsvideoeditorsdk.model.Rational.getDefaultInstance() : guessedFrameRate_;
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
   */
  private void setGuessedFrameRate(com.whensunset.wsvideoeditorsdk.model.Rational value) {
    if (value == null) {
      throw new NullPointerException();
    }
    guessedFrameRate_ = value;
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
   */
  private void setGuessedFrameRate(
      com.whensunset.wsvideoeditorsdk.model.Rational.Builder builderForValue) {
    guessedFrameRate_ = builderForValue.build();
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
   */
  private void mergeGuessedFrameRate(com.whensunset.wsvideoeditorsdk.model.Rational value) {
    if (guessedFrameRate_ != null &&
        guessedFrameRate_ != com.whensunset.wsvideoeditorsdk.model.Rational.getDefaultInstance()) {
      guessedFrameRate_ =
          com.whensunset.wsvideoeditorsdk.model.Rational.newBuilder(guessedFrameRate_).mergeFrom(value).buildPartial();
    } else {
      guessedFrameRate_ = value;
    }
    
  }
  
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
   */
  private void clearGuessedFrameRate() {
    guessedFrameRate_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (width_ != 0) {
      output.writeInt32(1, width_);
    }
    if (height_ != 0) {
      output.writeInt32(2, height_);
    }
    if (!codecType_.isEmpty()) {
      output.writeString(3, getCodecType());
    }
    if (avgFrameRate_ != null) {
      output.writeMessage(4, getAvgFrameRate());
    }
    if (timeBase_ != null) {
      output.writeMessage(5, getTimeBase());
    }
    if (durationTs_ != 0L) {
      output.writeInt64(6, durationTs_);
    }
    if (rotation_ != 0) {
      output.writeInt32(7, rotation_);
    }
    if (sampleAspectRatio_ != null) {
      output.writeMessage(8, getSampleAspectRatio());
    }
    if (guessedFrameRate_ != null) {
      output.writeMessage(9, getGuessedFrameRate());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (width_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, width_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, height_);
    }
    if (!codecType_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getCodecType());
    }
    if (avgFrameRate_ != null) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getAvgFrameRate());
    }
    if (timeBase_ != null) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getTimeBase());
    }
    if (durationTs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, durationTs_);
    }
    if (rotation_ != 0) {
      size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, rotation_);
    }
    if (sampleAspectRatio_ != null) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getSampleAspectRatio());
    }
    if (guessedFrameRate_ != null) {
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getGuessedFrameRate());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * 一个多媒体文件的一个多媒体数据流的信息
   * </pre>
   *
   * Protobuf type {@code whensunset.wsvideoeditor.model.MediaStreamHolder}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder, Builder> implements
      // @@protoc_insertion_point(builder_implements:whensunset.wsvideoeditor.model.MediaStreamHolder)
      com.whensunset.wsvideoeditorsdk.model.MediaStreamHolderOrBuilder {
    // Construct using com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * 视频的长和宽
     * </pre>
     *
     * <code>optional int32 width = 1;</code>
     */
    public int getWidth() {
      return instance.getWidth();
    }
    /**
     * <pre>
     * 视频的长和宽
     * </pre>
     *
     * <code>optional int32 width = 1;</code>
     */
    public Builder setWidth(int value) {
      copyOnWrite();
      instance.setWidth(value);
      return this;
    }
    /**
     * <pre>
     * 视频的长和宽
     * </pre>
     *
     * <code>optional int32 width = 1;</code>
     */
    public Builder clearWidth() {
      copyOnWrite();
      instance.clearWidth();
      return this;
    }

    /**
     * <code>optional int32 height = 2;</code>
     */
    public int getHeight() {
      return instance.getHeight();
    }
    /**
     * <code>optional int32 height = 2;</code>
     */
    public Builder setHeight(int value) {
      copyOnWrite();
      instance.setHeight(value);
      return this;
    }
    /**
     * <code>optional int32 height = 2;</code>
     */
    public Builder clearHeight() {
      copyOnWrite();
      instance.clearHeight();
      return this;
    }

    /**
     * <pre>
     * 编解码器的名称
     * </pre>
     *
     * <code>optional string codec_type = 3;</code>
     */
    public java.lang.String getCodecType() {
      return instance.getCodecType();
    }
    /**
     * <pre>
     * 编解码器的名称
     * </pre>
     *
     * <code>optional string codec_type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCodecTypeBytes() {
      return instance.getCodecTypeBytes();
    }
    /**
     * <pre>
     * 编解码器的名称
     * </pre>
     *
     * <code>optional string codec_type = 3;</code>
     */
    public Builder setCodecType(
        java.lang.String value) {
      copyOnWrite();
      instance.setCodecType(value);
      return this;
    }
    /**
     * <pre>
     * 编解码器的名称
     * </pre>
     *
     * <code>optional string codec_type = 3;</code>
     */
    public Builder clearCodecType() {
      copyOnWrite();
      instance.clearCodecType();
      return this;
    }
    /**
     * <pre>
     * 编解码器的名称
     * </pre>
     *
     * <code>optional string codec_type = 3;</code>
     */
    public Builder setCodecTypeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCodecTypeBytes(value);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
     */
    public boolean hasAvgFrameRate() {
      return instance.hasAvgFrameRate();
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
     */
    public com.whensunset.wsvideoeditorsdk.model.Rational getAvgFrameRate() {
      return instance.getAvgFrameRate();
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
     */
    public Builder setAvgFrameRate(com.whensunset.wsvideoeditorsdk.model.Rational value) {
      copyOnWrite();
      instance.setAvgFrameRate(value);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
     */
    public Builder setAvgFrameRate(
        com.whensunset.wsvideoeditorsdk.model.Rational.Builder builderForValue) {
      copyOnWrite();
      instance.setAvgFrameRate(builderForValue);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
     */
    public Builder mergeAvgFrameRate(com.whensunset.wsvideoeditorsdk.model.Rational value) {
      copyOnWrite();
      instance.mergeAvgFrameRate(value);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
     */
    public Builder clearAvgFrameRate() {
      copyOnWrite();
      instance.clearAvgFrameRate();
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
     */
    public boolean hasTimeBase() {
      return instance.hasTimeBase();
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
     */
    public com.whensunset.wsvideoeditorsdk.model.Rational getTimeBase() {
      return instance.getTimeBase();
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
     */
    public Builder setTimeBase(com.whensunset.wsvideoeditorsdk.model.Rational value) {
      copyOnWrite();
      instance.setTimeBase(value);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
     */
    public Builder setTimeBase(
        com.whensunset.wsvideoeditorsdk.model.Rational.Builder builderForValue) {
      copyOnWrite();
      instance.setTimeBase(builderForValue);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
     */
    public Builder mergeTimeBase(com.whensunset.wsvideoeditorsdk.model.Rational value) {
      copyOnWrite();
      instance.mergeTimeBase(value);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
     */
    public Builder clearTimeBase() {
      copyOnWrite();
      instance.clearTimeBase();
      return this;
    }
  
    /**
     * <code>optional int64 duration_ts = 6;</code>
     */
    public long getDurationTs() {
      return instance.getDurationTs();
    }
  
    /**
     * <code>optional int64 duration_ts = 6;</code>
     */
    public Builder setDurationTs(long value) {
      copyOnWrite();
      instance.setDurationTs(value);
      return this;
    }
  
    /**
     * <code>optional int64 duration_ts = 6;</code>
     */
    public Builder clearDurationTs() {
      copyOnWrite();
      instance.clearDurationTs();
      return this;
    }

    /**
     * <pre>
     * 视频的旋转角度
     * </pre>
     *
     * <code>optional int32 rotation = 7;</code>
     */
    public int getRotation() {
      return instance.getRotation();
    }
    /**
     * <pre>
     * 视频的旋转角度
     * </pre>
     *
     * <code>optional int32 rotation = 7;</code>
     */
    public Builder setRotation(int value) {
      copyOnWrite();
      instance.setRotation(value);
      return this;
    }
    /**
     * <pre>
     * 视频的旋转角度
     * </pre>
     *
     * <code>optional int32 rotation = 7;</code>
     */
    public Builder clearRotation() {
      copyOnWrite();
      instance.clearRotation();
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
     */
    public boolean hasSampleAspectRatio() {
      return instance.hasSampleAspectRatio();
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
     */
    public com.whensunset.wsvideoeditorsdk.model.Rational getSampleAspectRatio() {
      return instance.getSampleAspectRatio();
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
     */
    public Builder setSampleAspectRatio(com.whensunset.wsvideoeditorsdk.model.Rational value) {
      copyOnWrite();
      instance.setSampleAspectRatio(value);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
     */
    public Builder setSampleAspectRatio(
        com.whensunset.wsvideoeditorsdk.model.Rational.Builder builderForValue) {
      copyOnWrite();
      instance.setSampleAspectRatio(builderForValue);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
     */
    public Builder mergeSampleAspectRatio(com.whensunset.wsvideoeditorsdk.model.Rational value) {
      copyOnWrite();
      instance.mergeSampleAspectRatio(value);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
     */
    public Builder clearSampleAspectRatio() {
      copyOnWrite();
      instance.clearSampleAspectRatio();
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
     */
    public boolean hasGuessedFrameRate() {
      return instance.hasGuessedFrameRate();
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
     */
    public com.whensunset.wsvideoeditorsdk.model.Rational getGuessedFrameRate() {
      return instance.getGuessedFrameRate();
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
     */
    public Builder setGuessedFrameRate(com.whensunset.wsvideoeditorsdk.model.Rational value) {
      copyOnWrite();
      instance.setGuessedFrameRate(value);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
     */
    public Builder setGuessedFrameRate(
        com.whensunset.wsvideoeditorsdk.model.Rational.Builder builderForValue) {
      copyOnWrite();
      instance.setGuessedFrameRate(builderForValue);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
     */
    public Builder mergeGuessedFrameRate(com.whensunset.wsvideoeditorsdk.model.Rational value) {
      copyOnWrite();
      instance.mergeGuessedFrameRate(value);
      return this;
    }
  
    /**
     * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
     */
    public Builder clearGuessedFrameRate() {
      copyOnWrite();
      instance.clearGuessedFrameRate();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:whensunset.wsvideoeditor.model.MediaStreamHolder)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder();
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
        com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder other = (com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder) arg1;
        width_ = visitor.visitInt(width_ != 0, width_,
            other.width_ != 0, other.width_);
        height_ = visitor.visitInt(height_ != 0, height_,
            other.height_ != 0, other.height_);
        codecType_ = visitor.visitString(!codecType_.isEmpty(), codecType_,
            !other.codecType_.isEmpty(), other.codecType_);
        avgFrameRate_ = visitor.visitMessage(avgFrameRate_, other.avgFrameRate_);
        timeBase_ = visitor.visitMessage(timeBase_, other.timeBase_);
        durationTs_ = visitor.visitLong(durationTs_ != 0L, durationTs_,
            other.durationTs_ != 0L, other.durationTs_);
        rotation_ = visitor.visitInt(rotation_ != 0, rotation_,
            other.rotation_ != 0, other.rotation_);
        sampleAspectRatio_ = visitor.visitMessage(sampleAspectRatio_, other.sampleAspectRatio_);
        guessedFrameRate_ = visitor.visitMessage(guessedFrameRate_, other.guessedFrameRate_);
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

                width_ = input.readInt32();
                break;
              }
              case 16: {

                height_ = input.readInt32();
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                codecType_ = s;
                break;
              }
              case 34: {
                com.whensunset.wsvideoeditorsdk.model.Rational.Builder subBuilder = null;
                if (avgFrameRate_ != null) {
                  subBuilder = avgFrameRate_.toBuilder();
                }
                avgFrameRate_ = input.readMessage(com.whensunset.wsvideoeditorsdk.model.Rational.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(avgFrameRate_);
                  avgFrameRate_ = subBuilder.buildPartial();
                }
    
                break;
              }
              case 42: {
                com.whensunset.wsvideoeditorsdk.model.Rational.Builder subBuilder = null;
                if (timeBase_ != null) {
                  subBuilder = timeBase_.toBuilder();
                }
                timeBase_ = input.readMessage(com.whensunset.wsvideoeditorsdk.model.Rational.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(timeBase_);
                  timeBase_ = subBuilder.buildPartial();
                }
    
                break;
              }
              case 48: {
    
                durationTs_ = input.readInt64();
                break;
              }
              case 56: {
    
                rotation_ = input.readInt32();
                break;
              }
              case 66: {
                com.whensunset.wsvideoeditorsdk.model.Rational.Builder subBuilder = null;
                if (sampleAspectRatio_ != null) {
                  subBuilder = sampleAspectRatio_.toBuilder();
                }
                sampleAspectRatio_ = input.readMessage(com.whensunset.wsvideoeditorsdk.model.Rational.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(sampleAspectRatio_);
                  sampleAspectRatio_ = subBuilder.buildPartial();
                }
    
                break;
              }
              case 74: {
                com.whensunset.wsvideoeditorsdk.model.Rational.Builder subBuilder = null;
                if (guessedFrameRate_ != null) {
                  subBuilder = guessedFrameRate_.toBuilder();
                }
                guessedFrameRate_ = input.readMessage(com.whensunset.wsvideoeditorsdk.model.Rational.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(guessedFrameRate_);
                  guessedFrameRate_ = subBuilder.buildPartial();
                }
    
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
        if (PARSER == null) {    synchronized (com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder.class) {
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


  // @@protoc_insertion_point(class_scope:whensunset.wsvideoeditor.model.MediaStreamHolder)
  private static final com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MediaStreamHolder();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.whensunset.wsvideoeditorsdk.model.MediaStreamHolder getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<MediaStreamHolder> PARSER;

  public static com.google.protobuf.Parser<MediaStreamHolder> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

