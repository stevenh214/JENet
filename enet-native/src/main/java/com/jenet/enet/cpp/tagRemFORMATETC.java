// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRemFORMATETC {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cfFormat"),
        Constants$root.C_LONG$LAYOUT.withName("ptd"),
        Constants$root.C_LONG$LAYOUT.withName("dwAspect"),
        Constants$root.C_LONG$LAYOUT.withName("lindex"),
        Constants$root.C_LONG$LAYOUT.withName("tymed")
    ).withName("tagRemFORMATETC");
    public static MemoryLayout $LAYOUT() {
        return tagRemFORMATETC.$struct$LAYOUT;
    }
    static final VarHandle cfFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cfFormat"));
    public static VarHandle cfFormat$VH() {
        return tagRemFORMATETC.cfFormat$VH;
    }
    public static int cfFormat$get(MemorySegment seg) {
        return (int)tagRemFORMATETC.cfFormat$VH.get(seg);
    }
    public static void cfFormat$set( MemorySegment seg, int x) {
        tagRemFORMATETC.cfFormat$VH.set(seg, x);
    }
    public static int cfFormat$get(MemorySegment seg, long index) {
        return (int)tagRemFORMATETC.cfFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cfFormat$set(MemorySegment seg, long index, int x) {
        tagRemFORMATETC.cfFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ptd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ptd"));
    public static VarHandle ptd$VH() {
        return tagRemFORMATETC.ptd$VH;
    }
    public static int ptd$get(MemorySegment seg) {
        return (int)tagRemFORMATETC.ptd$VH.get(seg);
    }
    public static void ptd$set( MemorySegment seg, int x) {
        tagRemFORMATETC.ptd$VH.set(seg, x);
    }
    public static int ptd$get(MemorySegment seg, long index) {
        return (int)tagRemFORMATETC.ptd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ptd$set(MemorySegment seg, long index, int x) {
        tagRemFORMATETC.ptd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAspect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAspect"));
    public static VarHandle dwAspect$VH() {
        return tagRemFORMATETC.dwAspect$VH;
    }
    public static int dwAspect$get(MemorySegment seg) {
        return (int)tagRemFORMATETC.dwAspect$VH.get(seg);
    }
    public static void dwAspect$set( MemorySegment seg, int x) {
        tagRemFORMATETC.dwAspect$VH.set(seg, x);
    }
    public static int dwAspect$get(MemorySegment seg, long index) {
        return (int)tagRemFORMATETC.dwAspect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAspect$set(MemorySegment seg, long index, int x) {
        tagRemFORMATETC.dwAspect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lindex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lindex"));
    public static VarHandle lindex$VH() {
        return tagRemFORMATETC.lindex$VH;
    }
    public static int lindex$get(MemorySegment seg) {
        return (int)tagRemFORMATETC.lindex$VH.get(seg);
    }
    public static void lindex$set( MemorySegment seg, int x) {
        tagRemFORMATETC.lindex$VH.set(seg, x);
    }
    public static int lindex$get(MemorySegment seg, long index) {
        return (int)tagRemFORMATETC.lindex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lindex$set(MemorySegment seg, long index, int x) {
        tagRemFORMATETC.lindex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tymed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tymed"));
    public static VarHandle tymed$VH() {
        return tagRemFORMATETC.tymed$VH;
    }
    public static int tymed$get(MemorySegment seg) {
        return (int)tagRemFORMATETC.tymed$VH.get(seg);
    }
    public static void tymed$set( MemorySegment seg, int x) {
        tagRemFORMATETC.tymed$VH.set(seg, x);
    }
    public static int tymed$get(MemorySegment seg, long index) {
        return (int)tagRemFORMATETC.tymed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tymed$set(MemorySegment seg, long index, int x) {
        tagRemFORMATETC.tymed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


