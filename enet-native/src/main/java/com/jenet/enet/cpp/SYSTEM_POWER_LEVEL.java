// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class SYSTEM_POWER_LEVEL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Enable"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("Spare"),
        Constants$root.C_LONG$LAYOUT.withName("BatteryLevel"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Action"),
            Constants$root.C_LONG$LAYOUT.withName("Flags"),
            Constants$root.C_LONG$LAYOUT.withName("EventCode")
        ).withName("PowerPolicy"),
        Constants$root.C_LONG$LAYOUT.withName("MinSystemState")
    );
    public static MemoryLayout $LAYOUT() {
        return SYSTEM_POWER_LEVEL.$struct$LAYOUT;
    }
    static final VarHandle Enable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Enable"));
    public static VarHandle Enable$VH() {
        return SYSTEM_POWER_LEVEL.Enable$VH;
    }
    public static byte Enable$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_LEVEL.Enable$VH.get(seg);
    }
    public static void Enable$set( MemorySegment seg, byte x) {
        SYSTEM_POWER_LEVEL.Enable$VH.set(seg, x);
    }
    public static byte Enable$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_LEVEL.Enable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Enable$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_LEVEL.Enable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Spare$slice(MemorySegment seg) {
        return seg.asSlice(1, 3);
    }
    static final VarHandle BatteryLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BatteryLevel"));
    public static VarHandle BatteryLevel$VH() {
        return SYSTEM_POWER_LEVEL.BatteryLevel$VH;
    }
    public static int BatteryLevel$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_LEVEL.BatteryLevel$VH.get(seg);
    }
    public static void BatteryLevel$set( MemorySegment seg, int x) {
        SYSTEM_POWER_LEVEL.BatteryLevel$VH.set(seg, x);
    }
    public static int BatteryLevel$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_LEVEL.BatteryLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BatteryLevel$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_LEVEL.BatteryLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PowerPolicy$slice(MemorySegment seg) {
        return seg.asSlice(8, 12);
    }
    static final VarHandle MinSystemState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinSystemState"));
    public static VarHandle MinSystemState$VH() {
        return SYSTEM_POWER_LEVEL.MinSystemState$VH;
    }
    public static int MinSystemState$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_LEVEL.MinSystemState$VH.get(seg);
    }
    public static void MinSystemState$set( MemorySegment seg, int x) {
        SYSTEM_POWER_LEVEL.MinSystemState$VH.set(seg, x);
    }
    public static int MinSystemState$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_LEVEL.MinSystemState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinSystemState$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_LEVEL.MinSystemState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


