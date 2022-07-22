// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_CRL_CONTEXT_PAIR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pCertContext"),
        Constants$root.C_POINTER$LAYOUT.withName("pCrlContext")
    ).withName("_CERT_CRL_CONTEXT_PAIR");
    public static MemoryLayout $LAYOUT() {
        return _CERT_CRL_CONTEXT_PAIR.$struct$LAYOUT;
    }
    static final VarHandle pCertContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pCertContext"));
    public static VarHandle pCertContext$VH() {
        return _CERT_CRL_CONTEXT_PAIR.pCertContext$VH;
    }
    public static MemoryAddress pCertContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_CRL_CONTEXT_PAIR.pCertContext$VH.get(seg);
    }
    public static void pCertContext$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CRL_CONTEXT_PAIR.pCertContext$VH.set(seg, x);
    }
    public static MemoryAddress pCertContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_CRL_CONTEXT_PAIR.pCertContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCertContext$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CRL_CONTEXT_PAIR.pCertContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pCrlContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pCrlContext"));
    public static VarHandle pCrlContext$VH() {
        return _CERT_CRL_CONTEXT_PAIR.pCrlContext$VH;
    }
    public static MemoryAddress pCrlContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_CRL_CONTEXT_PAIR.pCrlContext$VH.get(seg);
    }
    public static void pCrlContext$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CRL_CONTEXT_PAIR.pCrlContext$VH.set(seg, x);
    }
    public static MemoryAddress pCrlContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_CRL_CONTEXT_PAIR.pCrlContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCrlContext$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CRL_CONTEXT_PAIR.pCrlContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


