// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMENUITEMINFOA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("fMask"),
        Constants$root.C_LONG$LAYOUT.withName("fType"),
        Constants$root.C_LONG$LAYOUT.withName("fState"),
        Constants$root.C_LONG$LAYOUT.withName("wID"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hSubMenu"),
        Constants$root.C_POINTER$LAYOUT.withName("hbmpChecked"),
        Constants$root.C_POINTER$LAYOUT.withName("hbmpUnchecked"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwItemData"),
        Constants$root.C_POINTER$LAYOUT.withName("dwTypeData"),
        Constants$root.C_LONG$LAYOUT.withName("cch"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hbmpItem")
    ).withName("tagMENUITEMINFOA");
    public static MemoryLayout $LAYOUT() {
        return tagMENUITEMINFOA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagMENUITEMINFOA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagMENUITEMINFOA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagMENUITEMINFOA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagMENUITEMINFOA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagMENUITEMINFOA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fMask"));
    public static VarHandle fMask$VH() {
        return tagMENUITEMINFOA.fMask$VH;
    }
    public static int fMask$get(MemorySegment seg) {
        return (int)tagMENUITEMINFOA.fMask$VH.get(seg);
    }
    public static void fMask$set( MemorySegment seg, int x) {
        tagMENUITEMINFOA.fMask$VH.set(seg, x);
    }
    public static int fMask$get(MemorySegment seg, long index) {
        return (int)tagMENUITEMINFOA.fMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fMask$set(MemorySegment seg, long index, int x) {
        tagMENUITEMINFOA.fMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fType"));
    public static VarHandle fType$VH() {
        return tagMENUITEMINFOA.fType$VH;
    }
    public static int fType$get(MemorySegment seg) {
        return (int)tagMENUITEMINFOA.fType$VH.get(seg);
    }
    public static void fType$set( MemorySegment seg, int x) {
        tagMENUITEMINFOA.fType$VH.set(seg, x);
    }
    public static int fType$get(MemorySegment seg, long index) {
        return (int)tagMENUITEMINFOA.fType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fType$set(MemorySegment seg, long index, int x) {
        tagMENUITEMINFOA.fType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fState"));
    public static VarHandle fState$VH() {
        return tagMENUITEMINFOA.fState$VH;
    }
    public static int fState$get(MemorySegment seg) {
        return (int)tagMENUITEMINFOA.fState$VH.get(seg);
    }
    public static void fState$set( MemorySegment seg, int x) {
        tagMENUITEMINFOA.fState$VH.set(seg, x);
    }
    public static int fState$get(MemorySegment seg, long index) {
        return (int)tagMENUITEMINFOA.fState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fState$set(MemorySegment seg, long index, int x) {
        tagMENUITEMINFOA.fState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wID"));
    public static VarHandle wID$VH() {
        return tagMENUITEMINFOA.wID$VH;
    }
    public static int wID$get(MemorySegment seg) {
        return (int)tagMENUITEMINFOA.wID$VH.get(seg);
    }
    public static void wID$set( MemorySegment seg, int x) {
        tagMENUITEMINFOA.wID$VH.set(seg, x);
    }
    public static int wID$get(MemorySegment seg, long index) {
        return (int)tagMENUITEMINFOA.wID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wID$set(MemorySegment seg, long index, int x) {
        tagMENUITEMINFOA.wID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hSubMenu$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hSubMenu"));
    public static VarHandle hSubMenu$VH() {
        return tagMENUITEMINFOA.hSubMenu$VH;
    }
    public static MemoryAddress hSubMenu$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMENUITEMINFOA.hSubMenu$VH.get(seg);
    }
    public static void hSubMenu$set( MemorySegment seg, MemoryAddress x) {
        tagMENUITEMINFOA.hSubMenu$VH.set(seg, x);
    }
    public static MemoryAddress hSubMenu$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMENUITEMINFOA.hSubMenu$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hSubMenu$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMENUITEMINFOA.hSubMenu$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmpChecked$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbmpChecked"));
    public static VarHandle hbmpChecked$VH() {
        return tagMENUITEMINFOA.hbmpChecked$VH;
    }
    public static MemoryAddress hbmpChecked$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMENUITEMINFOA.hbmpChecked$VH.get(seg);
    }
    public static void hbmpChecked$set( MemorySegment seg, MemoryAddress x) {
        tagMENUITEMINFOA.hbmpChecked$VH.set(seg, x);
    }
    public static MemoryAddress hbmpChecked$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMENUITEMINFOA.hbmpChecked$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmpChecked$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMENUITEMINFOA.hbmpChecked$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmpUnchecked$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbmpUnchecked"));
    public static VarHandle hbmpUnchecked$VH() {
        return tagMENUITEMINFOA.hbmpUnchecked$VH;
    }
    public static MemoryAddress hbmpUnchecked$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMENUITEMINFOA.hbmpUnchecked$VH.get(seg);
    }
    public static void hbmpUnchecked$set( MemorySegment seg, MemoryAddress x) {
        tagMENUITEMINFOA.hbmpUnchecked$VH.set(seg, x);
    }
    public static MemoryAddress hbmpUnchecked$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMENUITEMINFOA.hbmpUnchecked$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmpUnchecked$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMENUITEMINFOA.hbmpUnchecked$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwItemData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwItemData"));
    public static VarHandle dwItemData$VH() {
        return tagMENUITEMINFOA.dwItemData$VH;
    }
    public static long dwItemData$get(MemorySegment seg) {
        return (long)tagMENUITEMINFOA.dwItemData$VH.get(seg);
    }
    public static void dwItemData$set( MemorySegment seg, long x) {
        tagMENUITEMINFOA.dwItemData$VH.set(seg, x);
    }
    public static long dwItemData$get(MemorySegment seg, long index) {
        return (long)tagMENUITEMINFOA.dwItemData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwItemData$set(MemorySegment seg, long index, long x) {
        tagMENUITEMINFOA.dwItemData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTypeData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTypeData"));
    public static VarHandle dwTypeData$VH() {
        return tagMENUITEMINFOA.dwTypeData$VH;
    }
    public static MemoryAddress dwTypeData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMENUITEMINFOA.dwTypeData$VH.get(seg);
    }
    public static void dwTypeData$set( MemorySegment seg, MemoryAddress x) {
        tagMENUITEMINFOA.dwTypeData$VH.set(seg, x);
    }
    public static MemoryAddress dwTypeData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMENUITEMINFOA.dwTypeData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTypeData$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMENUITEMINFOA.dwTypeData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cch"));
    public static VarHandle cch$VH() {
        return tagMENUITEMINFOA.cch$VH;
    }
    public static int cch$get(MemorySegment seg) {
        return (int)tagMENUITEMINFOA.cch$VH.get(seg);
    }
    public static void cch$set( MemorySegment seg, int x) {
        tagMENUITEMINFOA.cch$VH.set(seg, x);
    }
    public static int cch$get(MemorySegment seg, long index) {
        return (int)tagMENUITEMINFOA.cch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cch$set(MemorySegment seg, long index, int x) {
        tagMENUITEMINFOA.cch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmpItem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbmpItem"));
    public static VarHandle hbmpItem$VH() {
        return tagMENUITEMINFOA.hbmpItem$VH;
    }
    public static MemoryAddress hbmpItem$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMENUITEMINFOA.hbmpItem$VH.get(seg);
    }
    public static void hbmpItem$set( MemorySegment seg, MemoryAddress x) {
        tagMENUITEMINFOA.hbmpItem$VH.set(seg, x);
    }
    public static MemoryAddress hbmpItem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMENUITEMINFOA.hbmpItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmpItem$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMENUITEMINFOA.hbmpItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


