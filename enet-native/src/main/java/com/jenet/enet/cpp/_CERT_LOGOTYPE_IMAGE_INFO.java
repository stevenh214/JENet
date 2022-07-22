// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_LOGOTYPE_IMAGE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwLogotypeImageInfoChoice"),
        Constants$root.C_LONG$LAYOUT.withName("dwFileSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwXSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwYSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwLogotypeImageResolutionChoice"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwNumBits"),
            Constants$root.C_LONG$LAYOUT.withName("dwTableSize")
        ).withName("$anon$0"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszLanguage")
    ).withName("_CERT_LOGOTYPE_IMAGE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_LOGOTYPE_IMAGE_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwLogotypeImageInfoChoice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLogotypeImageInfoChoice"));
    public static VarHandle dwLogotypeImageInfoChoice$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageInfoChoice$VH;
    }
    public static int dwLogotypeImageInfoChoice$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageInfoChoice$VH.get(seg);
    }
    public static void dwLogotypeImageInfoChoice$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageInfoChoice$VH.set(seg, x);
    }
    public static int dwLogotypeImageInfoChoice$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageInfoChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLogotypeImageInfoChoice$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageInfoChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFileSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileSize"));
    public static VarHandle dwFileSize$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwFileSize$VH;
    }
    public static int dwFileSize$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwFileSize$VH.get(seg);
    }
    public static void dwFileSize$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwFileSize$VH.set(seg, x);
    }
    public static int dwFileSize$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwFileSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileSize$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwFileSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwXSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwXSize"));
    public static VarHandle dwXSize$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwXSize$VH;
    }
    public static int dwXSize$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwXSize$VH.get(seg);
    }
    public static void dwXSize$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwXSize$VH.set(seg, x);
    }
    public static int dwXSize$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwXSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwXSize$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwXSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwYSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwYSize"));
    public static VarHandle dwYSize$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwYSize$VH;
    }
    public static int dwYSize$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwYSize$VH.get(seg);
    }
    public static void dwYSize$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwYSize$VH.set(seg, x);
    }
    public static int dwYSize$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwYSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwYSize$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwYSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwLogotypeImageResolutionChoice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLogotypeImageResolutionChoice"));
    public static VarHandle dwLogotypeImageResolutionChoice$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageResolutionChoice$VH;
    }
    public static int dwLogotypeImageResolutionChoice$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageResolutionChoice$VH.get(seg);
    }
    public static void dwLogotypeImageResolutionChoice$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageResolutionChoice$VH.set(seg, x);
    }
    public static int dwLogotypeImageResolutionChoice$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageResolutionChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLogotypeImageResolutionChoice$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageResolutionChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dwNumBits"));
    public static VarHandle dwNumBits$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwNumBits$VH;
    }
    public static int dwNumBits$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwNumBits$VH.get(seg);
    }
    public static void dwNumBits$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwNumBits$VH.set(seg, x);
    }
    public static int dwNumBits$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwNumBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumBits$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwNumBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTableSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dwTableSize"));
    public static VarHandle dwTableSize$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwTableSize$VH;
    }
    public static int dwTableSize$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwTableSize$VH.get(seg);
    }
    public static void dwTableSize$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwTableSize$VH.set(seg, x);
    }
    public static int dwTableSize$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwTableSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTableSize$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwTableSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszLanguage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszLanguage"));
    public static VarHandle pwszLanguage$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.pwszLanguage$VH;
    }
    public static MemoryAddress pwszLanguage$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_IMAGE_INFO.pwszLanguage$VH.get(seg);
    }
    public static void pwszLanguage$set( MemorySegment seg, MemoryAddress x) {
        _CERT_LOGOTYPE_IMAGE_INFO.pwszLanguage$VH.set(seg, x);
    }
    public static MemoryAddress pwszLanguage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_IMAGE_INFO.pwszLanguage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszLanguage$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_LOGOTYPE_IMAGE_INFO.pwszLanguage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


