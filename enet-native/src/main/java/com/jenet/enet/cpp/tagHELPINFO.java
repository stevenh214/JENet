// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagHELPINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("iContextType"),
        Constants$root.C_LONG$LAYOUT.withName("iCtrlId"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hItemHandle"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwContextId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("MousePos")
    ).withName("tagHELPINFO");
    public static MemoryLayout $LAYOUT() {
        return tagHELPINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagHELPINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagHELPINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagHELPINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagHELPINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagHELPINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iContextType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iContextType"));
    public static VarHandle iContextType$VH() {
        return tagHELPINFO.iContextType$VH;
    }
    public static int iContextType$get(MemorySegment seg) {
        return (int)tagHELPINFO.iContextType$VH.get(seg);
    }
    public static void iContextType$set( MemorySegment seg, int x) {
        tagHELPINFO.iContextType$VH.set(seg, x);
    }
    public static int iContextType$get(MemorySegment seg, long index) {
        return (int)tagHELPINFO.iContextType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iContextType$set(MemorySegment seg, long index, int x) {
        tagHELPINFO.iContextType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iCtrlId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iCtrlId"));
    public static VarHandle iCtrlId$VH() {
        return tagHELPINFO.iCtrlId$VH;
    }
    public static int iCtrlId$get(MemorySegment seg) {
        return (int)tagHELPINFO.iCtrlId$VH.get(seg);
    }
    public static void iCtrlId$set( MemorySegment seg, int x) {
        tagHELPINFO.iCtrlId$VH.set(seg, x);
    }
    public static int iCtrlId$get(MemorySegment seg, long index) {
        return (int)tagHELPINFO.iCtrlId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iCtrlId$set(MemorySegment seg, long index, int x) {
        tagHELPINFO.iCtrlId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hItemHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hItemHandle"));
    public static VarHandle hItemHandle$VH() {
        return tagHELPINFO.hItemHandle$VH;
    }
    public static MemoryAddress hItemHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagHELPINFO.hItemHandle$VH.get(seg);
    }
    public static void hItemHandle$set( MemorySegment seg, MemoryAddress x) {
        tagHELPINFO.hItemHandle$VH.set(seg, x);
    }
    public static MemoryAddress hItemHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagHELPINFO.hItemHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hItemHandle$set(MemorySegment seg, long index, MemoryAddress x) {
        tagHELPINFO.hItemHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwContextId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwContextId"));
    public static VarHandle dwContextId$VH() {
        return tagHELPINFO.dwContextId$VH;
    }
    public static long dwContextId$get(MemorySegment seg) {
        return (long)tagHELPINFO.dwContextId$VH.get(seg);
    }
    public static void dwContextId$set( MemorySegment seg, long x) {
        tagHELPINFO.dwContextId$VH.set(seg, x);
    }
    public static long dwContextId$get(MemorySegment seg, long index) {
        return (long)tagHELPINFO.dwContextId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwContextId$set(MemorySegment seg, long index, long x) {
        tagHELPINFO.dwContextId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment MousePos$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


