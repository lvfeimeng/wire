// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/unknown_fields.proto at 24:1
package com.squareup.wire.protos.unknownfields;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import okio.ByteString;

public final class VersionTwo extends Message<VersionTwo, VersionTwo.Builder> {
  public static final ProtoAdapter<VersionTwo> ADAPTER = ProtoAdapter.newMessageAdapter(VersionTwo.class);

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_I = 0;

  public static final Integer DEFAULT_V2_I = 0;

  public static final String DEFAULT_V2_S = "";

  public static final Integer DEFAULT_V2_F32 = 0;

  public static final Long DEFAULT_V2_F64 = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer i;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer v2_i;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String v2_s;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#FIXED32"
  )
  public final Integer v2_f32;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#FIXED64"
  )
  public final Long v2_f64;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> v2_rs;

  public VersionTwo(Integer i, Integer v2_i, String v2_s, Integer v2_f32, Long v2_f64, List<String> v2_rs) {
    this(i, v2_i, v2_s, v2_f32, v2_f64, v2_rs, ByteString.EMPTY);
  }

  public VersionTwo(Integer i, Integer v2_i, String v2_s, Integer v2_f32, Long v2_f64, List<String> v2_rs, ByteString unknownFields) {
    super(unknownFields);
    this.i = i;
    this.v2_i = v2_i;
    this.v2_s = v2_s;
    this.v2_f32 = v2_f32;
    this.v2_f64 = v2_f64;
    this.v2_rs = immutableCopyOf(v2_rs);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.i = i;
    builder.v2_i = v2_i;
    builder.v2_s = v2_s;
    builder.v2_f32 = v2_f32;
    builder.v2_f64 = v2_f64;
    builder.v2_rs = copyOf(v2_rs);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VersionTwo)) return false;
    VersionTwo o = (VersionTwo) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(i, o.i)
        && equals(v2_i, o.v2_i)
        && equals(v2_s, o.v2_s)
        && equals(v2_f32, o.v2_f32)
        && equals(v2_f64, o.v2_f64)
        && equals(v2_rs, o.v2_rs);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (i != null ? i.hashCode() : 0);
      result = result * 37 + (v2_i != null ? v2_i.hashCode() : 0);
      result = result * 37 + (v2_s != null ? v2_s.hashCode() : 0);
      result = result * 37 + (v2_f32 != null ? v2_f32.hashCode() : 0);
      result = result * 37 + (v2_f64 != null ? v2_f64.hashCode() : 0);
      result = result * 37 + (v2_rs != null ? v2_rs.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<VersionTwo, Builder> {
    public Integer i;

    public Integer v2_i;

    public String v2_s;

    public Integer v2_f32;

    public Long v2_f64;

    public List<String> v2_rs;

    public Builder() {
      v2_rs = newMutableList();
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    public Builder v2_i(Integer v2_i) {
      this.v2_i = v2_i;
      return this;
    }

    public Builder v2_s(String v2_s) {
      this.v2_s = v2_s;
      return this;
    }

    public Builder v2_f32(Integer v2_f32) {
      this.v2_f32 = v2_f32;
      return this;
    }

    public Builder v2_f64(Long v2_f64) {
      this.v2_f64 = v2_f64;
      return this;
    }

    public Builder v2_rs(List<String> v2_rs) {
      checkElementsNotNull(v2_rs);
      this.v2_rs = v2_rs;
      return this;
    }

    @Override
    public VersionTwo build() {
      return new VersionTwo(i, v2_i, v2_s, v2_f32, v2_f64, v2_rs, buildUnknownFields());
    }
  }
}
