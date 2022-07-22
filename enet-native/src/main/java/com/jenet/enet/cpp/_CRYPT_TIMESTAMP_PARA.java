// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_TIMESTAMP_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszTSAPolicyId"),
        Constants$root.C_LONG$LAYOUT.withName("fRequestCerts"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("Nonce"),
        Constants$root.C_LONG$LAYOUT.withName("cExtension"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgExtension")
    ).withName("_CRYPT_TIMESTAMP_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_TIMESTAMP_PARA.$struct$LAYOUT;
    }
    static final VarHandle pszTSAPolicyId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszTSAPolicyId"));
    public static VarHandle pszTSAPolicyId$VH() {
        return _CRYPT_TIMESTAMP_PARA.pszTSAPolicyId$VH;
    }
    public static MemoryAddress pszTSAPolicyId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_PARA.pszTSAPolicyId$VH.get(seg);
    }
    public static void pszTSAPolicyId$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_TIMESTAMP_PARA.pszTSAPolicyId$VH.set(seg, x);
    }
    public static MemoryAddress pszTSAPolicyId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_PARA.pszTSAPolicyId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszTSAPolicyId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_TIMESTAMP_PARA.pszTSAPolicyId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fRequestCerts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fRequestCerts"));
    public static VarHandle fRequestCerts$VH() {
        return _CRYPT_TIMESTAMP_PARA.fRequestCerts$VH;
    }
    public static int fRequestCerts$get(MemorySegment seg) {
        return (int)_CRYPT_TIMESTAMP_PARA.fRequestCerts$VH.get(seg);
    }
    public static void fRequestCerts$set( MemorySegment seg, int x) {
        _CRYPT_TIMESTAMP_PARA.fRequestCerts$VH.set(seg, x);
    }
    public static int fRequestCerts$get(MemorySegment seg, long index) {
        return (int)_CRYPT_TIMESTAMP_PARA.fRequestCerts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fRequestCerts$set(MemorySegment seg, long index, int x) {
        _CRYPT_TIMESTAMP_PARA.fRequestCerts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Nonce$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    static final VarHandle cExtension$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cExtension"));
    public static VarHandle cExtension$VH() {
        return _CRYPT_TIMESTAMP_PARA.cExtension$VH;
    }
    public static int cExtension$get(MemorySegment seg) {
        return (int)_CRYPT_TIMESTAMP_PARA.cExtension$VH.get(seg);
    }
    public static void cExtension$set( MemorySegment seg, int x) {
        _CRYPT_TIMESTAMP_PARA.cExtension$VH.set(seg, x);
    }
    public static int cExtension$get(MemorySegment seg, long index) {
        return (int)_CRYPT_TIMESTAMP_PARA.cExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cExtension$set(MemorySegment seg, long index, int x) {
        _CRYPT_TIMESTAMP_PARA.cExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgExtension$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgExtension"));
    public static VarHandle rgExtension$VH() {
        return _CRYPT_TIMESTAMP_PARA.rgExtension$VH;
    }
    public static MemoryAddress rgExtension$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_PARA.rgExtension$VH.get(seg);
    }
    public static void rgExtension$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_TIMESTAMP_PARA.rgExtension$VH.set(seg, x);
    }
    public static MemoryAddress rgExtension$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_TIMESTAMP_PARA.rgExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgExtension$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_TIMESTAMP_PARA.rgExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


