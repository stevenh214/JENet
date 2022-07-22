// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SI_COPYFILE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("SourceFileNameLength"),
        Constants$root.C_LONG$LAYOUT.withName("DestinationFileNameLength"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("FileNameBuffer"),
        MemoryLayout.paddingLayout(16)
    ).withName("_SI_COPYFILE");
    public static MemoryLayout $LAYOUT() {
        return _SI_COPYFILE.$struct$LAYOUT;
    }
    static final VarHandle SourceFileNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SourceFileNameLength"));
    public static VarHandle SourceFileNameLength$VH() {
        return _SI_COPYFILE.SourceFileNameLength$VH;
    }
    public static int SourceFileNameLength$get(MemorySegment seg) {
        return (int)_SI_COPYFILE.SourceFileNameLength$VH.get(seg);
    }
    public static void SourceFileNameLength$set( MemorySegment seg, int x) {
        _SI_COPYFILE.SourceFileNameLength$VH.set(seg, x);
    }
    public static int SourceFileNameLength$get(MemorySegment seg, long index) {
        return (int)_SI_COPYFILE.SourceFileNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SourceFileNameLength$set(MemorySegment seg, long index, int x) {
        _SI_COPYFILE.SourceFileNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DestinationFileNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DestinationFileNameLength"));
    public static VarHandle DestinationFileNameLength$VH() {
        return _SI_COPYFILE.DestinationFileNameLength$VH;
    }
    public static int DestinationFileNameLength$get(MemorySegment seg) {
        return (int)_SI_COPYFILE.DestinationFileNameLength$VH.get(seg);
    }
    public static void DestinationFileNameLength$set( MemorySegment seg, int x) {
        _SI_COPYFILE.DestinationFileNameLength$VH.set(seg, x);
    }
    public static int DestinationFileNameLength$get(MemorySegment seg, long index) {
        return (int)_SI_COPYFILE.DestinationFileNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DestinationFileNameLength$set(MemorySegment seg, long index, int x) {
        _SI_COPYFILE.DestinationFileNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _SI_COPYFILE.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_SI_COPYFILE.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _SI_COPYFILE.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_SI_COPYFILE.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _SI_COPYFILE.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileNameBuffer$slice(MemorySegment seg) {
        return seg.asSlice(12, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


