// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _WSANAMESPACE_INFOEXW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("NSProviderId"),
        Constants$root.C_LONG$LAYOUT.withName("dwNameSpace"),
        Constants$root.C_LONG$LAYOUT.withName("fActive"),
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpszIdentifier"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbSize"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pBlobData")
        ).withName("ProviderSpecific")
    ).withName("_WSANAMESPACE_INFOEXW");
    public static MemoryLayout $LAYOUT() {
        return _WSANAMESPACE_INFOEXW.$struct$LAYOUT;
    }
    public static MemorySegment NSProviderId$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle dwNameSpace$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNameSpace"));
    public static VarHandle dwNameSpace$VH() {
        return _WSANAMESPACE_INFOEXW.dwNameSpace$VH;
    }
    public static int dwNameSpace$get(MemorySegment seg) {
        return (int)_WSANAMESPACE_INFOEXW.dwNameSpace$VH.get(seg);
    }
    public static void dwNameSpace$set( MemorySegment seg, int x) {
        _WSANAMESPACE_INFOEXW.dwNameSpace$VH.set(seg, x);
    }
    public static int dwNameSpace$get(MemorySegment seg, long index) {
        return (int)_WSANAMESPACE_INFOEXW.dwNameSpace$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNameSpace$set(MemorySegment seg, long index, int x) {
        _WSANAMESPACE_INFOEXW.dwNameSpace$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fActive$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fActive"));
    public static VarHandle fActive$VH() {
        return _WSANAMESPACE_INFOEXW.fActive$VH;
    }
    public static int fActive$get(MemorySegment seg) {
        return (int)_WSANAMESPACE_INFOEXW.fActive$VH.get(seg);
    }
    public static void fActive$set( MemorySegment seg, int x) {
        _WSANAMESPACE_INFOEXW.fActive$VH.set(seg, x);
    }
    public static int fActive$get(MemorySegment seg, long index) {
        return (int)_WSANAMESPACE_INFOEXW.fActive$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fActive$set(MemorySegment seg, long index, int x) {
        _WSANAMESPACE_INFOEXW.fActive$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _WSANAMESPACE_INFOEXW.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_WSANAMESPACE_INFOEXW.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _WSANAMESPACE_INFOEXW.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_WSANAMESPACE_INFOEXW.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _WSANAMESPACE_INFOEXW.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszIdentifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszIdentifier"));
    public static VarHandle lpszIdentifier$VH() {
        return _WSANAMESPACE_INFOEXW.lpszIdentifier$VH;
    }
    public static MemoryAddress lpszIdentifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_WSANAMESPACE_INFOEXW.lpszIdentifier$VH.get(seg);
    }
    public static void lpszIdentifier$set( MemorySegment seg, MemoryAddress x) {
        _WSANAMESPACE_INFOEXW.lpszIdentifier$VH.set(seg, x);
    }
    public static MemoryAddress lpszIdentifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_WSANAMESPACE_INFOEXW.lpszIdentifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszIdentifier$set(MemorySegment seg, long index, MemoryAddress x) {
        _WSANAMESPACE_INFOEXW.lpszIdentifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ProviderSpecific$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


