// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_RC2_AUX_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwBitLen")
    ).withName("_CMSG_RC2_AUX_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_RC2_AUX_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_RC2_AUX_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_RC2_AUX_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_RC2_AUX_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_RC2_AUX_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_RC2_AUX_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBitLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwBitLen"));
    public static VarHandle dwBitLen$VH() {
        return _CMSG_RC2_AUX_INFO.dwBitLen$VH;
    }
    public static int dwBitLen$get(MemorySegment seg) {
        return (int)_CMSG_RC2_AUX_INFO.dwBitLen$VH.get(seg);
    }
    public static void dwBitLen$set( MemorySegment seg, int x) {
        _CMSG_RC2_AUX_INFO.dwBitLen$VH.set(seg, x);
    }
    public static int dwBitLen$get(MemorySegment seg, long index) {
        return (int)_CMSG_RC2_AUX_INFO.dwBitLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBitLen$set(MemorySegment seg, long index, int x) {
        _CMSG_RC2_AUX_INFO.dwBitLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


