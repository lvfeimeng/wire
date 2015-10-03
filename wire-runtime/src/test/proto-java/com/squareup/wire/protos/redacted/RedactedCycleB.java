// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/redacted_test.proto at 44:1
package com.squareup.wire.protos.redacted;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

public final class RedactedCycleB extends Message<RedactedCycleB, RedactedCycleB.Builder> {
  public static final ProtoAdapter<RedactedCycleB> ADAPTER = ProtoAdapter.newMessageAdapter(RedactedCycleB.class);

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.protos.redacted.RedactedCycleA#ADAPTER"
  )
  public final RedactedCycleA a;

  public RedactedCycleB(RedactedCycleA a) {
    this(a, ByteString.EMPTY);
  }

  public RedactedCycleB(RedactedCycleA a, ByteString unknownFields) {
    super(unknownFields);
    this.a = a;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.a = a;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RedactedCycleB)) return false;
    RedactedCycleB o = (RedactedCycleB) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(a, o.a);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (a != null ? a.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<RedactedCycleB, Builder> {
    public RedactedCycleA a;

    public Builder() {
    }

    public Builder a(RedactedCycleA a) {
      this.a = a;
      return this;
    }

    @Override
    public RedactedCycleB build() {
      return new RedactedCycleB(a, buildUnknownFields());
    }
  }
}
