// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_INITIATE_REPAIR_OUTPUT_BUFFER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Hint1"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Hint2"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Clsn"),
        Constants$root.C_LONG$LAYOUT.withName("Status"),
        MemoryLayout.paddingLayout(32)
    ).withName("_FILE_INITIATE_REPAIR_OUTPUT_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.$struct$LAYOUT;
    }
    static final VarHandle Hint1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Hint1"));
    public static VarHandle Hint1$VH() {
        return _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Hint1$VH;
    }
    public static long Hint1$get(MemorySegment seg) {
        return (long)_FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Hint1$VH.get(seg);
    }
    public static void Hint1$set( MemorySegment seg, long x) {
        _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Hint1$VH.set(seg, x);
    }
    public static long Hint1$get(MemorySegment seg, long index) {
        return (long)_FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Hint1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Hint1$set(MemorySegment seg, long index, long x) {
        _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Hint1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Hint2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Hint2"));
    public static VarHandle Hint2$VH() {
        return _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Hint2$VH;
    }
    public static long Hint2$get(MemorySegment seg) {
        return (long)_FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Hint2$VH.get(seg);
    }
    public static void Hint2$set( MemorySegment seg, long x) {
        _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Hint2$VH.set(seg, x);
    }
    public static long Hint2$get(MemorySegment seg, long index) {
        return (long)_FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Hint2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Hint2$set(MemorySegment seg, long index, long x) {
        _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Hint2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Clsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Clsn"));
    public static VarHandle Clsn$VH() {
        return _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Clsn$VH;
    }
    public static long Clsn$get(MemorySegment seg) {
        return (long)_FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Clsn$VH.get(seg);
    }
    public static void Clsn$set( MemorySegment seg, long x) {
        _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Clsn$VH.set(seg, x);
    }
    public static long Clsn$get(MemorySegment seg, long index) {
        return (long)_FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Clsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Clsn$set(MemorySegment seg, long index, long x) {
        _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Clsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Status"));
    public static VarHandle Status$VH() {
        return _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Status$VH;
    }
    public static int Status$get(MemorySegment seg) {
        return (int)_FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Status$VH.get(seg);
    }
    public static void Status$set( MemorySegment seg, int x) {
        _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Status$VH.set(seg, x);
    }
    public static int Status$get(MemorySegment seg, long index) {
        return (int)_FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Status$set(MemorySegment seg, long index, int x) {
        _FILE_INITIATE_REPAIR_OUTPUT_BUFFER.Status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


