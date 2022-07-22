// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ADMINISTRATOR_POWER_POLICY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("MinSleep"),
        Constants$root.C_LONG$LAYOUT.withName("MaxSleep"),
        Constants$root.C_LONG$LAYOUT.withName("MinVideoTimeout"),
        Constants$root.C_LONG$LAYOUT.withName("MaxVideoTimeout"),
        Constants$root.C_LONG$LAYOUT.withName("MinSpindownTimeout"),
        Constants$root.C_LONG$LAYOUT.withName("MaxSpindownTimeout")
    ).withName("_ADMINISTRATOR_POWER_POLICY");
    public static MemoryLayout $LAYOUT() {
        return _ADMINISTRATOR_POWER_POLICY.$struct$LAYOUT;
    }
    static final VarHandle MinSleep$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinSleep"));
    public static VarHandle MinSleep$VH() {
        return _ADMINISTRATOR_POWER_POLICY.MinSleep$VH;
    }
    public static int MinSleep$get(MemorySegment seg) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MinSleep$VH.get(seg);
    }
    public static void MinSleep$set( MemorySegment seg, int x) {
        _ADMINISTRATOR_POWER_POLICY.MinSleep$VH.set(seg, x);
    }
    public static int MinSleep$get(MemorySegment seg, long index) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MinSleep$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinSleep$set(MemorySegment seg, long index, int x) {
        _ADMINISTRATOR_POWER_POLICY.MinSleep$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxSleep$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxSleep"));
    public static VarHandle MaxSleep$VH() {
        return _ADMINISTRATOR_POWER_POLICY.MaxSleep$VH;
    }
    public static int MaxSleep$get(MemorySegment seg) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MaxSleep$VH.get(seg);
    }
    public static void MaxSleep$set( MemorySegment seg, int x) {
        _ADMINISTRATOR_POWER_POLICY.MaxSleep$VH.set(seg, x);
    }
    public static int MaxSleep$get(MemorySegment seg, long index) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MaxSleep$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxSleep$set(MemorySegment seg, long index, int x) {
        _ADMINISTRATOR_POWER_POLICY.MaxSleep$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinVideoTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinVideoTimeout"));
    public static VarHandle MinVideoTimeout$VH() {
        return _ADMINISTRATOR_POWER_POLICY.MinVideoTimeout$VH;
    }
    public static int MinVideoTimeout$get(MemorySegment seg) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MinVideoTimeout$VH.get(seg);
    }
    public static void MinVideoTimeout$set( MemorySegment seg, int x) {
        _ADMINISTRATOR_POWER_POLICY.MinVideoTimeout$VH.set(seg, x);
    }
    public static int MinVideoTimeout$get(MemorySegment seg, long index) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MinVideoTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinVideoTimeout$set(MemorySegment seg, long index, int x) {
        _ADMINISTRATOR_POWER_POLICY.MinVideoTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxVideoTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxVideoTimeout"));
    public static VarHandle MaxVideoTimeout$VH() {
        return _ADMINISTRATOR_POWER_POLICY.MaxVideoTimeout$VH;
    }
    public static int MaxVideoTimeout$get(MemorySegment seg) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MaxVideoTimeout$VH.get(seg);
    }
    public static void MaxVideoTimeout$set( MemorySegment seg, int x) {
        _ADMINISTRATOR_POWER_POLICY.MaxVideoTimeout$VH.set(seg, x);
    }
    public static int MaxVideoTimeout$get(MemorySegment seg, long index) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MaxVideoTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxVideoTimeout$set(MemorySegment seg, long index, int x) {
        _ADMINISTRATOR_POWER_POLICY.MaxVideoTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinSpindownTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinSpindownTimeout"));
    public static VarHandle MinSpindownTimeout$VH() {
        return _ADMINISTRATOR_POWER_POLICY.MinSpindownTimeout$VH;
    }
    public static int MinSpindownTimeout$get(MemorySegment seg) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MinSpindownTimeout$VH.get(seg);
    }
    public static void MinSpindownTimeout$set( MemorySegment seg, int x) {
        _ADMINISTRATOR_POWER_POLICY.MinSpindownTimeout$VH.set(seg, x);
    }
    public static int MinSpindownTimeout$get(MemorySegment seg, long index) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MinSpindownTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinSpindownTimeout$set(MemorySegment seg, long index, int x) {
        _ADMINISTRATOR_POWER_POLICY.MinSpindownTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxSpindownTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxSpindownTimeout"));
    public static VarHandle MaxSpindownTimeout$VH() {
        return _ADMINISTRATOR_POWER_POLICY.MaxSpindownTimeout$VH;
    }
    public static int MaxSpindownTimeout$get(MemorySegment seg) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MaxSpindownTimeout$VH.get(seg);
    }
    public static void MaxSpindownTimeout$set( MemorySegment seg, int x) {
        _ADMINISTRATOR_POWER_POLICY.MaxSpindownTimeout$VH.set(seg, x);
    }
    public static int MaxSpindownTimeout$get(MemorySegment seg, long index) {
        return (int)_ADMINISTRATOR_POWER_POLICY.MaxSpindownTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxSpindownTimeout$set(MemorySegment seg, long index, int x) {
        _ADMINISTRATOR_POWER_POLICY.MaxSpindownTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


