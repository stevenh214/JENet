// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagINTERFACEINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pUnk"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("iid"),
        Constants$root.C_SHORT$LAYOUT.withName("wMethod"),
        MemoryLayout.paddingLayout(48)
    ).withName("tagINTERFACEINFO");
    public static MemoryLayout $LAYOUT() {
        return tagINTERFACEINFO.$struct$LAYOUT;
    }
    static final VarHandle pUnk$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUnk"));
    public static VarHandle pUnk$VH() {
        return tagINTERFACEINFO.pUnk$VH;
    }
    public static MemoryAddress pUnk$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagINTERFACEINFO.pUnk$VH.get(seg);
    }
    public static void pUnk$set( MemorySegment seg, MemoryAddress x) {
        tagINTERFACEINFO.pUnk$VH.set(seg, x);
    }
    public static MemoryAddress pUnk$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagINTERFACEINFO.pUnk$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUnk$set(MemorySegment seg, long index, MemoryAddress x) {
        tagINTERFACEINFO.pUnk$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment iid$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle wMethod$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMethod"));
    public static VarHandle wMethod$VH() {
        return tagINTERFACEINFO.wMethod$VH;
    }
    public static short wMethod$get(MemorySegment seg) {
        return (short)tagINTERFACEINFO.wMethod$VH.get(seg);
    }
    public static void wMethod$set( MemorySegment seg, short x) {
        tagINTERFACEINFO.wMethod$VH.set(seg, x);
    }
    public static short wMethod$get(MemorySegment seg, long index) {
        return (short)tagINTERFACEINFO.wMethod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMethod$set(MemorySegment seg, long index, short x) {
        tagINTERFACEINFO.wMethod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


