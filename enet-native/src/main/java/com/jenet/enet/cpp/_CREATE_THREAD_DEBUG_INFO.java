// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CREATE_THREAD_DEBUG_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hThread"),
        Constants$root.C_POINTER$LAYOUT.withName("lpThreadLocalBase"),
        Constants$root.C_POINTER$LAYOUT.withName("lpStartAddress")
    ).withName("_CREATE_THREAD_DEBUG_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CREATE_THREAD_DEBUG_INFO.$struct$LAYOUT;
    }
    static final VarHandle hThread$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hThread"));
    public static VarHandle hThread$VH() {
        return _CREATE_THREAD_DEBUG_INFO.hThread$VH;
    }
    public static MemoryAddress hThread$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CREATE_THREAD_DEBUG_INFO.hThread$VH.get(seg);
    }
    public static void hThread$set( MemorySegment seg, MemoryAddress x) {
        _CREATE_THREAD_DEBUG_INFO.hThread$VH.set(seg, x);
    }
    public static MemoryAddress hThread$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CREATE_THREAD_DEBUG_INFO.hThread$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hThread$set(MemorySegment seg, long index, MemoryAddress x) {
        _CREATE_THREAD_DEBUG_INFO.hThread$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpThreadLocalBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpThreadLocalBase"));
    public static VarHandle lpThreadLocalBase$VH() {
        return _CREATE_THREAD_DEBUG_INFO.lpThreadLocalBase$VH;
    }
    public static MemoryAddress lpThreadLocalBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CREATE_THREAD_DEBUG_INFO.lpThreadLocalBase$VH.get(seg);
    }
    public static void lpThreadLocalBase$set( MemorySegment seg, MemoryAddress x) {
        _CREATE_THREAD_DEBUG_INFO.lpThreadLocalBase$VH.set(seg, x);
    }
    public static MemoryAddress lpThreadLocalBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CREATE_THREAD_DEBUG_INFO.lpThreadLocalBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpThreadLocalBase$set(MemorySegment seg, long index, MemoryAddress x) {
        _CREATE_THREAD_DEBUG_INFO.lpThreadLocalBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpStartAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpStartAddress"));
    public static VarHandle lpStartAddress$VH() {
        return _CREATE_THREAD_DEBUG_INFO.lpStartAddress$VH;
    }
    public static MemoryAddress lpStartAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CREATE_THREAD_DEBUG_INFO.lpStartAddress$VH.get(seg);
    }
    public static void lpStartAddress$set( MemorySegment seg, MemoryAddress x) {
        _CREATE_THREAD_DEBUG_INFO.lpStartAddress$VH.set(seg, x);
    }
    public static MemoryAddress lpStartAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CREATE_THREAD_DEBUG_INFO.lpStartAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpStartAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        _CREATE_THREAD_DEBUG_INFO.lpStartAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPTHREAD_START_ROUTINE lpStartAddress (MemorySegment segment, MemorySession session) {
        return LPTHREAD_START_ROUTINE.ofAddress(lpStartAddress$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


