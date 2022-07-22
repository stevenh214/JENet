// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _cpinfoexA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("MaxCharSize"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("DefaultChar"),
        MemoryLayout.sequenceLayout(12, Constants$root.C_CHAR$LAYOUT).withName("LeadByte"),
        Constants$root.C_SHORT$LAYOUT.withName("UnicodeDefaultChar"),
        Constants$root.C_LONG$LAYOUT.withName("CodePage"),
        MemoryLayout.sequenceLayout(260, Constants$root.C_CHAR$LAYOUT).withName("CodePageName")
    ).withName("_cpinfoexA");
    public static MemoryLayout $LAYOUT() {
        return _cpinfoexA.$struct$LAYOUT;
    }
    static final VarHandle MaxCharSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxCharSize"));
    public static VarHandle MaxCharSize$VH() {
        return _cpinfoexA.MaxCharSize$VH;
    }
    public static int MaxCharSize$get(MemorySegment seg) {
        return (int)_cpinfoexA.MaxCharSize$VH.get(seg);
    }
    public static void MaxCharSize$set( MemorySegment seg, int x) {
        _cpinfoexA.MaxCharSize$VH.set(seg, x);
    }
    public static int MaxCharSize$get(MemorySegment seg, long index) {
        return (int)_cpinfoexA.MaxCharSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxCharSize$set(MemorySegment seg, long index, int x) {
        _cpinfoexA.MaxCharSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DefaultChar$slice(MemorySegment seg) {
        return seg.asSlice(4, 2);
    }
    public static MemorySegment LeadByte$slice(MemorySegment seg) {
        return seg.asSlice(6, 12);
    }
    static final VarHandle UnicodeDefaultChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnicodeDefaultChar"));
    public static VarHandle UnicodeDefaultChar$VH() {
        return _cpinfoexA.UnicodeDefaultChar$VH;
    }
    public static short UnicodeDefaultChar$get(MemorySegment seg) {
        return (short)_cpinfoexA.UnicodeDefaultChar$VH.get(seg);
    }
    public static void UnicodeDefaultChar$set( MemorySegment seg, short x) {
        _cpinfoexA.UnicodeDefaultChar$VH.set(seg, x);
    }
    public static short UnicodeDefaultChar$get(MemorySegment seg, long index) {
        return (short)_cpinfoexA.UnicodeDefaultChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnicodeDefaultChar$set(MemorySegment seg, long index, short x) {
        _cpinfoexA.UnicodeDefaultChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CodePage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CodePage"));
    public static VarHandle CodePage$VH() {
        return _cpinfoexA.CodePage$VH;
    }
    public static int CodePage$get(MemorySegment seg) {
        return (int)_cpinfoexA.CodePage$VH.get(seg);
    }
    public static void CodePage$set( MemorySegment seg, int x) {
        _cpinfoexA.CodePage$VH.set(seg, x);
    }
    public static int CodePage$get(MemorySegment seg, long index) {
        return (int)_cpinfoexA.CodePage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CodePage$set(MemorySegment seg, long index, int x) {
        _cpinfoexA.CodePage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment CodePageName$slice(MemorySegment seg) {
        return seg.asSlice(24, 260);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


