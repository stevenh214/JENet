// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GET_FILTER_FILE_IDENTIFIER_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("FilterFileIdentifierLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("FilterFileIdentifier"),
        MemoryLayout.paddingLayout(8)
    ).withName("_GET_FILTER_FILE_IDENTIFIER_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _GET_FILTER_FILE_IDENTIFIER_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle FilterFileIdentifierLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FilterFileIdentifierLength"));
    public static VarHandle FilterFileIdentifierLength$VH() {
        return _GET_FILTER_FILE_IDENTIFIER_OUTPUT.FilterFileIdentifierLength$VH;
    }
    public static short FilterFileIdentifierLength$get(MemorySegment seg) {
        return (short)_GET_FILTER_FILE_IDENTIFIER_OUTPUT.FilterFileIdentifierLength$VH.get(seg);
    }
    public static void FilterFileIdentifierLength$set( MemorySegment seg, short x) {
        _GET_FILTER_FILE_IDENTIFIER_OUTPUT.FilterFileIdentifierLength$VH.set(seg, x);
    }
    public static short FilterFileIdentifierLength$get(MemorySegment seg, long index) {
        return (short)_GET_FILTER_FILE_IDENTIFIER_OUTPUT.FilterFileIdentifierLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FilterFileIdentifierLength$set(MemorySegment seg, long index, short x) {
        _GET_FILTER_FILE_IDENTIFIER_OUTPUT.FilterFileIdentifierLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FilterFileIdentifier$slice(MemorySegment seg) {
        return seg.asSlice(2, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


