// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagINPUT_MESSAGE_SOURCE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("deviceType"),
        Constants$root.C_LONG$LAYOUT.withName("originId")
    ).withName("tagINPUT_MESSAGE_SOURCE");
    public static MemoryLayout $LAYOUT() {
        return tagINPUT_MESSAGE_SOURCE.$struct$LAYOUT;
    }
    static final VarHandle deviceType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("deviceType"));
    public static VarHandle deviceType$VH() {
        return tagINPUT_MESSAGE_SOURCE.deviceType$VH;
    }
    public static int deviceType$get(MemorySegment seg) {
        return (int)tagINPUT_MESSAGE_SOURCE.deviceType$VH.get(seg);
    }
    public static void deviceType$set( MemorySegment seg, int x) {
        tagINPUT_MESSAGE_SOURCE.deviceType$VH.set(seg, x);
    }
    public static int deviceType$get(MemorySegment seg, long index) {
        return (int)tagINPUT_MESSAGE_SOURCE.deviceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void deviceType$set(MemorySegment seg, long index, int x) {
        tagINPUT_MESSAGE_SOURCE.deviceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle originId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("originId"));
    public static VarHandle originId$VH() {
        return tagINPUT_MESSAGE_SOURCE.originId$VH;
    }
    public static int originId$get(MemorySegment seg) {
        return (int)tagINPUT_MESSAGE_SOURCE.originId$VH.get(seg);
    }
    public static void originId$set( MemorySegment seg, int x) {
        tagINPUT_MESSAGE_SOURCE.originId$VH.set(seg, x);
    }
    public static int originId$get(MemorySegment seg, long index) {
        return (int)tagINPUT_MESSAGE_SOURCE.originId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void originId$set(MemorySegment seg, long index, int x) {
        tagINPUT_MESSAGE_SOURCE.originId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


