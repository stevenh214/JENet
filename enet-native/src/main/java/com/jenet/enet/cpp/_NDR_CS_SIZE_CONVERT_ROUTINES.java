// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NDR_CS_SIZE_CONVERT_ROUTINES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pfnNetSize"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnToNetCs"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnLocalSize"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnFromNetCs")
    ).withName("_NDR_CS_SIZE_CONVERT_ROUTINES");
    public static MemoryLayout $LAYOUT() {
        return _NDR_CS_SIZE_CONVERT_ROUTINES.$struct$LAYOUT;
    }
    static final VarHandle pfnNetSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnNetSize"));
    public static VarHandle pfnNetSize$VH() {
        return _NDR_CS_SIZE_CONVERT_ROUTINES.pfnNetSize$VH;
    }
    public static MemoryAddress pfnNetSize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_SIZE_CONVERT_ROUTINES.pfnNetSize$VH.get(seg);
    }
    public static void pfnNetSize$set( MemorySegment seg, MemoryAddress x) {
        _NDR_CS_SIZE_CONVERT_ROUTINES.pfnNetSize$VH.set(seg, x);
    }
    public static MemoryAddress pfnNetSize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_SIZE_CONVERT_ROUTINES.pfnNetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnNetSize$set(MemorySegment seg, long index, MemoryAddress x) {
        _NDR_CS_SIZE_CONVERT_ROUTINES.pfnNetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CS_TYPE_NET_SIZE_ROUTINE pfnNetSize (MemorySegment segment, MemorySession session) {
        return CS_TYPE_NET_SIZE_ROUTINE.ofAddress(pfnNetSize$get(segment), session);
    }
    static final VarHandle pfnToNetCs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnToNetCs"));
    public static VarHandle pfnToNetCs$VH() {
        return _NDR_CS_SIZE_CONVERT_ROUTINES.pfnToNetCs$VH;
    }
    public static MemoryAddress pfnToNetCs$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_SIZE_CONVERT_ROUTINES.pfnToNetCs$VH.get(seg);
    }
    public static void pfnToNetCs$set( MemorySegment seg, MemoryAddress x) {
        _NDR_CS_SIZE_CONVERT_ROUTINES.pfnToNetCs$VH.set(seg, x);
    }
    public static MemoryAddress pfnToNetCs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_SIZE_CONVERT_ROUTINES.pfnToNetCs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnToNetCs$set(MemorySegment seg, long index, MemoryAddress x) {
        _NDR_CS_SIZE_CONVERT_ROUTINES.pfnToNetCs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CS_TYPE_TO_NETCS_ROUTINE pfnToNetCs (MemorySegment segment, MemorySession session) {
        return CS_TYPE_TO_NETCS_ROUTINE.ofAddress(pfnToNetCs$get(segment), session);
    }
    static final VarHandle pfnLocalSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnLocalSize"));
    public static VarHandle pfnLocalSize$VH() {
        return _NDR_CS_SIZE_CONVERT_ROUTINES.pfnLocalSize$VH;
    }
    public static MemoryAddress pfnLocalSize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_SIZE_CONVERT_ROUTINES.pfnLocalSize$VH.get(seg);
    }
    public static void pfnLocalSize$set( MemorySegment seg, MemoryAddress x) {
        _NDR_CS_SIZE_CONVERT_ROUTINES.pfnLocalSize$VH.set(seg, x);
    }
    public static MemoryAddress pfnLocalSize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_SIZE_CONVERT_ROUTINES.pfnLocalSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnLocalSize$set(MemorySegment seg, long index, MemoryAddress x) {
        _NDR_CS_SIZE_CONVERT_ROUTINES.pfnLocalSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CS_TYPE_LOCAL_SIZE_ROUTINE pfnLocalSize (MemorySegment segment, MemorySession session) {
        return CS_TYPE_LOCAL_SIZE_ROUTINE.ofAddress(pfnLocalSize$get(segment), session);
    }
    static final VarHandle pfnFromNetCs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnFromNetCs"));
    public static VarHandle pfnFromNetCs$VH() {
        return _NDR_CS_SIZE_CONVERT_ROUTINES.pfnFromNetCs$VH;
    }
    public static MemoryAddress pfnFromNetCs$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_SIZE_CONVERT_ROUTINES.pfnFromNetCs$VH.get(seg);
    }
    public static void pfnFromNetCs$set( MemorySegment seg, MemoryAddress x) {
        _NDR_CS_SIZE_CONVERT_ROUTINES.pfnFromNetCs$VH.set(seg, x);
    }
    public static MemoryAddress pfnFromNetCs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_SIZE_CONVERT_ROUTINES.pfnFromNetCs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFromNetCs$set(MemorySegment seg, long index, MemoryAddress x) {
        _NDR_CS_SIZE_CONVERT_ROUTINES.pfnFromNetCs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CS_TYPE_FROM_NETCS_ROUTINE pfnFromNetCs (MemorySegment segment, MemorySession session) {
        return CS_TYPE_FROM_NETCS_ROUTINE.ofAddress(pfnFromNetCs$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


