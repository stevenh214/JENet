// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRMASKBLT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rclBounds"),
        Constants$root.C_LONG$LAYOUT.withName("xDest"),
        Constants$root.C_LONG$LAYOUT.withName("yDest"),
        Constants$root.C_LONG$LAYOUT.withName("cxDest"),
        Constants$root.C_LONG$LAYOUT.withName("cyDest"),
        Constants$root.C_LONG$LAYOUT.withName("dwRop"),
        Constants$root.C_LONG$LAYOUT.withName("xSrc"),
        Constants$root.C_LONG$LAYOUT.withName("ySrc"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("eM11"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM12"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM21"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM22"),
            Constants$root.C_FLOAT$LAYOUT.withName("eDx"),
            Constants$root.C_FLOAT$LAYOUT.withName("eDy")
        ).withName("xformSrc"),
        Constants$root.C_LONG$LAYOUT.withName("crBkColorSrc"),
        Constants$root.C_LONG$LAYOUT.withName("iUsageSrc"),
        Constants$root.C_LONG$LAYOUT.withName("offBmiSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cbBmiSrc"),
        Constants$root.C_LONG$LAYOUT.withName("offBitsSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cbBitsSrc"),
        Constants$root.C_LONG$LAYOUT.withName("xMask"),
        Constants$root.C_LONG$LAYOUT.withName("yMask"),
        Constants$root.C_LONG$LAYOUT.withName("iUsageMask"),
        Constants$root.C_LONG$LAYOUT.withName("offBmiMask"),
        Constants$root.C_LONG$LAYOUT.withName("cbBmiMask"),
        Constants$root.C_LONG$LAYOUT.withName("offBitsMask"),
        Constants$root.C_LONG$LAYOUT.withName("cbBitsMask")
    ).withName("tagEMRMASKBLT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRMASKBLT.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle xDest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xDest"));
    public static VarHandle xDest$VH() {
        return tagEMRMASKBLT.xDest$VH;
    }
    public static int xDest$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.xDest$VH.get(seg);
    }
    public static void xDest$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.xDest$VH.set(seg, x);
    }
    public static int xDest$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.xDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xDest$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.xDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yDest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yDest"));
    public static VarHandle yDest$VH() {
        return tagEMRMASKBLT.yDest$VH;
    }
    public static int yDest$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.yDest$VH.get(seg);
    }
    public static void yDest$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.yDest$VH.set(seg, x);
    }
    public static int yDest$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.yDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yDest$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.yDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cxDest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cxDest"));
    public static VarHandle cxDest$VH() {
        return tagEMRMASKBLT.cxDest$VH;
    }
    public static int cxDest$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.cxDest$VH.get(seg);
    }
    public static void cxDest$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.cxDest$VH.set(seg, x);
    }
    public static int cxDest$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.cxDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cxDest$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.cxDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cyDest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cyDest"));
    public static VarHandle cyDest$VH() {
        return tagEMRMASKBLT.cyDest$VH;
    }
    public static int cyDest$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.cyDest$VH.get(seg);
    }
    public static void cyDest$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.cyDest$VH.set(seg, x);
    }
    public static int cyDest$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.cyDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cyDest$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.cyDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRop$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRop"));
    public static VarHandle dwRop$VH() {
        return tagEMRMASKBLT.dwRop$VH;
    }
    public static int dwRop$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.dwRop$VH.get(seg);
    }
    public static void dwRop$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.dwRop$VH.set(seg, x);
    }
    public static int dwRop$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.dwRop$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRop$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.dwRop$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xSrc"));
    public static VarHandle xSrc$VH() {
        return tagEMRMASKBLT.xSrc$VH;
    }
    public static int xSrc$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.xSrc$VH.get(seg);
    }
    public static void xSrc$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.xSrc$VH.set(seg, x);
    }
    public static int xSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.xSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xSrc$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.xSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ySrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ySrc"));
    public static VarHandle ySrc$VH() {
        return tagEMRMASKBLT.ySrc$VH;
    }
    public static int ySrc$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.ySrc$VH.get(seg);
    }
    public static void ySrc$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.ySrc$VH.set(seg, x);
    }
    public static int ySrc$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.ySrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ySrc$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.ySrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment xformSrc$slice(MemorySegment seg) {
        return seg.asSlice(52, 24);
    }
    static final VarHandle crBkColorSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("crBkColorSrc"));
    public static VarHandle crBkColorSrc$VH() {
        return tagEMRMASKBLT.crBkColorSrc$VH;
    }
    public static int crBkColorSrc$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.crBkColorSrc$VH.get(seg);
    }
    public static void crBkColorSrc$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.crBkColorSrc$VH.set(seg, x);
    }
    public static int crBkColorSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.crBkColorSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void crBkColorSrc$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.crBkColorSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iUsageSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iUsageSrc"));
    public static VarHandle iUsageSrc$VH() {
        return tagEMRMASKBLT.iUsageSrc$VH;
    }
    public static int iUsageSrc$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.iUsageSrc$VH.get(seg);
    }
    public static void iUsageSrc$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.iUsageSrc$VH.set(seg, x);
    }
    public static int iUsageSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.iUsageSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iUsageSrc$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.iUsageSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBmiSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBmiSrc"));
    public static VarHandle offBmiSrc$VH() {
        return tagEMRMASKBLT.offBmiSrc$VH;
    }
    public static int offBmiSrc$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.offBmiSrc$VH.get(seg);
    }
    public static void offBmiSrc$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.offBmiSrc$VH.set(seg, x);
    }
    public static int offBmiSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.offBmiSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBmiSrc$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.offBmiSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBmiSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBmiSrc"));
    public static VarHandle cbBmiSrc$VH() {
        return tagEMRMASKBLT.cbBmiSrc$VH;
    }
    public static int cbBmiSrc$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.cbBmiSrc$VH.get(seg);
    }
    public static void cbBmiSrc$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.cbBmiSrc$VH.set(seg, x);
    }
    public static int cbBmiSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.cbBmiSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBmiSrc$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.cbBmiSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBitsSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBitsSrc"));
    public static VarHandle offBitsSrc$VH() {
        return tagEMRMASKBLT.offBitsSrc$VH;
    }
    public static int offBitsSrc$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.offBitsSrc$VH.get(seg);
    }
    public static void offBitsSrc$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.offBitsSrc$VH.set(seg, x);
    }
    public static int offBitsSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.offBitsSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBitsSrc$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.offBitsSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBitsSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBitsSrc"));
    public static VarHandle cbBitsSrc$VH() {
        return tagEMRMASKBLT.cbBitsSrc$VH;
    }
    public static int cbBitsSrc$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.cbBitsSrc$VH.get(seg);
    }
    public static void cbBitsSrc$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.cbBitsSrc$VH.set(seg, x);
    }
    public static int cbBitsSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.cbBitsSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBitsSrc$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.cbBitsSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xMask"));
    public static VarHandle xMask$VH() {
        return tagEMRMASKBLT.xMask$VH;
    }
    public static int xMask$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.xMask$VH.get(seg);
    }
    public static void xMask$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.xMask$VH.set(seg, x);
    }
    public static int xMask$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.xMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xMask$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.xMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yMask"));
    public static VarHandle yMask$VH() {
        return tagEMRMASKBLT.yMask$VH;
    }
    public static int yMask$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.yMask$VH.get(seg);
    }
    public static void yMask$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.yMask$VH.set(seg, x);
    }
    public static int yMask$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.yMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yMask$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.yMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iUsageMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iUsageMask"));
    public static VarHandle iUsageMask$VH() {
        return tagEMRMASKBLT.iUsageMask$VH;
    }
    public static int iUsageMask$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.iUsageMask$VH.get(seg);
    }
    public static void iUsageMask$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.iUsageMask$VH.set(seg, x);
    }
    public static int iUsageMask$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.iUsageMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iUsageMask$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.iUsageMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBmiMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBmiMask"));
    public static VarHandle offBmiMask$VH() {
        return tagEMRMASKBLT.offBmiMask$VH;
    }
    public static int offBmiMask$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.offBmiMask$VH.get(seg);
    }
    public static void offBmiMask$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.offBmiMask$VH.set(seg, x);
    }
    public static int offBmiMask$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.offBmiMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBmiMask$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.offBmiMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBmiMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBmiMask"));
    public static VarHandle cbBmiMask$VH() {
        return tagEMRMASKBLT.cbBmiMask$VH;
    }
    public static int cbBmiMask$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.cbBmiMask$VH.get(seg);
    }
    public static void cbBmiMask$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.cbBmiMask$VH.set(seg, x);
    }
    public static int cbBmiMask$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.cbBmiMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBmiMask$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.cbBmiMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBitsMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBitsMask"));
    public static VarHandle offBitsMask$VH() {
        return tagEMRMASKBLT.offBitsMask$VH;
    }
    public static int offBitsMask$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.offBitsMask$VH.get(seg);
    }
    public static void offBitsMask$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.offBitsMask$VH.set(seg, x);
    }
    public static int offBitsMask$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.offBitsMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBitsMask$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.offBitsMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBitsMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBitsMask"));
    public static VarHandle cbBitsMask$VH() {
        return tagEMRMASKBLT.cbBitsMask$VH;
    }
    public static int cbBitsMask$get(MemorySegment seg) {
        return (int)tagEMRMASKBLT.cbBitsMask$VH.get(seg);
    }
    public static void cbBitsMask$set( MemorySegment seg, int x) {
        tagEMRMASKBLT.cbBitsMask$VH.set(seg, x);
    }
    public static int cbBitsMask$get(MemorySegment seg, long index) {
        return (int)tagEMRMASKBLT.cbBitsMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBitsMask$set(MemorySegment seg, long index, int x) {
        tagEMRMASKBLT.cbBitsMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


