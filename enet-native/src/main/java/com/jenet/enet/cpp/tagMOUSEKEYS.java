// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMOUSEKEYS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("iMaxSpeed"),
        Constants$root.C_LONG$LAYOUT.withName("iTimeToMaxSpeed"),
        Constants$root.C_LONG$LAYOUT.withName("iCtrlSpeed"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved1"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved2")
    ).withName("tagMOUSEKEYS");
    public static MemoryLayout $LAYOUT() {
        return tagMOUSEKEYS.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagMOUSEKEYS.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagMOUSEKEYS.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagMOUSEKEYS.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagMOUSEKEYS.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagMOUSEKEYS.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagMOUSEKEYS.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagMOUSEKEYS.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagMOUSEKEYS.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagMOUSEKEYS.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagMOUSEKEYS.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iMaxSpeed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iMaxSpeed"));
    public static VarHandle iMaxSpeed$VH() {
        return tagMOUSEKEYS.iMaxSpeed$VH;
    }
    public static int iMaxSpeed$get(MemorySegment seg) {
        return (int)tagMOUSEKEYS.iMaxSpeed$VH.get(seg);
    }
    public static void iMaxSpeed$set( MemorySegment seg, int x) {
        tagMOUSEKEYS.iMaxSpeed$VH.set(seg, x);
    }
    public static int iMaxSpeed$get(MemorySegment seg, long index) {
        return (int)tagMOUSEKEYS.iMaxSpeed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMaxSpeed$set(MemorySegment seg, long index, int x) {
        tagMOUSEKEYS.iMaxSpeed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iTimeToMaxSpeed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iTimeToMaxSpeed"));
    public static VarHandle iTimeToMaxSpeed$VH() {
        return tagMOUSEKEYS.iTimeToMaxSpeed$VH;
    }
    public static int iTimeToMaxSpeed$get(MemorySegment seg) {
        return (int)tagMOUSEKEYS.iTimeToMaxSpeed$VH.get(seg);
    }
    public static void iTimeToMaxSpeed$set( MemorySegment seg, int x) {
        tagMOUSEKEYS.iTimeToMaxSpeed$VH.set(seg, x);
    }
    public static int iTimeToMaxSpeed$get(MemorySegment seg, long index) {
        return (int)tagMOUSEKEYS.iTimeToMaxSpeed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iTimeToMaxSpeed$set(MemorySegment seg, long index, int x) {
        tagMOUSEKEYS.iTimeToMaxSpeed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iCtrlSpeed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iCtrlSpeed"));
    public static VarHandle iCtrlSpeed$VH() {
        return tagMOUSEKEYS.iCtrlSpeed$VH;
    }
    public static int iCtrlSpeed$get(MemorySegment seg) {
        return (int)tagMOUSEKEYS.iCtrlSpeed$VH.get(seg);
    }
    public static void iCtrlSpeed$set( MemorySegment seg, int x) {
        tagMOUSEKEYS.iCtrlSpeed$VH.set(seg, x);
    }
    public static int iCtrlSpeed$get(MemorySegment seg, long index) {
        return (int)tagMOUSEKEYS.iCtrlSpeed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iCtrlSpeed$set(MemorySegment seg, long index, int x) {
        tagMOUSEKEYS.iCtrlSpeed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved1"));
    public static VarHandle dwReserved1$VH() {
        return tagMOUSEKEYS.dwReserved1$VH;
    }
    public static int dwReserved1$get(MemorySegment seg) {
        return (int)tagMOUSEKEYS.dwReserved1$VH.get(seg);
    }
    public static void dwReserved1$set( MemorySegment seg, int x) {
        tagMOUSEKEYS.dwReserved1$VH.set(seg, x);
    }
    public static int dwReserved1$get(MemorySegment seg, long index) {
        return (int)tagMOUSEKEYS.dwReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved1$set(MemorySegment seg, long index, int x) {
        tagMOUSEKEYS.dwReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved2"));
    public static VarHandle dwReserved2$VH() {
        return tagMOUSEKEYS.dwReserved2$VH;
    }
    public static int dwReserved2$get(MemorySegment seg) {
        return (int)tagMOUSEKEYS.dwReserved2$VH.get(seg);
    }
    public static void dwReserved2$set( MemorySegment seg, int x) {
        tagMOUSEKEYS.dwReserved2$VH.set(seg, x);
    }
    public static int dwReserved2$get(MemorySegment seg, long index) {
        return (int)tagMOUSEKEYS.dwReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved2$set(MemorySegment seg, long index, int x) {
        tagMOUSEKEYS.dwReserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


