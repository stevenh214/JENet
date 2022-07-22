// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TIME_ZONE_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Bias"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("StandardName"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("wYear"),
            Constants$root.C_SHORT$LAYOUT.withName("wMonth"),
            Constants$root.C_SHORT$LAYOUT.withName("wDayOfWeek"),
            Constants$root.C_SHORT$LAYOUT.withName("wDay"),
            Constants$root.C_SHORT$LAYOUT.withName("wHour"),
            Constants$root.C_SHORT$LAYOUT.withName("wMinute"),
            Constants$root.C_SHORT$LAYOUT.withName("wSecond"),
            Constants$root.C_SHORT$LAYOUT.withName("wMilliseconds")
        ).withName("StandardDate"),
        Constants$root.C_LONG$LAYOUT.withName("StandardBias"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("DaylightName"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("wYear"),
            Constants$root.C_SHORT$LAYOUT.withName("wMonth"),
            Constants$root.C_SHORT$LAYOUT.withName("wDayOfWeek"),
            Constants$root.C_SHORT$LAYOUT.withName("wDay"),
            Constants$root.C_SHORT$LAYOUT.withName("wHour"),
            Constants$root.C_SHORT$LAYOUT.withName("wMinute"),
            Constants$root.C_SHORT$LAYOUT.withName("wSecond"),
            Constants$root.C_SHORT$LAYOUT.withName("wMilliseconds")
        ).withName("DaylightDate"),
        Constants$root.C_LONG$LAYOUT.withName("DaylightBias")
    ).withName("_TIME_ZONE_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TIME_ZONE_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle Bias$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Bias"));
    public static VarHandle Bias$VH() {
        return _TIME_ZONE_INFORMATION.Bias$VH;
    }
    public static int Bias$get(MemorySegment seg) {
        return (int)_TIME_ZONE_INFORMATION.Bias$VH.get(seg);
    }
    public static void Bias$set( MemorySegment seg, int x) {
        _TIME_ZONE_INFORMATION.Bias$VH.set(seg, x);
    }
    public static int Bias$get(MemorySegment seg, long index) {
        return (int)_TIME_ZONE_INFORMATION.Bias$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Bias$set(MemorySegment seg, long index, int x) {
        _TIME_ZONE_INFORMATION.Bias$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment StandardName$slice(MemorySegment seg) {
        return seg.asSlice(4, 64);
    }
    public static MemorySegment StandardDate$slice(MemorySegment seg) {
        return seg.asSlice(68, 16);
    }
    static final VarHandle StandardBias$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StandardBias"));
    public static VarHandle StandardBias$VH() {
        return _TIME_ZONE_INFORMATION.StandardBias$VH;
    }
    public static int StandardBias$get(MemorySegment seg) {
        return (int)_TIME_ZONE_INFORMATION.StandardBias$VH.get(seg);
    }
    public static void StandardBias$set( MemorySegment seg, int x) {
        _TIME_ZONE_INFORMATION.StandardBias$VH.set(seg, x);
    }
    public static int StandardBias$get(MemorySegment seg, long index) {
        return (int)_TIME_ZONE_INFORMATION.StandardBias$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StandardBias$set(MemorySegment seg, long index, int x) {
        _TIME_ZONE_INFORMATION.StandardBias$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DaylightName$slice(MemorySegment seg) {
        return seg.asSlice(88, 64);
    }
    public static MemorySegment DaylightDate$slice(MemorySegment seg) {
        return seg.asSlice(152, 16);
    }
    static final VarHandle DaylightBias$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DaylightBias"));
    public static VarHandle DaylightBias$VH() {
        return _TIME_ZONE_INFORMATION.DaylightBias$VH;
    }
    public static int DaylightBias$get(MemorySegment seg) {
        return (int)_TIME_ZONE_INFORMATION.DaylightBias$VH.get(seg);
    }
    public static void DaylightBias$set( MemorySegment seg, int x) {
        _TIME_ZONE_INFORMATION.DaylightBias$VH.set(seg, x);
    }
    public static int DaylightBias$get(MemorySegment seg, long index) {
        return (int)_TIME_ZONE_INFORMATION.DaylightBias$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DaylightBias$set(MemorySegment seg, long index, int x) {
        _TIME_ZONE_INFORMATION.DaylightBias$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


