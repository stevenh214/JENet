// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DSSSEED {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("counter"),
        MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("seed")
    ).withName("_DSSSEED");
    public static MemoryLayout $LAYOUT() {
        return _DSSSEED.$struct$LAYOUT;
    }
    static final VarHandle counter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("counter"));
    public static VarHandle counter$VH() {
        return _DSSSEED.counter$VH;
    }
    public static int counter$get(MemorySegment seg) {
        return (int)_DSSSEED.counter$VH.get(seg);
    }
    public static void counter$set( MemorySegment seg, int x) {
        _DSSSEED.counter$VH.set(seg, x);
    }
    public static int counter$get(MemorySegment seg, long index) {
        return (int)_DSSSEED.counter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void counter$set(MemorySegment seg, long index, int x) {
        _DSSSEED.counter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment seed$slice(MemorySegment seg) {
        return seg.asSlice(4, 20);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


