// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ENetProtocolThrottleConfigure {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("command"),
            Constants$root.C_CHAR$LAYOUT.withName("channelID"),
            Constants$root.C_SHORT$LAYOUT.withName("reliableSequenceNumber")
        ).withName("header"),
        Constants$root.C_LONG$LAYOUT.withName("packetThrottleInterval"),
        Constants$root.C_LONG$LAYOUT.withName("packetThrottleAcceleration"),
        Constants$root.C_LONG$LAYOUT.withName("packetThrottleDeceleration")
    ).withName("_ENetProtocolThrottleConfigure");
    public static MemoryLayout $LAYOUT() {
        return _ENetProtocolThrottleConfigure.$struct$LAYOUT;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    static final VarHandle packetThrottleInterval$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("packetThrottleInterval"));
    public static VarHandle packetThrottleInterval$VH() {
        return _ENetProtocolThrottleConfigure.packetThrottleInterval$VH;
    }
    public static int packetThrottleInterval$get(MemorySegment seg) {
        return (int)_ENetProtocolThrottleConfigure.packetThrottleInterval$VH.get(seg);
    }
    public static void packetThrottleInterval$set( MemorySegment seg, int x) {
        _ENetProtocolThrottleConfigure.packetThrottleInterval$VH.set(seg, x);
    }
    public static int packetThrottleInterval$get(MemorySegment seg, long index) {
        return (int)_ENetProtocolThrottleConfigure.packetThrottleInterval$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void packetThrottleInterval$set(MemorySegment seg, long index, int x) {
        _ENetProtocolThrottleConfigure.packetThrottleInterval$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle packetThrottleAcceleration$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("packetThrottleAcceleration"));
    public static VarHandle packetThrottleAcceleration$VH() {
        return _ENetProtocolThrottleConfigure.packetThrottleAcceleration$VH;
    }
    public static int packetThrottleAcceleration$get(MemorySegment seg) {
        return (int)_ENetProtocolThrottleConfigure.packetThrottleAcceleration$VH.get(seg);
    }
    public static void packetThrottleAcceleration$set( MemorySegment seg, int x) {
        _ENetProtocolThrottleConfigure.packetThrottleAcceleration$VH.set(seg, x);
    }
    public static int packetThrottleAcceleration$get(MemorySegment seg, long index) {
        return (int)_ENetProtocolThrottleConfigure.packetThrottleAcceleration$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void packetThrottleAcceleration$set(MemorySegment seg, long index, int x) {
        _ENetProtocolThrottleConfigure.packetThrottleAcceleration$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle packetThrottleDeceleration$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("packetThrottleDeceleration"));
    public static VarHandle packetThrottleDeceleration$VH() {
        return _ENetProtocolThrottleConfigure.packetThrottleDeceleration$VH;
    }
    public static int packetThrottleDeceleration$get(MemorySegment seg) {
        return (int)_ENetProtocolThrottleConfigure.packetThrottleDeceleration$VH.get(seg);
    }
    public static void packetThrottleDeceleration$set( MemorySegment seg, int x) {
        _ENetProtocolThrottleConfigure.packetThrottleDeceleration$VH.set(seg, x);
    }
    public static int packetThrottleDeceleration$get(MemorySegment seg, long index) {
        return (int)_ENetProtocolThrottleConfigure.packetThrottleDeceleration$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void packetThrottleDeceleration$set(MemorySegment seg, long index, int x) {
        _ENetProtocolThrottleConfigure.packetThrottleDeceleration$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

