// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _UNWIND_HISTORY_TABLE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        Constants$root.C_CHAR$LAYOUT.withName("LocalHint"),
        Constants$root.C_CHAR$LAYOUT.withName("GlobalHint"),
        Constants$root.C_CHAR$LAYOUT.withName("Search"),
        Constants$root.C_CHAR$LAYOUT.withName("Once"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LowAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("HighAddress"),
        MemoryLayout.sequenceLayout(12, MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("ImageBase"),
            Constants$root.C_POINTER$LAYOUT.withName("FunctionEntry")
        ).withName("_UNWIND_HISTORY_TABLE_ENTRY")).withName("Entry")
    ).withName("_UNWIND_HISTORY_TABLE");
    public static MemoryLayout $LAYOUT() {
        return _UNWIND_HISTORY_TABLE.$struct$LAYOUT;
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return _UNWIND_HISTORY_TABLE.Count$VH;
    }
    public static int Count$get(MemorySegment seg) {
        return (int)_UNWIND_HISTORY_TABLE.Count$VH.get(seg);
    }
    public static void Count$set( MemorySegment seg, int x) {
        _UNWIND_HISTORY_TABLE.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)_UNWIND_HISTORY_TABLE.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        _UNWIND_HISTORY_TABLE.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LocalHint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LocalHint"));
    public static VarHandle LocalHint$VH() {
        return _UNWIND_HISTORY_TABLE.LocalHint$VH;
    }
    public static byte LocalHint$get(MemorySegment seg) {
        return (byte)_UNWIND_HISTORY_TABLE.LocalHint$VH.get(seg);
    }
    public static void LocalHint$set( MemorySegment seg, byte x) {
        _UNWIND_HISTORY_TABLE.LocalHint$VH.set(seg, x);
    }
    public static byte LocalHint$get(MemorySegment seg, long index) {
        return (byte)_UNWIND_HISTORY_TABLE.LocalHint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LocalHint$set(MemorySegment seg, long index, byte x) {
        _UNWIND_HISTORY_TABLE.LocalHint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle GlobalHint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GlobalHint"));
    public static VarHandle GlobalHint$VH() {
        return _UNWIND_HISTORY_TABLE.GlobalHint$VH;
    }
    public static byte GlobalHint$get(MemorySegment seg) {
        return (byte)_UNWIND_HISTORY_TABLE.GlobalHint$VH.get(seg);
    }
    public static void GlobalHint$set( MemorySegment seg, byte x) {
        _UNWIND_HISTORY_TABLE.GlobalHint$VH.set(seg, x);
    }
    public static byte GlobalHint$get(MemorySegment seg, long index) {
        return (byte)_UNWIND_HISTORY_TABLE.GlobalHint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GlobalHint$set(MemorySegment seg, long index, byte x) {
        _UNWIND_HISTORY_TABLE.GlobalHint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Search$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Search"));
    public static VarHandle Search$VH() {
        return _UNWIND_HISTORY_TABLE.Search$VH;
    }
    public static byte Search$get(MemorySegment seg) {
        return (byte)_UNWIND_HISTORY_TABLE.Search$VH.get(seg);
    }
    public static void Search$set( MemorySegment seg, byte x) {
        _UNWIND_HISTORY_TABLE.Search$VH.set(seg, x);
    }
    public static byte Search$get(MemorySegment seg, long index) {
        return (byte)_UNWIND_HISTORY_TABLE.Search$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Search$set(MemorySegment seg, long index, byte x) {
        _UNWIND_HISTORY_TABLE.Search$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Once$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Once"));
    public static VarHandle Once$VH() {
        return _UNWIND_HISTORY_TABLE.Once$VH;
    }
    public static byte Once$get(MemorySegment seg) {
        return (byte)_UNWIND_HISTORY_TABLE.Once$VH.get(seg);
    }
    public static void Once$set( MemorySegment seg, byte x) {
        _UNWIND_HISTORY_TABLE.Once$VH.set(seg, x);
    }
    public static byte Once$get(MemorySegment seg, long index) {
        return (byte)_UNWIND_HISTORY_TABLE.Once$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Once$set(MemorySegment seg, long index, byte x) {
        _UNWIND_HISTORY_TABLE.Once$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LowAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowAddress"));
    public static VarHandle LowAddress$VH() {
        return _UNWIND_HISTORY_TABLE.LowAddress$VH;
    }
    public static long LowAddress$get(MemorySegment seg) {
        return (long)_UNWIND_HISTORY_TABLE.LowAddress$VH.get(seg);
    }
    public static void LowAddress$set( MemorySegment seg, long x) {
        _UNWIND_HISTORY_TABLE.LowAddress$VH.set(seg, x);
    }
    public static long LowAddress$get(MemorySegment seg, long index) {
        return (long)_UNWIND_HISTORY_TABLE.LowAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LowAddress$set(MemorySegment seg, long index, long x) {
        _UNWIND_HISTORY_TABLE.LowAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HighAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HighAddress"));
    public static VarHandle HighAddress$VH() {
        return _UNWIND_HISTORY_TABLE.HighAddress$VH;
    }
    public static long HighAddress$get(MemorySegment seg) {
        return (long)_UNWIND_HISTORY_TABLE.HighAddress$VH.get(seg);
    }
    public static void HighAddress$set( MemorySegment seg, long x) {
        _UNWIND_HISTORY_TABLE.HighAddress$VH.set(seg, x);
    }
    public static long HighAddress$get(MemorySegment seg, long index) {
        return (long)_UNWIND_HISTORY_TABLE.HighAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HighAddress$set(MemorySegment seg, long index, long x) {
        _UNWIND_HISTORY_TABLE.HighAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Entry$slice(MemorySegment seg) {
        return seg.asSlice(24, 192);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


