// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GP_LOG_PAGE_DESCRIPTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("LogAddress"),
        Constants$root.C_SHORT$LAYOUT.withName("LogSectors")
    ).withName("_GP_LOG_PAGE_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _GP_LOG_PAGE_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle LogAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogAddress"));
    public static VarHandle LogAddress$VH() {
        return _GP_LOG_PAGE_DESCRIPTOR.LogAddress$VH;
    }
    public static short LogAddress$get(MemorySegment seg) {
        return (short)_GP_LOG_PAGE_DESCRIPTOR.LogAddress$VH.get(seg);
    }
    public static void LogAddress$set( MemorySegment seg, short x) {
        _GP_LOG_PAGE_DESCRIPTOR.LogAddress$VH.set(seg, x);
    }
    public static short LogAddress$get(MemorySegment seg, long index) {
        return (short)_GP_LOG_PAGE_DESCRIPTOR.LogAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogAddress$set(MemorySegment seg, long index, short x) {
        _GP_LOG_PAGE_DESCRIPTOR.LogAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogSectors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogSectors"));
    public static VarHandle LogSectors$VH() {
        return _GP_LOG_PAGE_DESCRIPTOR.LogSectors$VH;
    }
    public static short LogSectors$get(MemorySegment seg) {
        return (short)_GP_LOG_PAGE_DESCRIPTOR.LogSectors$VH.get(seg);
    }
    public static void LogSectors$set( MemorySegment seg, short x) {
        _GP_LOG_PAGE_DESCRIPTOR.LogSectors$VH.set(seg, x);
    }
    public static short LogSectors$get(MemorySegment seg, long index) {
        return (short)_GP_LOG_PAGE_DESCRIPTOR.LogSectors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogSectors$set(MemorySegment seg, long index, short x) {
        _GP_LOG_PAGE_DESCRIPTOR.LogSectors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


