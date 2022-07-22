// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CHANGER_MOVE_MEDIUM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("ElementType"),
            Constants$root.C_LONG$LAYOUT.withName("ElementAddress")
        ).withName("Transport"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("ElementType"),
            Constants$root.C_LONG$LAYOUT.withName("ElementAddress")
        ).withName("Source"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("ElementType"),
            Constants$root.C_LONG$LAYOUT.withName("ElementAddress")
        ).withName("Destination"),
        Constants$root.C_CHAR$LAYOUT.withName("Flip"),
        MemoryLayout.paddingLayout(24)
    ).withName("_CHANGER_MOVE_MEDIUM");
    public static MemoryLayout $LAYOUT() {
        return _CHANGER_MOVE_MEDIUM.$struct$LAYOUT;
    }
    public static MemorySegment Transport$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment Source$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment Destination$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    static final VarHandle Flip$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flip"));
    public static VarHandle Flip$VH() {
        return _CHANGER_MOVE_MEDIUM.Flip$VH;
    }
    public static byte Flip$get(MemorySegment seg) {
        return (byte)_CHANGER_MOVE_MEDIUM.Flip$VH.get(seg);
    }
    public static void Flip$set( MemorySegment seg, byte x) {
        _CHANGER_MOVE_MEDIUM.Flip$VH.set(seg, x);
    }
    public static byte Flip$get(MemorySegment seg, long index) {
        return (byte)_CHANGER_MOVE_MEDIUM.Flip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flip$set(MemorySegment seg, long index, byte x) {
        _CHANGER_MOVE_MEDIUM.Flip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


