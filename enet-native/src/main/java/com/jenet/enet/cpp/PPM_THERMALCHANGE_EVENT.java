// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PPM_THERMALCHANGE_EVENT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ThermalConstraint"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Processors")
    );
    public static MemoryLayout $LAYOUT() {
        return PPM_THERMALCHANGE_EVENT.$struct$LAYOUT;
    }
    static final VarHandle ThermalConstraint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ThermalConstraint"));
    public static VarHandle ThermalConstraint$VH() {
        return PPM_THERMALCHANGE_EVENT.ThermalConstraint$VH;
    }
    public static int ThermalConstraint$get(MemorySegment seg) {
        return (int)PPM_THERMALCHANGE_EVENT.ThermalConstraint$VH.get(seg);
    }
    public static void ThermalConstraint$set( MemorySegment seg, int x) {
        PPM_THERMALCHANGE_EVENT.ThermalConstraint$VH.set(seg, x);
    }
    public static int ThermalConstraint$get(MemorySegment seg, long index) {
        return (int)PPM_THERMALCHANGE_EVENT.ThermalConstraint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ThermalConstraint$set(MemorySegment seg, long index, int x) {
        PPM_THERMALCHANGE_EVENT.ThermalConstraint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Processors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Processors"));
    public static VarHandle Processors$VH() {
        return PPM_THERMALCHANGE_EVENT.Processors$VH;
    }
    public static long Processors$get(MemorySegment seg) {
        return (long)PPM_THERMALCHANGE_EVENT.Processors$VH.get(seg);
    }
    public static void Processors$set( MemorySegment seg, long x) {
        PPM_THERMALCHANGE_EVENT.Processors$VH.set(seg, x);
    }
    public static long Processors$get(MemorySegment seg, long index) {
        return (long)PPM_THERMALCHANGE_EVENT.Processors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Processors$set(MemorySegment seg, long index, long x) {
        PPM_THERMALCHANGE_EVENT.Processors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


