// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_ALIGNMENT_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("AlignmentRequirement")
    ).withName("_FILE_ALIGNMENT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_ALIGNMENT_INFO.$struct$LAYOUT;
    }
    static final VarHandle AlignmentRequirement$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AlignmentRequirement"));
    public static VarHandle AlignmentRequirement$VH() {
        return _FILE_ALIGNMENT_INFO.AlignmentRequirement$VH;
    }
    public static int AlignmentRequirement$get(MemorySegment seg) {
        return (int)_FILE_ALIGNMENT_INFO.AlignmentRequirement$VH.get(seg);
    }
    public static void AlignmentRequirement$set( MemorySegment seg, int x) {
        _FILE_ALIGNMENT_INFO.AlignmentRequirement$VH.set(seg, x);
    }
    public static int AlignmentRequirement$get(MemorySegment seg, long index) {
        return (int)_FILE_ALIGNMENT_INFO.AlignmentRequirement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AlignmentRequirement$set(MemorySegment seg, long index, int x) {
        _FILE_ALIGNMENT_INFO.AlignmentRequirement$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


