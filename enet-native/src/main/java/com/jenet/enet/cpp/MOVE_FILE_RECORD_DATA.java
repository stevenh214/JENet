// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class MOVE_FILE_RECORD_DATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("FileHandle"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("SourceFileRecord"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("TargetFileRecord")
    );
    public static MemoryLayout $LAYOUT() {
        return MOVE_FILE_RECORD_DATA.$struct$LAYOUT;
    }
    static final VarHandle FileHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileHandle"));
    public static VarHandle FileHandle$VH() {
        return MOVE_FILE_RECORD_DATA.FileHandle$VH;
    }
    public static MemoryAddress FileHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)MOVE_FILE_RECORD_DATA.FileHandle$VH.get(seg);
    }
    public static void FileHandle$set( MemorySegment seg, MemoryAddress x) {
        MOVE_FILE_RECORD_DATA.FileHandle$VH.set(seg, x);
    }
    public static MemoryAddress FileHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)MOVE_FILE_RECORD_DATA.FileHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileHandle$set(MemorySegment seg, long index, MemoryAddress x) {
        MOVE_FILE_RECORD_DATA.FileHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SourceFileRecord$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment TargetFileRecord$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


