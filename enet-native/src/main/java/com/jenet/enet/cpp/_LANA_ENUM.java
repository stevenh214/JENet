// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _LANA_ENUM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("length"),
        MemoryLayout.sequenceLayout(255, Constants$root.C_CHAR$LAYOUT).withName("lana")
    ).withName("_LANA_ENUM");
    public static MemoryLayout $LAYOUT() {
        return _LANA_ENUM.$struct$LAYOUT;
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return _LANA_ENUM.length$VH;
    }
    public static byte length$get(MemorySegment seg) {
        return (byte)_LANA_ENUM.length$VH.get(seg);
    }
    public static void length$set( MemorySegment seg, byte x) {
        _LANA_ENUM.length$VH.set(seg, x);
    }
    public static byte length$get(MemorySegment seg, long index) {
        return (byte)_LANA_ENUM.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, byte x) {
        _LANA_ENUM.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lana$slice(MemorySegment seg) {
        return seg.asSlice(1, 255);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


