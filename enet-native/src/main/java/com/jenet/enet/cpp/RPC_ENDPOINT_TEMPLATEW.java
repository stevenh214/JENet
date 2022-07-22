// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RPC_ENDPOINT_TEMPLATEW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ProtSeq"),
        Constants$root.C_POINTER$LAYOUT.withName("Endpoint"),
        Constants$root.C_POINTER$LAYOUT.withName("SecurityDescriptor"),
        Constants$root.C_LONG$LAYOUT.withName("Backlog"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return RPC_ENDPOINT_TEMPLATEW.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return RPC_ENDPOINT_TEMPLATEW.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)RPC_ENDPOINT_TEMPLATEW.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        RPC_ENDPOINT_TEMPLATEW.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)RPC_ENDPOINT_TEMPLATEW.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        RPC_ENDPOINT_TEMPLATEW.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProtSeq$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProtSeq"));
    public static VarHandle ProtSeq$VH() {
        return RPC_ENDPOINT_TEMPLATEW.ProtSeq$VH;
    }
    public static MemoryAddress ProtSeq$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RPC_ENDPOINT_TEMPLATEW.ProtSeq$VH.get(seg);
    }
    public static void ProtSeq$set( MemorySegment seg, MemoryAddress x) {
        RPC_ENDPOINT_TEMPLATEW.ProtSeq$VH.set(seg, x);
    }
    public static MemoryAddress ProtSeq$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RPC_ENDPOINT_TEMPLATEW.ProtSeq$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtSeq$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_ENDPOINT_TEMPLATEW.ProtSeq$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Endpoint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Endpoint"));
    public static VarHandle Endpoint$VH() {
        return RPC_ENDPOINT_TEMPLATEW.Endpoint$VH;
    }
    public static MemoryAddress Endpoint$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RPC_ENDPOINT_TEMPLATEW.Endpoint$VH.get(seg);
    }
    public static void Endpoint$set( MemorySegment seg, MemoryAddress x) {
        RPC_ENDPOINT_TEMPLATEW.Endpoint$VH.set(seg, x);
    }
    public static MemoryAddress Endpoint$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RPC_ENDPOINT_TEMPLATEW.Endpoint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Endpoint$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_ENDPOINT_TEMPLATEW.Endpoint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityDescriptor"));
    public static VarHandle SecurityDescriptor$VH() {
        return RPC_ENDPOINT_TEMPLATEW.SecurityDescriptor$VH;
    }
    public static MemoryAddress SecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RPC_ENDPOINT_TEMPLATEW.SecurityDescriptor$VH.get(seg);
    }
    public static void SecurityDescriptor$set( MemorySegment seg, MemoryAddress x) {
        RPC_ENDPOINT_TEMPLATEW.SecurityDescriptor$VH.set(seg, x);
    }
    public static MemoryAddress SecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RPC_ENDPOINT_TEMPLATEW.SecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityDescriptor$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_ENDPOINT_TEMPLATEW.SecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Backlog$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Backlog"));
    public static VarHandle Backlog$VH() {
        return RPC_ENDPOINT_TEMPLATEW.Backlog$VH;
    }
    public static int Backlog$get(MemorySegment seg) {
        return (int)RPC_ENDPOINT_TEMPLATEW.Backlog$VH.get(seg);
    }
    public static void Backlog$set( MemorySegment seg, int x) {
        RPC_ENDPOINT_TEMPLATEW.Backlog$VH.set(seg, x);
    }
    public static int Backlog$get(MemorySegment seg, long index) {
        return (int)RPC_ENDPOINT_TEMPLATEW.Backlog$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Backlog$set(MemorySegment seg, long index, int x) {
        RPC_ENDPOINT_TEMPLATEW.Backlog$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


