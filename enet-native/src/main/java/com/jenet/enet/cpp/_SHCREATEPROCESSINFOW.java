// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SHCREATEPROCESSINFOW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("fMask"),
        Constants$root.C_POINTER$LAYOUT.withName("hwnd"),
        Constants$root.C_POINTER$LAYOUT.withName("pszFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pszParameters"),
        Constants$root.C_POINTER$LAYOUT.withName("pszCurrentDirectory"),
        Constants$root.C_POINTER$LAYOUT.withName("hUserToken"),
        Constants$root.C_POINTER$LAYOUT.withName("lpProcessAttributes"),
        Constants$root.C_POINTER$LAYOUT.withName("lpThreadAttributes"),
        Constants$root.C_LONG$LAYOUT.withName("bInheritHandles"),
        Constants$root.C_LONG$LAYOUT.withName("dwCreationFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("lpStartupInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("lpProcessInformation")
    ).withName("_SHCREATEPROCESSINFOW");
    public static MemoryLayout $LAYOUT() {
        return _SHCREATEPROCESSINFOW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _SHCREATEPROCESSINFOW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_SHCREATEPROCESSINFOW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _SHCREATEPROCESSINFOW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_SHCREATEPROCESSINFOW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _SHCREATEPROCESSINFOW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fMask"));
    public static VarHandle fMask$VH() {
        return _SHCREATEPROCESSINFOW.fMask$VH;
    }
    public static int fMask$get(MemorySegment seg) {
        return (int)_SHCREATEPROCESSINFOW.fMask$VH.get(seg);
    }
    public static void fMask$set( MemorySegment seg, int x) {
        _SHCREATEPROCESSINFOW.fMask$VH.set(seg, x);
    }
    public static int fMask$get(MemorySegment seg, long index) {
        return (int)_SHCREATEPROCESSINFOW.fMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fMask$set(MemorySegment seg, long index, int x) {
        _SHCREATEPROCESSINFOW.fMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwnd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwnd"));
    public static VarHandle hwnd$VH() {
        return _SHCREATEPROCESSINFOW.hwnd$VH;
    }
    public static MemoryAddress hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.hwnd$VH.get(seg);
    }
    public static void hwnd$set( MemorySegment seg, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.hwnd$VH.set(seg, x);
    }
    public static MemoryAddress hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.hwnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.hwnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszFile"));
    public static VarHandle pszFile$VH() {
        return _SHCREATEPROCESSINFOW.pszFile$VH;
    }
    public static MemoryAddress pszFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.pszFile$VH.get(seg);
    }
    public static void pszFile$set( MemorySegment seg, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.pszFile$VH.set(seg, x);
    }
    public static MemoryAddress pszFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.pszFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.pszFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszParameters$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszParameters"));
    public static VarHandle pszParameters$VH() {
        return _SHCREATEPROCESSINFOW.pszParameters$VH;
    }
    public static MemoryAddress pszParameters$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.pszParameters$VH.get(seg);
    }
    public static void pszParameters$set( MemorySegment seg, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.pszParameters$VH.set(seg, x);
    }
    public static MemoryAddress pszParameters$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.pszParameters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszParameters$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.pszParameters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszCurrentDirectory$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszCurrentDirectory"));
    public static VarHandle pszCurrentDirectory$VH() {
        return _SHCREATEPROCESSINFOW.pszCurrentDirectory$VH;
    }
    public static MemoryAddress pszCurrentDirectory$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.pszCurrentDirectory$VH.get(seg);
    }
    public static void pszCurrentDirectory$set( MemorySegment seg, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.pszCurrentDirectory$VH.set(seg, x);
    }
    public static MemoryAddress pszCurrentDirectory$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.pszCurrentDirectory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszCurrentDirectory$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.pszCurrentDirectory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hUserToken$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hUserToken"));
    public static VarHandle hUserToken$VH() {
        return _SHCREATEPROCESSINFOW.hUserToken$VH;
    }
    public static MemoryAddress hUserToken$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.hUserToken$VH.get(seg);
    }
    public static void hUserToken$set( MemorySegment seg, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.hUserToken$VH.set(seg, x);
    }
    public static MemoryAddress hUserToken$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.hUserToken$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hUserToken$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.hUserToken$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpProcessAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpProcessAttributes"));
    public static VarHandle lpProcessAttributes$VH() {
        return _SHCREATEPROCESSINFOW.lpProcessAttributes$VH;
    }
    public static MemoryAddress lpProcessAttributes$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.lpProcessAttributes$VH.get(seg);
    }
    public static void lpProcessAttributes$set( MemorySegment seg, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.lpProcessAttributes$VH.set(seg, x);
    }
    public static MemoryAddress lpProcessAttributes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.lpProcessAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpProcessAttributes$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.lpProcessAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpThreadAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpThreadAttributes"));
    public static VarHandle lpThreadAttributes$VH() {
        return _SHCREATEPROCESSINFOW.lpThreadAttributes$VH;
    }
    public static MemoryAddress lpThreadAttributes$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.lpThreadAttributes$VH.get(seg);
    }
    public static void lpThreadAttributes$set( MemorySegment seg, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.lpThreadAttributes$VH.set(seg, x);
    }
    public static MemoryAddress lpThreadAttributes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.lpThreadAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpThreadAttributes$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.lpThreadAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bInheritHandles$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bInheritHandles"));
    public static VarHandle bInheritHandles$VH() {
        return _SHCREATEPROCESSINFOW.bInheritHandles$VH;
    }
    public static int bInheritHandles$get(MemorySegment seg) {
        return (int)_SHCREATEPROCESSINFOW.bInheritHandles$VH.get(seg);
    }
    public static void bInheritHandles$set( MemorySegment seg, int x) {
        _SHCREATEPROCESSINFOW.bInheritHandles$VH.set(seg, x);
    }
    public static int bInheritHandles$get(MemorySegment seg, long index) {
        return (int)_SHCREATEPROCESSINFOW.bInheritHandles$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bInheritHandles$set(MemorySegment seg, long index, int x) {
        _SHCREATEPROCESSINFOW.bInheritHandles$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCreationFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCreationFlags"));
    public static VarHandle dwCreationFlags$VH() {
        return _SHCREATEPROCESSINFOW.dwCreationFlags$VH;
    }
    public static int dwCreationFlags$get(MemorySegment seg) {
        return (int)_SHCREATEPROCESSINFOW.dwCreationFlags$VH.get(seg);
    }
    public static void dwCreationFlags$set( MemorySegment seg, int x) {
        _SHCREATEPROCESSINFOW.dwCreationFlags$VH.set(seg, x);
    }
    public static int dwCreationFlags$get(MemorySegment seg, long index) {
        return (int)_SHCREATEPROCESSINFOW.dwCreationFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCreationFlags$set(MemorySegment seg, long index, int x) {
        _SHCREATEPROCESSINFOW.dwCreationFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpStartupInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpStartupInfo"));
    public static VarHandle lpStartupInfo$VH() {
        return _SHCREATEPROCESSINFOW.lpStartupInfo$VH;
    }
    public static MemoryAddress lpStartupInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.lpStartupInfo$VH.get(seg);
    }
    public static void lpStartupInfo$set( MemorySegment seg, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.lpStartupInfo$VH.set(seg, x);
    }
    public static MemoryAddress lpStartupInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.lpStartupInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpStartupInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.lpStartupInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpProcessInformation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpProcessInformation"));
    public static VarHandle lpProcessInformation$VH() {
        return _SHCREATEPROCESSINFOW.lpProcessInformation$VH;
    }
    public static MemoryAddress lpProcessInformation$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.lpProcessInformation$VH.get(seg);
    }
    public static void lpProcessInformation$set( MemorySegment seg, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.lpProcessInformation$VH.set(seg, x);
    }
    public static MemoryAddress lpProcessInformation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHCREATEPROCESSINFOW.lpProcessInformation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpProcessInformation$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHCREATEPROCESSINFOW.lpProcessInformation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


