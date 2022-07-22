// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class SCARD_READERSTATEW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("szReader"),
        Constants$root.C_POINTER$LAYOUT.withName("pvUserData"),
        Constants$root.C_LONG$LAYOUT.withName("dwCurrentState"),
        Constants$root.C_LONG$LAYOUT.withName("dwEventState"),
        Constants$root.C_LONG$LAYOUT.withName("cbAtr"),
        MemoryLayout.sequenceLayout(36, Constants$root.C_CHAR$LAYOUT).withName("rgbAtr")
    );
    public static MemoryLayout $LAYOUT() {
        return SCARD_READERSTATEW.$struct$LAYOUT;
    }
    static final VarHandle szReader$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szReader"));
    public static VarHandle szReader$VH() {
        return SCARD_READERSTATEW.szReader$VH;
    }
    public static MemoryAddress szReader$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)SCARD_READERSTATEW.szReader$VH.get(seg);
    }
    public static void szReader$set( MemorySegment seg, MemoryAddress x) {
        SCARD_READERSTATEW.szReader$VH.set(seg, x);
    }
    public static MemoryAddress szReader$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)SCARD_READERSTATEW.szReader$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szReader$set(MemorySegment seg, long index, MemoryAddress x) {
        SCARD_READERSTATEW.szReader$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvUserData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvUserData"));
    public static VarHandle pvUserData$VH() {
        return SCARD_READERSTATEW.pvUserData$VH;
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)SCARD_READERSTATEW.pvUserData$VH.get(seg);
    }
    public static void pvUserData$set( MemorySegment seg, MemoryAddress x) {
        SCARD_READERSTATEW.pvUserData$VH.set(seg, x);
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)SCARD_READERSTATEW.pvUserData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvUserData$set(MemorySegment seg, long index, MemoryAddress x) {
        SCARD_READERSTATEW.pvUserData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCurrentState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCurrentState"));
    public static VarHandle dwCurrentState$VH() {
        return SCARD_READERSTATEW.dwCurrentState$VH;
    }
    public static int dwCurrentState$get(MemorySegment seg) {
        return (int)SCARD_READERSTATEW.dwCurrentState$VH.get(seg);
    }
    public static void dwCurrentState$set( MemorySegment seg, int x) {
        SCARD_READERSTATEW.dwCurrentState$VH.set(seg, x);
    }
    public static int dwCurrentState$get(MemorySegment seg, long index) {
        return (int)SCARD_READERSTATEW.dwCurrentState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCurrentState$set(MemorySegment seg, long index, int x) {
        SCARD_READERSTATEW.dwCurrentState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwEventState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwEventState"));
    public static VarHandle dwEventState$VH() {
        return SCARD_READERSTATEW.dwEventState$VH;
    }
    public static int dwEventState$get(MemorySegment seg) {
        return (int)SCARD_READERSTATEW.dwEventState$VH.get(seg);
    }
    public static void dwEventState$set( MemorySegment seg, int x) {
        SCARD_READERSTATEW.dwEventState$VH.set(seg, x);
    }
    public static int dwEventState$get(MemorySegment seg, long index) {
        return (int)SCARD_READERSTATEW.dwEventState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwEventState$set(MemorySegment seg, long index, int x) {
        SCARD_READERSTATEW.dwEventState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbAtr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbAtr"));
    public static VarHandle cbAtr$VH() {
        return SCARD_READERSTATEW.cbAtr$VH;
    }
    public static int cbAtr$get(MemorySegment seg) {
        return (int)SCARD_READERSTATEW.cbAtr$VH.get(seg);
    }
    public static void cbAtr$set( MemorySegment seg, int x) {
        SCARD_READERSTATEW.cbAtr$VH.set(seg, x);
    }
    public static int cbAtr$get(MemorySegment seg, long index) {
        return (int)SCARD_READERSTATEW.cbAtr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAtr$set(MemorySegment seg, long index, int x) {
        SCARD_READERSTATEW.cbAtr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rgbAtr$slice(MemorySegment seg) {
        return seg.asSlice(28, 36);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


