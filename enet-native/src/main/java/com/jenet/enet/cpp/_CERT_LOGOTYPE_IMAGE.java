// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_LOGOTYPE_IMAGE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pwszMimeType"),
            Constants$root.C_LONG$LAYOUT.withName("cHashedUrl"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("rgHashedUrl")
        ).withName("LogotypeDetails"),
        Constants$root.C_POINTER$LAYOUT.withName("pLogotypeImageInfo")
    ).withName("_CERT_LOGOTYPE_IMAGE");
    public static MemoryLayout $LAYOUT() {
        return _CERT_LOGOTYPE_IMAGE.$struct$LAYOUT;
    }
    public static MemorySegment LogotypeDetails$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle pLogotypeImageInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pLogotypeImageInfo"));
    public static VarHandle pLogotypeImageInfo$VH() {
        return _CERT_LOGOTYPE_IMAGE.pLogotypeImageInfo$VH;
    }
    public static MemoryAddress pLogotypeImageInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_IMAGE.pLogotypeImageInfo$VH.get(seg);
    }
    public static void pLogotypeImageInfo$set( MemorySegment seg, MemoryAddress x) {
        _CERT_LOGOTYPE_IMAGE.pLogotypeImageInfo$VH.set(seg, x);
    }
    public static MemoryAddress pLogotypeImageInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_IMAGE.pLogotypeImageInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pLogotypeImageInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_LOGOTYPE_IMAGE.pLogotypeImageInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


