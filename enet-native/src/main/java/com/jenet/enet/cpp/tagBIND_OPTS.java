// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagBIND_OPTS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbStruct"),
        Constants$root.C_LONG$LAYOUT.withName("grfFlags"),
        Constants$root.C_LONG$LAYOUT.withName("grfMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwTickCountDeadline")
    ).withName("tagBIND_OPTS");
    public static MemoryLayout $LAYOUT() {
        return tagBIND_OPTS.$struct$LAYOUT;
    }
    static final VarHandle cbStruct$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbStruct"));
    public static VarHandle cbStruct$VH() {
        return tagBIND_OPTS.cbStruct$VH;
    }
    public static int cbStruct$get(MemorySegment seg) {
        return (int)tagBIND_OPTS.cbStruct$VH.get(seg);
    }
    public static void cbStruct$set( MemorySegment seg, int x) {
        tagBIND_OPTS.cbStruct$VH.set(seg, x);
    }
    public static int cbStruct$get(MemorySegment seg, long index) {
        return (int)tagBIND_OPTS.cbStruct$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStruct$set(MemorySegment seg, long index, int x) {
        tagBIND_OPTS.cbStruct$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle grfFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("grfFlags"));
    public static VarHandle grfFlags$VH() {
        return tagBIND_OPTS.grfFlags$VH;
    }
    public static int grfFlags$get(MemorySegment seg) {
        return (int)tagBIND_OPTS.grfFlags$VH.get(seg);
    }
    public static void grfFlags$set( MemorySegment seg, int x) {
        tagBIND_OPTS.grfFlags$VH.set(seg, x);
    }
    public static int grfFlags$get(MemorySegment seg, long index) {
        return (int)tagBIND_OPTS.grfFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfFlags$set(MemorySegment seg, long index, int x) {
        tagBIND_OPTS.grfFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle grfMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("grfMode"));
    public static VarHandle grfMode$VH() {
        return tagBIND_OPTS.grfMode$VH;
    }
    public static int grfMode$get(MemorySegment seg) {
        return (int)tagBIND_OPTS.grfMode$VH.get(seg);
    }
    public static void grfMode$set( MemorySegment seg, int x) {
        tagBIND_OPTS.grfMode$VH.set(seg, x);
    }
    public static int grfMode$get(MemorySegment seg, long index) {
        return (int)tagBIND_OPTS.grfMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfMode$set(MemorySegment seg, long index, int x) {
        tagBIND_OPTS.grfMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTickCountDeadline$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTickCountDeadline"));
    public static VarHandle dwTickCountDeadline$VH() {
        return tagBIND_OPTS.dwTickCountDeadline$VH;
    }
    public static int dwTickCountDeadline$get(MemorySegment seg) {
        return (int)tagBIND_OPTS.dwTickCountDeadline$VH.get(seg);
    }
    public static void dwTickCountDeadline$set( MemorySegment seg, int x) {
        tagBIND_OPTS.dwTickCountDeadline$VH.set(seg, x);
    }
    public static int dwTickCountDeadline$get(MemorySegment seg, long index) {
        return (int)tagBIND_OPTS.dwTickCountDeadline$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTickCountDeadline$set(MemorySegment seg, long index, int x) {
        tagBIND_OPTS.dwTickCountDeadline$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


