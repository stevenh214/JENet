// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagBLOB {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pBlobData")
    ).withName("tagBLOB");
    public static MemoryLayout $LAYOUT() {
        return tagBLOB.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagBLOB.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagBLOB.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagBLOB.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagBLOB.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagBLOB.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pBlobData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pBlobData"));
    public static VarHandle pBlobData$VH() {
        return tagBLOB.pBlobData$VH;
    }
    public static MemoryAddress pBlobData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagBLOB.pBlobData$VH.get(seg);
    }
    public static void pBlobData$set( MemorySegment seg, MemoryAddress x) {
        tagBLOB.pBlobData$VH.set(seg, x);
    }
    public static MemoryAddress pBlobData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagBLOB.pBlobData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pBlobData$set(MemorySegment seg, long index, MemoryAddress x) {
        tagBLOB.pBlobData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


