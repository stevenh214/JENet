// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagTOUCHINPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("x"),
        Constants$root.C_LONG$LAYOUT.withName("y"),
        Constants$root.C_POINTER$LAYOUT.withName("hSource"),
        Constants$root.C_LONG$LAYOUT.withName("dwID"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwMask"),
        Constants$root.C_LONG$LAYOUT.withName("dwTime"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwExtraInfo"),
        Constants$root.C_LONG$LAYOUT.withName("cxContact"),
        Constants$root.C_LONG$LAYOUT.withName("cyContact")
    ).withName("tagTOUCHINPUT");
    public static MemoryLayout $LAYOUT() {
        return tagTOUCHINPUT.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return tagTOUCHINPUT.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)tagTOUCHINPUT.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        tagTOUCHINPUT.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)tagTOUCHINPUT.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        tagTOUCHINPUT.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return tagTOUCHINPUT.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)tagTOUCHINPUT.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        tagTOUCHINPUT.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)tagTOUCHINPUT.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        tagTOUCHINPUT.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hSource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hSource"));
    public static VarHandle hSource$VH() {
        return tagTOUCHINPUT.hSource$VH;
    }
    public static MemoryAddress hSource$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagTOUCHINPUT.hSource$VH.get(seg);
    }
    public static void hSource$set( MemorySegment seg, MemoryAddress x) {
        tagTOUCHINPUT.hSource$VH.set(seg, x);
    }
    public static MemoryAddress hSource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagTOUCHINPUT.hSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hSource$set(MemorySegment seg, long index, MemoryAddress x) {
        tagTOUCHINPUT.hSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwID"));
    public static VarHandle dwID$VH() {
        return tagTOUCHINPUT.dwID$VH;
    }
    public static int dwID$get(MemorySegment seg) {
        return (int)tagTOUCHINPUT.dwID$VH.get(seg);
    }
    public static void dwID$set( MemorySegment seg, int x) {
        tagTOUCHINPUT.dwID$VH.set(seg, x);
    }
    public static int dwID$get(MemorySegment seg, long index) {
        return (int)tagTOUCHINPUT.dwID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwID$set(MemorySegment seg, long index, int x) {
        tagTOUCHINPUT.dwID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagTOUCHINPUT.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagTOUCHINPUT.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagTOUCHINPUT.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagTOUCHINPUT.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagTOUCHINPUT.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMask"));
    public static VarHandle dwMask$VH() {
        return tagTOUCHINPUT.dwMask$VH;
    }
    public static int dwMask$get(MemorySegment seg) {
        return (int)tagTOUCHINPUT.dwMask$VH.get(seg);
    }
    public static void dwMask$set( MemorySegment seg, int x) {
        tagTOUCHINPUT.dwMask$VH.set(seg, x);
    }
    public static int dwMask$get(MemorySegment seg, long index) {
        return (int)tagTOUCHINPUT.dwMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMask$set(MemorySegment seg, long index, int x) {
        tagTOUCHINPUT.dwMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTime"));
    public static VarHandle dwTime$VH() {
        return tagTOUCHINPUT.dwTime$VH;
    }
    public static int dwTime$get(MemorySegment seg) {
        return (int)tagTOUCHINPUT.dwTime$VH.get(seg);
    }
    public static void dwTime$set( MemorySegment seg, int x) {
        tagTOUCHINPUT.dwTime$VH.set(seg, x);
    }
    public static int dwTime$get(MemorySegment seg, long index) {
        return (int)tagTOUCHINPUT.dwTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTime$set(MemorySegment seg, long index, int x) {
        tagTOUCHINPUT.dwTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExtraInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwExtraInfo"));
    public static VarHandle dwExtraInfo$VH() {
        return tagTOUCHINPUT.dwExtraInfo$VH;
    }
    public static long dwExtraInfo$get(MemorySegment seg) {
        return (long)tagTOUCHINPUT.dwExtraInfo$VH.get(seg);
    }
    public static void dwExtraInfo$set( MemorySegment seg, long x) {
        tagTOUCHINPUT.dwExtraInfo$VH.set(seg, x);
    }
    public static long dwExtraInfo$get(MemorySegment seg, long index) {
        return (long)tagTOUCHINPUT.dwExtraInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExtraInfo$set(MemorySegment seg, long index, long x) {
        tagTOUCHINPUT.dwExtraInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cxContact$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cxContact"));
    public static VarHandle cxContact$VH() {
        return tagTOUCHINPUT.cxContact$VH;
    }
    public static int cxContact$get(MemorySegment seg) {
        return (int)tagTOUCHINPUT.cxContact$VH.get(seg);
    }
    public static void cxContact$set( MemorySegment seg, int x) {
        tagTOUCHINPUT.cxContact$VH.set(seg, x);
    }
    public static int cxContact$get(MemorySegment seg, long index) {
        return (int)tagTOUCHINPUT.cxContact$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cxContact$set(MemorySegment seg, long index, int x) {
        tagTOUCHINPUT.cxContact$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cyContact$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cyContact"));
    public static VarHandle cyContact$VH() {
        return tagTOUCHINPUT.cyContact$VH;
    }
    public static int cyContact$get(MemorySegment seg) {
        return (int)tagTOUCHINPUT.cyContact$VH.get(seg);
    }
    public static void cyContact$set( MemorySegment seg, int x) {
        tagTOUCHINPUT.cyContact$VH.set(seg, x);
    }
    public static int cyContact$get(MemorySegment seg, long index) {
        return (int)tagTOUCHINPUT.cyContact$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cyContact$set(MemorySegment seg, long index, int x) {
        tagTOUCHINPUT.cyContact$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


