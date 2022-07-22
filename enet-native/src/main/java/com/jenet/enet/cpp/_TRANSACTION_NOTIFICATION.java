// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TRANSACTION_NOTIFICATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("TransactionKey"),
        Constants$root.C_LONG$LAYOUT.withName("TransactionNotification"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("TmVirtualClock"),
        Constants$root.C_LONG$LAYOUT.withName("ArgumentLength"),
        MemoryLayout.paddingLayout(32)
    ).withName("_TRANSACTION_NOTIFICATION");
    public static MemoryLayout $LAYOUT() {
        return _TRANSACTION_NOTIFICATION.$struct$LAYOUT;
    }
    static final VarHandle TransactionKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransactionKey"));
    public static VarHandle TransactionKey$VH() {
        return _TRANSACTION_NOTIFICATION.TransactionKey$VH;
    }
    public static MemoryAddress TransactionKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_TRANSACTION_NOTIFICATION.TransactionKey$VH.get(seg);
    }
    public static void TransactionKey$set( MemorySegment seg, MemoryAddress x) {
        _TRANSACTION_NOTIFICATION.TransactionKey$VH.set(seg, x);
    }
    public static MemoryAddress TransactionKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_TRANSACTION_NOTIFICATION.TransactionKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransactionKey$set(MemorySegment seg, long index, MemoryAddress x) {
        _TRANSACTION_NOTIFICATION.TransactionKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TransactionNotification$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransactionNotification"));
    public static VarHandle TransactionNotification$VH() {
        return _TRANSACTION_NOTIFICATION.TransactionNotification$VH;
    }
    public static int TransactionNotification$get(MemorySegment seg) {
        return (int)_TRANSACTION_NOTIFICATION.TransactionNotification$VH.get(seg);
    }
    public static void TransactionNotification$set( MemorySegment seg, int x) {
        _TRANSACTION_NOTIFICATION.TransactionNotification$VH.set(seg, x);
    }
    public static int TransactionNotification$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_NOTIFICATION.TransactionNotification$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransactionNotification$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_NOTIFICATION.TransactionNotification$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment TmVirtualClock$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    static final VarHandle ArgumentLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ArgumentLength"));
    public static VarHandle ArgumentLength$VH() {
        return _TRANSACTION_NOTIFICATION.ArgumentLength$VH;
    }
    public static int ArgumentLength$get(MemorySegment seg) {
        return (int)_TRANSACTION_NOTIFICATION.ArgumentLength$VH.get(seg);
    }
    public static void ArgumentLength$set( MemorySegment seg, int x) {
        _TRANSACTION_NOTIFICATION.ArgumentLength$VH.set(seg, x);
    }
    public static int ArgumentLength$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_NOTIFICATION.ArgumentLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ArgumentLength$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_NOTIFICATION.ArgumentLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


