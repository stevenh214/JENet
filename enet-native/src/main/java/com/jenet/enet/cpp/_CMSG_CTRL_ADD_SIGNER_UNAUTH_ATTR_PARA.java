// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwSignerIndex"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("blob")
    ).withName("_CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSignerIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSignerIndex"));
    public static VarHandle dwSignerIndex$VH() {
        return _CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA.dwSignerIndex$VH;
    }
    public static int dwSignerIndex$get(MemorySegment seg) {
        return (int)_CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA.dwSignerIndex$VH.get(seg);
    }
    public static void dwSignerIndex$set( MemorySegment seg, int x) {
        _CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA.dwSignerIndex$VH.set(seg, x);
    }
    public static int dwSignerIndex$get(MemorySegment seg, long index) {
        return (int)_CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA.dwSignerIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSignerIndex$set(MemorySegment seg, long index, int x) {
        _CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA.dwSignerIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment blob$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


