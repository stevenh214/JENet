// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NON_PAGED_DEBUG_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Signature"),
        Constants$root.C_SHORT$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_SHORT$LAYOUT.withName("Machine"),
        Constants$root.C_SHORT$LAYOUT.withName("Characteristics"),
        Constants$root.C_LONG$LAYOUT.withName("TimeDateStamp"),
        Constants$root.C_LONG$LAYOUT.withName("CheckSum"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfImage"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ImageBase")
    ).withName("_NON_PAGED_DEBUG_INFO");
    public static MemoryLayout $LAYOUT() {
        return _NON_PAGED_DEBUG_INFO.$struct$LAYOUT;
    }
    static final VarHandle Signature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Signature"));
    public static VarHandle Signature$VH() {
        return _NON_PAGED_DEBUG_INFO.Signature$VH;
    }
    public static short Signature$get(MemorySegment seg) {
        return (short)_NON_PAGED_DEBUG_INFO.Signature$VH.get(seg);
    }
    public static void Signature$set( MemorySegment seg, short x) {
        _NON_PAGED_DEBUG_INFO.Signature$VH.set(seg, x);
    }
    public static short Signature$get(MemorySegment seg, long index) {
        return (short)_NON_PAGED_DEBUG_INFO.Signature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Signature$set(MemorySegment seg, long index, short x) {
        _NON_PAGED_DEBUG_INFO.Signature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _NON_PAGED_DEBUG_INFO.Flags$VH;
    }
    public static short Flags$get(MemorySegment seg) {
        return (short)_NON_PAGED_DEBUG_INFO.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, short x) {
        _NON_PAGED_DEBUG_INFO.Flags$VH.set(seg, x);
    }
    public static short Flags$get(MemorySegment seg, long index) {
        return (short)_NON_PAGED_DEBUG_INFO.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, short x) {
        _NON_PAGED_DEBUG_INFO.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _NON_PAGED_DEBUG_INFO.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_NON_PAGED_DEBUG_INFO.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _NON_PAGED_DEBUG_INFO.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_NON_PAGED_DEBUG_INFO.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _NON_PAGED_DEBUG_INFO.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Machine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Machine"));
    public static VarHandle Machine$VH() {
        return _NON_PAGED_DEBUG_INFO.Machine$VH;
    }
    public static short Machine$get(MemorySegment seg) {
        return (short)_NON_PAGED_DEBUG_INFO.Machine$VH.get(seg);
    }
    public static void Machine$set( MemorySegment seg, short x) {
        _NON_PAGED_DEBUG_INFO.Machine$VH.set(seg, x);
    }
    public static short Machine$get(MemorySegment seg, long index) {
        return (short)_NON_PAGED_DEBUG_INFO.Machine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Machine$set(MemorySegment seg, long index, short x) {
        _NON_PAGED_DEBUG_INFO.Machine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Characteristics$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Characteristics"));
    public static VarHandle Characteristics$VH() {
        return _NON_PAGED_DEBUG_INFO.Characteristics$VH;
    }
    public static short Characteristics$get(MemorySegment seg) {
        return (short)_NON_PAGED_DEBUG_INFO.Characteristics$VH.get(seg);
    }
    public static void Characteristics$set( MemorySegment seg, short x) {
        _NON_PAGED_DEBUG_INFO.Characteristics$VH.set(seg, x);
    }
    public static short Characteristics$get(MemorySegment seg, long index) {
        return (short)_NON_PAGED_DEBUG_INFO.Characteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, short x) {
        _NON_PAGED_DEBUG_INFO.Characteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return _NON_PAGED_DEBUG_INFO.TimeDateStamp$VH;
    }
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)_NON_PAGED_DEBUG_INFO.TimeDateStamp$VH.get(seg);
    }
    public static void TimeDateStamp$set( MemorySegment seg, int x) {
        _NON_PAGED_DEBUG_INFO.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)_NON_PAGED_DEBUG_INFO.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        _NON_PAGED_DEBUG_INFO.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CheckSum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CheckSum"));
    public static VarHandle CheckSum$VH() {
        return _NON_PAGED_DEBUG_INFO.CheckSum$VH;
    }
    public static int CheckSum$get(MemorySegment seg) {
        return (int)_NON_PAGED_DEBUG_INFO.CheckSum$VH.get(seg);
    }
    public static void CheckSum$set( MemorySegment seg, int x) {
        _NON_PAGED_DEBUG_INFO.CheckSum$VH.set(seg, x);
    }
    public static int CheckSum$get(MemorySegment seg, long index) {
        return (int)_NON_PAGED_DEBUG_INFO.CheckSum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CheckSum$set(MemorySegment seg, long index, int x) {
        _NON_PAGED_DEBUG_INFO.CheckSum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfImage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfImage"));
    public static VarHandle SizeOfImage$VH() {
        return _NON_PAGED_DEBUG_INFO.SizeOfImage$VH;
    }
    public static int SizeOfImage$get(MemorySegment seg) {
        return (int)_NON_PAGED_DEBUG_INFO.SizeOfImage$VH.get(seg);
    }
    public static void SizeOfImage$set( MemorySegment seg, int x) {
        _NON_PAGED_DEBUG_INFO.SizeOfImage$VH.set(seg, x);
    }
    public static int SizeOfImage$get(MemorySegment seg, long index) {
        return (int)_NON_PAGED_DEBUG_INFO.SizeOfImage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfImage$set(MemorySegment seg, long index, int x) {
        _NON_PAGED_DEBUG_INFO.SizeOfImage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImageBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImageBase"));
    public static VarHandle ImageBase$VH() {
        return _NON_PAGED_DEBUG_INFO.ImageBase$VH;
    }
    public static long ImageBase$get(MemorySegment seg) {
        return (long)_NON_PAGED_DEBUG_INFO.ImageBase$VH.get(seg);
    }
    public static void ImageBase$set( MemorySegment seg, long x) {
        _NON_PAGED_DEBUG_INFO.ImageBase$VH.set(seg, x);
    }
    public static long ImageBase$get(MemorySegment seg, long index) {
        return (long)_NON_PAGED_DEBUG_INFO.ImageBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImageBase$set(MemorySegment seg, long index, long x) {
        _NON_PAGED_DEBUG_INFO.ImageBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

