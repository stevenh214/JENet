// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _EFS_COMPATIBILITY_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("EfsVersion")
    ).withName("_EFS_COMPATIBILITY_INFO");
    public static MemoryLayout $LAYOUT() {
        return _EFS_COMPATIBILITY_INFO.$struct$LAYOUT;
    }
    static final VarHandle EfsVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EfsVersion"));
    public static VarHandle EfsVersion$VH() {
        return _EFS_COMPATIBILITY_INFO.EfsVersion$VH;
    }
    public static int EfsVersion$get(MemorySegment seg) {
        return (int)_EFS_COMPATIBILITY_INFO.EfsVersion$VH.get(seg);
    }
    public static void EfsVersion$set( MemorySegment seg, int x) {
        _EFS_COMPATIBILITY_INFO.EfsVersion$VH.set(seg, x);
    }
    public static int EfsVersion$get(MemorySegment seg, long index) {
        return (int)_EFS_COMPATIBILITY_INFO.EfsVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EfsVersion$set(MemorySegment seg, long index, int x) {
        _EFS_COMPATIBILITY_INFO.EfsVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


