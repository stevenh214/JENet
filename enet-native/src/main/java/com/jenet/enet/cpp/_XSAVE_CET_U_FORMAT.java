// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _XSAVE_CET_U_FORMAT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Ia32CetUMsr"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Ia32Pl3SspMsr")
    ).withName("_XSAVE_CET_U_FORMAT");
    public static MemoryLayout $LAYOUT() {
        return _XSAVE_CET_U_FORMAT.$struct$LAYOUT;
    }
    static final VarHandle Ia32CetUMsr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Ia32CetUMsr"));
    public static VarHandle Ia32CetUMsr$VH() {
        return _XSAVE_CET_U_FORMAT.Ia32CetUMsr$VH;
    }
    public static long Ia32CetUMsr$get(MemorySegment seg) {
        return (long)_XSAVE_CET_U_FORMAT.Ia32CetUMsr$VH.get(seg);
    }
    public static void Ia32CetUMsr$set( MemorySegment seg, long x) {
        _XSAVE_CET_U_FORMAT.Ia32CetUMsr$VH.set(seg, x);
    }
    public static long Ia32CetUMsr$get(MemorySegment seg, long index) {
        return (long)_XSAVE_CET_U_FORMAT.Ia32CetUMsr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Ia32CetUMsr$set(MemorySegment seg, long index, long x) {
        _XSAVE_CET_U_FORMAT.Ia32CetUMsr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Ia32Pl3SspMsr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Ia32Pl3SspMsr"));
    public static VarHandle Ia32Pl3SspMsr$VH() {
        return _XSAVE_CET_U_FORMAT.Ia32Pl3SspMsr$VH;
    }
    public static long Ia32Pl3SspMsr$get(MemorySegment seg) {
        return (long)_XSAVE_CET_U_FORMAT.Ia32Pl3SspMsr$VH.get(seg);
    }
    public static void Ia32Pl3SspMsr$set( MemorySegment seg, long x) {
        _XSAVE_CET_U_FORMAT.Ia32Pl3SspMsr$VH.set(seg, x);
    }
    public static long Ia32Pl3SspMsr$get(MemorySegment seg, long index) {
        return (long)_XSAVE_CET_U_FORMAT.Ia32Pl3SspMsr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Ia32Pl3SspMsr$set(MemorySegment seg, long index, long x) {
        _XSAVE_CET_U_FORMAT.Ia32Pl3SspMsr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


