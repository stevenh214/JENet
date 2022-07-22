// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_SIGN_MESSAGE_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwMsgEncodingType"),
        Constants$root.C_POINTER$LAYOUT.withName("pSigningCert"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("HashAlgorithm"),
        Constants$root.C_POINTER$LAYOUT.withName("pvHashAuxInfo"),
        Constants$root.C_LONG$LAYOUT.withName("cMsgCert"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpMsgCert"),
        Constants$root.C_LONG$LAYOUT.withName("cMsgCrl"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpMsgCrl"),
        Constants$root.C_LONG$LAYOUT.withName("cAuthAttr"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgAuthAttr"),
        Constants$root.C_LONG$LAYOUT.withName("cUnauthAttr"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgUnauthAttr"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwInnerContentType")
    ).withName("_CRYPT_SIGN_MESSAGE_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_SIGN_MESSAGE_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMsgEncodingType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMsgEncodingType"));
    public static VarHandle dwMsgEncodingType$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.dwMsgEncodingType$VH;
    }
    public static int dwMsgEncodingType$get(MemorySegment seg) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.dwMsgEncodingType$VH.get(seg);
    }
    public static void dwMsgEncodingType$set( MemorySegment seg, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.dwMsgEncodingType$VH.set(seg, x);
    }
    public static int dwMsgEncodingType$get(MemorySegment seg, long index) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.dwMsgEncodingType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMsgEncodingType$set(MemorySegment seg, long index, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.dwMsgEncodingType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSigningCert$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSigningCert"));
    public static VarHandle pSigningCert$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.pSigningCert$VH;
    }
    public static MemoryAddress pSigningCert$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.pSigningCert$VH.get(seg);
    }
    public static void pSigningCert$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.pSigningCert$VH.set(seg, x);
    }
    public static MemoryAddress pSigningCert$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.pSigningCert$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSigningCert$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.pSigningCert$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment HashAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    static final VarHandle pvHashAuxInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvHashAuxInfo"));
    public static VarHandle pvHashAuxInfo$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.pvHashAuxInfo$VH;
    }
    public static MemoryAddress pvHashAuxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.pvHashAuxInfo$VH.get(seg);
    }
    public static void pvHashAuxInfo$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.pvHashAuxInfo$VH.set(seg, x);
    }
    public static MemoryAddress pvHashAuxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.pvHashAuxInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvHashAuxInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.pvHashAuxInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cMsgCert$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cMsgCert"));
    public static VarHandle cMsgCert$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.cMsgCert$VH;
    }
    public static int cMsgCert$get(MemorySegment seg) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.cMsgCert$VH.get(seg);
    }
    public static void cMsgCert$set( MemorySegment seg, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.cMsgCert$VH.set(seg, x);
    }
    public static int cMsgCert$get(MemorySegment seg, long index) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.cMsgCert$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cMsgCert$set(MemorySegment seg, long index, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.cMsgCert$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpMsgCert$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpMsgCert"));
    public static VarHandle rgpMsgCert$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.rgpMsgCert$VH;
    }
    public static MemoryAddress rgpMsgCert$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.rgpMsgCert$VH.get(seg);
    }
    public static void rgpMsgCert$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.rgpMsgCert$VH.set(seg, x);
    }
    public static MemoryAddress rgpMsgCert$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.rgpMsgCert$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpMsgCert$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.rgpMsgCert$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cMsgCrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cMsgCrl"));
    public static VarHandle cMsgCrl$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.cMsgCrl$VH;
    }
    public static int cMsgCrl$get(MemorySegment seg) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.cMsgCrl$VH.get(seg);
    }
    public static void cMsgCrl$set( MemorySegment seg, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.cMsgCrl$VH.set(seg, x);
    }
    public static int cMsgCrl$get(MemorySegment seg, long index) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.cMsgCrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cMsgCrl$set(MemorySegment seg, long index, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.cMsgCrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpMsgCrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpMsgCrl"));
    public static VarHandle rgpMsgCrl$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.rgpMsgCrl$VH;
    }
    public static MemoryAddress rgpMsgCrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.rgpMsgCrl$VH.get(seg);
    }
    public static void rgpMsgCrl$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.rgpMsgCrl$VH.set(seg, x);
    }
    public static MemoryAddress rgpMsgCrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.rgpMsgCrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpMsgCrl$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.rgpMsgCrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAuthAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAuthAttr"));
    public static VarHandle cAuthAttr$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.cAuthAttr$VH;
    }
    public static int cAuthAttr$get(MemorySegment seg) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.cAuthAttr$VH.get(seg);
    }
    public static void cAuthAttr$set( MemorySegment seg, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.cAuthAttr$VH.set(seg, x);
    }
    public static int cAuthAttr$get(MemorySegment seg, long index) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.cAuthAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAuthAttr$set(MemorySegment seg, long index, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.cAuthAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgAuthAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgAuthAttr"));
    public static VarHandle rgAuthAttr$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.rgAuthAttr$VH;
    }
    public static MemoryAddress rgAuthAttr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.rgAuthAttr$VH.get(seg);
    }
    public static void rgAuthAttr$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.rgAuthAttr$VH.set(seg, x);
    }
    public static MemoryAddress rgAuthAttr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.rgAuthAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgAuthAttr$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.rgAuthAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cUnauthAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cUnauthAttr"));
    public static VarHandle cUnauthAttr$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.cUnauthAttr$VH;
    }
    public static int cUnauthAttr$get(MemorySegment seg) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.cUnauthAttr$VH.get(seg);
    }
    public static void cUnauthAttr$set( MemorySegment seg, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.cUnauthAttr$VH.set(seg, x);
    }
    public static int cUnauthAttr$get(MemorySegment seg, long index) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.cUnauthAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cUnauthAttr$set(MemorySegment seg, long index, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.cUnauthAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgUnauthAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgUnauthAttr"));
    public static VarHandle rgUnauthAttr$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.rgUnauthAttr$VH;
    }
    public static MemoryAddress rgUnauthAttr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.rgUnauthAttr$VH.get(seg);
    }
    public static void rgUnauthAttr$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.rgUnauthAttr$VH.set(seg, x);
    }
    public static MemoryAddress rgUnauthAttr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_SIGN_MESSAGE_PARA.rgUnauthAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgUnauthAttr$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_SIGN_MESSAGE_PARA.rgUnauthAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwInnerContentType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwInnerContentType"));
    public static VarHandle dwInnerContentType$VH() {
        return _CRYPT_SIGN_MESSAGE_PARA.dwInnerContentType$VH;
    }
    public static int dwInnerContentType$get(MemorySegment seg) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.dwInnerContentType$VH.get(seg);
    }
    public static void dwInnerContentType$set( MemorySegment seg, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.dwInnerContentType$VH.set(seg, x);
    }
    public static int dwInnerContentType$get(MemorySegment seg, long index) {
        return (int)_CRYPT_SIGN_MESSAGE_PARA.dwInnerContentType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInnerContentType$set(MemorySegment seg, long index, int x) {
        _CRYPT_SIGN_MESSAGE_PARA.dwInnerContentType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

