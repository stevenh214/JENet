// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class HBITMAP__ {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("unused")
    ).withName("HBITMAP__");
    public static MemoryLayout $LAYOUT() {
        return HBITMAP__.$struct$LAYOUT;
    }
    static final VarHandle unused$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unused"));
    public static VarHandle unused$VH() {
        return HBITMAP__.unused$VH;
    }
    public static int unused$get(MemorySegment seg) {
        return (int)HBITMAP__.unused$VH.get(seg);
    }
    public static void unused$set( MemorySegment seg, int x) {
        HBITMAP__.unused$VH.set(seg, x);
    }
    public static int unused$get(MemorySegment seg, long index) {
        return (int)HBITMAP__.unused$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unused$set(MemorySegment seg, long index, int x) {
        HBITMAP__.unused$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


