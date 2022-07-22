// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CHANGER_PRODUCT_DATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("VendorId"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("ProductId"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("Revision"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("SerialNumber"),
        Constants$root.C_CHAR$LAYOUT.withName("DeviceType")
    ).withName("_CHANGER_PRODUCT_DATA");
    public static MemoryLayout $LAYOUT() {
        return _CHANGER_PRODUCT_DATA.$struct$LAYOUT;
    }
    public static MemorySegment VendorId$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment ProductId$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static MemorySegment Revision$slice(MemorySegment seg) {
        return seg.asSlice(24, 4);
    }
    public static MemorySegment SerialNumber$slice(MemorySegment seg) {
        return seg.asSlice(28, 32);
    }
    static final VarHandle DeviceType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceType"));
    public static VarHandle DeviceType$VH() {
        return _CHANGER_PRODUCT_DATA.DeviceType$VH;
    }
    public static byte DeviceType$get(MemorySegment seg) {
        return (byte)_CHANGER_PRODUCT_DATA.DeviceType$VH.get(seg);
    }
    public static void DeviceType$set( MemorySegment seg, byte x) {
        _CHANGER_PRODUCT_DATA.DeviceType$VH.set(seg, x);
    }
    public static byte DeviceType$get(MemorySegment seg, long index) {
        return (byte)_CHANGER_PRODUCT_DATA.DeviceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceType$set(MemorySegment seg, long index, byte x) {
        _CHANGER_PRODUCT_DATA.DeviceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


