// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RETRIEVAL_POINTER_COUNT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ExtentCount")
    ).withName("RETRIEVAL_POINTER_COUNT");
    public static MemoryLayout $LAYOUT() {
        return RETRIEVAL_POINTER_COUNT.$struct$LAYOUT;
    }
    static final VarHandle ExtentCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExtentCount"));
    public static VarHandle ExtentCount$VH() {
        return RETRIEVAL_POINTER_COUNT.ExtentCount$VH;
    }
    public static int ExtentCount$get(MemorySegment seg) {
        return (int)RETRIEVAL_POINTER_COUNT.ExtentCount$VH.get(seg);
    }
    public static void ExtentCount$set( MemorySegment seg, int x) {
        RETRIEVAL_POINTER_COUNT.ExtentCount$VH.set(seg, x);
    }
    public static int ExtentCount$get(MemorySegment seg, long index) {
        return (int)RETRIEVAL_POINTER_COUNT.ExtentCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExtentCount$set(MemorySegment seg, long index, int x) {
        RETRIEVAL_POINTER_COUNT.ExtentCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


