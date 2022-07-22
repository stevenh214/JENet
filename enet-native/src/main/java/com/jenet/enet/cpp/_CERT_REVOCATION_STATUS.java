// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_REVOCATION_STATUS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwIndex"),
        Constants$root.C_LONG$LAYOUT.withName("dwError"),
        Constants$root.C_LONG$LAYOUT.withName("dwReason"),
        Constants$root.C_LONG$LAYOUT.withName("fHasFreshnessTime"),
        Constants$root.C_LONG$LAYOUT.withName("dwFreshnessTime")
    ).withName("_CERT_REVOCATION_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _CERT_REVOCATION_STATUS.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_REVOCATION_STATUS.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwIndex"));
    public static VarHandle dwIndex$VH() {
        return _CERT_REVOCATION_STATUS.dwIndex$VH;
    }
    public static int dwIndex$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.dwIndex$VH.get(seg);
    }
    public static void dwIndex$set( MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.dwIndex$VH.set(seg, x);
    }
    public static int dwIndex$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.dwIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwIndex$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.dwIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwError$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwError"));
    public static VarHandle dwError$VH() {
        return _CERT_REVOCATION_STATUS.dwError$VH;
    }
    public static int dwError$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.dwError$VH.get(seg);
    }
    public static void dwError$set( MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.dwError$VH.set(seg, x);
    }
    public static int dwError$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.dwError$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwError$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.dwError$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReason$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReason"));
    public static VarHandle dwReason$VH() {
        return _CERT_REVOCATION_STATUS.dwReason$VH;
    }
    public static int dwReason$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.dwReason$VH.get(seg);
    }
    public static void dwReason$set( MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.dwReason$VH.set(seg, x);
    }
    public static int dwReason$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.dwReason$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReason$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.dwReason$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fHasFreshnessTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fHasFreshnessTime"));
    public static VarHandle fHasFreshnessTime$VH() {
        return _CERT_REVOCATION_STATUS.fHasFreshnessTime$VH;
    }
    public static int fHasFreshnessTime$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.fHasFreshnessTime$VH.get(seg);
    }
    public static void fHasFreshnessTime$set( MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.fHasFreshnessTime$VH.set(seg, x);
    }
    public static int fHasFreshnessTime$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.fHasFreshnessTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fHasFreshnessTime$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.fHasFreshnessTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFreshnessTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFreshnessTime"));
    public static VarHandle dwFreshnessTime$VH() {
        return _CERT_REVOCATION_STATUS.dwFreshnessTime$VH;
    }
    public static int dwFreshnessTime$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.dwFreshnessTime$VH.get(seg);
    }
    public static void dwFreshnessTime$set( MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.dwFreshnessTime$VH.set(seg, x);
    }
    public static int dwFreshnessTime$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.dwFreshnessTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFreshnessTime$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.dwFreshnessTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

