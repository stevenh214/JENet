// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cOID"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpszOID")
    ).withName("_CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA.$struct$LAYOUT;
    }
    static final VarHandle cOID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cOID"));
    public static VarHandle cOID$VH() {
        return _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA.cOID$VH;
    }
    public static int cOID$get(MemorySegment seg) {
        return (int)_CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA.cOID$VH.get(seg);
    }
    public static void cOID$set( MemorySegment seg, int x) {
        _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA.cOID$VH.set(seg, x);
    }
    public static int cOID$get(MemorySegment seg, long index) {
        return (int)_CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA.cOID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cOID$set(MemorySegment seg, long index, int x) {
        _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA.cOID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpszOID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpszOID"));
    public static VarHandle rgpszOID$VH() {
        return _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA.rgpszOID$VH;
    }
    public static MemoryAddress rgpszOID$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA.rgpszOID$VH.get(seg);
    }
    public static void rgpszOID$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA.rgpszOID$VH.set(seg, x);
    }
    public static MemoryAddress rgpszOID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA.rgpszOID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpszOID$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA.rgpszOID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


