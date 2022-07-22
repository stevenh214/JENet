// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ENetProtocolHeader {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("peerID"),
        Constants$root.C_SHORT$LAYOUT.withName("sentTime")
    ).withName("_ENetProtocolHeader");
    public static MemoryLayout $LAYOUT() {
        return _ENetProtocolHeader.$struct$LAYOUT;
    }
    static final VarHandle peerID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("peerID"));
    public static VarHandle peerID$VH() {
        return _ENetProtocolHeader.peerID$VH;
    }
    public static short peerID$get(MemorySegment seg) {
        return (short)_ENetProtocolHeader.peerID$VH.get(seg);
    }
    public static void peerID$set( MemorySegment seg, short x) {
        _ENetProtocolHeader.peerID$VH.set(seg, x);
    }
    public static short peerID$get(MemorySegment seg, long index) {
        return (short)_ENetProtocolHeader.peerID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void peerID$set(MemorySegment seg, long index, short x) {
        _ENetProtocolHeader.peerID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sentTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sentTime"));
    public static VarHandle sentTime$VH() {
        return _ENetProtocolHeader.sentTime$VH;
    }
    public static short sentTime$get(MemorySegment seg) {
        return (short)_ENetProtocolHeader.sentTime$VH.get(seg);
    }
    public static void sentTime$set( MemorySegment seg, short x) {
        _ENetProtocolHeader.sentTime$VH.set(seg, x);
    }
    public static short sentTime$get(MemorySegment seg, long index) {
        return (short)_ENetProtocolHeader.sentTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sentTime$set(MemorySegment seg, long index, short x) {
        _ENetProtocolHeader.sentTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


