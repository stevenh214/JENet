// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SCOPE_TABLE_ARM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("BeginAddress"),
            Constants$root.C_LONG$LAYOUT.withName("EndAddress"),
            Constants$root.C_LONG$LAYOUT.withName("HandlerAddress"),
            Constants$root.C_LONG$LAYOUT.withName("JumpTarget")
        )).withName("ScopeRecord")
    ).withName("_SCOPE_TABLE_ARM");
    public static MemoryLayout $LAYOUT() {
        return _SCOPE_TABLE_ARM.$struct$LAYOUT;
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return _SCOPE_TABLE_ARM.Count$VH;
    }
    public static int Count$get(MemorySegment seg) {
        return (int)_SCOPE_TABLE_ARM.Count$VH.get(seg);
    }
    public static void Count$set( MemorySegment seg, int x) {
        _SCOPE_TABLE_ARM.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)_SCOPE_TABLE_ARM.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        _SCOPE_TABLE_ARM.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ScopeRecord$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


