// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_HOTPLUG_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_CHAR$LAYOUT.withName("MediaRemovable"),
        Constants$root.C_CHAR$LAYOUT.withName("MediaHotplug"),
        Constants$root.C_CHAR$LAYOUT.withName("DeviceHotplug"),
        Constants$root.C_CHAR$LAYOUT.withName("WriteCacheEnableOverride")
    ).withName("_STORAGE_HOTPLUG_INFO");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_HOTPLUG_INFO.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_HOTPLUG_INFO.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_HOTPLUG_INFO.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_HOTPLUG_INFO.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HOTPLUG_INFO.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_HOTPLUG_INFO.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MediaRemovable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediaRemovable"));
    public static VarHandle MediaRemovable$VH() {
        return _STORAGE_HOTPLUG_INFO.MediaRemovable$VH;
    }
    public static byte MediaRemovable$get(MemorySegment seg) {
        return (byte)_STORAGE_HOTPLUG_INFO.MediaRemovable$VH.get(seg);
    }
    public static void MediaRemovable$set( MemorySegment seg, byte x) {
        _STORAGE_HOTPLUG_INFO.MediaRemovable$VH.set(seg, x);
    }
    public static byte MediaRemovable$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_HOTPLUG_INFO.MediaRemovable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MediaRemovable$set(MemorySegment seg, long index, byte x) {
        _STORAGE_HOTPLUG_INFO.MediaRemovable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MediaHotplug$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediaHotplug"));
    public static VarHandle MediaHotplug$VH() {
        return _STORAGE_HOTPLUG_INFO.MediaHotplug$VH;
    }
    public static byte MediaHotplug$get(MemorySegment seg) {
        return (byte)_STORAGE_HOTPLUG_INFO.MediaHotplug$VH.get(seg);
    }
    public static void MediaHotplug$set( MemorySegment seg, byte x) {
        _STORAGE_HOTPLUG_INFO.MediaHotplug$VH.set(seg, x);
    }
    public static byte MediaHotplug$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_HOTPLUG_INFO.MediaHotplug$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MediaHotplug$set(MemorySegment seg, long index, byte x) {
        _STORAGE_HOTPLUG_INFO.MediaHotplug$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceHotplug$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceHotplug"));
    public static VarHandle DeviceHotplug$VH() {
        return _STORAGE_HOTPLUG_INFO.DeviceHotplug$VH;
    }
    public static byte DeviceHotplug$get(MemorySegment seg) {
        return (byte)_STORAGE_HOTPLUG_INFO.DeviceHotplug$VH.get(seg);
    }
    public static void DeviceHotplug$set( MemorySegment seg, byte x) {
        _STORAGE_HOTPLUG_INFO.DeviceHotplug$VH.set(seg, x);
    }
    public static byte DeviceHotplug$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_HOTPLUG_INFO.DeviceHotplug$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceHotplug$set(MemorySegment seg, long index, byte x) {
        _STORAGE_HOTPLUG_INFO.DeviceHotplug$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WriteCacheEnableOverride$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WriteCacheEnableOverride"));
    public static VarHandle WriteCacheEnableOverride$VH() {
        return _STORAGE_HOTPLUG_INFO.WriteCacheEnableOverride$VH;
    }
    public static byte WriteCacheEnableOverride$get(MemorySegment seg) {
        return (byte)_STORAGE_HOTPLUG_INFO.WriteCacheEnableOverride$VH.get(seg);
    }
    public static void WriteCacheEnableOverride$set( MemorySegment seg, byte x) {
        _STORAGE_HOTPLUG_INFO.WriteCacheEnableOverride$VH.set(seg, x);
    }
    public static byte WriteCacheEnableOverride$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_HOTPLUG_INFO.WriteCacheEnableOverride$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WriteCacheEnableOverride$set(MemorySegment seg, long index, byte x) {
        _STORAGE_HOTPLUG_INFO.WriteCacheEnableOverride$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


