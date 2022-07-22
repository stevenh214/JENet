// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MMIOINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("fccIOProc"),
        Constants$root.C_POINTER$LAYOUT.withName("pIOProc"),
        Constants$root.C_LONG$LAYOUT.withName("wErrorRet"),
        Constants$root.C_POINTER$LAYOUT.withName("htask"),
        Constants$root.C_LONG$LAYOUT.withName("cchBuffer"),
        Constants$root.C_POINTER$LAYOUT.withName("pchBuffer"),
        Constants$root.C_POINTER$LAYOUT.withName("pchNext"),
        Constants$root.C_POINTER$LAYOUT.withName("pchEndRead"),
        Constants$root.C_POINTER$LAYOUT.withName("pchEndWrite"),
        Constants$root.C_LONG$LAYOUT.withName("lBufOffset"),
        Constants$root.C_LONG$LAYOUT.withName("lDiskOffset"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_LONG$LAYOUT).withName("adwInfo"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved1"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("hmmio")
    ).withName("_MMIOINFO");
    public static MemoryLayout $LAYOUT() {
        return _MMIOINFO.$struct$LAYOUT;
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _MMIOINFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_MMIOINFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _MMIOINFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_MMIOINFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _MMIOINFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fccIOProc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fccIOProc"));
    public static VarHandle fccIOProc$VH() {
        return _MMIOINFO.fccIOProc$VH;
    }
    public static int fccIOProc$get(MemorySegment seg) {
        return (int)_MMIOINFO.fccIOProc$VH.get(seg);
    }
    public static void fccIOProc$set( MemorySegment seg, int x) {
        _MMIOINFO.fccIOProc$VH.set(seg, x);
    }
    public static int fccIOProc$get(MemorySegment seg, long index) {
        return (int)_MMIOINFO.fccIOProc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fccIOProc$set(MemorySegment seg, long index, int x) {
        _MMIOINFO.fccIOProc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pIOProc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pIOProc"));
    public static VarHandle pIOProc$VH() {
        return _MMIOINFO.pIOProc$VH;
    }
    public static MemoryAddress pIOProc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.pIOProc$VH.get(seg);
    }
    public static void pIOProc$set( MemorySegment seg, MemoryAddress x) {
        _MMIOINFO.pIOProc$VH.set(seg, x);
    }
    public static MemoryAddress pIOProc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.pIOProc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pIOProc$set(MemorySegment seg, long index, MemoryAddress x) {
        _MMIOINFO.pIOProc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPMMIOPROC pIOProc (MemorySegment segment, MemorySession session) {
        return LPMMIOPROC.ofAddress(pIOProc$get(segment), session);
    }
    static final VarHandle wErrorRet$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wErrorRet"));
    public static VarHandle wErrorRet$VH() {
        return _MMIOINFO.wErrorRet$VH;
    }
    public static int wErrorRet$get(MemorySegment seg) {
        return (int)_MMIOINFO.wErrorRet$VH.get(seg);
    }
    public static void wErrorRet$set( MemorySegment seg, int x) {
        _MMIOINFO.wErrorRet$VH.set(seg, x);
    }
    public static int wErrorRet$get(MemorySegment seg, long index) {
        return (int)_MMIOINFO.wErrorRet$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wErrorRet$set(MemorySegment seg, long index, int x) {
        _MMIOINFO.wErrorRet$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle htask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("htask"));
    public static VarHandle htask$VH() {
        return _MMIOINFO.htask$VH;
    }
    public static MemoryAddress htask$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.htask$VH.get(seg);
    }
    public static void htask$set( MemorySegment seg, MemoryAddress x) {
        _MMIOINFO.htask$VH.set(seg, x);
    }
    public static MemoryAddress htask$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.htask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void htask$set(MemorySegment seg, long index, MemoryAddress x) {
        _MMIOINFO.htask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cchBuffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cchBuffer"));
    public static VarHandle cchBuffer$VH() {
        return _MMIOINFO.cchBuffer$VH;
    }
    public static int cchBuffer$get(MemorySegment seg) {
        return (int)_MMIOINFO.cchBuffer$VH.get(seg);
    }
    public static void cchBuffer$set( MemorySegment seg, int x) {
        _MMIOINFO.cchBuffer$VH.set(seg, x);
    }
    public static int cchBuffer$get(MemorySegment seg, long index) {
        return (int)_MMIOINFO.cchBuffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cchBuffer$set(MemorySegment seg, long index, int x) {
        _MMIOINFO.cchBuffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pchBuffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pchBuffer"));
    public static VarHandle pchBuffer$VH() {
        return _MMIOINFO.pchBuffer$VH;
    }
    public static MemoryAddress pchBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.pchBuffer$VH.get(seg);
    }
    public static void pchBuffer$set( MemorySegment seg, MemoryAddress x) {
        _MMIOINFO.pchBuffer$VH.set(seg, x);
    }
    public static MemoryAddress pchBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.pchBuffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pchBuffer$set(MemorySegment seg, long index, MemoryAddress x) {
        _MMIOINFO.pchBuffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pchNext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pchNext"));
    public static VarHandle pchNext$VH() {
        return _MMIOINFO.pchNext$VH;
    }
    public static MemoryAddress pchNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.pchNext$VH.get(seg);
    }
    public static void pchNext$set( MemorySegment seg, MemoryAddress x) {
        _MMIOINFO.pchNext$VH.set(seg, x);
    }
    public static MemoryAddress pchNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.pchNext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pchNext$set(MemorySegment seg, long index, MemoryAddress x) {
        _MMIOINFO.pchNext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pchEndRead$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pchEndRead"));
    public static VarHandle pchEndRead$VH() {
        return _MMIOINFO.pchEndRead$VH;
    }
    public static MemoryAddress pchEndRead$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.pchEndRead$VH.get(seg);
    }
    public static void pchEndRead$set( MemorySegment seg, MemoryAddress x) {
        _MMIOINFO.pchEndRead$VH.set(seg, x);
    }
    public static MemoryAddress pchEndRead$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.pchEndRead$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pchEndRead$set(MemorySegment seg, long index, MemoryAddress x) {
        _MMIOINFO.pchEndRead$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pchEndWrite$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pchEndWrite"));
    public static VarHandle pchEndWrite$VH() {
        return _MMIOINFO.pchEndWrite$VH;
    }
    public static MemoryAddress pchEndWrite$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.pchEndWrite$VH.get(seg);
    }
    public static void pchEndWrite$set( MemorySegment seg, MemoryAddress x) {
        _MMIOINFO.pchEndWrite$VH.set(seg, x);
    }
    public static MemoryAddress pchEndWrite$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.pchEndWrite$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pchEndWrite$set(MemorySegment seg, long index, MemoryAddress x) {
        _MMIOINFO.pchEndWrite$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lBufOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lBufOffset"));
    public static VarHandle lBufOffset$VH() {
        return _MMIOINFO.lBufOffset$VH;
    }
    public static int lBufOffset$get(MemorySegment seg) {
        return (int)_MMIOINFO.lBufOffset$VH.get(seg);
    }
    public static void lBufOffset$set( MemorySegment seg, int x) {
        _MMIOINFO.lBufOffset$VH.set(seg, x);
    }
    public static int lBufOffset$get(MemorySegment seg, long index) {
        return (int)_MMIOINFO.lBufOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lBufOffset$set(MemorySegment seg, long index, int x) {
        _MMIOINFO.lBufOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lDiskOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lDiskOffset"));
    public static VarHandle lDiskOffset$VH() {
        return _MMIOINFO.lDiskOffset$VH;
    }
    public static int lDiskOffset$get(MemorySegment seg) {
        return (int)_MMIOINFO.lDiskOffset$VH.get(seg);
    }
    public static void lDiskOffset$set( MemorySegment seg, int x) {
        _MMIOINFO.lDiskOffset$VH.set(seg, x);
    }
    public static int lDiskOffset$get(MemorySegment seg, long index) {
        return (int)_MMIOINFO.lDiskOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lDiskOffset$set(MemorySegment seg, long index, int x) {
        _MMIOINFO.lDiskOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment adwInfo$slice(MemorySegment seg) {
        return seg.asSlice(72, 12);
    }
    static final VarHandle dwReserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved1"));
    public static VarHandle dwReserved1$VH() {
        return _MMIOINFO.dwReserved1$VH;
    }
    public static int dwReserved1$get(MemorySegment seg) {
        return (int)_MMIOINFO.dwReserved1$VH.get(seg);
    }
    public static void dwReserved1$set( MemorySegment seg, int x) {
        _MMIOINFO.dwReserved1$VH.set(seg, x);
    }
    public static int dwReserved1$get(MemorySegment seg, long index) {
        return (int)_MMIOINFO.dwReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved1$set(MemorySegment seg, long index, int x) {
        _MMIOINFO.dwReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved2"));
    public static VarHandle dwReserved2$VH() {
        return _MMIOINFO.dwReserved2$VH;
    }
    public static int dwReserved2$get(MemorySegment seg) {
        return (int)_MMIOINFO.dwReserved2$VH.get(seg);
    }
    public static void dwReserved2$set( MemorySegment seg, int x) {
        _MMIOINFO.dwReserved2$VH.set(seg, x);
    }
    public static int dwReserved2$get(MemorySegment seg, long index) {
        return (int)_MMIOINFO.dwReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved2$set(MemorySegment seg, long index, int x) {
        _MMIOINFO.dwReserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hmmio$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hmmio"));
    public static VarHandle hmmio$VH() {
        return _MMIOINFO.hmmio$VH;
    }
    public static MemoryAddress hmmio$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.hmmio$VH.get(seg);
    }
    public static void hmmio$set( MemorySegment seg, MemoryAddress x) {
        _MMIOINFO.hmmio$VH.set(seg, x);
    }
    public static MemoryAddress hmmio$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MMIOINFO.hmmio$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hmmio$set(MemorySegment seg, long index, MemoryAddress x) {
        _MMIOINFO.hmmio$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


