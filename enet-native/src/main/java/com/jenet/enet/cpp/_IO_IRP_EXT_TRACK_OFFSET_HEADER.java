// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IO_IRP_EXT_TRACK_OFFSET_HEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Validation"),
        Constants$root.C_SHORT$LAYOUT.withName("Flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("TrackedOffsetCallback")
    ).withName("_IO_IRP_EXT_TRACK_OFFSET_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _IO_IRP_EXT_TRACK_OFFSET_HEADER.$struct$LAYOUT;
    }
    static final VarHandle Validation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Validation"));
    public static VarHandle Validation$VH() {
        return _IO_IRP_EXT_TRACK_OFFSET_HEADER.Validation$VH;
    }
    public static short Validation$get(MemorySegment seg) {
        return (short)_IO_IRP_EXT_TRACK_OFFSET_HEADER.Validation$VH.get(seg);
    }
    public static void Validation$set( MemorySegment seg, short x) {
        _IO_IRP_EXT_TRACK_OFFSET_HEADER.Validation$VH.set(seg, x);
    }
    public static short Validation$get(MemorySegment seg, long index) {
        return (short)_IO_IRP_EXT_TRACK_OFFSET_HEADER.Validation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Validation$set(MemorySegment seg, long index, short x) {
        _IO_IRP_EXT_TRACK_OFFSET_HEADER.Validation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _IO_IRP_EXT_TRACK_OFFSET_HEADER.Flags$VH;
    }
    public static short Flags$get(MemorySegment seg) {
        return (short)_IO_IRP_EXT_TRACK_OFFSET_HEADER.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, short x) {
        _IO_IRP_EXT_TRACK_OFFSET_HEADER.Flags$VH.set(seg, x);
    }
    public static short Flags$get(MemorySegment seg, long index) {
        return (short)_IO_IRP_EXT_TRACK_OFFSET_HEADER.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, short x) {
        _IO_IRP_EXT_TRACK_OFFSET_HEADER.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TrackedOffsetCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TrackedOffsetCallback"));
    public static VarHandle TrackedOffsetCallback$VH() {
        return _IO_IRP_EXT_TRACK_OFFSET_HEADER.TrackedOffsetCallback$VH;
    }
    public static MemoryAddress TrackedOffsetCallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_IO_IRP_EXT_TRACK_OFFSET_HEADER.TrackedOffsetCallback$VH.get(seg);
    }
    public static void TrackedOffsetCallback$set( MemorySegment seg, MemoryAddress x) {
        _IO_IRP_EXT_TRACK_OFFSET_HEADER.TrackedOffsetCallback$VH.set(seg, x);
    }
    public static MemoryAddress TrackedOffsetCallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_IO_IRP_EXT_TRACK_OFFSET_HEADER.TrackedOffsetCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TrackedOffsetCallback$set(MemorySegment seg, long index, MemoryAddress x) {
        _IO_IRP_EXT_TRACK_OFFSET_HEADER.TrackedOffsetCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK TrackedOffsetCallback (MemorySegment segment, MemorySession session) {
        return PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK.ofAddress(TrackedOffsetCallback$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


