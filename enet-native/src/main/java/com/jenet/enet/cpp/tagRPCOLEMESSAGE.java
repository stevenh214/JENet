// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRPCOLEMESSAGE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("reserved1"),
        Constants$root.C_LONG$LAYOUT.withName("dataRepresentation"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("Buffer"),
        Constants$root.C_LONG$LAYOUT.withName("cbBuffer"),
        Constants$root.C_LONG$LAYOUT.withName("iMethod"),
        MemoryLayout.sequenceLayout(5, Constants$root.C_POINTER$LAYOUT).withName("reserved2"),
        Constants$root.C_LONG$LAYOUT.withName("rpcFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagRPCOLEMESSAGE");
    public static MemoryLayout $LAYOUT() {
        return tagRPCOLEMESSAGE.$struct$LAYOUT;
    }
    static final VarHandle reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved1"));
    public static VarHandle reserved1$VH() {
        return tagRPCOLEMESSAGE.reserved1$VH;
    }
    public static MemoryAddress reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRPCOLEMESSAGE.reserved1$VH.get(seg);
    }
    public static void reserved1$set( MemorySegment seg, MemoryAddress x) {
        tagRPCOLEMESSAGE.reserved1$VH.set(seg, x);
    }
    public static MemoryAddress reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRPCOLEMESSAGE.reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPCOLEMESSAGE.reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dataRepresentation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dataRepresentation"));
    public static VarHandle dataRepresentation$VH() {
        return tagRPCOLEMESSAGE.dataRepresentation$VH;
    }
    public static int dataRepresentation$get(MemorySegment seg) {
        return (int)tagRPCOLEMESSAGE.dataRepresentation$VH.get(seg);
    }
    public static void dataRepresentation$set( MemorySegment seg, int x) {
        tagRPCOLEMESSAGE.dataRepresentation$VH.set(seg, x);
    }
    public static int dataRepresentation$get(MemorySegment seg, long index) {
        return (int)tagRPCOLEMESSAGE.dataRepresentation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dataRepresentation$set(MemorySegment seg, long index, int x) {
        tagRPCOLEMESSAGE.dataRepresentation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Buffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Buffer"));
    public static VarHandle Buffer$VH() {
        return tagRPCOLEMESSAGE.Buffer$VH;
    }
    public static MemoryAddress Buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRPCOLEMESSAGE.Buffer$VH.get(seg);
    }
    public static void Buffer$set( MemorySegment seg, MemoryAddress x) {
        tagRPCOLEMESSAGE.Buffer$VH.set(seg, x);
    }
    public static MemoryAddress Buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRPCOLEMESSAGE.Buffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Buffer$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPCOLEMESSAGE.Buffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBuffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBuffer"));
    public static VarHandle cbBuffer$VH() {
        return tagRPCOLEMESSAGE.cbBuffer$VH;
    }
    public static int cbBuffer$get(MemorySegment seg) {
        return (int)tagRPCOLEMESSAGE.cbBuffer$VH.get(seg);
    }
    public static void cbBuffer$set( MemorySegment seg, int x) {
        tagRPCOLEMESSAGE.cbBuffer$VH.set(seg, x);
    }
    public static int cbBuffer$get(MemorySegment seg, long index) {
        return (int)tagRPCOLEMESSAGE.cbBuffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBuffer$set(MemorySegment seg, long index, int x) {
        tagRPCOLEMESSAGE.cbBuffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iMethod$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iMethod"));
    public static VarHandle iMethod$VH() {
        return tagRPCOLEMESSAGE.iMethod$VH;
    }
    public static int iMethod$get(MemorySegment seg) {
        return (int)tagRPCOLEMESSAGE.iMethod$VH.get(seg);
    }
    public static void iMethod$set( MemorySegment seg, int x) {
        tagRPCOLEMESSAGE.iMethod$VH.set(seg, x);
    }
    public static int iMethod$get(MemorySegment seg, long index) {
        return (int)tagRPCOLEMESSAGE.iMethod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMethod$set(MemorySegment seg, long index, int x) {
        tagRPCOLEMESSAGE.iMethod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment reserved2$slice(MemorySegment seg) {
        return seg.asSlice(32, 40);
    }
    static final VarHandle rpcFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rpcFlags"));
    public static VarHandle rpcFlags$VH() {
        return tagRPCOLEMESSAGE.rpcFlags$VH;
    }
    public static int rpcFlags$get(MemorySegment seg) {
        return (int)tagRPCOLEMESSAGE.rpcFlags$VH.get(seg);
    }
    public static void rpcFlags$set( MemorySegment seg, int x) {
        tagRPCOLEMESSAGE.rpcFlags$VH.set(seg, x);
    }
    public static int rpcFlags$get(MemorySegment seg, long index) {
        return (int)tagRPCOLEMESSAGE.rpcFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rpcFlags$set(MemorySegment seg, long index, int x) {
        tagRPCOLEMESSAGE.rpcFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


