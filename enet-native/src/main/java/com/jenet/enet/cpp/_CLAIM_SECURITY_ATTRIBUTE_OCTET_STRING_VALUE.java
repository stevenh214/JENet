// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pValue"),
        Constants$root.C_LONG$LAYOUT.withName("ValueLength"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE");
    public static MemoryLayout $LAYOUT() {
        return _CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE.$struct$LAYOUT;
    }
    static final VarHandle pValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pValue"));
    public static VarHandle pValue$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE.pValue$VH;
    }
    public static MemoryAddress pValue$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE.pValue$VH.get(seg);
    }
    public static void pValue$set( MemorySegment seg, MemoryAddress x) {
        _CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE.pValue$VH.set(seg, x);
    }
    public static MemoryAddress pValue$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE.pValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pValue$set(MemorySegment seg, long index, MemoryAddress x) {
        _CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE.pValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ValueLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ValueLength"));
    public static VarHandle ValueLength$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE.ValueLength$VH;
    }
    public static int ValueLength$get(MemorySegment seg) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE.ValueLength$VH.get(seg);
    }
    public static void ValueLength$set( MemorySegment seg, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE.ValueLength$VH.set(seg, x);
    }
    public static int ValueLength$get(MemorySegment seg, long index) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE.ValueLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ValueLength$set(MemorySegment seg, long index, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE.ValueLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

