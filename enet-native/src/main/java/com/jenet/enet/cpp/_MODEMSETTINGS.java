// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MODEMSETTINGS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwActualSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwRequiredSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwDevSpecificOffset"),
        Constants$root.C_LONG$LAYOUT.withName("dwDevSpecificSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwCallSetupFailTimer"),
        Constants$root.C_LONG$LAYOUT.withName("dwInactivityTimeout"),
        Constants$root.C_LONG$LAYOUT.withName("dwSpeakerVolume"),
        Constants$root.C_LONG$LAYOUT.withName("dwSpeakerMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwPreferredModemOptions"),
        Constants$root.C_LONG$LAYOUT.withName("dwNegotiatedModemOptions"),
        Constants$root.C_LONG$LAYOUT.withName("dwNegotiatedDCERate"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("abVariablePortion"),
        MemoryLayout.paddingLayout(24)
    ).withName("_MODEMSETTINGS");
    public static MemoryLayout $LAYOUT() {
        return _MODEMSETTINGS.$struct$LAYOUT;
    }
    static final VarHandle dwActualSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwActualSize"));
    public static VarHandle dwActualSize$VH() {
        return _MODEMSETTINGS.dwActualSize$VH;
    }
    public static int dwActualSize$get(MemorySegment seg) {
        return (int)_MODEMSETTINGS.dwActualSize$VH.get(seg);
    }
    public static void dwActualSize$set( MemorySegment seg, int x) {
        _MODEMSETTINGS.dwActualSize$VH.set(seg, x);
    }
    public static int dwActualSize$get(MemorySegment seg, long index) {
        return (int)_MODEMSETTINGS.dwActualSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwActualSize$set(MemorySegment seg, long index, int x) {
        _MODEMSETTINGS.dwActualSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRequiredSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRequiredSize"));
    public static VarHandle dwRequiredSize$VH() {
        return _MODEMSETTINGS.dwRequiredSize$VH;
    }
    public static int dwRequiredSize$get(MemorySegment seg) {
        return (int)_MODEMSETTINGS.dwRequiredSize$VH.get(seg);
    }
    public static void dwRequiredSize$set( MemorySegment seg, int x) {
        _MODEMSETTINGS.dwRequiredSize$VH.set(seg, x);
    }
    public static int dwRequiredSize$get(MemorySegment seg, long index) {
        return (int)_MODEMSETTINGS.dwRequiredSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRequiredSize$set(MemorySegment seg, long index, int x) {
        _MODEMSETTINGS.dwRequiredSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDevSpecificOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDevSpecificOffset"));
    public static VarHandle dwDevSpecificOffset$VH() {
        return _MODEMSETTINGS.dwDevSpecificOffset$VH;
    }
    public static int dwDevSpecificOffset$get(MemorySegment seg) {
        return (int)_MODEMSETTINGS.dwDevSpecificOffset$VH.get(seg);
    }
    public static void dwDevSpecificOffset$set( MemorySegment seg, int x) {
        _MODEMSETTINGS.dwDevSpecificOffset$VH.set(seg, x);
    }
    public static int dwDevSpecificOffset$get(MemorySegment seg, long index) {
        return (int)_MODEMSETTINGS.dwDevSpecificOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDevSpecificOffset$set(MemorySegment seg, long index, int x) {
        _MODEMSETTINGS.dwDevSpecificOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDevSpecificSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDevSpecificSize"));
    public static VarHandle dwDevSpecificSize$VH() {
        return _MODEMSETTINGS.dwDevSpecificSize$VH;
    }
    public static int dwDevSpecificSize$get(MemorySegment seg) {
        return (int)_MODEMSETTINGS.dwDevSpecificSize$VH.get(seg);
    }
    public static void dwDevSpecificSize$set( MemorySegment seg, int x) {
        _MODEMSETTINGS.dwDevSpecificSize$VH.set(seg, x);
    }
    public static int dwDevSpecificSize$get(MemorySegment seg, long index) {
        return (int)_MODEMSETTINGS.dwDevSpecificSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDevSpecificSize$set(MemorySegment seg, long index, int x) {
        _MODEMSETTINGS.dwDevSpecificSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCallSetupFailTimer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallSetupFailTimer"));
    public static VarHandle dwCallSetupFailTimer$VH() {
        return _MODEMSETTINGS.dwCallSetupFailTimer$VH;
    }
    public static int dwCallSetupFailTimer$get(MemorySegment seg) {
        return (int)_MODEMSETTINGS.dwCallSetupFailTimer$VH.get(seg);
    }
    public static void dwCallSetupFailTimer$set( MemorySegment seg, int x) {
        _MODEMSETTINGS.dwCallSetupFailTimer$VH.set(seg, x);
    }
    public static int dwCallSetupFailTimer$get(MemorySegment seg, long index) {
        return (int)_MODEMSETTINGS.dwCallSetupFailTimer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallSetupFailTimer$set(MemorySegment seg, long index, int x) {
        _MODEMSETTINGS.dwCallSetupFailTimer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwInactivityTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwInactivityTimeout"));
    public static VarHandle dwInactivityTimeout$VH() {
        return _MODEMSETTINGS.dwInactivityTimeout$VH;
    }
    public static int dwInactivityTimeout$get(MemorySegment seg) {
        return (int)_MODEMSETTINGS.dwInactivityTimeout$VH.get(seg);
    }
    public static void dwInactivityTimeout$set( MemorySegment seg, int x) {
        _MODEMSETTINGS.dwInactivityTimeout$VH.set(seg, x);
    }
    public static int dwInactivityTimeout$get(MemorySegment seg, long index) {
        return (int)_MODEMSETTINGS.dwInactivityTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInactivityTimeout$set(MemorySegment seg, long index, int x) {
        _MODEMSETTINGS.dwInactivityTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSpeakerVolume$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSpeakerVolume"));
    public static VarHandle dwSpeakerVolume$VH() {
        return _MODEMSETTINGS.dwSpeakerVolume$VH;
    }
    public static int dwSpeakerVolume$get(MemorySegment seg) {
        return (int)_MODEMSETTINGS.dwSpeakerVolume$VH.get(seg);
    }
    public static void dwSpeakerVolume$set( MemorySegment seg, int x) {
        _MODEMSETTINGS.dwSpeakerVolume$VH.set(seg, x);
    }
    public static int dwSpeakerVolume$get(MemorySegment seg, long index) {
        return (int)_MODEMSETTINGS.dwSpeakerVolume$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSpeakerVolume$set(MemorySegment seg, long index, int x) {
        _MODEMSETTINGS.dwSpeakerVolume$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSpeakerMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSpeakerMode"));
    public static VarHandle dwSpeakerMode$VH() {
        return _MODEMSETTINGS.dwSpeakerMode$VH;
    }
    public static int dwSpeakerMode$get(MemorySegment seg) {
        return (int)_MODEMSETTINGS.dwSpeakerMode$VH.get(seg);
    }
    public static void dwSpeakerMode$set( MemorySegment seg, int x) {
        _MODEMSETTINGS.dwSpeakerMode$VH.set(seg, x);
    }
    public static int dwSpeakerMode$get(MemorySegment seg, long index) {
        return (int)_MODEMSETTINGS.dwSpeakerMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSpeakerMode$set(MemorySegment seg, long index, int x) {
        _MODEMSETTINGS.dwSpeakerMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPreferredModemOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPreferredModemOptions"));
    public static VarHandle dwPreferredModemOptions$VH() {
        return _MODEMSETTINGS.dwPreferredModemOptions$VH;
    }
    public static int dwPreferredModemOptions$get(MemorySegment seg) {
        return (int)_MODEMSETTINGS.dwPreferredModemOptions$VH.get(seg);
    }
    public static void dwPreferredModemOptions$set( MemorySegment seg, int x) {
        _MODEMSETTINGS.dwPreferredModemOptions$VH.set(seg, x);
    }
    public static int dwPreferredModemOptions$get(MemorySegment seg, long index) {
        return (int)_MODEMSETTINGS.dwPreferredModemOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPreferredModemOptions$set(MemorySegment seg, long index, int x) {
        _MODEMSETTINGS.dwPreferredModemOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNegotiatedModemOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNegotiatedModemOptions"));
    public static VarHandle dwNegotiatedModemOptions$VH() {
        return _MODEMSETTINGS.dwNegotiatedModemOptions$VH;
    }
    public static int dwNegotiatedModemOptions$get(MemorySegment seg) {
        return (int)_MODEMSETTINGS.dwNegotiatedModemOptions$VH.get(seg);
    }
    public static void dwNegotiatedModemOptions$set( MemorySegment seg, int x) {
        _MODEMSETTINGS.dwNegotiatedModemOptions$VH.set(seg, x);
    }
    public static int dwNegotiatedModemOptions$get(MemorySegment seg, long index) {
        return (int)_MODEMSETTINGS.dwNegotiatedModemOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNegotiatedModemOptions$set(MemorySegment seg, long index, int x) {
        _MODEMSETTINGS.dwNegotiatedModemOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNegotiatedDCERate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNegotiatedDCERate"));
    public static VarHandle dwNegotiatedDCERate$VH() {
        return _MODEMSETTINGS.dwNegotiatedDCERate$VH;
    }
    public static int dwNegotiatedDCERate$get(MemorySegment seg) {
        return (int)_MODEMSETTINGS.dwNegotiatedDCERate$VH.get(seg);
    }
    public static void dwNegotiatedDCERate$set( MemorySegment seg, int x) {
        _MODEMSETTINGS.dwNegotiatedDCERate$VH.set(seg, x);
    }
    public static int dwNegotiatedDCERate$get(MemorySegment seg, long index) {
        return (int)_MODEMSETTINGS.dwNegotiatedDCERate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNegotiatedDCERate$set(MemorySegment seg, long index, int x) {
        _MODEMSETTINGS.dwNegotiatedDCERate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment abVariablePortion$slice(MemorySegment seg) {
        return seg.asSlice(44, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


