// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OSVERSIONINFOEXW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwOSVersionInfoSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwMajorVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwMinorVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwBuildNumber"),
        Constants$root.C_LONG$LAYOUT.withName("dwPlatformId"),
        MemoryLayout.sequenceLayout(128, Constants$root.C_SHORT$LAYOUT).withName("szCSDVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("wServicePackMajor"),
        Constants$root.C_SHORT$LAYOUT.withName("wServicePackMinor"),
        Constants$root.C_SHORT$LAYOUT.withName("wSuiteMask"),
        Constants$root.C_CHAR$LAYOUT.withName("wProductType"),
        Constants$root.C_CHAR$LAYOUT.withName("wReserved")
    ).withName("_OSVERSIONINFOEXW");
    public static MemoryLayout $LAYOUT() {
        return _OSVERSIONINFOEXW.$struct$LAYOUT;
    }
    static final VarHandle dwOSVersionInfoSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOSVersionInfoSize"));
    public static VarHandle dwOSVersionInfoSize$VH() {
        return _OSVERSIONINFOEXW.dwOSVersionInfoSize$VH;
    }
    public static int dwOSVersionInfoSize$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOEXW.dwOSVersionInfoSize$VH.get(seg);
    }
    public static void dwOSVersionInfoSize$set( MemorySegment seg, int x) {
        _OSVERSIONINFOEXW.dwOSVersionInfoSize$VH.set(seg, x);
    }
    public static int dwOSVersionInfoSize$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOEXW.dwOSVersionInfoSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOSVersionInfoSize$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOEXW.dwOSVersionInfoSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMajorVersion"));
    public static VarHandle dwMajorVersion$VH() {
        return _OSVERSIONINFOEXW.dwMajorVersion$VH;
    }
    public static int dwMajorVersion$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOEXW.dwMajorVersion$VH.get(seg);
    }
    public static void dwMajorVersion$set( MemorySegment seg, int x) {
        _OSVERSIONINFOEXW.dwMajorVersion$VH.set(seg, x);
    }
    public static int dwMajorVersion$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOEXW.dwMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMajorVersion$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOEXW.dwMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMinorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMinorVersion"));
    public static VarHandle dwMinorVersion$VH() {
        return _OSVERSIONINFOEXW.dwMinorVersion$VH;
    }
    public static int dwMinorVersion$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOEXW.dwMinorVersion$VH.get(seg);
    }
    public static void dwMinorVersion$set( MemorySegment seg, int x) {
        _OSVERSIONINFOEXW.dwMinorVersion$VH.set(seg, x);
    }
    public static int dwMinorVersion$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOEXW.dwMinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMinorVersion$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOEXW.dwMinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBuildNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwBuildNumber"));
    public static VarHandle dwBuildNumber$VH() {
        return _OSVERSIONINFOEXW.dwBuildNumber$VH;
    }
    public static int dwBuildNumber$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOEXW.dwBuildNumber$VH.get(seg);
    }
    public static void dwBuildNumber$set( MemorySegment seg, int x) {
        _OSVERSIONINFOEXW.dwBuildNumber$VH.set(seg, x);
    }
    public static int dwBuildNumber$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOEXW.dwBuildNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBuildNumber$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOEXW.dwBuildNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPlatformId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPlatformId"));
    public static VarHandle dwPlatformId$VH() {
        return _OSVERSIONINFOEXW.dwPlatformId$VH;
    }
    public static int dwPlatformId$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOEXW.dwPlatformId$VH.get(seg);
    }
    public static void dwPlatformId$set( MemorySegment seg, int x) {
        _OSVERSIONINFOEXW.dwPlatformId$VH.set(seg, x);
    }
    public static int dwPlatformId$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOEXW.dwPlatformId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPlatformId$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOEXW.dwPlatformId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szCSDVersion$slice(MemorySegment seg) {
        return seg.asSlice(20, 256);
    }
    static final VarHandle wServicePackMajor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wServicePackMajor"));
    public static VarHandle wServicePackMajor$VH() {
        return _OSVERSIONINFOEXW.wServicePackMajor$VH;
    }
    public static short wServicePackMajor$get(MemorySegment seg) {
        return (short)_OSVERSIONINFOEXW.wServicePackMajor$VH.get(seg);
    }
    public static void wServicePackMajor$set( MemorySegment seg, short x) {
        _OSVERSIONINFOEXW.wServicePackMajor$VH.set(seg, x);
    }
    public static short wServicePackMajor$get(MemorySegment seg, long index) {
        return (short)_OSVERSIONINFOEXW.wServicePackMajor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wServicePackMajor$set(MemorySegment seg, long index, short x) {
        _OSVERSIONINFOEXW.wServicePackMajor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wServicePackMinor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wServicePackMinor"));
    public static VarHandle wServicePackMinor$VH() {
        return _OSVERSIONINFOEXW.wServicePackMinor$VH;
    }
    public static short wServicePackMinor$get(MemorySegment seg) {
        return (short)_OSVERSIONINFOEXW.wServicePackMinor$VH.get(seg);
    }
    public static void wServicePackMinor$set( MemorySegment seg, short x) {
        _OSVERSIONINFOEXW.wServicePackMinor$VH.set(seg, x);
    }
    public static short wServicePackMinor$get(MemorySegment seg, long index) {
        return (short)_OSVERSIONINFOEXW.wServicePackMinor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wServicePackMinor$set(MemorySegment seg, long index, short x) {
        _OSVERSIONINFOEXW.wServicePackMinor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wSuiteMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wSuiteMask"));
    public static VarHandle wSuiteMask$VH() {
        return _OSVERSIONINFOEXW.wSuiteMask$VH;
    }
    public static short wSuiteMask$get(MemorySegment seg) {
        return (short)_OSVERSIONINFOEXW.wSuiteMask$VH.get(seg);
    }
    public static void wSuiteMask$set( MemorySegment seg, short x) {
        _OSVERSIONINFOEXW.wSuiteMask$VH.set(seg, x);
    }
    public static short wSuiteMask$get(MemorySegment seg, long index) {
        return (short)_OSVERSIONINFOEXW.wSuiteMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wSuiteMask$set(MemorySegment seg, long index, short x) {
        _OSVERSIONINFOEXW.wSuiteMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wProductType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wProductType"));
    public static VarHandle wProductType$VH() {
        return _OSVERSIONINFOEXW.wProductType$VH;
    }
    public static byte wProductType$get(MemorySegment seg) {
        return (byte)_OSVERSIONINFOEXW.wProductType$VH.get(seg);
    }
    public static void wProductType$set( MemorySegment seg, byte x) {
        _OSVERSIONINFOEXW.wProductType$VH.set(seg, x);
    }
    public static byte wProductType$get(MemorySegment seg, long index) {
        return (byte)_OSVERSIONINFOEXW.wProductType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wProductType$set(MemorySegment seg, long index, byte x) {
        _OSVERSIONINFOEXW.wProductType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved"));
    public static VarHandle wReserved$VH() {
        return _OSVERSIONINFOEXW.wReserved$VH;
    }
    public static byte wReserved$get(MemorySegment seg) {
        return (byte)_OSVERSIONINFOEXW.wReserved$VH.get(seg);
    }
    public static void wReserved$set( MemorySegment seg, byte x) {
        _OSVERSIONINFOEXW.wReserved$VH.set(seg, x);
    }
    public static byte wReserved$get(MemorySegment seg, long index) {
        return (byte)_OSVERSIONINFOEXW.wReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved$set(MemorySegment seg, long index, byte x) {
        _OSVERSIONINFOEXW.wReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


