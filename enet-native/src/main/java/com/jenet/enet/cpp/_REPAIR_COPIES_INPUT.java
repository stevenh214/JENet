// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _REPAIR_COPIES_INPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
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
        ).withName("FileOffset"),
        Constants$root.C_LONG$LAYOUT.withName("Length"),
        Constants$root.C_LONG$LAYOUT.withName("SourceCopy"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfRepairCopies"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("RepairCopies")
    ).withName("_REPAIR_COPIES_INPUT");
    public static MemoryLayout $LAYOUT() {
        return _REPAIR_COPIES_INPUT.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _REPAIR_COPIES_INPUT.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_REPAIR_COPIES_INPUT.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _REPAIR_COPIES_INPUT.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_REPAIR_COPIES_INPUT.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _REPAIR_COPIES_INPUT.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _REPAIR_COPIES_INPUT.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_REPAIR_COPIES_INPUT.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _REPAIR_COPIES_INPUT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_REPAIR_COPIES_INPUT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _REPAIR_COPIES_INPUT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileOffset$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _REPAIR_COPIES_INPUT.Length$VH;
    }
    public static int Length$get(MemorySegment seg) {
        return (int)_REPAIR_COPIES_INPUT.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, int x) {
        _REPAIR_COPIES_INPUT.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_REPAIR_COPIES_INPUT.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _REPAIR_COPIES_INPUT.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SourceCopy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SourceCopy"));
    public static VarHandle SourceCopy$VH() {
        return _REPAIR_COPIES_INPUT.SourceCopy$VH;
    }
    public static int SourceCopy$get(MemorySegment seg) {
        return (int)_REPAIR_COPIES_INPUT.SourceCopy$VH.get(seg);
    }
    public static void SourceCopy$set( MemorySegment seg, int x) {
        _REPAIR_COPIES_INPUT.SourceCopy$VH.set(seg, x);
    }
    public static int SourceCopy$get(MemorySegment seg, long index) {
        return (int)_REPAIR_COPIES_INPUT.SourceCopy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SourceCopy$set(MemorySegment seg, long index, int x) {
        _REPAIR_COPIES_INPUT.SourceCopy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfRepairCopies$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfRepairCopies"));
    public static VarHandle NumberOfRepairCopies$VH() {
        return _REPAIR_COPIES_INPUT.NumberOfRepairCopies$VH;
    }
    public static int NumberOfRepairCopies$get(MemorySegment seg) {
        return (int)_REPAIR_COPIES_INPUT.NumberOfRepairCopies$VH.get(seg);
    }
    public static void NumberOfRepairCopies$set( MemorySegment seg, int x) {
        _REPAIR_COPIES_INPUT.NumberOfRepairCopies$VH.set(seg, x);
    }
    public static int NumberOfRepairCopies$get(MemorySegment seg, long index) {
        return (int)_REPAIR_COPIES_INPUT.NumberOfRepairCopies$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfRepairCopies$set(MemorySegment seg, long index, int x) {
        _REPAIR_COPIES_INPUT.NumberOfRepairCopies$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RepairCopies$slice(MemorySegment seg) {
        return seg.asSlice(28, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


