// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NETCONNECTINFOSTRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbStructure"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwSpeed"),
        Constants$root.C_LONG$LAYOUT.withName("dwDelay"),
        Constants$root.C_LONG$LAYOUT.withName("dwOptDataSize")
    ).withName("_NETCONNECTINFOSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return _NETCONNECTINFOSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle cbStructure$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbStructure"));
    public static VarHandle cbStructure$VH() {
        return _NETCONNECTINFOSTRUCT.cbStructure$VH;
    }
    public static int cbStructure$get(MemorySegment seg) {
        return (int)_NETCONNECTINFOSTRUCT.cbStructure$VH.get(seg);
    }
    public static void cbStructure$set( MemorySegment seg, int x) {
        _NETCONNECTINFOSTRUCT.cbStructure$VH.set(seg, x);
    }
    public static int cbStructure$get(MemorySegment seg, long index) {
        return (int)_NETCONNECTINFOSTRUCT.cbStructure$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStructure$set(MemorySegment seg, long index, int x) {
        _NETCONNECTINFOSTRUCT.cbStructure$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _NETCONNECTINFOSTRUCT.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_NETCONNECTINFOSTRUCT.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _NETCONNECTINFOSTRUCT.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_NETCONNECTINFOSTRUCT.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _NETCONNECTINFOSTRUCT.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSpeed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSpeed"));
    public static VarHandle dwSpeed$VH() {
        return _NETCONNECTINFOSTRUCT.dwSpeed$VH;
    }
    public static int dwSpeed$get(MemorySegment seg) {
        return (int)_NETCONNECTINFOSTRUCT.dwSpeed$VH.get(seg);
    }
    public static void dwSpeed$set( MemorySegment seg, int x) {
        _NETCONNECTINFOSTRUCT.dwSpeed$VH.set(seg, x);
    }
    public static int dwSpeed$get(MemorySegment seg, long index) {
        return (int)_NETCONNECTINFOSTRUCT.dwSpeed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSpeed$set(MemorySegment seg, long index, int x) {
        _NETCONNECTINFOSTRUCT.dwSpeed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDelay$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDelay"));
    public static VarHandle dwDelay$VH() {
        return _NETCONNECTINFOSTRUCT.dwDelay$VH;
    }
    public static int dwDelay$get(MemorySegment seg) {
        return (int)_NETCONNECTINFOSTRUCT.dwDelay$VH.get(seg);
    }
    public static void dwDelay$set( MemorySegment seg, int x) {
        _NETCONNECTINFOSTRUCT.dwDelay$VH.set(seg, x);
    }
    public static int dwDelay$get(MemorySegment seg, long index) {
        return (int)_NETCONNECTINFOSTRUCT.dwDelay$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDelay$set(MemorySegment seg, long index, int x) {
        _NETCONNECTINFOSTRUCT.dwDelay$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOptDataSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOptDataSize"));
    public static VarHandle dwOptDataSize$VH() {
        return _NETCONNECTINFOSTRUCT.dwOptDataSize$VH;
    }
    public static int dwOptDataSize$get(MemorySegment seg) {
        return (int)_NETCONNECTINFOSTRUCT.dwOptDataSize$VH.get(seg);
    }
    public static void dwOptDataSize$set( MemorySegment seg, int x) {
        _NETCONNECTINFOSTRUCT.dwOptDataSize$VH.set(seg, x);
    }
    public static int dwOptDataSize$get(MemorySegment seg, long index) {
        return (int)_NETCONNECTINFOSTRUCT.dwOptDataSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOptDataSize$set(MemorySegment seg, long index, int x) {
        _NETCONNECTINFOSTRUCT.dwOptDataSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


