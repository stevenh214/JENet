// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class midiproptimediv_tag {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbStruct"),
        Constants$root.C_LONG$LAYOUT.withName("dwTimeDiv")
    ).withName("midiproptimediv_tag");
    public static MemoryLayout $LAYOUT() {
        return midiproptimediv_tag.$struct$LAYOUT;
    }
    static final VarHandle cbStruct$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbStruct"));
    public static VarHandle cbStruct$VH() {
        return midiproptimediv_tag.cbStruct$VH;
    }
    public static int cbStruct$get(MemorySegment seg) {
        return (int)midiproptimediv_tag.cbStruct$VH.get(seg);
    }
    public static void cbStruct$set( MemorySegment seg, int x) {
        midiproptimediv_tag.cbStruct$VH.set(seg, x);
    }
    public static int cbStruct$get(MemorySegment seg, long index) {
        return (int)midiproptimediv_tag.cbStruct$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStruct$set(MemorySegment seg, long index, int x) {
        midiproptimediv_tag.cbStruct$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTimeDiv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTimeDiv"));
    public static VarHandle dwTimeDiv$VH() {
        return midiproptimediv_tag.dwTimeDiv$VH;
    }
    public static int dwTimeDiv$get(MemorySegment seg) {
        return (int)midiproptimediv_tag.dwTimeDiv$VH.get(seg);
    }
    public static void dwTimeDiv$set( MemorySegment seg, int x) {
        midiproptimediv_tag.dwTimeDiv$VH.set(seg, x);
    }
    public static int dwTimeDiv$get(MemorySegment seg, long index) {
        return (int)midiproptimediv_tag.dwTimeDiv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTimeDiv$set(MemorySegment seg, long index, int x) {
        midiproptimediv_tag.dwTimeDiv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


