// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SCM_PD_DEVICE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("DeviceGuid"),
        Constants$root.C_LONG$LAYOUT.withName("UnsafeShutdownCount"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("PersistentMemorySizeInBytes"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("VolatileMemorySizeInBytes"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalMemorySizeInBytes"),
        Constants$root.C_LONG$LAYOUT.withName("SlotNumber"),
        Constants$root.C_LONG$LAYOUT.withName("DeviceHandle"),
        Constants$root.C_SHORT$LAYOUT.withName("PhysicalId"),
        Constants$root.C_CHAR$LAYOUT.withName("NumberOfFormatInterfaceCodes"),
        MemoryLayout.paddingLayout(8),
        MemoryLayout.sequenceLayout(8, Constants$root.C_SHORT$LAYOUT).withName("FormatInterfaceCodes"),
        Constants$root.C_LONG$LAYOUT.withName("VendorId"),
        Constants$root.C_LONG$LAYOUT.withName("ProductId"),
        Constants$root.C_LONG$LAYOUT.withName("SubsystemDeviceId"),
        Constants$root.C_LONG$LAYOUT.withName("SubsystemVendorId"),
        Constants$root.C_CHAR$LAYOUT.withName("ManufacturingLocation"),
        Constants$root.C_CHAR$LAYOUT.withName("ManufacturingWeek"),
        Constants$root.C_CHAR$LAYOUT.withName("ManufacturingYear"),
        MemoryLayout.paddingLayout(8),
        Constants$root.C_LONG$LAYOUT.withName("SerialNumber4Byte"),
        Constants$root.C_LONG$LAYOUT.withName("SerialNumberLengthInChars"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("SerialNumber"),
        MemoryLayout.paddingLayout(56)
    ).withName("_SCM_PD_DEVICE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _SCM_PD_DEVICE_INFO.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SCM_PD_DEVICE_INFO.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_SCM_PD_DEVICE_INFO.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _SCM_PD_DEVICE_INFO.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_DEVICE_INFO.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _SCM_PD_DEVICE_INFO.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCM_PD_DEVICE_INFO.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SCM_PD_DEVICE_INFO.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SCM_PD_DEVICE_INFO.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_DEVICE_INFO.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCM_PD_DEVICE_INFO.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DeviceGuid$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle UnsafeShutdownCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnsafeShutdownCount"));
    public static VarHandle UnsafeShutdownCount$VH() {
        return _SCM_PD_DEVICE_INFO.UnsafeShutdownCount$VH;
    }
    public static int UnsafeShutdownCount$get(MemorySegment seg) {
        return (int)_SCM_PD_DEVICE_INFO.UnsafeShutdownCount$VH.get(seg);
    }
    public static void UnsafeShutdownCount$set( MemorySegment seg, int x) {
        _SCM_PD_DEVICE_INFO.UnsafeShutdownCount$VH.set(seg, x);
    }
    public static int UnsafeShutdownCount$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_DEVICE_INFO.UnsafeShutdownCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnsafeShutdownCount$set(MemorySegment seg, long index, int x) {
        _SCM_PD_DEVICE_INFO.UnsafeShutdownCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PersistentMemorySizeInBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PersistentMemorySizeInBytes"));
    public static VarHandle PersistentMemorySizeInBytes$VH() {
        return _SCM_PD_DEVICE_INFO.PersistentMemorySizeInBytes$VH;
    }
    public static long PersistentMemorySizeInBytes$get(MemorySegment seg) {
        return (long)_SCM_PD_DEVICE_INFO.PersistentMemorySizeInBytes$VH.get(seg);
    }
    public static void PersistentMemorySizeInBytes$set( MemorySegment seg, long x) {
        _SCM_PD_DEVICE_INFO.PersistentMemorySizeInBytes$VH.set(seg, x);
    }
    public static long PersistentMemorySizeInBytes$get(MemorySegment seg, long index) {
        return (long)_SCM_PD_DEVICE_INFO.PersistentMemorySizeInBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PersistentMemorySizeInBytes$set(MemorySegment seg, long index, long x) {
        _SCM_PD_DEVICE_INFO.PersistentMemorySizeInBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VolatileMemorySizeInBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolatileMemorySizeInBytes"));
    public static VarHandle VolatileMemorySizeInBytes$VH() {
        return _SCM_PD_DEVICE_INFO.VolatileMemorySizeInBytes$VH;
    }
    public static long VolatileMemorySizeInBytes$get(MemorySegment seg) {
        return (long)_SCM_PD_DEVICE_INFO.VolatileMemorySizeInBytes$VH.get(seg);
    }
    public static void VolatileMemorySizeInBytes$set( MemorySegment seg, long x) {
        _SCM_PD_DEVICE_INFO.VolatileMemorySizeInBytes$VH.set(seg, x);
    }
    public static long VolatileMemorySizeInBytes$get(MemorySegment seg, long index) {
        return (long)_SCM_PD_DEVICE_INFO.VolatileMemorySizeInBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolatileMemorySizeInBytes$set(MemorySegment seg, long index, long x) {
        _SCM_PD_DEVICE_INFO.VolatileMemorySizeInBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalMemorySizeInBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalMemorySizeInBytes"));
    public static VarHandle TotalMemorySizeInBytes$VH() {
        return _SCM_PD_DEVICE_INFO.TotalMemorySizeInBytes$VH;
    }
    public static long TotalMemorySizeInBytes$get(MemorySegment seg) {
        return (long)_SCM_PD_DEVICE_INFO.TotalMemorySizeInBytes$VH.get(seg);
    }
    public static void TotalMemorySizeInBytes$set( MemorySegment seg, long x) {
        _SCM_PD_DEVICE_INFO.TotalMemorySizeInBytes$VH.set(seg, x);
    }
    public static long TotalMemorySizeInBytes$get(MemorySegment seg, long index) {
        return (long)_SCM_PD_DEVICE_INFO.TotalMemorySizeInBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalMemorySizeInBytes$set(MemorySegment seg, long index, long x) {
        _SCM_PD_DEVICE_INFO.TotalMemorySizeInBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SlotNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SlotNumber"));
    public static VarHandle SlotNumber$VH() {
        return _SCM_PD_DEVICE_INFO.SlotNumber$VH;
    }
    public static int SlotNumber$get(MemorySegment seg) {
        return (int)_SCM_PD_DEVICE_INFO.SlotNumber$VH.get(seg);
    }
    public static void SlotNumber$set( MemorySegment seg, int x) {
        _SCM_PD_DEVICE_INFO.SlotNumber$VH.set(seg, x);
    }
    public static int SlotNumber$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_DEVICE_INFO.SlotNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SlotNumber$set(MemorySegment seg, long index, int x) {
        _SCM_PD_DEVICE_INFO.SlotNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceHandle"));
    public static VarHandle DeviceHandle$VH() {
        return _SCM_PD_DEVICE_INFO.DeviceHandle$VH;
    }
    public static int DeviceHandle$get(MemorySegment seg) {
        return (int)_SCM_PD_DEVICE_INFO.DeviceHandle$VH.get(seg);
    }
    public static void DeviceHandle$set( MemorySegment seg, int x) {
        _SCM_PD_DEVICE_INFO.DeviceHandle$VH.set(seg, x);
    }
    public static int DeviceHandle$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_DEVICE_INFO.DeviceHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceHandle$set(MemorySegment seg, long index, int x) {
        _SCM_PD_DEVICE_INFO.DeviceHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PhysicalId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PhysicalId"));
    public static VarHandle PhysicalId$VH() {
        return _SCM_PD_DEVICE_INFO.PhysicalId$VH;
    }
    public static short PhysicalId$get(MemorySegment seg) {
        return (short)_SCM_PD_DEVICE_INFO.PhysicalId$VH.get(seg);
    }
    public static void PhysicalId$set( MemorySegment seg, short x) {
        _SCM_PD_DEVICE_INFO.PhysicalId$VH.set(seg, x);
    }
    public static short PhysicalId$get(MemorySegment seg, long index) {
        return (short)_SCM_PD_DEVICE_INFO.PhysicalId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PhysicalId$set(MemorySegment seg, long index, short x) {
        _SCM_PD_DEVICE_INFO.PhysicalId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfFormatInterfaceCodes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfFormatInterfaceCodes"));
    public static VarHandle NumberOfFormatInterfaceCodes$VH() {
        return _SCM_PD_DEVICE_INFO.NumberOfFormatInterfaceCodes$VH;
    }
    public static byte NumberOfFormatInterfaceCodes$get(MemorySegment seg) {
        return (byte)_SCM_PD_DEVICE_INFO.NumberOfFormatInterfaceCodes$VH.get(seg);
    }
    public static void NumberOfFormatInterfaceCodes$set( MemorySegment seg, byte x) {
        _SCM_PD_DEVICE_INFO.NumberOfFormatInterfaceCodes$VH.set(seg, x);
    }
    public static byte NumberOfFormatInterfaceCodes$get(MemorySegment seg, long index) {
        return (byte)_SCM_PD_DEVICE_INFO.NumberOfFormatInterfaceCodes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfFormatInterfaceCodes$set(MemorySegment seg, long index, byte x) {
        _SCM_PD_DEVICE_INFO.NumberOfFormatInterfaceCodes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FormatInterfaceCodes$slice(MemorySegment seg) {
        return seg.asSlice(68, 16);
    }
    static final VarHandle VendorId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VendorId"));
    public static VarHandle VendorId$VH() {
        return _SCM_PD_DEVICE_INFO.VendorId$VH;
    }
    public static int VendorId$get(MemorySegment seg) {
        return (int)_SCM_PD_DEVICE_INFO.VendorId$VH.get(seg);
    }
    public static void VendorId$set( MemorySegment seg, int x) {
        _SCM_PD_DEVICE_INFO.VendorId$VH.set(seg, x);
    }
    public static int VendorId$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_DEVICE_INFO.VendorId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VendorId$set(MemorySegment seg, long index, int x) {
        _SCM_PD_DEVICE_INFO.VendorId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProductId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProductId"));
    public static VarHandle ProductId$VH() {
        return _SCM_PD_DEVICE_INFO.ProductId$VH;
    }
    public static int ProductId$get(MemorySegment seg) {
        return (int)_SCM_PD_DEVICE_INFO.ProductId$VH.get(seg);
    }
    public static void ProductId$set( MemorySegment seg, int x) {
        _SCM_PD_DEVICE_INFO.ProductId$VH.set(seg, x);
    }
    public static int ProductId$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_DEVICE_INFO.ProductId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProductId$set(MemorySegment seg, long index, int x) {
        _SCM_PD_DEVICE_INFO.ProductId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SubsystemDeviceId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SubsystemDeviceId"));
    public static VarHandle SubsystemDeviceId$VH() {
        return _SCM_PD_DEVICE_INFO.SubsystemDeviceId$VH;
    }
    public static int SubsystemDeviceId$get(MemorySegment seg) {
        return (int)_SCM_PD_DEVICE_INFO.SubsystemDeviceId$VH.get(seg);
    }
    public static void SubsystemDeviceId$set( MemorySegment seg, int x) {
        _SCM_PD_DEVICE_INFO.SubsystemDeviceId$VH.set(seg, x);
    }
    public static int SubsystemDeviceId$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_DEVICE_INFO.SubsystemDeviceId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SubsystemDeviceId$set(MemorySegment seg, long index, int x) {
        _SCM_PD_DEVICE_INFO.SubsystemDeviceId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SubsystemVendorId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SubsystemVendorId"));
    public static VarHandle SubsystemVendorId$VH() {
        return _SCM_PD_DEVICE_INFO.SubsystemVendorId$VH;
    }
    public static int SubsystemVendorId$get(MemorySegment seg) {
        return (int)_SCM_PD_DEVICE_INFO.SubsystemVendorId$VH.get(seg);
    }
    public static void SubsystemVendorId$set( MemorySegment seg, int x) {
        _SCM_PD_DEVICE_INFO.SubsystemVendorId$VH.set(seg, x);
    }
    public static int SubsystemVendorId$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_DEVICE_INFO.SubsystemVendorId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SubsystemVendorId$set(MemorySegment seg, long index, int x) {
        _SCM_PD_DEVICE_INFO.SubsystemVendorId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ManufacturingLocation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ManufacturingLocation"));
    public static VarHandle ManufacturingLocation$VH() {
        return _SCM_PD_DEVICE_INFO.ManufacturingLocation$VH;
    }
    public static byte ManufacturingLocation$get(MemorySegment seg) {
        return (byte)_SCM_PD_DEVICE_INFO.ManufacturingLocation$VH.get(seg);
    }
    public static void ManufacturingLocation$set( MemorySegment seg, byte x) {
        _SCM_PD_DEVICE_INFO.ManufacturingLocation$VH.set(seg, x);
    }
    public static byte ManufacturingLocation$get(MemorySegment seg, long index) {
        return (byte)_SCM_PD_DEVICE_INFO.ManufacturingLocation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ManufacturingLocation$set(MemorySegment seg, long index, byte x) {
        _SCM_PD_DEVICE_INFO.ManufacturingLocation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ManufacturingWeek$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ManufacturingWeek"));
    public static VarHandle ManufacturingWeek$VH() {
        return _SCM_PD_DEVICE_INFO.ManufacturingWeek$VH;
    }
    public static byte ManufacturingWeek$get(MemorySegment seg) {
        return (byte)_SCM_PD_DEVICE_INFO.ManufacturingWeek$VH.get(seg);
    }
    public static void ManufacturingWeek$set( MemorySegment seg, byte x) {
        _SCM_PD_DEVICE_INFO.ManufacturingWeek$VH.set(seg, x);
    }
    public static byte ManufacturingWeek$get(MemorySegment seg, long index) {
        return (byte)_SCM_PD_DEVICE_INFO.ManufacturingWeek$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ManufacturingWeek$set(MemorySegment seg, long index, byte x) {
        _SCM_PD_DEVICE_INFO.ManufacturingWeek$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ManufacturingYear$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ManufacturingYear"));
    public static VarHandle ManufacturingYear$VH() {
        return _SCM_PD_DEVICE_INFO.ManufacturingYear$VH;
    }
    public static byte ManufacturingYear$get(MemorySegment seg) {
        return (byte)_SCM_PD_DEVICE_INFO.ManufacturingYear$VH.get(seg);
    }
    public static void ManufacturingYear$set( MemorySegment seg, byte x) {
        _SCM_PD_DEVICE_INFO.ManufacturingYear$VH.set(seg, x);
    }
    public static byte ManufacturingYear$get(MemorySegment seg, long index) {
        return (byte)_SCM_PD_DEVICE_INFO.ManufacturingYear$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ManufacturingYear$set(MemorySegment seg, long index, byte x) {
        _SCM_PD_DEVICE_INFO.ManufacturingYear$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SerialNumber4Byte$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SerialNumber4Byte"));
    public static VarHandle SerialNumber4Byte$VH() {
        return _SCM_PD_DEVICE_INFO.SerialNumber4Byte$VH;
    }
    public static int SerialNumber4Byte$get(MemorySegment seg) {
        return (int)_SCM_PD_DEVICE_INFO.SerialNumber4Byte$VH.get(seg);
    }
    public static void SerialNumber4Byte$set( MemorySegment seg, int x) {
        _SCM_PD_DEVICE_INFO.SerialNumber4Byte$VH.set(seg, x);
    }
    public static int SerialNumber4Byte$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_DEVICE_INFO.SerialNumber4Byte$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SerialNumber4Byte$set(MemorySegment seg, long index, int x) {
        _SCM_PD_DEVICE_INFO.SerialNumber4Byte$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SerialNumberLengthInChars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SerialNumberLengthInChars"));
    public static VarHandle SerialNumberLengthInChars$VH() {
        return _SCM_PD_DEVICE_INFO.SerialNumberLengthInChars$VH;
    }
    public static int SerialNumberLengthInChars$get(MemorySegment seg) {
        return (int)_SCM_PD_DEVICE_INFO.SerialNumberLengthInChars$VH.get(seg);
    }
    public static void SerialNumberLengthInChars$set( MemorySegment seg, int x) {
        _SCM_PD_DEVICE_INFO.SerialNumberLengthInChars$VH.set(seg, x);
    }
    public static int SerialNumberLengthInChars$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_DEVICE_INFO.SerialNumberLengthInChars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SerialNumberLengthInChars$set(MemorySegment seg, long index, int x) {
        _SCM_PD_DEVICE_INFO.SerialNumberLengthInChars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SerialNumber$slice(MemorySegment seg) {
        return seg.asSlice(112, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


