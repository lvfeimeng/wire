// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/simple_service2.proto at 17:1
package com.squareup.services;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

public final class LetsDataResponse extends Message<LetsDataResponse, LetsDataResponse.Builder> {
  public static final ProtoAdapter<LetsDataResponse> ADAPTER = ProtoAdapter.newMessageAdapter(LetsDataResponse.class);

  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_DATA = ByteString.EMPTY;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString data;

  public LetsDataResponse(ByteString data) {
    this(data, ByteString.EMPTY);
  }

  public LetsDataResponse(ByteString data, ByteString unknownFields) {
    super(unknownFields);
    this.data = data;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.data = data;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LetsDataResponse)) return false;
    LetsDataResponse o = (LetsDataResponse) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(data, o.data);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (data != null ? data.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<LetsDataResponse, Builder> {
    public ByteString data;

    public Builder() {
    }

    public Builder data(ByteString data) {
      this.data = data;
      return this;
    }

    @Override
    public LetsDataResponse build() {
      return new LetsDataResponse(data, buildUnknownFields());
    }
  }
}
