// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMIXERLINECONTROLSA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbStruct"),
        Constants$root.C_LONG$LAYOUT.withName("dwLineID"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwControlID"),
            Constants$root.C_LONG$LAYOUT.withName("dwControlType")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("cControls"),
        Constants$root.C_LONG$LAYOUT.withName("cbmxctrl"),
        Constants$root.C_POINTER$LAYOUT.withName("pamxctrl")
    ).withName("tagMIXERLINECONTROLSA");
    public static MemoryLayout $LAYOUT() {
        return tagMIXERLINECONTROLSA.$struct$LAYOUT;
    }
    static final VarHandle cbStruct$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbStruct"));
    public static VarHandle cbStruct$VH() {
        return tagMIXERLINECONTROLSA.cbStruct$VH;
    }
    public static int cbStruct$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSA.cbStruct$VH.get(seg);
    }
    public static void cbStruct$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSA.cbStruct$VH.set(seg, x);
    }
    public static int cbStruct$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSA.cbStruct$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStruct$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSA.cbStruct$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwLineID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLineID"));
    public static VarHandle dwLineID$VH() {
        return tagMIXERLINECONTROLSA.dwLineID$VH;
    }
    public static int dwLineID$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSA.dwLineID$VH.get(seg);
    }
    public static void dwLineID$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSA.dwLineID$VH.set(seg, x);
    }
    public static int dwLineID$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSA.dwLineID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLineID$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSA.dwLineID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwControlID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dwControlID"));
    public static VarHandle dwControlID$VH() {
        return tagMIXERLINECONTROLSA.dwControlID$VH;
    }
    public static int dwControlID$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSA.dwControlID$VH.get(seg);
    }
    public static void dwControlID$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSA.dwControlID$VH.set(seg, x);
    }
    public static int dwControlID$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSA.dwControlID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwControlID$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSA.dwControlID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwControlType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dwControlType"));
    public static VarHandle dwControlType$VH() {
        return tagMIXERLINECONTROLSA.dwControlType$VH;
    }
    public static int dwControlType$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSA.dwControlType$VH.get(seg);
    }
    public static void dwControlType$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSA.dwControlType$VH.set(seg, x);
    }
    public static int dwControlType$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSA.dwControlType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwControlType$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSA.dwControlType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cControls$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cControls"));
    public static VarHandle cControls$VH() {
        return tagMIXERLINECONTROLSA.cControls$VH;
    }
    public static int cControls$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSA.cControls$VH.get(seg);
    }
    public static void cControls$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSA.cControls$VH.set(seg, x);
    }
    public static int cControls$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSA.cControls$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cControls$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSA.cControls$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbmxctrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbmxctrl"));
    public static VarHandle cbmxctrl$VH() {
        return tagMIXERLINECONTROLSA.cbmxctrl$VH;
    }
    public static int cbmxctrl$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSA.cbmxctrl$VH.get(seg);
    }
    public static void cbmxctrl$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSA.cbmxctrl$VH.set(seg, x);
    }
    public static int cbmxctrl$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSA.cbmxctrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbmxctrl$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSA.cbmxctrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pamxctrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pamxctrl"));
    public static VarHandle pamxctrl$VH() {
        return tagMIXERLINECONTROLSA.pamxctrl$VH;
    }
    public static MemoryAddress pamxctrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMIXERLINECONTROLSA.pamxctrl$VH.get(seg);
    }
    public static void pamxctrl$set( MemorySegment seg, MemoryAddress x) {
        tagMIXERLINECONTROLSA.pamxctrl$VH.set(seg, x);
    }
    public static MemoryAddress pamxctrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMIXERLINECONTROLSA.pamxctrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pamxctrl$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMIXERLINECONTROLSA.pamxctrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


