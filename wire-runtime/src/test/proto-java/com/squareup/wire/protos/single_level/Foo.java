// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/single_level.proto at 20:1
package com.squareup.wire.protos.single_level;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

public final class Foo extends Message<Foo, Foo.Builder> {
  public static final ProtoAdapter<Foo> ADAPTER = ProtoAdapter.newMessageAdapter(Foo.class);

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_BAR = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer bar;

  public Foo(Integer bar) {
    this(bar, ByteString.EMPTY);
  }

  public Foo(Integer bar, ByteString unknownFields) {
    super(unknownFields);
    this.bar = bar;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.bar = bar;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Foo)) return false;
    Foo o = (Foo) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(bar, o.bar);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (bar != null ? bar.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<Foo, Builder> {
    public Integer bar;

    public Builder() {
    }

    public Builder bar(Integer bar) {
      this.bar = bar;
      return this;
    }

    @Override
    public Foo build() {
      return new Foo(bar, buildUnknownFields());
    }
  }
}
