// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RPC_IF_ID {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("Uuid"),
        Constants$root.C_SHORT$LAYOUT.withName("VersMajor"),
        Constants$root.C_SHORT$LAYOUT.withName("VersMinor")
    ).withName("_RPC_IF_ID");
    public static MemoryLayout $LAYOUT() {
        return _RPC_IF_ID.$struct$LAYOUT;
    }
    public static MemorySegment Uuid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle VersMajor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VersMajor"));
    public static VarHandle VersMajor$VH() {
        return _RPC_IF_ID.VersMajor$VH;
    }
    public static short VersMajor$get(MemorySegment seg) {
        return (short)_RPC_IF_ID.VersMajor$VH.get(seg);
    }
    public static void VersMajor$set( MemorySegment seg, short x) {
        _RPC_IF_ID.VersMajor$VH.set(seg, x);
    }
    public static short VersMajor$get(MemorySegment seg, long index) {
        return (short)_RPC_IF_ID.VersMajor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VersMajor$set(MemorySegment seg, long index, short x) {
        _RPC_IF_ID.VersMajor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VersMinor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VersMinor"));
    public static VarHandle VersMinor$VH() {
        return _RPC_IF_ID.VersMinor$VH;
    }
    public static short VersMinor$get(MemorySegment seg) {
        return (short)_RPC_IF_ID.VersMinor$VH.get(seg);
    }
    public static void VersMinor$set( MemorySegment seg, short x) {
        _RPC_IF_ID.VersMinor$VH.set(seg, x);
    }
    public static short VersMinor$get(MemorySegment seg, long index) {
        return (short)_RPC_IF_ID.VersMinor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VersMinor$set(MemorySegment seg, long index, short x) {
        _RPC_IF_ID.VersMinor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


