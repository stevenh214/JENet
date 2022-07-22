// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_ROM_OPTIONAL_HEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Magic"),
        Constants$root.C_CHAR$LAYOUT.withName("MajorLinkerVersion"),
        Constants$root.C_CHAR$LAYOUT.withName("MinorLinkerVersion"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfCode"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfInitializedData"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfUninitializedData"),
        Constants$root.C_LONG$LAYOUT.withName("AddressOfEntryPoint"),
        Constants$root.C_LONG$LAYOUT.withName("BaseOfCode"),
        Constants$root.C_LONG$LAYOUT.withName("BaseOfData"),
        Constants$root.C_LONG$LAYOUT.withName("BaseOfBss"),
        Constants$root.C_LONG$LAYOUT.withName("GprMask"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_LONG$LAYOUT).withName("CprMask"),
        Constants$root.C_LONG$LAYOUT.withName("GpValue")
    ).withName("_IMAGE_ROM_OPTIONAL_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_ROM_OPTIONAL_HEADER.$struct$LAYOUT;
    }
    static final VarHandle Magic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Magic"));
    public static VarHandle Magic$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.Magic$VH;
    }
    public static short Magic$get(MemorySegment seg) {
        return (short)_IMAGE_ROM_OPTIONAL_HEADER.Magic$VH.get(seg);
    }
    public static void Magic$set( MemorySegment seg, short x) {
        _IMAGE_ROM_OPTIONAL_HEADER.Magic$VH.set(seg, x);
    }
    public static short Magic$get(MemorySegment seg, long index) {
        return (short)_IMAGE_ROM_OPTIONAL_HEADER.Magic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Magic$set(MemorySegment seg, long index, short x) {
        _IMAGE_ROM_OPTIONAL_HEADER.Magic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorLinkerVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorLinkerVersion"));
    public static VarHandle MajorLinkerVersion$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.MajorLinkerVersion$VH;
    }
    public static byte MajorLinkerVersion$get(MemorySegment seg) {
        return (byte)_IMAGE_ROM_OPTIONAL_HEADER.MajorLinkerVersion$VH.get(seg);
    }
    public static void MajorLinkerVersion$set( MemorySegment seg, byte x) {
        _IMAGE_ROM_OPTIONAL_HEADER.MajorLinkerVersion$VH.set(seg, x);
    }
    public static byte MajorLinkerVersion$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_ROM_OPTIONAL_HEADER.MajorLinkerVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorLinkerVersion$set(MemorySegment seg, long index, byte x) {
        _IMAGE_ROM_OPTIONAL_HEADER.MajorLinkerVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorLinkerVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorLinkerVersion"));
    public static VarHandle MinorLinkerVersion$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.MinorLinkerVersion$VH;
    }
    public static byte MinorLinkerVersion$get(MemorySegment seg) {
        return (byte)_IMAGE_ROM_OPTIONAL_HEADER.MinorLinkerVersion$VH.get(seg);
    }
    public static void MinorLinkerVersion$set( MemorySegment seg, byte x) {
        _IMAGE_ROM_OPTIONAL_HEADER.MinorLinkerVersion$VH.set(seg, x);
    }
    public static byte MinorLinkerVersion$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_ROM_OPTIONAL_HEADER.MinorLinkerVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorLinkerVersion$set(MemorySegment seg, long index, byte x) {
        _IMAGE_ROM_OPTIONAL_HEADER.MinorLinkerVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfCode"));
    public static VarHandle SizeOfCode$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.SizeOfCode$VH;
    }
    public static int SizeOfCode$get(MemorySegment seg) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.SizeOfCode$VH.get(seg);
    }
    public static void SizeOfCode$set( MemorySegment seg, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.SizeOfCode$VH.set(seg, x);
    }
    public static int SizeOfCode$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.SizeOfCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfCode$set(MemorySegment seg, long index, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.SizeOfCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfInitializedData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfInitializedData"));
    public static VarHandle SizeOfInitializedData$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.SizeOfInitializedData$VH;
    }
    public static int SizeOfInitializedData$get(MemorySegment seg) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.SizeOfInitializedData$VH.get(seg);
    }
    public static void SizeOfInitializedData$set( MemorySegment seg, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.SizeOfInitializedData$VH.set(seg, x);
    }
    public static int SizeOfInitializedData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.SizeOfInitializedData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfInitializedData$set(MemorySegment seg, long index, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.SizeOfInitializedData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfUninitializedData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfUninitializedData"));
    public static VarHandle SizeOfUninitializedData$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.SizeOfUninitializedData$VH;
    }
    public static int SizeOfUninitializedData$get(MemorySegment seg) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.SizeOfUninitializedData$VH.get(seg);
    }
    public static void SizeOfUninitializedData$set( MemorySegment seg, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.SizeOfUninitializedData$VH.set(seg, x);
    }
    public static int SizeOfUninitializedData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.SizeOfUninitializedData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfUninitializedData$set(MemorySegment seg, long index, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.SizeOfUninitializedData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AddressOfEntryPoint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddressOfEntryPoint"));
    public static VarHandle AddressOfEntryPoint$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.AddressOfEntryPoint$VH;
    }
    public static int AddressOfEntryPoint$get(MemorySegment seg) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.AddressOfEntryPoint$VH.get(seg);
    }
    public static void AddressOfEntryPoint$set( MemorySegment seg, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.AddressOfEntryPoint$VH.set(seg, x);
    }
    public static int AddressOfEntryPoint$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.AddressOfEntryPoint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfEntryPoint$set(MemorySegment seg, long index, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.AddressOfEntryPoint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseOfCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseOfCode"));
    public static VarHandle BaseOfCode$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.BaseOfCode$VH;
    }
    public static int BaseOfCode$get(MemorySegment seg) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.BaseOfCode$VH.get(seg);
    }
    public static void BaseOfCode$set( MemorySegment seg, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.BaseOfCode$VH.set(seg, x);
    }
    public static int BaseOfCode$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.BaseOfCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseOfCode$set(MemorySegment seg, long index, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.BaseOfCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseOfData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseOfData"));
    public static VarHandle BaseOfData$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.BaseOfData$VH;
    }
    public static int BaseOfData$get(MemorySegment seg) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.BaseOfData$VH.get(seg);
    }
    public static void BaseOfData$set( MemorySegment seg, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.BaseOfData$VH.set(seg, x);
    }
    public static int BaseOfData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.BaseOfData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseOfData$set(MemorySegment seg, long index, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.BaseOfData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseOfBss$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseOfBss"));
    public static VarHandle BaseOfBss$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.BaseOfBss$VH;
    }
    public static int BaseOfBss$get(MemorySegment seg) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.BaseOfBss$VH.get(seg);
    }
    public static void BaseOfBss$set( MemorySegment seg, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.BaseOfBss$VH.set(seg, x);
    }
    public static int BaseOfBss$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.BaseOfBss$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseOfBss$set(MemorySegment seg, long index, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.BaseOfBss$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle GprMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GprMask"));
    public static VarHandle GprMask$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.GprMask$VH;
    }
    public static int GprMask$get(MemorySegment seg) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.GprMask$VH.get(seg);
    }
    public static void GprMask$set( MemorySegment seg, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.GprMask$VH.set(seg, x);
    }
    public static int GprMask$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.GprMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GprMask$set(MemorySegment seg, long index, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.GprMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment CprMask$slice(MemorySegment seg) {
        return seg.asSlice(36, 16);
    }
    static final VarHandle GpValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GpValue"));
    public static VarHandle GpValue$VH() {
        return _IMAGE_ROM_OPTIONAL_HEADER.GpValue$VH;
    }
    public static int GpValue$get(MemorySegment seg) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.GpValue$VH.get(seg);
    }
    public static void GpValue$set( MemorySegment seg, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.GpValue$VH.set(seg, x);
    }
    public static int GpValue$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ROM_OPTIONAL_HEADER.GpValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GpValue$set(MemorySegment seg, long index, int x) {
        _IMAGE_ROM_OPTIONAL_HEADER.GpValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


