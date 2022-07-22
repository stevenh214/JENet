// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_TRUST_LIST_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pCtlEntry"),
        Constants$root.C_POINTER$LAYOUT.withName("pCtlContext")
    ).withName("_CERT_TRUST_LIST_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_TRUST_LIST_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_TRUST_LIST_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_TRUST_LIST_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CERT_TRUST_LIST_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_TRUST_LIST_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_TRUST_LIST_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pCtlEntry$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pCtlEntry"));
    public static VarHandle pCtlEntry$VH() {
        return _CERT_TRUST_LIST_INFO.pCtlEntry$VH;
    }
    public static MemoryAddress pCtlEntry$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_TRUST_LIST_INFO.pCtlEntry$VH.get(seg);
    }
    public static void pCtlEntry$set( MemorySegment seg, MemoryAddress x) {
        _CERT_TRUST_LIST_INFO.pCtlEntry$VH.set(seg, x);
    }
    public static MemoryAddress pCtlEntry$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_TRUST_LIST_INFO.pCtlEntry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCtlEntry$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_TRUST_LIST_INFO.pCtlEntry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pCtlContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pCtlContext"));
    public static VarHandle pCtlContext$VH() {
        return _CERT_TRUST_LIST_INFO.pCtlContext$VH;
    }
    public static MemoryAddress pCtlContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_TRUST_LIST_INFO.pCtlContext$VH.get(seg);
    }
    public static void pCtlContext$set( MemorySegment seg, MemoryAddress x) {
        _CERT_TRUST_LIST_INFO.pCtlContext$VH.set(seg, x);
    }
    public static MemoryAddress pCtlContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_TRUST_LIST_INFO.pCtlContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCtlContext$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_TRUST_LIST_INFO.pCtlContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


