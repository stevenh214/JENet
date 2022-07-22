// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DRIVER_INFO_5W {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cVersion"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pName"),
        Constants$root.C_POINTER$LAYOUT.withName("pEnvironment"),
        Constants$root.C_POINTER$LAYOUT.withName("pDriverPath"),
        Constants$root.C_POINTER$LAYOUT.withName("pDataFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pConfigFile"),
        Constants$root.C_LONG$LAYOUT.withName("dwDriverAttributes"),
        Constants$root.C_LONG$LAYOUT.withName("dwConfigVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwDriverVersion"),
        MemoryLayout.paddingLayout(32)
    ).withName("_DRIVER_INFO_5W");
    public static MemoryLayout $LAYOUT() {
        return _DRIVER_INFO_5W.$struct$LAYOUT;
    }
    static final VarHandle cVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cVersion"));
    public static VarHandle cVersion$VH() {
        return _DRIVER_INFO_5W.cVersion$VH;
    }
    public static int cVersion$get(MemorySegment seg) {
        return (int)_DRIVER_INFO_5W.cVersion$VH.get(seg);
    }
    public static void cVersion$set( MemorySegment seg, int x) {
        _DRIVER_INFO_5W.cVersion$VH.set(seg, x);
    }
    public static int cVersion$get(MemorySegment seg, long index) {
        return (int)_DRIVER_INFO_5W.cVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cVersion$set(MemorySegment seg, long index, int x) {
        _DRIVER_INFO_5W.cVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    public static VarHandle pName$VH() {
        return _DRIVER_INFO_5W.pName$VH;
    }
    public static MemoryAddress pName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_5W.pName$VH.get(seg);
    }
    public static void pName$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_5W.pName$VH.set(seg, x);
    }
    public static MemoryAddress pName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_5W.pName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_5W.pName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pEnvironment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pEnvironment"));
    public static VarHandle pEnvironment$VH() {
        return _DRIVER_INFO_5W.pEnvironment$VH;
    }
    public static MemoryAddress pEnvironment$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_5W.pEnvironment$VH.get(seg);
    }
    public static void pEnvironment$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_5W.pEnvironment$VH.set(seg, x);
    }
    public static MemoryAddress pEnvironment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_5W.pEnvironment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pEnvironment$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_5W.pEnvironment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDriverPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDriverPath"));
    public static VarHandle pDriverPath$VH() {
        return _DRIVER_INFO_5W.pDriverPath$VH;
    }
    public static MemoryAddress pDriverPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_5W.pDriverPath$VH.get(seg);
    }
    public static void pDriverPath$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_5W.pDriverPath$VH.set(seg, x);
    }
    public static MemoryAddress pDriverPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_5W.pDriverPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDriverPath$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_5W.pDriverPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDataFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDataFile"));
    public static VarHandle pDataFile$VH() {
        return _DRIVER_INFO_5W.pDataFile$VH;
    }
    public static MemoryAddress pDataFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_5W.pDataFile$VH.get(seg);
    }
    public static void pDataFile$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_5W.pDataFile$VH.set(seg, x);
    }
    public static MemoryAddress pDataFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_5W.pDataFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDataFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_5W.pDataFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pConfigFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pConfigFile"));
    public static VarHandle pConfigFile$VH() {
        return _DRIVER_INFO_5W.pConfigFile$VH;
    }
    public static MemoryAddress pConfigFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_5W.pConfigFile$VH.get(seg);
    }
    public static void pConfigFile$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_5W.pConfigFile$VH.set(seg, x);
    }
    public static MemoryAddress pConfigFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_5W.pConfigFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pConfigFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_5W.pConfigFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDriverAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDriverAttributes"));
    public static VarHandle dwDriverAttributes$VH() {
        return _DRIVER_INFO_5W.dwDriverAttributes$VH;
    }
    public static int dwDriverAttributes$get(MemorySegment seg) {
        return (int)_DRIVER_INFO_5W.dwDriverAttributes$VH.get(seg);
    }
    public static void dwDriverAttributes$set( MemorySegment seg, int x) {
        _DRIVER_INFO_5W.dwDriverAttributes$VH.set(seg, x);
    }
    public static int dwDriverAttributes$get(MemorySegment seg, long index) {
        return (int)_DRIVER_INFO_5W.dwDriverAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDriverAttributes$set(MemorySegment seg, long index, int x) {
        _DRIVER_INFO_5W.dwDriverAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwConfigVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwConfigVersion"));
    public static VarHandle dwConfigVersion$VH() {
        return _DRIVER_INFO_5W.dwConfigVersion$VH;
    }
    public static int dwConfigVersion$get(MemorySegment seg) {
        return (int)_DRIVER_INFO_5W.dwConfigVersion$VH.get(seg);
    }
    public static void dwConfigVersion$set( MemorySegment seg, int x) {
        _DRIVER_INFO_5W.dwConfigVersion$VH.set(seg, x);
    }
    public static int dwConfigVersion$get(MemorySegment seg, long index) {
        return (int)_DRIVER_INFO_5W.dwConfigVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwConfigVersion$set(MemorySegment seg, long index, int x) {
        _DRIVER_INFO_5W.dwConfigVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDriverVersion"));
    public static VarHandle dwDriverVersion$VH() {
        return _DRIVER_INFO_5W.dwDriverVersion$VH;
    }
    public static int dwDriverVersion$get(MemorySegment seg) {
        return (int)_DRIVER_INFO_5W.dwDriverVersion$VH.get(seg);
    }
    public static void dwDriverVersion$set( MemorySegment seg, int x) {
        _DRIVER_INFO_5W.dwDriverVersion$VH.set(seg, x);
    }
    public static int dwDriverVersion$get(MemorySegment seg, long index) {
        return (int)_DRIVER_INFO_5W.dwDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDriverVersion$set(MemorySegment seg, long index, int x) {
        _DRIVER_INFO_5W.dwDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


