// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCUSTDATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cCustData"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("prgCustData")
    ).withName("tagCUSTDATA");
    public static MemoryLayout $LAYOUT() {
        return tagCUSTDATA.$struct$LAYOUT;
    }
    static final VarHandle cCustData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cCustData"));
    public static VarHandle cCustData$VH() {
        return tagCUSTDATA.cCustData$VH;
    }
    public static int cCustData$get(MemorySegment seg) {
        return (int)tagCUSTDATA.cCustData$VH.get(seg);
    }
    public static void cCustData$set( MemorySegment seg, int x) {
        tagCUSTDATA.cCustData$VH.set(seg, x);
    }
    public static int cCustData$get(MemorySegment seg, long index) {
        return (int)tagCUSTDATA.cCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCustData$set(MemorySegment seg, long index, int x) {
        tagCUSTDATA.cCustData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle prgCustData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("prgCustData"));
    public static VarHandle prgCustData$VH() {
        return tagCUSTDATA.prgCustData$VH;
    }
    public static MemoryAddress prgCustData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCUSTDATA.prgCustData$VH.get(seg);
    }
    public static void prgCustData$set( MemorySegment seg, MemoryAddress x) {
        tagCUSTDATA.prgCustData$VH.set(seg, x);
    }
    public static MemoryAddress prgCustData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCUSTDATA.prgCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prgCustData$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCUSTDATA.prgCustData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


