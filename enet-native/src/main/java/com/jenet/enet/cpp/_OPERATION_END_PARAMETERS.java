// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OPERATION_END_PARAMETERS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("OperationId"),
        Constants$root.C_LONG$LAYOUT.withName("Flags")
    ).withName("_OPERATION_END_PARAMETERS");
    public static MemoryLayout $LAYOUT() {
        return _OPERATION_END_PARAMETERS.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _OPERATION_END_PARAMETERS.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_OPERATION_END_PARAMETERS.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _OPERATION_END_PARAMETERS.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_OPERATION_END_PARAMETERS.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _OPERATION_END_PARAMETERS.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OperationId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OperationId"));
    public static VarHandle OperationId$VH() {
        return _OPERATION_END_PARAMETERS.OperationId$VH;
    }
    public static int OperationId$get(MemorySegment seg) {
        return (int)_OPERATION_END_PARAMETERS.OperationId$VH.get(seg);
    }
    public static void OperationId$set( MemorySegment seg, int x) {
        _OPERATION_END_PARAMETERS.OperationId$VH.set(seg, x);
    }
    public static int OperationId$get(MemorySegment seg, long index) {
        return (int)_OPERATION_END_PARAMETERS.OperationId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OperationId$set(MemorySegment seg, long index, int x) {
        _OPERATION_END_PARAMETERS.OperationId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _OPERATION_END_PARAMETERS.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_OPERATION_END_PARAMETERS.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _OPERATION_END_PARAMETERS.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_OPERATION_END_PARAMETERS.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _OPERATION_END_PARAMETERS.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


