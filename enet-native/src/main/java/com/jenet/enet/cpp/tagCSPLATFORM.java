// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCSPLATFORM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwPlatformId"),
        Constants$root.C_LONG$LAYOUT.withName("dwVersionHi"),
        Constants$root.C_LONG$LAYOUT.withName("dwVersionLo"),
        Constants$root.C_LONG$LAYOUT.withName("dwProcessorArch")
    ).withName("tagCSPLATFORM");
    public static MemoryLayout $LAYOUT() {
        return tagCSPLATFORM.$struct$LAYOUT;
    }
    static final VarHandle dwPlatformId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPlatformId"));
    public static VarHandle dwPlatformId$VH() {
        return tagCSPLATFORM.dwPlatformId$VH;
    }
    public static int dwPlatformId$get(MemorySegment seg) {
        return (int)tagCSPLATFORM.dwPlatformId$VH.get(seg);
    }
    public static void dwPlatformId$set( MemorySegment seg, int x) {
        tagCSPLATFORM.dwPlatformId$VH.set(seg, x);
    }
    public static int dwPlatformId$get(MemorySegment seg, long index) {
        return (int)tagCSPLATFORM.dwPlatformId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPlatformId$set(MemorySegment seg, long index, int x) {
        tagCSPLATFORM.dwPlatformId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVersionHi$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersionHi"));
    public static VarHandle dwVersionHi$VH() {
        return tagCSPLATFORM.dwVersionHi$VH;
    }
    public static int dwVersionHi$get(MemorySegment seg) {
        return (int)tagCSPLATFORM.dwVersionHi$VH.get(seg);
    }
    public static void dwVersionHi$set( MemorySegment seg, int x) {
        tagCSPLATFORM.dwVersionHi$VH.set(seg, x);
    }
    public static int dwVersionHi$get(MemorySegment seg, long index) {
        return (int)tagCSPLATFORM.dwVersionHi$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersionHi$set(MemorySegment seg, long index, int x) {
        tagCSPLATFORM.dwVersionHi$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVersionLo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersionLo"));
    public static VarHandle dwVersionLo$VH() {
        return tagCSPLATFORM.dwVersionLo$VH;
    }
    public static int dwVersionLo$get(MemorySegment seg) {
        return (int)tagCSPLATFORM.dwVersionLo$VH.get(seg);
    }
    public static void dwVersionLo$set( MemorySegment seg, int x) {
        tagCSPLATFORM.dwVersionLo$VH.set(seg, x);
    }
    public static int dwVersionLo$get(MemorySegment seg, long index) {
        return (int)tagCSPLATFORM.dwVersionLo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersionLo$set(MemorySegment seg, long index, int x) {
        tagCSPLATFORM.dwVersionLo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProcessorArch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProcessorArch"));
    public static VarHandle dwProcessorArch$VH() {
        return tagCSPLATFORM.dwProcessorArch$VH;
    }
    public static int dwProcessorArch$get(MemorySegment seg) {
        return (int)tagCSPLATFORM.dwProcessorArch$VH.get(seg);
    }
    public static void dwProcessorArch$set( MemorySegment seg, int x) {
        tagCSPLATFORM.dwProcessorArch$VH.set(seg, x);
    }
    public static int dwProcessorArch$get(MemorySegment seg, long index) {
        return (int)tagCSPLATFORM.dwProcessorArch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProcessorArch$set(MemorySegment seg, long index, int x) {
        tagCSPLATFORM.dwProcessorArch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


