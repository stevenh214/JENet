// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMCI_STATUS_PARMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwReturn"),
        Constants$root.C_LONG$LAYOUT.withName("dwItem"),
        Constants$root.C_LONG$LAYOUT.withName("dwTrack")
    ).withName("tagMCI_STATUS_PARMS");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_STATUS_PARMS.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_STATUS_PARMS.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_STATUS_PARMS.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_STATUS_PARMS.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_STATUS_PARMS.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_STATUS_PARMS.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReturn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReturn"));
    public static VarHandle dwReturn$VH() {
        return tagMCI_STATUS_PARMS.dwReturn$VH;
    }
    public static long dwReturn$get(MemorySegment seg) {
        return (long)tagMCI_STATUS_PARMS.dwReturn$VH.get(seg);
    }
    public static void dwReturn$set( MemorySegment seg, long x) {
        tagMCI_STATUS_PARMS.dwReturn$VH.set(seg, x);
    }
    public static long dwReturn$get(MemorySegment seg, long index) {
        return (long)tagMCI_STATUS_PARMS.dwReturn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReturn$set(MemorySegment seg, long index, long x) {
        tagMCI_STATUS_PARMS.dwReturn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwItem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwItem"));
    public static VarHandle dwItem$VH() {
        return tagMCI_STATUS_PARMS.dwItem$VH;
    }
    public static int dwItem$get(MemorySegment seg) {
        return (int)tagMCI_STATUS_PARMS.dwItem$VH.get(seg);
    }
    public static void dwItem$set( MemorySegment seg, int x) {
        tagMCI_STATUS_PARMS.dwItem$VH.set(seg, x);
    }
    public static int dwItem$get(MemorySegment seg, long index) {
        return (int)tagMCI_STATUS_PARMS.dwItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwItem$set(MemorySegment seg, long index, int x) {
        tagMCI_STATUS_PARMS.dwItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTrack$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTrack"));
    public static VarHandle dwTrack$VH() {
        return tagMCI_STATUS_PARMS.dwTrack$VH;
    }
    public static int dwTrack$get(MemorySegment seg) {
        return (int)tagMCI_STATUS_PARMS.dwTrack$VH.get(seg);
    }
    public static void dwTrack$set( MemorySegment seg, int x) {
        tagMCI_STATUS_PARMS.dwTrack$VH.set(seg, x);
    }
    public static int dwTrack$get(MemorySegment seg, long index) {
        return (int)tagMCI_STATUS_PARMS.dwTrack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTrack$set(MemorySegment seg, long index, int x) {
        tagMCI_STATUS_PARMS.dwTrack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


