// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _HMAC_Info {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("HashAlgid"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pbInnerString"),
        Constants$root.C_LONG$LAYOUT.withName("cbInnerString"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pbOuterString"),
        Constants$root.C_LONG$LAYOUT.withName("cbOuterString"),
        MemoryLayout.paddingLayout(32)
    ).withName("_HMAC_Info");
    public static MemoryLayout $LAYOUT() {
        return _HMAC_Info.$struct$LAYOUT;
    }
    static final VarHandle HashAlgid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HashAlgid"));
    public static VarHandle HashAlgid$VH() {
        return _HMAC_Info.HashAlgid$VH;
    }
    public static int HashAlgid$get(MemorySegment seg) {
        return (int)_HMAC_Info.HashAlgid$VH.get(seg);
    }
    public static void HashAlgid$set( MemorySegment seg, int x) {
        _HMAC_Info.HashAlgid$VH.set(seg, x);
    }
    public static int HashAlgid$get(MemorySegment seg, long index) {
        return (int)_HMAC_Info.HashAlgid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HashAlgid$set(MemorySegment seg, long index, int x) {
        _HMAC_Info.HashAlgid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbInnerString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbInnerString"));
    public static VarHandle pbInnerString$VH() {
        return _HMAC_Info.pbInnerString$VH;
    }
    public static MemoryAddress pbInnerString$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_HMAC_Info.pbInnerString$VH.get(seg);
    }
    public static void pbInnerString$set( MemorySegment seg, MemoryAddress x) {
        _HMAC_Info.pbInnerString$VH.set(seg, x);
    }
    public static MemoryAddress pbInnerString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_HMAC_Info.pbInnerString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbInnerString$set(MemorySegment seg, long index, MemoryAddress x) {
        _HMAC_Info.pbInnerString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbInnerString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbInnerString"));
    public static VarHandle cbInnerString$VH() {
        return _HMAC_Info.cbInnerString$VH;
    }
    public static int cbInnerString$get(MemorySegment seg) {
        return (int)_HMAC_Info.cbInnerString$VH.get(seg);
    }
    public static void cbInnerString$set( MemorySegment seg, int x) {
        _HMAC_Info.cbInnerString$VH.set(seg, x);
    }
    public static int cbInnerString$get(MemorySegment seg, long index) {
        return (int)_HMAC_Info.cbInnerString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbInnerString$set(MemorySegment seg, long index, int x) {
        _HMAC_Info.cbInnerString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbOuterString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbOuterString"));
    public static VarHandle pbOuterString$VH() {
        return _HMAC_Info.pbOuterString$VH;
    }
    public static MemoryAddress pbOuterString$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_HMAC_Info.pbOuterString$VH.get(seg);
    }
    public static void pbOuterString$set( MemorySegment seg, MemoryAddress x) {
        _HMAC_Info.pbOuterString$VH.set(seg, x);
    }
    public static MemoryAddress pbOuterString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_HMAC_Info.pbOuterString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbOuterString$set(MemorySegment seg, long index, MemoryAddress x) {
        _HMAC_Info.pbOuterString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbOuterString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbOuterString"));
    public static VarHandle cbOuterString$VH() {
        return _HMAC_Info.cbOuterString$VH;
    }
    public static int cbOuterString$get(MemorySegment seg) {
        return (int)_HMAC_Info.cbOuterString$VH.get(seg);
    }
    public static void cbOuterString$set( MemorySegment seg, int x) {
        _HMAC_Info.cbOuterString$VH.set(seg, x);
    }
    public static int cbOuterString$get(MemorySegment seg, long index) {
        return (int)_HMAC_Info.cbOuterString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbOuterString$set(MemorySegment seg, long index, int x) {
        _HMAC_Info.cbOuterString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


