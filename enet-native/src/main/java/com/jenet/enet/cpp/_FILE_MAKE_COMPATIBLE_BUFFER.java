// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_MAKE_COMPATIBLE_BUFFER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("CloseDisc")
    ).withName("_FILE_MAKE_COMPATIBLE_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return _FILE_MAKE_COMPATIBLE_BUFFER.$struct$LAYOUT;
    }
    static final VarHandle CloseDisc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CloseDisc"));
    public static VarHandle CloseDisc$VH() {
        return _FILE_MAKE_COMPATIBLE_BUFFER.CloseDisc$VH;
    }
    public static byte CloseDisc$get(MemorySegment seg) {
        return (byte)_FILE_MAKE_COMPATIBLE_BUFFER.CloseDisc$VH.get(seg);
    }
    public static void CloseDisc$set( MemorySegment seg, byte x) {
        _FILE_MAKE_COMPATIBLE_BUFFER.CloseDisc$VH.set(seg, x);
    }
    public static byte CloseDisc$get(MemorySegment seg, long index) {
        return (byte)_FILE_MAKE_COMPATIBLE_BUFFER.CloseDisc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CloseDisc$set(MemorySegment seg, long index, byte x) {
        _FILE_MAKE_COMPATIBLE_BUFFER.CloseDisc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


