// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagBIND_OPTS2 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbStruct"),
        Constants$root.C_LONG$LAYOUT.withName("grfFlags"),
        Constants$root.C_LONG$LAYOUT.withName("grfMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwTickCountDeadline"),
        Constants$root.C_LONG$LAYOUT.withName("dwTrackFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwClassContext"),
        Constants$root.C_LONG$LAYOUT.withName("locale"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pServerInfo")
    ).withName("tagBIND_OPTS2");
    public static MemoryLayout $LAYOUT() {
        return tagBIND_OPTS2.$struct$LAYOUT;
    }
    static final VarHandle cbStruct$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbStruct"));
    public static VarHandle cbStruct$VH() {
        return tagBIND_OPTS2.cbStruct$VH;
    }
    public static int cbStruct$get(MemorySegment seg) {
        return (int)tagBIND_OPTS2.cbStruct$VH.get(seg);
    }
    public static void cbStruct$set( MemorySegment seg, int x) {
        tagBIND_OPTS2.cbStruct$VH.set(seg, x);
    }
    public static int cbStruct$get(MemorySegment seg, long index) {
        return (int)tagBIND_OPTS2.cbStruct$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStruct$set(MemorySegment seg, long index, int x) {
        tagBIND_OPTS2.cbStruct$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle grfFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("grfFlags"));
    public static VarHandle grfFlags$VH() {
        return tagBIND_OPTS2.grfFlags$VH;
    }
    public static int grfFlags$get(MemorySegment seg) {
        return (int)tagBIND_OPTS2.grfFlags$VH.get(seg);
    }
    public static void grfFlags$set( MemorySegment seg, int x) {
        tagBIND_OPTS2.grfFlags$VH.set(seg, x);
    }
    public static int grfFlags$get(MemorySegment seg, long index) {
        return (int)tagBIND_OPTS2.grfFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfFlags$set(MemorySegment seg, long index, int x) {
        tagBIND_OPTS2.grfFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle grfMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("grfMode"));
    public static VarHandle grfMode$VH() {
        return tagBIND_OPTS2.grfMode$VH;
    }
    public static int grfMode$get(MemorySegment seg) {
        return (int)tagBIND_OPTS2.grfMode$VH.get(seg);
    }
    public static void grfMode$set( MemorySegment seg, int x) {
        tagBIND_OPTS2.grfMode$VH.set(seg, x);
    }
    public static int grfMode$get(MemorySegment seg, long index) {
        return (int)tagBIND_OPTS2.grfMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfMode$set(MemorySegment seg, long index, int x) {
        tagBIND_OPTS2.grfMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTickCountDeadline$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTickCountDeadline"));
    public static VarHandle dwTickCountDeadline$VH() {
        return tagBIND_OPTS2.dwTickCountDeadline$VH;
    }
    public static int dwTickCountDeadline$get(MemorySegment seg) {
        return (int)tagBIND_OPTS2.dwTickCountDeadline$VH.get(seg);
    }
    public static void dwTickCountDeadline$set( MemorySegment seg, int x) {
        tagBIND_OPTS2.dwTickCountDeadline$VH.set(seg, x);
    }
    public static int dwTickCountDeadline$get(MemorySegment seg, long index) {
        return (int)tagBIND_OPTS2.dwTickCountDeadline$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTickCountDeadline$set(MemorySegment seg, long index, int x) {
        tagBIND_OPTS2.dwTickCountDeadline$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTrackFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTrackFlags"));
    public static VarHandle dwTrackFlags$VH() {
        return tagBIND_OPTS2.dwTrackFlags$VH;
    }
    public static int dwTrackFlags$get(MemorySegment seg) {
        return (int)tagBIND_OPTS2.dwTrackFlags$VH.get(seg);
    }
    public static void dwTrackFlags$set( MemorySegment seg, int x) {
        tagBIND_OPTS2.dwTrackFlags$VH.set(seg, x);
    }
    public static int dwTrackFlags$get(MemorySegment seg, long index) {
        return (int)tagBIND_OPTS2.dwTrackFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTrackFlags$set(MemorySegment seg, long index, int x) {
        tagBIND_OPTS2.dwTrackFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwClassContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwClassContext"));
    public static VarHandle dwClassContext$VH() {
        return tagBIND_OPTS2.dwClassContext$VH;
    }
    public static int dwClassContext$get(MemorySegment seg) {
        return (int)tagBIND_OPTS2.dwClassContext$VH.get(seg);
    }
    public static void dwClassContext$set( MemorySegment seg, int x) {
        tagBIND_OPTS2.dwClassContext$VH.set(seg, x);
    }
    public static int dwClassContext$get(MemorySegment seg, long index) {
        return (int)tagBIND_OPTS2.dwClassContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwClassContext$set(MemorySegment seg, long index, int x) {
        tagBIND_OPTS2.dwClassContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle locale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("locale"));
    public static VarHandle locale$VH() {
        return tagBIND_OPTS2.locale$VH;
    }
    public static int locale$get(MemorySegment seg) {
        return (int)tagBIND_OPTS2.locale$VH.get(seg);
    }
    public static void locale$set( MemorySegment seg, int x) {
        tagBIND_OPTS2.locale$VH.set(seg, x);
    }
    public static int locale$get(MemorySegment seg, long index) {
        return (int)tagBIND_OPTS2.locale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void locale$set(MemorySegment seg, long index, int x) {
        tagBIND_OPTS2.locale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pServerInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pServerInfo"));
    public static VarHandle pServerInfo$VH() {
        return tagBIND_OPTS2.pServerInfo$VH;
    }
    public static MemoryAddress pServerInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagBIND_OPTS2.pServerInfo$VH.get(seg);
    }
    public static void pServerInfo$set( MemorySegment seg, MemoryAddress x) {
        tagBIND_OPTS2.pServerInfo$VH.set(seg, x);
    }
    public static MemoryAddress pServerInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagBIND_OPTS2.pServerInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pServerInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        tagBIND_OPTS2.pServerInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


