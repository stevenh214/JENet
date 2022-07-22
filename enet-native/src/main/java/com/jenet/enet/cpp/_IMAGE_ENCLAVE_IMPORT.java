// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_ENCLAVE_IMPORT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("MatchType"),
        Constants$root.C_LONG$LAYOUT.withName("MinimumSecurityVersion"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("UniqueOrAuthorID"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("FamilyID"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("ImageID"),
        Constants$root.C_LONG$LAYOUT.withName("ImportName"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved")
    ).withName("_IMAGE_ENCLAVE_IMPORT");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_ENCLAVE_IMPORT.$struct$LAYOUT;
    }
    static final VarHandle MatchType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MatchType"));
    public static VarHandle MatchType$VH() {
        return _IMAGE_ENCLAVE_IMPORT.MatchType$VH;
    }
    public static int MatchType$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_IMPORT.MatchType$VH.get(seg);
    }
    public static void MatchType$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_IMPORT.MatchType$VH.set(seg, x);
    }
    public static int MatchType$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_IMPORT.MatchType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MatchType$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_IMPORT.MatchType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinimumSecurityVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinimumSecurityVersion"));
    public static VarHandle MinimumSecurityVersion$VH() {
        return _IMAGE_ENCLAVE_IMPORT.MinimumSecurityVersion$VH;
    }
    public static int MinimumSecurityVersion$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_IMPORT.MinimumSecurityVersion$VH.get(seg);
    }
    public static void MinimumSecurityVersion$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_IMPORT.MinimumSecurityVersion$VH.set(seg, x);
    }
    public static int MinimumSecurityVersion$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_IMPORT.MinimumSecurityVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinimumSecurityVersion$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_IMPORT.MinimumSecurityVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment UniqueOrAuthorID$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    public static MemorySegment FamilyID$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static MemorySegment ImageID$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    static final VarHandle ImportName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImportName"));
    public static VarHandle ImportName$VH() {
        return _IMAGE_ENCLAVE_IMPORT.ImportName$VH;
    }
    public static int ImportName$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_IMPORT.ImportName$VH.get(seg);
    }
    public static void ImportName$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_IMPORT.ImportName$VH.set(seg, x);
    }
    public static int ImportName$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_IMPORT.ImportName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImportName$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_IMPORT.ImportName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _IMAGE_ENCLAVE_IMPORT.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_IMPORT.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_IMPORT.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_IMPORT.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_IMPORT.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


