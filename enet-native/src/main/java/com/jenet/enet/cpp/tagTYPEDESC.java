// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagTYPEDESC {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("lptdesc"),
            Constants$root.C_POINTER$LAYOUT.withName("lpadesc"),
            Constants$root.C_LONG$LAYOUT.withName("hreftype")
        ).withName("$anon$0"),
        Constants$root.C_SHORT$LAYOUT.withName("vt"),
        MemoryLayout.paddingLayout(48)
    ).withName("tagTYPEDESC");
    public static MemoryLayout $LAYOUT() {
        return tagTYPEDESC.$struct$LAYOUT;
    }
    static final VarHandle lptdesc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("lptdesc"));
    public static VarHandle lptdesc$VH() {
        return tagTYPEDESC.lptdesc$VH;
    }
    public static MemoryAddress lptdesc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagTYPEDESC.lptdesc$VH.get(seg);
    }
    public static void lptdesc$set( MemorySegment seg, MemoryAddress x) {
        tagTYPEDESC.lptdesc$VH.set(seg, x);
    }
    public static MemoryAddress lptdesc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagTYPEDESC.lptdesc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lptdesc$set(MemorySegment seg, long index, MemoryAddress x) {
        tagTYPEDESC.lptdesc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpadesc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("lpadesc"));
    public static VarHandle lpadesc$VH() {
        return tagTYPEDESC.lpadesc$VH;
    }
    public static MemoryAddress lpadesc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagTYPEDESC.lpadesc$VH.get(seg);
    }
    public static void lpadesc$set( MemorySegment seg, MemoryAddress x) {
        tagTYPEDESC.lpadesc$VH.set(seg, x);
    }
    public static MemoryAddress lpadesc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagTYPEDESC.lpadesc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpadesc$set(MemorySegment seg, long index, MemoryAddress x) {
        tagTYPEDESC.lpadesc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hreftype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hreftype"));
    public static VarHandle hreftype$VH() {
        return tagTYPEDESC.hreftype$VH;
    }
    public static int hreftype$get(MemorySegment seg) {
        return (int)tagTYPEDESC.hreftype$VH.get(seg);
    }
    public static void hreftype$set( MemorySegment seg, int x) {
        tagTYPEDESC.hreftype$VH.set(seg, x);
    }
    public static int hreftype$get(MemorySegment seg, long index) {
        return (int)tagTYPEDESC.hreftype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hreftype$set(MemorySegment seg, long index, int x) {
        tagTYPEDESC.hreftype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vt"));
    public static VarHandle vt$VH() {
        return tagTYPEDESC.vt$VH;
    }
    public static short vt$get(MemorySegment seg) {
        return (short)tagTYPEDESC.vt$VH.get(seg);
    }
    public static void vt$set( MemorySegment seg, short x) {
        tagTYPEDESC.vt$VH.set(seg, x);
    }
    public static short vt$get(MemorySegment seg, long index) {
        return (short)tagTYPEDESC.vt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vt$set(MemorySegment seg, long index, short x) {
        tagTYPEDESC.vt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


