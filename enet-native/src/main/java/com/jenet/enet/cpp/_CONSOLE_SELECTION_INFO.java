// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CONSOLE_SELECTION_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("dwSelectionAnchor"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("Left"),
            Constants$root.C_SHORT$LAYOUT.withName("Top"),
            Constants$root.C_SHORT$LAYOUT.withName("Right"),
            Constants$root.C_SHORT$LAYOUT.withName("Bottom")
        ).withName("srSelection")
    ).withName("_CONSOLE_SELECTION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CONSOLE_SELECTION_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CONSOLE_SELECTION_INFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CONSOLE_SELECTION_INFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _CONSOLE_SELECTION_INFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_SELECTION_INFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CONSOLE_SELECTION_INFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dwSelectionAnchor$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static MemorySegment srSelection$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


