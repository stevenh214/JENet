// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMCI_SET_PARMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_LONG$LAYOUT.withName("dwTimeFormat"),
        Constants$root.C_LONG$LAYOUT.withName("dwAudio")
    ).withName("tagMCI_SET_PARMS");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_SET_PARMS.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_SET_PARMS.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_SET_PARMS.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_SET_PARMS.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_SET_PARMS.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_SET_PARMS.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTimeFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTimeFormat"));
    public static VarHandle dwTimeFormat$VH() {
        return tagMCI_SET_PARMS.dwTimeFormat$VH;
    }
    public static int dwTimeFormat$get(MemorySegment seg) {
        return (int)tagMCI_SET_PARMS.dwTimeFormat$VH.get(seg);
    }
    public static void dwTimeFormat$set( MemorySegment seg, int x) {
        tagMCI_SET_PARMS.dwTimeFormat$VH.set(seg, x);
    }
    public static int dwTimeFormat$get(MemorySegment seg, long index) {
        return (int)tagMCI_SET_PARMS.dwTimeFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTimeFormat$set(MemorySegment seg, long index, int x) {
        tagMCI_SET_PARMS.dwTimeFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAudio$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAudio"));
    public static VarHandle dwAudio$VH() {
        return tagMCI_SET_PARMS.dwAudio$VH;
    }
    public static int dwAudio$get(MemorySegment seg) {
        return (int)tagMCI_SET_PARMS.dwAudio$VH.get(seg);
    }
    public static void dwAudio$set( MemorySegment seg, int x) {
        tagMCI_SET_PARMS.dwAudio$VH.set(seg, x);
    }
    public static int dwAudio$get(MemorySegment seg, long index) {
        return (int)tagMCI_SET_PARMS.dwAudio$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAudio$set(MemorySegment seg, long index, int x) {
        tagMCI_SET_PARMS.dwAudio$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

