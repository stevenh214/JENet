// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Magic"),
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("HeaderSize"),
        Constants$root.C_LONG$LAYOUT.withName("cbCertifyInfo"),
        Constants$root.C_LONG$LAYOUT.withName("cbSignature"),
        Constants$root.C_LONG$LAYOUT.withName("cbTpmPublic")
    ).withName("__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT");
    public static MemoryLayout $LAYOUT() {
        return __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.$struct$LAYOUT;
    }
    static final VarHandle Magic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Magic"));
    public static VarHandle Magic$VH() {
        return __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.Magic$VH;
    }
    public static int Magic$get(MemorySegment seg) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.Magic$VH.get(seg);
    }
    public static void Magic$set( MemorySegment seg, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.Magic$VH.set(seg, x);
    }
    public static int Magic$get(MemorySegment seg, long index) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.Magic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Magic$set(MemorySegment seg, long index, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.Magic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HeaderSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HeaderSize"));
    public static VarHandle HeaderSize$VH() {
        return __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.HeaderSize$VH;
    }
    public static int HeaderSize$get(MemorySegment seg) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.HeaderSize$VH.get(seg);
    }
    public static void HeaderSize$set( MemorySegment seg, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.HeaderSize$VH.set(seg, x);
    }
    public static int HeaderSize$get(MemorySegment seg, long index) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.HeaderSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HeaderSize$set(MemorySegment seg, long index, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.HeaderSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbCertifyInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbCertifyInfo"));
    public static VarHandle cbCertifyInfo$VH() {
        return __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbCertifyInfo$VH;
    }
    public static int cbCertifyInfo$get(MemorySegment seg) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbCertifyInfo$VH.get(seg);
    }
    public static void cbCertifyInfo$set( MemorySegment seg, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbCertifyInfo$VH.set(seg, x);
    }
    public static int cbCertifyInfo$get(MemorySegment seg, long index) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbCertifyInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbCertifyInfo$set(MemorySegment seg, long index, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbCertifyInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbSignature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSignature"));
    public static VarHandle cbSignature$VH() {
        return __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbSignature$VH;
    }
    public static int cbSignature$get(MemorySegment seg) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbSignature$VH.get(seg);
    }
    public static void cbSignature$set( MemorySegment seg, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbSignature$VH.set(seg, x);
    }
    public static int cbSignature$get(MemorySegment seg, long index) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbSignature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSignature$set(MemorySegment seg, long index, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbSignature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbTpmPublic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbTpmPublic"));
    public static VarHandle cbTpmPublic$VH() {
        return __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbTpmPublic$VH;
    }
    public static int cbTpmPublic$get(MemorySegment seg) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbTpmPublic$VH.get(seg);
    }
    public static void cbTpmPublic$set( MemorySegment seg, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbTpmPublic$VH.set(seg, x);
    }
    public static int cbTpmPublic$get(MemorySegment seg, long index) {
        return (int)__NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbTpmPublic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbTpmPublic$set(MemorySegment seg, long index, int x) {
        __NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT.cbTpmPublic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


