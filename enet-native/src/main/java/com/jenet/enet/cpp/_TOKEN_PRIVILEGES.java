// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TOKEN_PRIVILEGES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("PrivilegeCount"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("Luid"),
            Constants$root.C_LONG$LAYOUT.withName("Attributes")
        ).withName("_LUID_AND_ATTRIBUTES")).withName("Privileges")
    ).withName("_TOKEN_PRIVILEGES");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_PRIVILEGES.$struct$LAYOUT;
    }
    static final VarHandle PrivilegeCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PrivilegeCount"));
    public static VarHandle PrivilegeCount$VH() {
        return _TOKEN_PRIVILEGES.PrivilegeCount$VH;
    }
    public static int PrivilegeCount$get(MemorySegment seg) {
        return (int)_TOKEN_PRIVILEGES.PrivilegeCount$VH.get(seg);
    }
    public static void PrivilegeCount$set( MemorySegment seg, int x) {
        _TOKEN_PRIVILEGES.PrivilegeCount$VH.set(seg, x);
    }
    public static int PrivilegeCount$get(MemorySegment seg, long index) {
        return (int)_TOKEN_PRIVILEGES.PrivilegeCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrivilegeCount$set(MemorySegment seg, long index, int x) {
        _TOKEN_PRIVILEGES.PrivilegeCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Privileges$slice(MemorySegment seg) {
        return seg.asSlice(4, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


