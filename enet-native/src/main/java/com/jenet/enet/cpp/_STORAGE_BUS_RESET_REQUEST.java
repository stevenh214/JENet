// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_BUS_RESET_REQUEST {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("PathId")
    ).withName("_STORAGE_BUS_RESET_REQUEST");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_BUS_RESET_REQUEST.$struct$LAYOUT;
    }
    static final VarHandle PathId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PathId"));
    public static VarHandle PathId$VH() {
        return _STORAGE_BUS_RESET_REQUEST.PathId$VH;
    }
    public static byte PathId$get(MemorySegment seg) {
        return (byte)_STORAGE_BUS_RESET_REQUEST.PathId$VH.get(seg);
    }
    public static void PathId$set( MemorySegment seg, byte x) {
        _STORAGE_BUS_RESET_REQUEST.PathId$VH.set(seg, x);
    }
    public static byte PathId$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_BUS_RESET_REQUEST.PathId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PathId$set(MemorySegment seg, long index, byte x) {
        _STORAGE_BUS_RESET_REQUEST.PathId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

