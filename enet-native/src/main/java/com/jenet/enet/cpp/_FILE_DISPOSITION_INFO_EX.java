// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_DISPOSITION_INFO_EX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Flags")
    ).withName("_FILE_DISPOSITION_INFO_EX");
    public static MemoryLayout $LAYOUT() {
        return _FILE_DISPOSITION_INFO_EX.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _FILE_DISPOSITION_INFO_EX.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_FILE_DISPOSITION_INFO_EX.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _FILE_DISPOSITION_INFO_EX.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_FILE_DISPOSITION_INFO_EX.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _FILE_DISPOSITION_INFO_EX.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

