// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_DISPOSITION_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("DeleteFileA")
    ).withName("_FILE_DISPOSITION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_DISPOSITION_INFO.$struct$LAYOUT;
    }
    static final VarHandle DeleteFileA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeleteFileA"));
    public static VarHandle DeleteFileA$VH() {
        return _FILE_DISPOSITION_INFO.DeleteFileA$VH;
    }
    public static byte DeleteFileA$get(MemorySegment seg) {
        return (byte)_FILE_DISPOSITION_INFO.DeleteFileA$VH.get(seg);
    }
    public static void DeleteFileA$set( MemorySegment seg, byte x) {
        _FILE_DISPOSITION_INFO.DeleteFileA$VH.set(seg, x);
    }
    public static byte DeleteFileA$get(MemorySegment seg, long index) {
        return (byte)_FILE_DISPOSITION_INFO.DeleteFileA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeleteFileA$set(MemorySegment seg, long index, byte x) {
        _FILE_DISPOSITION_INFO.DeleteFileA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


