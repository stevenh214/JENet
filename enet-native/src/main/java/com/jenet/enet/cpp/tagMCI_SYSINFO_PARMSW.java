// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMCI_SYSINFO_PARMSW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrReturn"),
        Constants$root.C_LONG$LAYOUT.withName("dwRetSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwNumber"),
        Constants$root.C_LONG$LAYOUT.withName("wDeviceType")
    ).withName("tagMCI_SYSINFO_PARMSW");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_SYSINFO_PARMSW.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_SYSINFO_PARMSW.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_SYSINFO_PARMSW.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_SYSINFO_PARMSW.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_SYSINFO_PARMSW.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_SYSINFO_PARMSW.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrReturn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrReturn"));
    public static VarHandle lpstrReturn$VH() {
        return tagMCI_SYSINFO_PARMSW.lpstrReturn$VH;
    }
    public static MemoryAddress lpstrReturn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMCI_SYSINFO_PARMSW.lpstrReturn$VH.get(seg);
    }
    public static void lpstrReturn$set( MemorySegment seg, MemoryAddress x) {
        tagMCI_SYSINFO_PARMSW.lpstrReturn$VH.set(seg, x);
    }
    public static MemoryAddress lpstrReturn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMCI_SYSINFO_PARMSW.lpstrReturn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrReturn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMCI_SYSINFO_PARMSW.lpstrReturn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRetSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRetSize"));
    public static VarHandle dwRetSize$VH() {
        return tagMCI_SYSINFO_PARMSW.dwRetSize$VH;
    }
    public static int dwRetSize$get(MemorySegment seg) {
        return (int)tagMCI_SYSINFO_PARMSW.dwRetSize$VH.get(seg);
    }
    public static void dwRetSize$set( MemorySegment seg, int x) {
        tagMCI_SYSINFO_PARMSW.dwRetSize$VH.set(seg, x);
    }
    public static int dwRetSize$get(MemorySegment seg, long index) {
        return (int)tagMCI_SYSINFO_PARMSW.dwRetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRetSize$set(MemorySegment seg, long index, int x) {
        tagMCI_SYSINFO_PARMSW.dwRetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNumber"));
    public static VarHandle dwNumber$VH() {
        return tagMCI_SYSINFO_PARMSW.dwNumber$VH;
    }
    public static int dwNumber$get(MemorySegment seg) {
        return (int)tagMCI_SYSINFO_PARMSW.dwNumber$VH.get(seg);
    }
    public static void dwNumber$set( MemorySegment seg, int x) {
        tagMCI_SYSINFO_PARMSW.dwNumber$VH.set(seg, x);
    }
    public static int dwNumber$get(MemorySegment seg, long index) {
        return (int)tagMCI_SYSINFO_PARMSW.dwNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumber$set(MemorySegment seg, long index, int x) {
        tagMCI_SYSINFO_PARMSW.dwNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wDeviceType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wDeviceType"));
    public static VarHandle wDeviceType$VH() {
        return tagMCI_SYSINFO_PARMSW.wDeviceType$VH;
    }
    public static int wDeviceType$get(MemorySegment seg) {
        return (int)tagMCI_SYSINFO_PARMSW.wDeviceType$VH.get(seg);
    }
    public static void wDeviceType$set( MemorySegment seg, int x) {
        tagMCI_SYSINFO_PARMSW.wDeviceType$VH.set(seg, x);
    }
    public static int wDeviceType$get(MemorySegment seg, long index) {
        return (int)tagMCI_SYSINFO_PARMSW.wDeviceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wDeviceType$set(MemorySegment seg, long index, int x) {
        tagMCI_SYSINFO_PARMSW.wDeviceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


