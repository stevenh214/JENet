// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPANOSE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("bFamilyType"),
        Constants$root.C_CHAR$LAYOUT.withName("bSerifStyle"),
        Constants$root.C_CHAR$LAYOUT.withName("bWeight"),
        Constants$root.C_CHAR$LAYOUT.withName("bProportion"),
        Constants$root.C_CHAR$LAYOUT.withName("bContrast"),
        Constants$root.C_CHAR$LAYOUT.withName("bStrokeVariation"),
        Constants$root.C_CHAR$LAYOUT.withName("bArmStyle"),
        Constants$root.C_CHAR$LAYOUT.withName("bLetterform"),
        Constants$root.C_CHAR$LAYOUT.withName("bMidline"),
        Constants$root.C_CHAR$LAYOUT.withName("bXHeight")
    ).withName("tagPANOSE");
    public static MemoryLayout $LAYOUT() {
        return tagPANOSE.$struct$LAYOUT;
    }
    static final VarHandle bFamilyType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bFamilyType"));
    public static VarHandle bFamilyType$VH() {
        return tagPANOSE.bFamilyType$VH;
    }
    public static byte bFamilyType$get(MemorySegment seg) {
        return (byte)tagPANOSE.bFamilyType$VH.get(seg);
    }
    public static void bFamilyType$set( MemorySegment seg, byte x) {
        tagPANOSE.bFamilyType$VH.set(seg, x);
    }
    public static byte bFamilyType$get(MemorySegment seg, long index) {
        return (byte)tagPANOSE.bFamilyType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bFamilyType$set(MemorySegment seg, long index, byte x) {
        tagPANOSE.bFamilyType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bSerifStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bSerifStyle"));
    public static VarHandle bSerifStyle$VH() {
        return tagPANOSE.bSerifStyle$VH;
    }
    public static byte bSerifStyle$get(MemorySegment seg) {
        return (byte)tagPANOSE.bSerifStyle$VH.get(seg);
    }
    public static void bSerifStyle$set( MemorySegment seg, byte x) {
        tagPANOSE.bSerifStyle$VH.set(seg, x);
    }
    public static byte bSerifStyle$get(MemorySegment seg, long index) {
        return (byte)tagPANOSE.bSerifStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bSerifStyle$set(MemorySegment seg, long index, byte x) {
        tagPANOSE.bSerifStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bWeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bWeight"));
    public static VarHandle bWeight$VH() {
        return tagPANOSE.bWeight$VH;
    }
    public static byte bWeight$get(MemorySegment seg) {
        return (byte)tagPANOSE.bWeight$VH.get(seg);
    }
    public static void bWeight$set( MemorySegment seg, byte x) {
        tagPANOSE.bWeight$VH.set(seg, x);
    }
    public static byte bWeight$get(MemorySegment seg, long index) {
        return (byte)tagPANOSE.bWeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bWeight$set(MemorySegment seg, long index, byte x) {
        tagPANOSE.bWeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bProportion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bProportion"));
    public static VarHandle bProportion$VH() {
        return tagPANOSE.bProportion$VH;
    }
    public static byte bProportion$get(MemorySegment seg) {
        return (byte)tagPANOSE.bProportion$VH.get(seg);
    }
    public static void bProportion$set( MemorySegment seg, byte x) {
        tagPANOSE.bProportion$VH.set(seg, x);
    }
    public static byte bProportion$get(MemorySegment seg, long index) {
        return (byte)tagPANOSE.bProportion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bProportion$set(MemorySegment seg, long index, byte x) {
        tagPANOSE.bProportion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bContrast$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bContrast"));
    public static VarHandle bContrast$VH() {
        return tagPANOSE.bContrast$VH;
    }
    public static byte bContrast$get(MemorySegment seg) {
        return (byte)tagPANOSE.bContrast$VH.get(seg);
    }
    public static void bContrast$set( MemorySegment seg, byte x) {
        tagPANOSE.bContrast$VH.set(seg, x);
    }
    public static byte bContrast$get(MemorySegment seg, long index) {
        return (byte)tagPANOSE.bContrast$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bContrast$set(MemorySegment seg, long index, byte x) {
        tagPANOSE.bContrast$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bStrokeVariation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bStrokeVariation"));
    public static VarHandle bStrokeVariation$VH() {
        return tagPANOSE.bStrokeVariation$VH;
    }
    public static byte bStrokeVariation$get(MemorySegment seg) {
        return (byte)tagPANOSE.bStrokeVariation$VH.get(seg);
    }
    public static void bStrokeVariation$set( MemorySegment seg, byte x) {
        tagPANOSE.bStrokeVariation$VH.set(seg, x);
    }
    public static byte bStrokeVariation$get(MemorySegment seg, long index) {
        return (byte)tagPANOSE.bStrokeVariation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bStrokeVariation$set(MemorySegment seg, long index, byte x) {
        tagPANOSE.bStrokeVariation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bArmStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bArmStyle"));
    public static VarHandle bArmStyle$VH() {
        return tagPANOSE.bArmStyle$VH;
    }
    public static byte bArmStyle$get(MemorySegment seg) {
        return (byte)tagPANOSE.bArmStyle$VH.get(seg);
    }
    public static void bArmStyle$set( MemorySegment seg, byte x) {
        tagPANOSE.bArmStyle$VH.set(seg, x);
    }
    public static byte bArmStyle$get(MemorySegment seg, long index) {
        return (byte)tagPANOSE.bArmStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bArmStyle$set(MemorySegment seg, long index, byte x) {
        tagPANOSE.bArmStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bLetterform$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bLetterform"));
    public static VarHandle bLetterform$VH() {
        return tagPANOSE.bLetterform$VH;
    }
    public static byte bLetterform$get(MemorySegment seg) {
        return (byte)tagPANOSE.bLetterform$VH.get(seg);
    }
    public static void bLetterform$set( MemorySegment seg, byte x) {
        tagPANOSE.bLetterform$VH.set(seg, x);
    }
    public static byte bLetterform$get(MemorySegment seg, long index) {
        return (byte)tagPANOSE.bLetterform$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bLetterform$set(MemorySegment seg, long index, byte x) {
        tagPANOSE.bLetterform$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bMidline$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bMidline"));
    public static VarHandle bMidline$VH() {
        return tagPANOSE.bMidline$VH;
    }
    public static byte bMidline$get(MemorySegment seg) {
        return (byte)tagPANOSE.bMidline$VH.get(seg);
    }
    public static void bMidline$set( MemorySegment seg, byte x) {
        tagPANOSE.bMidline$VH.set(seg, x);
    }
    public static byte bMidline$get(MemorySegment seg, long index) {
        return (byte)tagPANOSE.bMidline$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bMidline$set(MemorySegment seg, long index, byte x) {
        tagPANOSE.bMidline$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bXHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bXHeight"));
    public static VarHandle bXHeight$VH() {
        return tagPANOSE.bXHeight$VH;
    }
    public static byte bXHeight$get(MemorySegment seg) {
        return (byte)tagPANOSE.bXHeight$VH.get(seg);
    }
    public static void bXHeight$set( MemorySegment seg, byte x) {
        tagPANOSE.bXHeight$VH.set(seg, x);
    }
    public static byte bXHeight$get(MemorySegment seg, long index) {
        return (byte)tagPANOSE.bXHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bXHeight$set(MemorySegment seg, long index, byte x) {
        tagPANOSE.bXHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


