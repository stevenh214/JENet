// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RPC_CALL_LOCAL_ADDRESS_V1 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("Buffer"),
        Constants$root.C_LONG$LAYOUT.withName("BufferSize"),
        Constants$root.C_LONG$LAYOUT.withName("AddressFormat")
    ).withName("_RPC_CALL_LOCAL_ADDRESS_V1");
    public static MemoryLayout $LAYOUT() {
        return _RPC_CALL_LOCAL_ADDRESS_V1.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _RPC_CALL_LOCAL_ADDRESS_V1.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_RPC_CALL_LOCAL_ADDRESS_V1.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _RPC_CALL_LOCAL_ADDRESS_V1.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_RPC_CALL_LOCAL_ADDRESS_V1.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _RPC_CALL_LOCAL_ADDRESS_V1.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Buffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Buffer"));
    public static VarHandle Buffer$VH() {
        return _RPC_CALL_LOCAL_ADDRESS_V1.Buffer$VH;
    }
    public static MemoryAddress Buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_CALL_LOCAL_ADDRESS_V1.Buffer$VH.get(seg);
    }
    public static void Buffer$set( MemorySegment seg, MemoryAddress x) {
        _RPC_CALL_LOCAL_ADDRESS_V1.Buffer$VH.set(seg, x);
    }
    public static MemoryAddress Buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_CALL_LOCAL_ADDRESS_V1.Buffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Buffer$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_CALL_LOCAL_ADDRESS_V1.Buffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BufferSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BufferSize"));
    public static VarHandle BufferSize$VH() {
        return _RPC_CALL_LOCAL_ADDRESS_V1.BufferSize$VH;
    }
    public static int BufferSize$get(MemorySegment seg) {
        return (int)_RPC_CALL_LOCAL_ADDRESS_V1.BufferSize$VH.get(seg);
    }
    public static void BufferSize$set( MemorySegment seg, int x) {
        _RPC_CALL_LOCAL_ADDRESS_V1.BufferSize$VH.set(seg, x);
    }
    public static int BufferSize$get(MemorySegment seg, long index) {
        return (int)_RPC_CALL_LOCAL_ADDRESS_V1.BufferSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferSize$set(MemorySegment seg, long index, int x) {
        _RPC_CALL_LOCAL_ADDRESS_V1.BufferSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AddressFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddressFormat"));
    public static VarHandle AddressFormat$VH() {
        return _RPC_CALL_LOCAL_ADDRESS_V1.AddressFormat$VH;
    }
    public static int AddressFormat$get(MemorySegment seg) {
        return (int)_RPC_CALL_LOCAL_ADDRESS_V1.AddressFormat$VH.get(seg);
    }
    public static void AddressFormat$set( MemorySegment seg, int x) {
        _RPC_CALL_LOCAL_ADDRESS_V1.AddressFormat$VH.set(seg, x);
    }
    public static int AddressFormat$get(MemorySegment seg, long index) {
        return (int)_RPC_CALL_LOCAL_ADDRESS_V1.AddressFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressFormat$set(MemorySegment seg, long index, int x) {
        _RPC_CALL_LOCAL_ADDRESS_V1.AddressFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


