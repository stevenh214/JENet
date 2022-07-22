// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TAPE_SET_POSITION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Method"),
        Constants$root.C_LONG$LAYOUT.withName("Partition"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("Offset"),
        Constants$root.C_CHAR$LAYOUT.withName("Immediate"),
        MemoryLayout.paddingLayout(56)
    ).withName("_TAPE_SET_POSITION");
    public static MemoryLayout $LAYOUT() {
        return _TAPE_SET_POSITION.$struct$LAYOUT;
    }
    static final VarHandle Method$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Method"));
    public static VarHandle Method$VH() {
        return _TAPE_SET_POSITION.Method$VH;
    }
    public static int Method$get(MemorySegment seg) {
        return (int)_TAPE_SET_POSITION.Method$VH.get(seg);
    }
    public static void Method$set( MemorySegment seg, int x) {
        _TAPE_SET_POSITION.Method$VH.set(seg, x);
    }
    public static int Method$get(MemorySegment seg, long index) {
        return (int)_TAPE_SET_POSITION.Method$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Method$set(MemorySegment seg, long index, int x) {
        _TAPE_SET_POSITION.Method$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Partition$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Partition"));
    public static VarHandle Partition$VH() {
        return _TAPE_SET_POSITION.Partition$VH;
    }
    public static int Partition$get(MemorySegment seg) {
        return (int)_TAPE_SET_POSITION.Partition$VH.get(seg);
    }
    public static void Partition$set( MemorySegment seg, int x) {
        _TAPE_SET_POSITION.Partition$VH.set(seg, x);
    }
    public static int Partition$get(MemorySegment seg, long index) {
        return (int)_TAPE_SET_POSITION.Partition$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Partition$set(MemorySegment seg, long index, int x) {
        _TAPE_SET_POSITION.Partition$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Offset$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle Immediate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Immediate"));
    public static VarHandle Immediate$VH() {
        return _TAPE_SET_POSITION.Immediate$VH;
    }
    public static byte Immediate$get(MemorySegment seg) {
        return (byte)_TAPE_SET_POSITION.Immediate$VH.get(seg);
    }
    public static void Immediate$set( MemorySegment seg, byte x) {
        _TAPE_SET_POSITION.Immediate$VH.set(seg, x);
    }
    public static byte Immediate$get(MemorySegment seg, long index) {
        return (byte)_TAPE_SET_POSITION.Immediate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Immediate$set(MemorySegment seg, long index, byte x) {
        _TAPE_SET_POSITION.Immediate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


