// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_ATTRIBUTES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cAttr"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgAttr")
    ).withName("_CRYPT_ATTRIBUTES");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_ATTRIBUTES.$struct$LAYOUT;
    }
    static final VarHandle cAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAttr"));
    public static VarHandle cAttr$VH() {
        return _CRYPT_ATTRIBUTES.cAttr$VH;
    }
    public static int cAttr$get(MemorySegment seg) {
        return (int)_CRYPT_ATTRIBUTES.cAttr$VH.get(seg);
    }
    public static void cAttr$set( MemorySegment seg, int x) {
        _CRYPT_ATTRIBUTES.cAttr$VH.set(seg, x);
    }
    public static int cAttr$get(MemorySegment seg, long index) {
        return (int)_CRYPT_ATTRIBUTES.cAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAttr$set(MemorySegment seg, long index, int x) {
        _CRYPT_ATTRIBUTES.cAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgAttr"));
    public static VarHandle rgAttr$VH() {
        return _CRYPT_ATTRIBUTES.rgAttr$VH;
    }
    public static MemoryAddress rgAttr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ATTRIBUTES.rgAttr$VH.get(seg);
    }
    public static void rgAttr$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_ATTRIBUTES.rgAttr$VH.set(seg, x);
    }
    public static MemoryAddress rgAttr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ATTRIBUTES.rgAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgAttr$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_ATTRIBUTES.rgAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

