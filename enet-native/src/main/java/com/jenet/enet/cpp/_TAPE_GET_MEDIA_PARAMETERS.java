// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TAPE_GET_MEDIA_PARAMETERS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
        ).withName("Capacity"),
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
        ).withName("Remaining"),
        Constants$root.C_LONG$LAYOUT.withName("BlockSize"),
        Constants$root.C_LONG$LAYOUT.withName("PartitionCount"),
        Constants$root.C_CHAR$LAYOUT.withName("WriteProtected"),
        MemoryLayout.paddingLayout(56)
    ).withName("_TAPE_GET_MEDIA_PARAMETERS");
    public static MemoryLayout $LAYOUT() {
        return _TAPE_GET_MEDIA_PARAMETERS.$struct$LAYOUT;
    }
    public static MemorySegment Capacity$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment Remaining$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle BlockSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BlockSize"));
    public static VarHandle BlockSize$VH() {
        return _TAPE_GET_MEDIA_PARAMETERS.BlockSize$VH;
    }
    public static int BlockSize$get(MemorySegment seg) {
        return (int)_TAPE_GET_MEDIA_PARAMETERS.BlockSize$VH.get(seg);
    }
    public static void BlockSize$set( MemorySegment seg, int x) {
        _TAPE_GET_MEDIA_PARAMETERS.BlockSize$VH.set(seg, x);
    }
    public static int BlockSize$get(MemorySegment seg, long index) {
        return (int)_TAPE_GET_MEDIA_PARAMETERS.BlockSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BlockSize$set(MemorySegment seg, long index, int x) {
        _TAPE_GET_MEDIA_PARAMETERS.BlockSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PartitionCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PartitionCount"));
    public static VarHandle PartitionCount$VH() {
        return _TAPE_GET_MEDIA_PARAMETERS.PartitionCount$VH;
    }
    public static int PartitionCount$get(MemorySegment seg) {
        return (int)_TAPE_GET_MEDIA_PARAMETERS.PartitionCount$VH.get(seg);
    }
    public static void PartitionCount$set( MemorySegment seg, int x) {
        _TAPE_GET_MEDIA_PARAMETERS.PartitionCount$VH.set(seg, x);
    }
    public static int PartitionCount$get(MemorySegment seg, long index) {
        return (int)_TAPE_GET_MEDIA_PARAMETERS.PartitionCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionCount$set(MemorySegment seg, long index, int x) {
        _TAPE_GET_MEDIA_PARAMETERS.PartitionCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WriteProtected$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WriteProtected"));
    public static VarHandle WriteProtected$VH() {
        return _TAPE_GET_MEDIA_PARAMETERS.WriteProtected$VH;
    }
    public static byte WriteProtected$get(MemorySegment seg) {
        return (byte)_TAPE_GET_MEDIA_PARAMETERS.WriteProtected$VH.get(seg);
    }
    public static void WriteProtected$set( MemorySegment seg, byte x) {
        _TAPE_GET_MEDIA_PARAMETERS.WriteProtected$VH.set(seg, x);
    }
    public static byte WriteProtected$get(MemorySegment seg, long index) {
        return (byte)_TAPE_GET_MEDIA_PARAMETERS.WriteProtected$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WriteProtected$set(MemorySegment seg, long index, byte x) {
        _TAPE_GET_MEDIA_PARAMETERS.WriteProtected$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


