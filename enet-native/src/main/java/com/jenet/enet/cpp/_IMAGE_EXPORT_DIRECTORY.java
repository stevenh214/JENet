// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_EXPORT_DIRECTORY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Characteristics"),
        Constants$root.C_LONG$LAYOUT.withName("TimeDateStamp"),
        Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MinorVersion"),
        Constants$root.C_LONG$LAYOUT.withName("Name"),
        Constants$root.C_LONG$LAYOUT.withName("Base"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfFunctions"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfNames"),
        Constants$root.C_LONG$LAYOUT.withName("AddressOfFunctions"),
        Constants$root.C_LONG$LAYOUT.withName("AddressOfNames"),
        Constants$root.C_LONG$LAYOUT.withName("AddressOfNameOrdinals")
    ).withName("_IMAGE_EXPORT_DIRECTORY");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_EXPORT_DIRECTORY.$struct$LAYOUT;
    }
    static final VarHandle Characteristics$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Characteristics"));
    public static VarHandle Characteristics$VH() {
        return _IMAGE_EXPORT_DIRECTORY.Characteristics$VH;
    }
    public static int Characteristics$get(MemorySegment seg) {
        return (int)_IMAGE_EXPORT_DIRECTORY.Characteristics$VH.get(seg);
    }
    public static void Characteristics$set( MemorySegment seg, int x) {
        _IMAGE_EXPORT_DIRECTORY.Characteristics$VH.set(seg, x);
    }
    public static int Characteristics$get(MemorySegment seg, long index) {
        return (int)_IMAGE_EXPORT_DIRECTORY.Characteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, int x) {
        _IMAGE_EXPORT_DIRECTORY.Characteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return _IMAGE_EXPORT_DIRECTORY.TimeDateStamp$VH;
    }
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)_IMAGE_EXPORT_DIRECTORY.TimeDateStamp$VH.get(seg);
    }
    public static void TimeDateStamp$set( MemorySegment seg, int x) {
        _IMAGE_EXPORT_DIRECTORY.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)_IMAGE_EXPORT_DIRECTORY.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        _IMAGE_EXPORT_DIRECTORY.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorVersion"));
    public static VarHandle MajorVersion$VH() {
        return _IMAGE_EXPORT_DIRECTORY.MajorVersion$VH;
    }
    public static short MajorVersion$get(MemorySegment seg) {
        return (short)_IMAGE_EXPORT_DIRECTORY.MajorVersion$VH.get(seg);
    }
    public static void MajorVersion$set( MemorySegment seg, short x) {
        _IMAGE_EXPORT_DIRECTORY.MajorVersion$VH.set(seg, x);
    }
    public static short MajorVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_EXPORT_DIRECTORY.MajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_EXPORT_DIRECTORY.MajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorVersion"));
    public static VarHandle MinorVersion$VH() {
        return _IMAGE_EXPORT_DIRECTORY.MinorVersion$VH;
    }
    public static short MinorVersion$get(MemorySegment seg) {
        return (short)_IMAGE_EXPORT_DIRECTORY.MinorVersion$VH.get(seg);
    }
    public static void MinorVersion$set( MemorySegment seg, short x) {
        _IMAGE_EXPORT_DIRECTORY.MinorVersion$VH.set(seg, x);
    }
    public static short MinorVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_EXPORT_DIRECTORY.MinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_EXPORT_DIRECTORY.MinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Name"));
    public static VarHandle Name$VH() {
        return _IMAGE_EXPORT_DIRECTORY.Name$VH;
    }
    public static int Name$get(MemorySegment seg) {
        return (int)_IMAGE_EXPORT_DIRECTORY.Name$VH.get(seg);
    }
    public static void Name$set( MemorySegment seg, int x) {
        _IMAGE_EXPORT_DIRECTORY.Name$VH.set(seg, x);
    }
    public static int Name$get(MemorySegment seg, long index) {
        return (int)_IMAGE_EXPORT_DIRECTORY.Name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Name$set(MemorySegment seg, long index, int x) {
        _IMAGE_EXPORT_DIRECTORY.Name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Base$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Base"));
    public static VarHandle Base$VH() {
        return _IMAGE_EXPORT_DIRECTORY.Base$VH;
    }
    public static int Base$get(MemorySegment seg) {
        return (int)_IMAGE_EXPORT_DIRECTORY.Base$VH.get(seg);
    }
    public static void Base$set( MemorySegment seg, int x) {
        _IMAGE_EXPORT_DIRECTORY.Base$VH.set(seg, x);
    }
    public static int Base$get(MemorySegment seg, long index) {
        return (int)_IMAGE_EXPORT_DIRECTORY.Base$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Base$set(MemorySegment seg, long index, int x) {
        _IMAGE_EXPORT_DIRECTORY.Base$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfFunctions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfFunctions"));
    public static VarHandle NumberOfFunctions$VH() {
        return _IMAGE_EXPORT_DIRECTORY.NumberOfFunctions$VH;
    }
    public static int NumberOfFunctions$get(MemorySegment seg) {
        return (int)_IMAGE_EXPORT_DIRECTORY.NumberOfFunctions$VH.get(seg);
    }
    public static void NumberOfFunctions$set( MemorySegment seg, int x) {
        _IMAGE_EXPORT_DIRECTORY.NumberOfFunctions$VH.set(seg, x);
    }
    public static int NumberOfFunctions$get(MemorySegment seg, long index) {
        return (int)_IMAGE_EXPORT_DIRECTORY.NumberOfFunctions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfFunctions$set(MemorySegment seg, long index, int x) {
        _IMAGE_EXPORT_DIRECTORY.NumberOfFunctions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfNames"));
    public static VarHandle NumberOfNames$VH() {
        return _IMAGE_EXPORT_DIRECTORY.NumberOfNames$VH;
    }
    public static int NumberOfNames$get(MemorySegment seg) {
        return (int)_IMAGE_EXPORT_DIRECTORY.NumberOfNames$VH.get(seg);
    }
    public static void NumberOfNames$set( MemorySegment seg, int x) {
        _IMAGE_EXPORT_DIRECTORY.NumberOfNames$VH.set(seg, x);
    }
    public static int NumberOfNames$get(MemorySegment seg, long index) {
        return (int)_IMAGE_EXPORT_DIRECTORY.NumberOfNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfNames$set(MemorySegment seg, long index, int x) {
        _IMAGE_EXPORT_DIRECTORY.NumberOfNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AddressOfFunctions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddressOfFunctions"));
    public static VarHandle AddressOfFunctions$VH() {
        return _IMAGE_EXPORT_DIRECTORY.AddressOfFunctions$VH;
    }
    public static int AddressOfFunctions$get(MemorySegment seg) {
        return (int)_IMAGE_EXPORT_DIRECTORY.AddressOfFunctions$VH.get(seg);
    }
    public static void AddressOfFunctions$set( MemorySegment seg, int x) {
        _IMAGE_EXPORT_DIRECTORY.AddressOfFunctions$VH.set(seg, x);
    }
    public static int AddressOfFunctions$get(MemorySegment seg, long index) {
        return (int)_IMAGE_EXPORT_DIRECTORY.AddressOfFunctions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfFunctions$set(MemorySegment seg, long index, int x) {
        _IMAGE_EXPORT_DIRECTORY.AddressOfFunctions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AddressOfNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddressOfNames"));
    public static VarHandle AddressOfNames$VH() {
        return _IMAGE_EXPORT_DIRECTORY.AddressOfNames$VH;
    }
    public static int AddressOfNames$get(MemorySegment seg) {
        return (int)_IMAGE_EXPORT_DIRECTORY.AddressOfNames$VH.get(seg);
    }
    public static void AddressOfNames$set( MemorySegment seg, int x) {
        _IMAGE_EXPORT_DIRECTORY.AddressOfNames$VH.set(seg, x);
    }
    public static int AddressOfNames$get(MemorySegment seg, long index) {
        return (int)_IMAGE_EXPORT_DIRECTORY.AddressOfNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfNames$set(MemorySegment seg, long index, int x) {
        _IMAGE_EXPORT_DIRECTORY.AddressOfNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AddressOfNameOrdinals$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddressOfNameOrdinals"));
    public static VarHandle AddressOfNameOrdinals$VH() {
        return _IMAGE_EXPORT_DIRECTORY.AddressOfNameOrdinals$VH;
    }
    public static int AddressOfNameOrdinals$get(MemorySegment seg) {
        return (int)_IMAGE_EXPORT_DIRECTORY.AddressOfNameOrdinals$VH.get(seg);
    }
    public static void AddressOfNameOrdinals$set( MemorySegment seg, int x) {
        _IMAGE_EXPORT_DIRECTORY.AddressOfNameOrdinals$VH.set(seg, x);
    }
    public static int AddressOfNameOrdinals$get(MemorySegment seg, long index) {
        return (int)_IMAGE_EXPORT_DIRECTORY.AddressOfNameOrdinals$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfNameOrdinals$set(MemorySegment seg, long index, int x) {
        _IMAGE_EXPORT_DIRECTORY.AddressOfNameOrdinals$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

