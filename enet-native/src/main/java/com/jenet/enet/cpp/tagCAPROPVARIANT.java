// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCAPROPVARIANT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cElems"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pElems")
    ).withName("tagCAPROPVARIANT");
    public static MemoryLayout $LAYOUT() {
        return tagCAPROPVARIANT.$struct$LAYOUT;
    }
    static final VarHandle cElems$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cElems"));
    public static VarHandle cElems$VH() {
        return tagCAPROPVARIANT.cElems$VH;
    }
    public static int cElems$get(MemorySegment seg) {
        return (int)tagCAPROPVARIANT.cElems$VH.get(seg);
    }
    public static void cElems$set( MemorySegment seg, int x) {
        tagCAPROPVARIANT.cElems$VH.set(seg, x);
    }
    public static int cElems$get(MemorySegment seg, long index) {
        return (int)tagCAPROPVARIANT.cElems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cElems$set(MemorySegment seg, long index, int x) {
        tagCAPROPVARIANT.cElems$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pElems$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pElems"));
    public static VarHandle pElems$VH() {
        return tagCAPROPVARIANT.pElems$VH;
    }
    public static MemoryAddress pElems$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCAPROPVARIANT.pElems$VH.get(seg);
    }
    public static void pElems$set( MemorySegment seg, MemoryAddress x) {
        tagCAPROPVARIANT.pElems$VH.set(seg, x);
    }
    public static MemoryAddress pElems$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCAPROPVARIANT.pElems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pElems$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCAPROPVARIANT.pElems$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


