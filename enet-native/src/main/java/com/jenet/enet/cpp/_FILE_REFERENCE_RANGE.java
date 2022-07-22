// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_REFERENCE_RANGE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("StartingFileReferenceNumber"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("EndingFileReferenceNumber")
    ).withName("_FILE_REFERENCE_RANGE");
    public static MemoryLayout $LAYOUT() {
        return _FILE_REFERENCE_RANGE.$struct$LAYOUT;
    }
    static final VarHandle StartingFileReferenceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartingFileReferenceNumber"));
    public static VarHandle StartingFileReferenceNumber$VH() {
        return _FILE_REFERENCE_RANGE.StartingFileReferenceNumber$VH;
    }
    public static long StartingFileReferenceNumber$get(MemorySegment seg) {
        return (long)_FILE_REFERENCE_RANGE.StartingFileReferenceNumber$VH.get(seg);
    }
    public static void StartingFileReferenceNumber$set( MemorySegment seg, long x) {
        _FILE_REFERENCE_RANGE.StartingFileReferenceNumber$VH.set(seg, x);
    }
    public static long StartingFileReferenceNumber$get(MemorySegment seg, long index) {
        return (long)_FILE_REFERENCE_RANGE.StartingFileReferenceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartingFileReferenceNumber$set(MemorySegment seg, long index, long x) {
        _FILE_REFERENCE_RANGE.StartingFileReferenceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EndingFileReferenceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EndingFileReferenceNumber"));
    public static VarHandle EndingFileReferenceNumber$VH() {
        return _FILE_REFERENCE_RANGE.EndingFileReferenceNumber$VH;
    }
    public static long EndingFileReferenceNumber$get(MemorySegment seg) {
        return (long)_FILE_REFERENCE_RANGE.EndingFileReferenceNumber$VH.get(seg);
    }
    public static void EndingFileReferenceNumber$set( MemorySegment seg, long x) {
        _FILE_REFERENCE_RANGE.EndingFileReferenceNumber$VH.set(seg, x);
    }
    public static long EndingFileReferenceNumber$get(MemorySegment seg, long index) {
        return (long)_FILE_REFERENCE_RANGE.EndingFileReferenceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EndingFileReferenceNumber$set(MemorySegment seg, long index, long x) {
        _FILE_REFERENCE_RANGE.EndingFileReferenceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

