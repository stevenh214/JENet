// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SESSION_BUFFER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("lsn"),
        Constants$root.C_CHAR$LAYOUT.withName("state"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("local_name"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("remote_name"),
        Constants$root.C_CHAR$LAYOUT.withName("rcvs_outstanding"),
        Constants$root.C_CHAR$LAYOUT.withName("sends_outstanding")
    ).withName("_SESSION_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return _SESSION_BUFFER.$struct$LAYOUT;
    }
    static final VarHandle lsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lsn"));
    public static VarHandle lsn$VH() {
        return _SESSION_BUFFER.lsn$VH;
    }
    public static byte lsn$get(MemorySegment seg) {
        return (byte)_SESSION_BUFFER.lsn$VH.get(seg);
    }
    public static void lsn$set( MemorySegment seg, byte x) {
        _SESSION_BUFFER.lsn$VH.set(seg, x);
    }
    public static byte lsn$get(MemorySegment seg, long index) {
        return (byte)_SESSION_BUFFER.lsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lsn$set(MemorySegment seg, long index, byte x) {
        _SESSION_BUFFER.lsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return _SESSION_BUFFER.state$VH;
    }
    public static byte state$get(MemorySegment seg) {
        return (byte)_SESSION_BUFFER.state$VH.get(seg);
    }
    public static void state$set( MemorySegment seg, byte x) {
        _SESSION_BUFFER.state$VH.set(seg, x);
    }
    public static byte state$get(MemorySegment seg, long index) {
        return (byte)_SESSION_BUFFER.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, byte x) {
        _SESSION_BUFFER.state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment local_name$slice(MemorySegment seg) {
        return seg.asSlice(2, 16);
    }
    public static MemorySegment remote_name$slice(MemorySegment seg) {
        return seg.asSlice(18, 16);
    }
    static final VarHandle rcvs_outstanding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rcvs_outstanding"));
    public static VarHandle rcvs_outstanding$VH() {
        return _SESSION_BUFFER.rcvs_outstanding$VH;
    }
    public static byte rcvs_outstanding$get(MemorySegment seg) {
        return (byte)_SESSION_BUFFER.rcvs_outstanding$VH.get(seg);
    }
    public static void rcvs_outstanding$set( MemorySegment seg, byte x) {
        _SESSION_BUFFER.rcvs_outstanding$VH.set(seg, x);
    }
    public static byte rcvs_outstanding$get(MemorySegment seg, long index) {
        return (byte)_SESSION_BUFFER.rcvs_outstanding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rcvs_outstanding$set(MemorySegment seg, long index, byte x) {
        _SESSION_BUFFER.rcvs_outstanding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sends_outstanding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sends_outstanding"));
    public static VarHandle sends_outstanding$VH() {
        return _SESSION_BUFFER.sends_outstanding$VH;
    }
    public static byte sends_outstanding$get(MemorySegment seg) {
        return (byte)_SESSION_BUFFER.sends_outstanding$VH.get(seg);
    }
    public static void sends_outstanding$set( MemorySegment seg, byte x) {
        _SESSION_BUFFER.sends_outstanding$VH.set(seg, x);
    }
    public static byte sends_outstanding$get(MemorySegment seg, long index) {
        return (byte)_SESSION_BUFFER.sends_outstanding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sends_outstanding$set(MemorySegment seg, long index, byte x) {
        _SESSION_BUFFER.sends_outstanding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


