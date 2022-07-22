// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("type"),
            Constants$root.C_LONG$LAYOUT.withName("size"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("adapterId"),
            Constants$root.C_LONG$LAYOUT.withName("id")
        ).withName("header"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("disableMonitorVirtualResolution"),
                    MemoryLayout.paddingLayout(31).withName("reserved")
                )
            ).withName("$anon$0"),
            Constants$root.C_LONG$LAYOUT.withName("value")
        ).withName("$anon$0")
    ).withName("DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION");
    public static MemoryLayout $LAYOUT() {
        return DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION.$struct$LAYOUT;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 20);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION.value$VH;
    }
    public static int value$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION.value$VH.set(seg, x);
    }
    public static int value$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


