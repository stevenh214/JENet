// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ENetChannel {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("outgoingReliableSequenceNumber"),
        Constants$root.C_SHORT$LAYOUT.withName("outgoingUnreliableSequenceNumber"),
        Constants$root.C_SHORT$LAYOUT.withName("usedReliableWindows"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_SHORT$LAYOUT).withName("reliableWindows"),
        Constants$root.C_SHORT$LAYOUT.withName("incomingReliableSequenceNumber"),
        Constants$root.C_SHORT$LAYOUT.withName("incomingUnreliableSequenceNumber"),
        MemoryLayout.paddingLayout(48),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("next"),
                Constants$root.C_POINTER$LAYOUT.withName("previous")
            ).withName("sentinel")
        ).withName("incomingReliableCommands"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("next"),
                Constants$root.C_POINTER$LAYOUT.withName("previous")
            ).withName("sentinel")
        ).withName("incomingUnreliableCommands")
    ).withName("_ENetChannel");
    public static MemoryLayout $LAYOUT() {
        return _ENetChannel.$struct$LAYOUT;
    }
    static final VarHandle outgoingReliableSequenceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("outgoingReliableSequenceNumber"));
    public static VarHandle outgoingReliableSequenceNumber$VH() {
        return _ENetChannel.outgoingReliableSequenceNumber$VH;
    }
    public static short outgoingReliableSequenceNumber$get(MemorySegment seg) {
        return (short)_ENetChannel.outgoingReliableSequenceNumber$VH.get(seg);
    }
    public static void outgoingReliableSequenceNumber$set( MemorySegment seg, short x) {
        _ENetChannel.outgoingReliableSequenceNumber$VH.set(seg, x);
    }
    public static short outgoingReliableSequenceNumber$get(MemorySegment seg, long index) {
        return (short)_ENetChannel.outgoingReliableSequenceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void outgoingReliableSequenceNumber$set(MemorySegment seg, long index, short x) {
        _ENetChannel.outgoingReliableSequenceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle outgoingUnreliableSequenceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("outgoingUnreliableSequenceNumber"));
    public static VarHandle outgoingUnreliableSequenceNumber$VH() {
        return _ENetChannel.outgoingUnreliableSequenceNumber$VH;
    }
    public static short outgoingUnreliableSequenceNumber$get(MemorySegment seg) {
        return (short)_ENetChannel.outgoingUnreliableSequenceNumber$VH.get(seg);
    }
    public static void outgoingUnreliableSequenceNumber$set( MemorySegment seg, short x) {
        _ENetChannel.outgoingUnreliableSequenceNumber$VH.set(seg, x);
    }
    public static short outgoingUnreliableSequenceNumber$get(MemorySegment seg, long index) {
        return (short)_ENetChannel.outgoingUnreliableSequenceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void outgoingUnreliableSequenceNumber$set(MemorySegment seg, long index, short x) {
        _ENetChannel.outgoingUnreliableSequenceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle usedReliableWindows$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("usedReliableWindows"));
    public static VarHandle usedReliableWindows$VH() {
        return _ENetChannel.usedReliableWindows$VH;
    }
    public static short usedReliableWindows$get(MemorySegment seg) {
        return (short)_ENetChannel.usedReliableWindows$VH.get(seg);
    }
    public static void usedReliableWindows$set( MemorySegment seg, short x) {
        _ENetChannel.usedReliableWindows$VH.set(seg, x);
    }
    public static short usedReliableWindows$get(MemorySegment seg, long index) {
        return (short)_ENetChannel.usedReliableWindows$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void usedReliableWindows$set(MemorySegment seg, long index, short x) {
        _ENetChannel.usedReliableWindows$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment reliableWindows$slice(MemorySegment seg) {
        return seg.asSlice(6, 32);
    }
    static final VarHandle incomingReliableSequenceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("incomingReliableSequenceNumber"));
    public static VarHandle incomingReliableSequenceNumber$VH() {
        return _ENetChannel.incomingReliableSequenceNumber$VH;
    }
    public static short incomingReliableSequenceNumber$get(MemorySegment seg) {
        return (short)_ENetChannel.incomingReliableSequenceNumber$VH.get(seg);
    }
    public static void incomingReliableSequenceNumber$set( MemorySegment seg, short x) {
        _ENetChannel.incomingReliableSequenceNumber$VH.set(seg, x);
    }
    public static short incomingReliableSequenceNumber$get(MemorySegment seg, long index) {
        return (short)_ENetChannel.incomingReliableSequenceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void incomingReliableSequenceNumber$set(MemorySegment seg, long index, short x) {
        _ENetChannel.incomingReliableSequenceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle incomingUnreliableSequenceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("incomingUnreliableSequenceNumber"));
    public static VarHandle incomingUnreliableSequenceNumber$VH() {
        return _ENetChannel.incomingUnreliableSequenceNumber$VH;
    }
    public static short incomingUnreliableSequenceNumber$get(MemorySegment seg) {
        return (short)_ENetChannel.incomingUnreliableSequenceNumber$VH.get(seg);
    }
    public static void incomingUnreliableSequenceNumber$set( MemorySegment seg, short x) {
        _ENetChannel.incomingUnreliableSequenceNumber$VH.set(seg, x);
    }
    public static short incomingUnreliableSequenceNumber$get(MemorySegment seg, long index) {
        return (short)_ENetChannel.incomingUnreliableSequenceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void incomingUnreliableSequenceNumber$set(MemorySegment seg, long index, short x) {
        _ENetChannel.incomingUnreliableSequenceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment incomingReliableCommands$slice(MemorySegment seg) {
        return seg.asSlice(48, 16);
    }
    public static MemorySegment incomingUnreliableCommands$slice(MemorySegment seg) {
        return seg.asSlice(64, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


