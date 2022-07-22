// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_CONTENT_ENCRYPT_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hCryptProv"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("ContentEncryptionAlgorithm"),
        Constants$root.C_POINTER$LAYOUT.withName("pvEncryptionAuxInfo"),
        Constants$root.C_LONG$LAYOUT.withName("cRecipients"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgCmsRecipients"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnAlloc"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnFree"),
        Constants$root.C_LONG$LAYOUT.withName("dwEncryptFlags"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("hContentEncryptKey"),
            Constants$root.C_POINTER$LAYOUT.withName("hCNGContentEncryptKey")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("fCNG"),
        Constants$root.C_POINTER$LAYOUT.withName("pbCNGContentEncryptKeyObject"),
        Constants$root.C_POINTER$LAYOUT.withName("pbContentEncryptKey"),
        Constants$root.C_LONG$LAYOUT.withName("cbContentEncryptKey"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CMSG_CONTENT_ENCRYPT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_CONTENT_ENCRYPT_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCryptProv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCryptProv"));
    public static VarHandle hCryptProv$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.hCryptProv$VH;
    }
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)_CMSG_CONTENT_ENCRYPT_INFO.hCryptProv$VH.get(seg);
    }
    public static void hCryptProv$set( MemorySegment seg, long x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hCryptProv$VH.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)_CMSG_CONTENT_ENCRYPT_INFO.hCryptProv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hCryptProv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ContentEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    static final VarHandle pvEncryptionAuxInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvEncryptionAuxInfo"));
    public static VarHandle pvEncryptionAuxInfo$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.pvEncryptionAuxInfo$VH;
    }
    public static MemoryAddress pvEncryptionAuxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.pvEncryptionAuxInfo$VH.get(seg);
    }
    public static void pvEncryptionAuxInfo$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pvEncryptionAuxInfo$VH.set(seg, x);
    }
    public static MemoryAddress pvEncryptionAuxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.pvEncryptionAuxInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvEncryptionAuxInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pvEncryptionAuxInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cRecipients$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cRecipients"));
    public static VarHandle cRecipients$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.cRecipients$VH;
    }
    public static int cRecipients$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cRecipients$VH.get(seg);
    }
    public static void cRecipients$set( MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cRecipients$VH.set(seg, x);
    }
    public static int cRecipients$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cRecipients$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cRecipients$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cRecipients$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgCmsRecipients$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgCmsRecipients"));
    public static VarHandle rgCmsRecipients$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.rgCmsRecipients$VH;
    }
    public static MemoryAddress rgCmsRecipients$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.rgCmsRecipients$VH.get(seg);
    }
    public static void rgCmsRecipients$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.rgCmsRecipients$VH.set(seg, x);
    }
    public static MemoryAddress rgCmsRecipients$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.rgCmsRecipients$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCmsRecipients$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.rgCmsRecipients$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnAlloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnAlloc"));
    public static VarHandle pfnAlloc$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.pfnAlloc$VH;
    }
    public static MemoryAddress pfnAlloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.pfnAlloc$VH.get(seg);
    }
    public static void pfnAlloc$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pfnAlloc$VH.set(seg, x);
    }
    public static MemoryAddress pfnAlloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.pfnAlloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnAlloc$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pfnAlloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CMSG_ALLOC pfnAlloc (MemorySegment segment, MemorySession session) {
        return PFN_CMSG_ALLOC.ofAddress(pfnAlloc$get(segment), session);
    }
    static final VarHandle pfnFree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnFree"));
    public static VarHandle pfnFree$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.pfnFree$VH;
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.pfnFree$VH.get(seg);
    }
    public static void pfnFree$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pfnFree$VH.set(seg, x);
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.pfnFree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFree$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pfnFree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CMSG_FREE pfnFree (MemorySegment segment, MemorySession session) {
        return PFN_CMSG_FREE.ofAddress(pfnFree$get(segment), session);
    }
    static final VarHandle dwEncryptFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwEncryptFlags"));
    public static VarHandle dwEncryptFlags$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.dwEncryptFlags$VH;
    }
    public static int dwEncryptFlags$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.dwEncryptFlags$VH.get(seg);
    }
    public static void dwEncryptFlags$set( MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.dwEncryptFlags$VH.set(seg, x);
    }
    public static int dwEncryptFlags$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.dwEncryptFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwEncryptFlags$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.dwEncryptFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hContentEncryptKey"));
    public static VarHandle hContentEncryptKey$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.hContentEncryptKey$VH;
    }
    public static long hContentEncryptKey$get(MemorySegment seg) {
        return (long)_CMSG_CONTENT_ENCRYPT_INFO.hContentEncryptKey$VH.get(seg);
    }
    public static void hContentEncryptKey$set( MemorySegment seg, long x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hContentEncryptKey$VH.set(seg, x);
    }
    public static long hContentEncryptKey$get(MemorySegment seg, long index) {
        return (long)_CMSG_CONTENT_ENCRYPT_INFO.hContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hContentEncryptKey$set(MemorySegment seg, long index, long x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCNGContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hCNGContentEncryptKey"));
    public static VarHandle hCNGContentEncryptKey$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.hCNGContentEncryptKey$VH;
    }
    public static MemoryAddress hCNGContentEncryptKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.hCNGContentEncryptKey$VH.get(seg);
    }
    public static void hCNGContentEncryptKey$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hCNGContentEncryptKey$VH.set(seg, x);
    }
    public static MemoryAddress hCNGContentEncryptKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.hCNGContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCNGContentEncryptKey$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hCNGContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fCNG$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fCNG"));
    public static VarHandle fCNG$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.fCNG$VH;
    }
    public static int fCNG$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.fCNG$VH.get(seg);
    }
    public static void fCNG$set( MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.fCNG$VH.set(seg, x);
    }
    public static int fCNG$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.fCNG$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fCNG$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.fCNG$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbCNGContentEncryptKeyObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbCNGContentEncryptKeyObject"));
    public static VarHandle pbCNGContentEncryptKeyObject$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.pbCNGContentEncryptKeyObject$VH;
    }
    public static MemoryAddress pbCNGContentEncryptKeyObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.pbCNGContentEncryptKeyObject$VH.get(seg);
    }
    public static void pbCNGContentEncryptKeyObject$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pbCNGContentEncryptKeyObject$VH.set(seg, x);
    }
    public static MemoryAddress pbCNGContentEncryptKeyObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.pbCNGContentEncryptKeyObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbCNGContentEncryptKeyObject$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pbCNGContentEncryptKeyObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbContentEncryptKey"));
    public static VarHandle pbContentEncryptKey$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.pbContentEncryptKey$VH;
    }
    public static MemoryAddress pbContentEncryptKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.pbContentEncryptKey$VH.get(seg);
    }
    public static void pbContentEncryptKey$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pbContentEncryptKey$VH.set(seg, x);
    }
    public static MemoryAddress pbContentEncryptKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CONTENT_ENCRYPT_INFO.pbContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbContentEncryptKey$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pbContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbContentEncryptKey"));
    public static VarHandle cbContentEncryptKey$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.cbContentEncryptKey$VH;
    }
    public static int cbContentEncryptKey$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cbContentEncryptKey$VH.get(seg);
    }
    public static void cbContentEncryptKey$set( MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cbContentEncryptKey$VH.set(seg, x);
    }
    public static int cbContentEncryptKey$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cbContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbContentEncryptKey$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cbContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


