// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_STRONG_SIGN_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwInfoChoice"),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pvInfo"),
            Constants$root.C_POINTER$LAYOUT.withName("pSerializedInfo"),
            Constants$root.C_POINTER$LAYOUT.withName("pszOID")
        ).withName("$anon$0")
    ).withName("_CERT_STRONG_SIGN_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_STRONG_SIGN_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_STRONG_SIGN_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_STRONG_SIGN_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CERT_STRONG_SIGN_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_STRONG_SIGN_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_STRONG_SIGN_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwInfoChoice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwInfoChoice"));
    public static VarHandle dwInfoChoice$VH() {
        return _CERT_STRONG_SIGN_PARA.dwInfoChoice$VH;
    }
    public static int dwInfoChoice$get(MemorySegment seg) {
        return (int)_CERT_STRONG_SIGN_PARA.dwInfoChoice$VH.get(seg);
    }
    public static void dwInfoChoice$set( MemorySegment seg, int x) {
        _CERT_STRONG_SIGN_PARA.dwInfoChoice$VH.set(seg, x);
    }
    public static int dwInfoChoice$get(MemorySegment seg, long index) {
        return (int)_CERT_STRONG_SIGN_PARA.dwInfoChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInfoChoice$set(MemorySegment seg, long index, int x) {
        _CERT_STRONG_SIGN_PARA.dwInfoChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pvInfo"));
    public static VarHandle pvInfo$VH() {
        return _CERT_STRONG_SIGN_PARA.pvInfo$VH;
    }
    public static MemoryAddress pvInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_STRONG_SIGN_PARA.pvInfo$VH.get(seg);
    }
    public static void pvInfo$set( MemorySegment seg, MemoryAddress x) {
        _CERT_STRONG_SIGN_PARA.pvInfo$VH.set(seg, x);
    }
    public static MemoryAddress pvInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_STRONG_SIGN_PARA.pvInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_STRONG_SIGN_PARA.pvInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSerializedInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pSerializedInfo"));
    public static VarHandle pSerializedInfo$VH() {
        return _CERT_STRONG_SIGN_PARA.pSerializedInfo$VH;
    }
    public static MemoryAddress pSerializedInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_STRONG_SIGN_PARA.pSerializedInfo$VH.get(seg);
    }
    public static void pSerializedInfo$set( MemorySegment seg, MemoryAddress x) {
        _CERT_STRONG_SIGN_PARA.pSerializedInfo$VH.set(seg, x);
    }
    public static MemoryAddress pSerializedInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_STRONG_SIGN_PARA.pSerializedInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSerializedInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_STRONG_SIGN_PARA.pSerializedInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszOID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pszOID"));
    public static VarHandle pszOID$VH() {
        return _CERT_STRONG_SIGN_PARA.pszOID$VH;
    }
    public static MemoryAddress pszOID$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_STRONG_SIGN_PARA.pszOID$VH.get(seg);
    }
    public static void pszOID$set( MemorySegment seg, MemoryAddress x) {
        _CERT_STRONG_SIGN_PARA.pszOID$VH.set(seg, x);
    }
    public static MemoryAddress pszOID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_STRONG_SIGN_PARA.pszOID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszOID$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_STRONG_SIGN_PARA.pszOID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


