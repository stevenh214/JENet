// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _tagCODEBASEHOLD {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("szDistUnit"),
        Constants$root.C_POINTER$LAYOUT.withName("szCodeBase"),
        Constants$root.C_LONG$LAYOUT.withName("dwVersionMS"),
        Constants$root.C_LONG$LAYOUT.withName("dwVersionLS"),
        Constants$root.C_LONG$LAYOUT.withName("dwStyle"),
        MemoryLayout.paddingLayout(32)
    ).withName("_tagCODEBASEHOLD");
    public static MemoryLayout $LAYOUT() {
        return _tagCODEBASEHOLD.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _tagCODEBASEHOLD.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_tagCODEBASEHOLD.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _tagCODEBASEHOLD.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_tagCODEBASEHOLD.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _tagCODEBASEHOLD.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szDistUnit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szDistUnit"));
    public static VarHandle szDistUnit$VH() {
        return _tagCODEBASEHOLD.szDistUnit$VH;
    }
    public static MemoryAddress szDistUnit$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagCODEBASEHOLD.szDistUnit$VH.get(seg);
    }
    public static void szDistUnit$set( MemorySegment seg, MemoryAddress x) {
        _tagCODEBASEHOLD.szDistUnit$VH.set(seg, x);
    }
    public static MemoryAddress szDistUnit$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagCODEBASEHOLD.szDistUnit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szDistUnit$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagCODEBASEHOLD.szDistUnit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szCodeBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szCodeBase"));
    public static VarHandle szCodeBase$VH() {
        return _tagCODEBASEHOLD.szCodeBase$VH;
    }
    public static MemoryAddress szCodeBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagCODEBASEHOLD.szCodeBase$VH.get(seg);
    }
    public static void szCodeBase$set( MemorySegment seg, MemoryAddress x) {
        _tagCODEBASEHOLD.szCodeBase$VH.set(seg, x);
    }
    public static MemoryAddress szCodeBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagCODEBASEHOLD.szCodeBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szCodeBase$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagCODEBASEHOLD.szCodeBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVersionMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersionMS"));
    public static VarHandle dwVersionMS$VH() {
        return _tagCODEBASEHOLD.dwVersionMS$VH;
    }
    public static int dwVersionMS$get(MemorySegment seg) {
        return (int)_tagCODEBASEHOLD.dwVersionMS$VH.get(seg);
    }
    public static void dwVersionMS$set( MemorySegment seg, int x) {
        _tagCODEBASEHOLD.dwVersionMS$VH.set(seg, x);
    }
    public static int dwVersionMS$get(MemorySegment seg, long index) {
        return (int)_tagCODEBASEHOLD.dwVersionMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersionMS$set(MemorySegment seg, long index, int x) {
        _tagCODEBASEHOLD.dwVersionMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVersionLS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersionLS"));
    public static VarHandle dwVersionLS$VH() {
        return _tagCODEBASEHOLD.dwVersionLS$VH;
    }
    public static int dwVersionLS$get(MemorySegment seg) {
        return (int)_tagCODEBASEHOLD.dwVersionLS$VH.get(seg);
    }
    public static void dwVersionLS$set( MemorySegment seg, int x) {
        _tagCODEBASEHOLD.dwVersionLS$VH.set(seg, x);
    }
    public static int dwVersionLS$get(MemorySegment seg, long index) {
        return (int)_tagCODEBASEHOLD.dwVersionLS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersionLS$set(MemorySegment seg, long index, int x) {
        _tagCODEBASEHOLD.dwVersionLS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStyle"));
    public static VarHandle dwStyle$VH() {
        return _tagCODEBASEHOLD.dwStyle$VH;
    }
    public static int dwStyle$get(MemorySegment seg) {
        return (int)_tagCODEBASEHOLD.dwStyle$VH.get(seg);
    }
    public static void dwStyle$set( MemorySegment seg, int x) {
        _tagCODEBASEHOLD.dwStyle$VH.set(seg, x);
    }
    public static int dwStyle$get(MemorySegment seg, long index) {
        return (int)_tagCODEBASEHOLD.dwStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStyle$set(MemorySegment seg, long index, int x) {
        _tagCODEBASEHOLD.dwStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


