// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class USN_TRACK_MODIFIED_RANGES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("Unused"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ChunkSize"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("FileSizeThreshold")
    );
    public static MemoryLayout $LAYOUT() {
        return USN_TRACK_MODIFIED_RANGES.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return USN_TRACK_MODIFIED_RANGES.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)USN_TRACK_MODIFIED_RANGES.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        USN_TRACK_MODIFIED_RANGES.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)USN_TRACK_MODIFIED_RANGES.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        USN_TRACK_MODIFIED_RANGES.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Unused$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Unused"));
    public static VarHandle Unused$VH() {
        return USN_TRACK_MODIFIED_RANGES.Unused$VH;
    }
    public static int Unused$get(MemorySegment seg) {
        return (int)USN_TRACK_MODIFIED_RANGES.Unused$VH.get(seg);
    }
    public static void Unused$set( MemorySegment seg, int x) {
        USN_TRACK_MODIFIED_RANGES.Unused$VH.set(seg, x);
    }
    public static int Unused$get(MemorySegment seg, long index) {
        return (int)USN_TRACK_MODIFIED_RANGES.Unused$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unused$set(MemorySegment seg, long index, int x) {
        USN_TRACK_MODIFIED_RANGES.Unused$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ChunkSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ChunkSize"));
    public static VarHandle ChunkSize$VH() {
        return USN_TRACK_MODIFIED_RANGES.ChunkSize$VH;
    }
    public static long ChunkSize$get(MemorySegment seg) {
        return (long)USN_TRACK_MODIFIED_RANGES.ChunkSize$VH.get(seg);
    }
    public static void ChunkSize$set( MemorySegment seg, long x) {
        USN_TRACK_MODIFIED_RANGES.ChunkSize$VH.set(seg, x);
    }
    public static long ChunkSize$get(MemorySegment seg, long index) {
        return (long)USN_TRACK_MODIFIED_RANGES.ChunkSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ChunkSize$set(MemorySegment seg, long index, long x) {
        USN_TRACK_MODIFIED_RANGES.ChunkSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileSizeThreshold$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileSizeThreshold"));
    public static VarHandle FileSizeThreshold$VH() {
        return USN_TRACK_MODIFIED_RANGES.FileSizeThreshold$VH;
    }
    public static long FileSizeThreshold$get(MemorySegment seg) {
        return (long)USN_TRACK_MODIFIED_RANGES.FileSizeThreshold$VH.get(seg);
    }
    public static void FileSizeThreshold$set( MemorySegment seg, long x) {
        USN_TRACK_MODIFIED_RANGES.FileSizeThreshold$VH.set(seg, x);
    }
    public static long FileSizeThreshold$get(MemorySegment seg, long index) {
        return (long)USN_TRACK_MODIFIED_RANGES.FileSizeThreshold$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileSizeThreshold$set(MemorySegment seg, long index, long x) {
        USN_TRACK_MODIFIED_RANGES.FileSizeThreshold$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


