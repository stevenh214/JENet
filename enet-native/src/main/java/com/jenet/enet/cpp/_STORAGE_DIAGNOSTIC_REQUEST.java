// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_DIAGNOSTIC_REQUEST {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("TargetType"),
        Constants$root.C_LONG$LAYOUT.withName("Level")
    ).withName("_STORAGE_DIAGNOSTIC_REQUEST");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_DIAGNOSTIC_REQUEST.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_DIAGNOSTIC_REQUEST.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_DIAGNOSTIC_REQUEST.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _STORAGE_DIAGNOSTIC_REQUEST.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetType"));
    public static VarHandle TargetType$VH() {
        return _STORAGE_DIAGNOSTIC_REQUEST.TargetType$VH;
    }
    public static int TargetType$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.TargetType$VH.get(seg);
    }
    public static void TargetType$set( MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.TargetType$VH.set(seg, x);
    }
    public static int TargetType$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.TargetType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetType$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.TargetType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Level$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Level"));
    public static VarHandle Level$VH() {
        return _STORAGE_DIAGNOSTIC_REQUEST.Level$VH;
    }
    public static int Level$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Level$VH.get(seg);
    }
    public static void Level$set( MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Level$VH.set(seg, x);
    }
    public static int Level$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Level$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


