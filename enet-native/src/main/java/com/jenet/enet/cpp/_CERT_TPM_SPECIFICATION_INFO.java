// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_TPM_SPECIFICATION_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pwszFamily"),
        Constants$root.C_LONG$LAYOUT.withName("dwLevel"),
        Constants$root.C_LONG$LAYOUT.withName("dwRevision")
    ).withName("_CERT_TPM_SPECIFICATION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_TPM_SPECIFICATION_INFO.$struct$LAYOUT;
    }
    static final VarHandle pwszFamily$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszFamily"));
    public static VarHandle pwszFamily$VH() {
        return _CERT_TPM_SPECIFICATION_INFO.pwszFamily$VH;
    }
    public static MemoryAddress pwszFamily$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_TPM_SPECIFICATION_INFO.pwszFamily$VH.get(seg);
    }
    public static void pwszFamily$set( MemorySegment seg, MemoryAddress x) {
        _CERT_TPM_SPECIFICATION_INFO.pwszFamily$VH.set(seg, x);
    }
    public static MemoryAddress pwszFamily$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_TPM_SPECIFICATION_INFO.pwszFamily$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszFamily$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_TPM_SPECIFICATION_INFO.pwszFamily$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLevel"));
    public static VarHandle dwLevel$VH() {
        return _CERT_TPM_SPECIFICATION_INFO.dwLevel$VH;
    }
    public static int dwLevel$get(MemorySegment seg) {
        return (int)_CERT_TPM_SPECIFICATION_INFO.dwLevel$VH.get(seg);
    }
    public static void dwLevel$set( MemorySegment seg, int x) {
        _CERT_TPM_SPECIFICATION_INFO.dwLevel$VH.set(seg, x);
    }
    public static int dwLevel$get(MemorySegment seg, long index) {
        return (int)_CERT_TPM_SPECIFICATION_INFO.dwLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLevel$set(MemorySegment seg, long index, int x) {
        _CERT_TPM_SPECIFICATION_INFO.dwLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRevision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRevision"));
    public static VarHandle dwRevision$VH() {
        return _CERT_TPM_SPECIFICATION_INFO.dwRevision$VH;
    }
    public static int dwRevision$get(MemorySegment seg) {
        return (int)_CERT_TPM_SPECIFICATION_INFO.dwRevision$VH.get(seg);
    }
    public static void dwRevision$set( MemorySegment seg, int x) {
        _CERT_TPM_SPECIFICATION_INFO.dwRevision$VH.set(seg, x);
    }
    public static int dwRevision$get(MemorySegment seg, long index) {
        return (int)_CERT_TPM_SPECIFICATION_INFO.dwRevision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRevision$set(MemorySegment seg, long index, int x) {
        _CERT_TPM_SPECIFICATION_INFO.dwRevision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

