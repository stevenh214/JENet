// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _HISTOGRAM_BUCKET {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Reads"),
        Constants$root.C_LONG$LAYOUT.withName("Writes")
    ).withName("_HISTOGRAM_BUCKET");
    public static MemoryLayout $LAYOUT() {
        return _HISTOGRAM_BUCKET.$struct$LAYOUT;
    }
    static final VarHandle Reads$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reads"));
    public static VarHandle Reads$VH() {
        return _HISTOGRAM_BUCKET.Reads$VH;
    }
    public static int Reads$get(MemorySegment seg) {
        return (int)_HISTOGRAM_BUCKET.Reads$VH.get(seg);
    }
    public static void Reads$set( MemorySegment seg, int x) {
        _HISTOGRAM_BUCKET.Reads$VH.set(seg, x);
    }
    public static int Reads$get(MemorySegment seg, long index) {
        return (int)_HISTOGRAM_BUCKET.Reads$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reads$set(MemorySegment seg, long index, int x) {
        _HISTOGRAM_BUCKET.Reads$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Writes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Writes"));
    public static VarHandle Writes$VH() {
        return _HISTOGRAM_BUCKET.Writes$VH;
    }
    public static int Writes$get(MemorySegment seg) {
        return (int)_HISTOGRAM_BUCKET.Writes$VH.get(seg);
    }
    public static void Writes$set( MemorySegment seg, int x) {
        _HISTOGRAM_BUCKET.Writes$VH.set(seg, x);
    }
    public static int Writes$get(MemorySegment seg, long index) {
        return (int)_HISTOGRAM_BUCKET.Writes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Writes$set(MemorySegment seg, long index, int x) {
        _HISTOGRAM_BUCKET.Writes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


