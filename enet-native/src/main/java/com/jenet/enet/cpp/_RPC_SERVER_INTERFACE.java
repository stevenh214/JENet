// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RPC_SERVER_INTERFACE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Length"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("SyntaxGUID"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
                Constants$root.C_SHORT$LAYOUT.withName("MinorVersion")
            ).withName("SyntaxVersion")
        ).withName("InterfaceId"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("SyntaxGUID"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
                Constants$root.C_SHORT$LAYOUT.withName("MinorVersion")
            ).withName("SyntaxVersion")
        ).withName("TransferSyntax"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("DispatchTable"),
        Constants$root.C_LONG$LAYOUT.withName("RpcProtseqEndpointCount"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("RpcProtseqEndpoint"),
        Constants$root.C_POINTER$LAYOUT.withName("DefaultManagerEpv"),
        Constants$root.C_POINTER$LAYOUT.withName("InterpreterInfo"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_RPC_SERVER_INTERFACE");
    public static MemoryLayout $LAYOUT() {
        return _RPC_SERVER_INTERFACE.$struct$LAYOUT;
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _RPC_SERVER_INTERFACE.Length$VH;
    }
    public static int Length$get(MemorySegment seg) {
        return (int)_RPC_SERVER_INTERFACE.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, int x) {
        _RPC_SERVER_INTERFACE.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_RPC_SERVER_INTERFACE.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _RPC_SERVER_INTERFACE.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment InterfaceId$slice(MemorySegment seg) {
        return seg.asSlice(4, 20);
    }
    public static MemorySegment TransferSyntax$slice(MemorySegment seg) {
        return seg.asSlice(24, 20);
    }
    static final VarHandle DispatchTable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DispatchTable"));
    public static VarHandle DispatchTable$VH() {
        return _RPC_SERVER_INTERFACE.DispatchTable$VH;
    }
    public static MemoryAddress DispatchTable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_SERVER_INTERFACE.DispatchTable$VH.get(seg);
    }
    public static void DispatchTable$set( MemorySegment seg, MemoryAddress x) {
        _RPC_SERVER_INTERFACE.DispatchTable$VH.set(seg, x);
    }
    public static MemoryAddress DispatchTable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_SERVER_INTERFACE.DispatchTable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DispatchTable$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_SERVER_INTERFACE.DispatchTable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RpcProtseqEndpointCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RpcProtseqEndpointCount"));
    public static VarHandle RpcProtseqEndpointCount$VH() {
        return _RPC_SERVER_INTERFACE.RpcProtseqEndpointCount$VH;
    }
    public static int RpcProtseqEndpointCount$get(MemorySegment seg) {
        return (int)_RPC_SERVER_INTERFACE.RpcProtseqEndpointCount$VH.get(seg);
    }
    public static void RpcProtseqEndpointCount$set( MemorySegment seg, int x) {
        _RPC_SERVER_INTERFACE.RpcProtseqEndpointCount$VH.set(seg, x);
    }
    public static int RpcProtseqEndpointCount$get(MemorySegment seg, long index) {
        return (int)_RPC_SERVER_INTERFACE.RpcProtseqEndpointCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RpcProtseqEndpointCount$set(MemorySegment seg, long index, int x) {
        _RPC_SERVER_INTERFACE.RpcProtseqEndpointCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RpcProtseqEndpoint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RpcProtseqEndpoint"));
    public static VarHandle RpcProtseqEndpoint$VH() {
        return _RPC_SERVER_INTERFACE.RpcProtseqEndpoint$VH;
    }
    public static MemoryAddress RpcProtseqEndpoint$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_SERVER_INTERFACE.RpcProtseqEndpoint$VH.get(seg);
    }
    public static void RpcProtseqEndpoint$set( MemorySegment seg, MemoryAddress x) {
        _RPC_SERVER_INTERFACE.RpcProtseqEndpoint$VH.set(seg, x);
    }
    public static MemoryAddress RpcProtseqEndpoint$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_SERVER_INTERFACE.RpcProtseqEndpoint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RpcProtseqEndpoint$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_SERVER_INTERFACE.RpcProtseqEndpoint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefaultManagerEpv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DefaultManagerEpv"));
    public static VarHandle DefaultManagerEpv$VH() {
        return _RPC_SERVER_INTERFACE.DefaultManagerEpv$VH;
    }
    public static MemoryAddress DefaultManagerEpv$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_SERVER_INTERFACE.DefaultManagerEpv$VH.get(seg);
    }
    public static void DefaultManagerEpv$set( MemorySegment seg, MemoryAddress x) {
        _RPC_SERVER_INTERFACE.DefaultManagerEpv$VH.set(seg, x);
    }
    public static MemoryAddress DefaultManagerEpv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_SERVER_INTERFACE.DefaultManagerEpv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultManagerEpv$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_SERVER_INTERFACE.DefaultManagerEpv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle InterpreterInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InterpreterInfo"));
    public static VarHandle InterpreterInfo$VH() {
        return _RPC_SERVER_INTERFACE.InterpreterInfo$VH;
    }
    public static MemoryAddress InterpreterInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_SERVER_INTERFACE.InterpreterInfo$VH.get(seg);
    }
    public static void InterpreterInfo$set( MemorySegment seg, MemoryAddress x) {
        _RPC_SERVER_INTERFACE.InterpreterInfo$VH.set(seg, x);
    }
    public static MemoryAddress InterpreterInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_SERVER_INTERFACE.InterpreterInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InterpreterInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_SERVER_INTERFACE.InterpreterInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _RPC_SERVER_INTERFACE.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_RPC_SERVER_INTERFACE.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _RPC_SERVER_INTERFACE.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_RPC_SERVER_INTERFACE.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _RPC_SERVER_INTERFACE.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


