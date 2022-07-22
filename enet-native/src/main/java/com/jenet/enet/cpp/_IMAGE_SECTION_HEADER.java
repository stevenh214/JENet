// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_SECTION_HEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Name"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("PhysicalAddress"),
            Constants$root.C_LONG$LAYOUT.withName("VirtualSize")
        ).withName("Misc"),
        Constants$root.C_LONG$LAYOUT.withName("VirtualAddress"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfRawData"),
        Constants$root.C_LONG$LAYOUT.withName("PointerToRawData"),
        Constants$root.C_LONG$LAYOUT.withName("PointerToRelocations"),
        Constants$root.C_LONG$LAYOUT.withName("PointerToLinenumbers"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberOfRelocations"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberOfLinenumbers"),
        Constants$root.C_LONG$LAYOUT.withName("Characteristics")
    ).withName("_IMAGE_SECTION_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_SECTION_HEADER.$struct$LAYOUT;
    }
    public static MemorySegment Name$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static class Misc {

        static final  GroupLayout Misc$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("PhysicalAddress"),
            Constants$root.C_LONG$LAYOUT.withName("VirtualSize")
        );
        public static MemoryLayout $LAYOUT() {
            return Misc.Misc$union$LAYOUT;
        }
        static final VarHandle PhysicalAddress$VH = Misc$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PhysicalAddress"));
        public static VarHandle PhysicalAddress$VH() {
            return Misc.PhysicalAddress$VH;
        }
        public static int PhysicalAddress$get(MemorySegment seg) {
            return (int)Misc.PhysicalAddress$VH.get(seg);
        }
        public static void PhysicalAddress$set( MemorySegment seg, int x) {
            Misc.PhysicalAddress$VH.set(seg, x);
        }
        public static int PhysicalAddress$get(MemorySegment seg, long index) {
            return (int)Misc.PhysicalAddress$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void PhysicalAddress$set(MemorySegment seg, long index, int x) {
            Misc.PhysicalAddress$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle VirtualSize$VH = Misc$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VirtualSize"));
        public static VarHandle VirtualSize$VH() {
            return Misc.VirtualSize$VH;
        }
        public static int VirtualSize$get(MemorySegment seg) {
            return (int)Misc.VirtualSize$VH.get(seg);
        }
        public static void VirtualSize$set( MemorySegment seg, int x) {
            Misc.VirtualSize$VH.set(seg, x);
        }
        public static int VirtualSize$get(MemorySegment seg, long index) {
            return (int)Misc.VirtualSize$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void VirtualSize$set(MemorySegment seg, long index, int x) {
            Misc.VirtualSize$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Misc$slice(MemorySegment seg) {
        return seg.asSlice(8, 4);
    }
    static final VarHandle VirtualAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VirtualAddress"));
    public static VarHandle VirtualAddress$VH() {
        return _IMAGE_SECTION_HEADER.VirtualAddress$VH;
    }
    public static int VirtualAddress$get(MemorySegment seg) {
        return (int)_IMAGE_SECTION_HEADER.VirtualAddress$VH.get(seg);
    }
    public static void VirtualAddress$set( MemorySegment seg, int x) {
        _IMAGE_SECTION_HEADER.VirtualAddress$VH.set(seg, x);
    }
    public static int VirtualAddress$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SECTION_HEADER.VirtualAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VirtualAddress$set(MemorySegment seg, long index, int x) {
        _IMAGE_SECTION_HEADER.VirtualAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfRawData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfRawData"));
    public static VarHandle SizeOfRawData$VH() {
        return _IMAGE_SECTION_HEADER.SizeOfRawData$VH;
    }
    public static int SizeOfRawData$get(MemorySegment seg) {
        return (int)_IMAGE_SECTION_HEADER.SizeOfRawData$VH.get(seg);
    }
    public static void SizeOfRawData$set( MemorySegment seg, int x) {
        _IMAGE_SECTION_HEADER.SizeOfRawData$VH.set(seg, x);
    }
    public static int SizeOfRawData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SECTION_HEADER.SizeOfRawData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfRawData$set(MemorySegment seg, long index, int x) {
        _IMAGE_SECTION_HEADER.SizeOfRawData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PointerToRawData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PointerToRawData"));
    public static VarHandle PointerToRawData$VH() {
        return _IMAGE_SECTION_HEADER.PointerToRawData$VH;
    }
    public static int PointerToRawData$get(MemorySegment seg) {
        return (int)_IMAGE_SECTION_HEADER.PointerToRawData$VH.get(seg);
    }
    public static void PointerToRawData$set( MemorySegment seg, int x) {
        _IMAGE_SECTION_HEADER.PointerToRawData$VH.set(seg, x);
    }
    public static int PointerToRawData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SECTION_HEADER.PointerToRawData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PointerToRawData$set(MemorySegment seg, long index, int x) {
        _IMAGE_SECTION_HEADER.PointerToRawData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PointerToRelocations$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PointerToRelocations"));
    public static VarHandle PointerToRelocations$VH() {
        return _IMAGE_SECTION_HEADER.PointerToRelocations$VH;
    }
    public static int PointerToRelocations$get(MemorySegment seg) {
        return (int)_IMAGE_SECTION_HEADER.PointerToRelocations$VH.get(seg);
    }
    public static void PointerToRelocations$set( MemorySegment seg, int x) {
        _IMAGE_SECTION_HEADER.PointerToRelocations$VH.set(seg, x);
    }
    public static int PointerToRelocations$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SECTION_HEADER.PointerToRelocations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PointerToRelocations$set(MemorySegment seg, long index, int x) {
        _IMAGE_SECTION_HEADER.PointerToRelocations$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PointerToLinenumbers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PointerToLinenumbers"));
    public static VarHandle PointerToLinenumbers$VH() {
        return _IMAGE_SECTION_HEADER.PointerToLinenumbers$VH;
    }
    public static int PointerToLinenumbers$get(MemorySegment seg) {
        return (int)_IMAGE_SECTION_HEADER.PointerToLinenumbers$VH.get(seg);
    }
    public static void PointerToLinenumbers$set( MemorySegment seg, int x) {
        _IMAGE_SECTION_HEADER.PointerToLinenumbers$VH.set(seg, x);
    }
    public static int PointerToLinenumbers$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SECTION_HEADER.PointerToLinenumbers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PointerToLinenumbers$set(MemorySegment seg, long index, int x) {
        _IMAGE_SECTION_HEADER.PointerToLinenumbers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfRelocations$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfRelocations"));
    public static VarHandle NumberOfRelocations$VH() {
        return _IMAGE_SECTION_HEADER.NumberOfRelocations$VH;
    }
    public static short NumberOfRelocations$get(MemorySegment seg) {
        return (short)_IMAGE_SECTION_HEADER.NumberOfRelocations$VH.get(seg);
    }
    public static void NumberOfRelocations$set( MemorySegment seg, short x) {
        _IMAGE_SECTION_HEADER.NumberOfRelocations$VH.set(seg, x);
    }
    public static short NumberOfRelocations$get(MemorySegment seg, long index) {
        return (short)_IMAGE_SECTION_HEADER.NumberOfRelocations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfRelocations$set(MemorySegment seg, long index, short x) {
        _IMAGE_SECTION_HEADER.NumberOfRelocations$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfLinenumbers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfLinenumbers"));
    public static VarHandle NumberOfLinenumbers$VH() {
        return _IMAGE_SECTION_HEADER.NumberOfLinenumbers$VH;
    }
    public static short NumberOfLinenumbers$get(MemorySegment seg) {
        return (short)_IMAGE_SECTION_HEADER.NumberOfLinenumbers$VH.get(seg);
    }
    public static void NumberOfLinenumbers$set( MemorySegment seg, short x) {
        _IMAGE_SECTION_HEADER.NumberOfLinenumbers$VH.set(seg, x);
    }
    public static short NumberOfLinenumbers$get(MemorySegment seg, long index) {
        return (short)_IMAGE_SECTION_HEADER.NumberOfLinenumbers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfLinenumbers$set(MemorySegment seg, long index, short x) {
        _IMAGE_SECTION_HEADER.NumberOfLinenumbers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Characteristics$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Characteristics"));
    public static VarHandle Characteristics$VH() {
        return _IMAGE_SECTION_HEADER.Characteristics$VH;
    }
    public static int Characteristics$get(MemorySegment seg) {
        return (int)_IMAGE_SECTION_HEADER.Characteristics$VH.get(seg);
    }
    public static void Characteristics$set( MemorySegment seg, int x) {
        _IMAGE_SECTION_HEADER.Characteristics$VH.set(seg, x);
    }
    public static int Characteristics$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SECTION_HEADER.Characteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, int x) {
        _IMAGE_SECTION_HEADER.Characteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


