// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RPC_ASYNC_NOTIFICATION_INFO {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("NotificationRoutine"),
            Constants$root.C_POINTER$LAYOUT.withName("hThread")
        ).withName("APC"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("hIOPort"),
            Constants$root.C_LONG$LAYOUT.withName("dwNumberOfBytesTransferred"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("dwCompletionKey"),
            Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped")
        ).withName("IOC"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("hWnd"),
            Constants$root.C_LONG$LAYOUT.withName("Msg"),
            MemoryLayout.paddingLayout(32)
        ).withName("HWND"),
        Constants$root.C_POINTER$LAYOUT.withName("hEvent"),
        Constants$root.C_POINTER$LAYOUT.withName("NotificationRoutine")
    ).withName("_RPC_ASYNC_NOTIFICATION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _RPC_ASYNC_NOTIFICATION_INFO.$union$LAYOUT;
    }
    public static class APC {

        static final  GroupLayout APC$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("NotificationRoutine"),
            Constants$root.C_POINTER$LAYOUT.withName("hThread")
        );
        public static MemoryLayout $LAYOUT() {
            return APC.APC$struct$LAYOUT;
        }
        static final VarHandle NotificationRoutine$VH = APC$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NotificationRoutine"));
        public static VarHandle NotificationRoutine$VH() {
            return APC.NotificationRoutine$VH;
        }
        public static MemoryAddress NotificationRoutine$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)APC.NotificationRoutine$VH.get(seg);
        }
        public static void NotificationRoutine$set( MemorySegment seg, MemoryAddress x) {
            APC.NotificationRoutine$VH.set(seg, x);
        }
        public static MemoryAddress NotificationRoutine$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)APC.NotificationRoutine$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void NotificationRoutine$set(MemorySegment seg, long index, MemoryAddress x) {
            APC.NotificationRoutine$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static PFN_RPCNOTIFICATION_ROUTINE NotificationRoutine (MemorySegment segment, MemorySession session) {
            return PFN_RPCNOTIFICATION_ROUTINE.ofAddress(NotificationRoutine$get(segment), session);
        }
        static final VarHandle hThread$VH = APC$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hThread"));
        public static VarHandle hThread$VH() {
            return APC.hThread$VH;
        }
        public static MemoryAddress hThread$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)APC.hThread$VH.get(seg);
        }
        public static void hThread$set( MemorySegment seg, MemoryAddress x) {
            APC.hThread$VH.set(seg, x);
        }
        public static MemoryAddress hThread$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)APC.hThread$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hThread$set(MemorySegment seg, long index, MemoryAddress x) {
            APC.hThread$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment APC$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static class IOC {

        static final  GroupLayout IOC$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("hIOPort"),
            Constants$root.C_LONG$LAYOUT.withName("dwNumberOfBytesTransferred"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("dwCompletionKey"),
            Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped")
        );
        public static MemoryLayout $LAYOUT() {
            return IOC.IOC$struct$LAYOUT;
        }
        static final VarHandle hIOPort$VH = IOC$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hIOPort"));
        public static VarHandle hIOPort$VH() {
            return IOC.hIOPort$VH;
        }
        public static MemoryAddress hIOPort$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)IOC.hIOPort$VH.get(seg);
        }
        public static void hIOPort$set( MemorySegment seg, MemoryAddress x) {
            IOC.hIOPort$VH.set(seg, x);
        }
        public static MemoryAddress hIOPort$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)IOC.hIOPort$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hIOPort$set(MemorySegment seg, long index, MemoryAddress x) {
            IOC.hIOPort$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle dwNumberOfBytesTransferred$VH = IOC$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNumberOfBytesTransferred"));
        public static VarHandle dwNumberOfBytesTransferred$VH() {
            return IOC.dwNumberOfBytesTransferred$VH;
        }
        public static int dwNumberOfBytesTransferred$get(MemorySegment seg) {
            return (int)IOC.dwNumberOfBytesTransferred$VH.get(seg);
        }
        public static void dwNumberOfBytesTransferred$set( MemorySegment seg, int x) {
            IOC.dwNumberOfBytesTransferred$VH.set(seg, x);
        }
        public static int dwNumberOfBytesTransferred$get(MemorySegment seg, long index) {
            return (int)IOC.dwNumberOfBytesTransferred$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void dwNumberOfBytesTransferred$set(MemorySegment seg, long index, int x) {
            IOC.dwNumberOfBytesTransferred$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle dwCompletionKey$VH = IOC$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCompletionKey"));
        public static VarHandle dwCompletionKey$VH() {
            return IOC.dwCompletionKey$VH;
        }
        public static long dwCompletionKey$get(MemorySegment seg) {
            return (long)IOC.dwCompletionKey$VH.get(seg);
        }
        public static void dwCompletionKey$set( MemorySegment seg, long x) {
            IOC.dwCompletionKey$VH.set(seg, x);
        }
        public static long dwCompletionKey$get(MemorySegment seg, long index) {
            return (long)IOC.dwCompletionKey$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void dwCompletionKey$set(MemorySegment seg, long index, long x) {
            IOC.dwCompletionKey$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle lpOverlapped$VH = IOC$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpOverlapped"));
        public static VarHandle lpOverlapped$VH() {
            return IOC.lpOverlapped$VH;
        }
        public static MemoryAddress lpOverlapped$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)IOC.lpOverlapped$VH.get(seg);
        }
        public static void lpOverlapped$set( MemorySegment seg, MemoryAddress x) {
            IOC.lpOverlapped$VH.set(seg, x);
        }
        public static MemoryAddress lpOverlapped$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)IOC.lpOverlapped$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void lpOverlapped$set(MemorySegment seg, long index, MemoryAddress x) {
            IOC.lpOverlapped$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment IOC$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static class HWND {

        static final  GroupLayout HWND$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("hWnd"),
            Constants$root.C_LONG$LAYOUT.withName("Msg"),
            MemoryLayout.paddingLayout(32)
        );
        public static MemoryLayout $LAYOUT() {
            return HWND.HWND$struct$LAYOUT;
        }
        static final VarHandle hWnd$VH = HWND$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hWnd"));
        public static VarHandle hWnd$VH() {
            return HWND.hWnd$VH;
        }
        public static MemoryAddress hWnd$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)HWND.hWnd$VH.get(seg);
        }
        public static void hWnd$set( MemorySegment seg, MemoryAddress x) {
            HWND.hWnd$VH.set(seg, x);
        }
        public static MemoryAddress hWnd$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)HWND.hWnd$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hWnd$set(MemorySegment seg, long index, MemoryAddress x) {
            HWND.hWnd$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle Msg$VH = HWND$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Msg"));
        public static VarHandle Msg$VH() {
            return HWND.Msg$VH;
        }
        public static int Msg$get(MemorySegment seg) {
            return (int)HWND.Msg$VH.get(seg);
        }
        public static void Msg$set( MemorySegment seg, int x) {
            HWND.Msg$VH.set(seg, x);
        }
        public static int Msg$get(MemorySegment seg, long index) {
            return (int)HWND.Msg$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Msg$set(MemorySegment seg, long index, int x) {
            HWND.Msg$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment HWND$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle hEvent$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hEvent"));
    public static VarHandle hEvent$VH() {
        return _RPC_ASYNC_NOTIFICATION_INFO.hEvent$VH;
    }
    public static MemoryAddress hEvent$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_ASYNC_NOTIFICATION_INFO.hEvent$VH.get(seg);
    }
    public static void hEvent$set( MemorySegment seg, MemoryAddress x) {
        _RPC_ASYNC_NOTIFICATION_INFO.hEvent$VH.set(seg, x);
    }
    public static MemoryAddress hEvent$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_ASYNC_NOTIFICATION_INFO.hEvent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hEvent$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_ASYNC_NOTIFICATION_INFO.hEvent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NotificationRoutine$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NotificationRoutine"));
    public static VarHandle NotificationRoutine$VH() {
        return _RPC_ASYNC_NOTIFICATION_INFO.NotificationRoutine$VH;
    }
    public static MemoryAddress NotificationRoutine$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_ASYNC_NOTIFICATION_INFO.NotificationRoutine$VH.get(seg);
    }
    public static void NotificationRoutine$set( MemorySegment seg, MemoryAddress x) {
        _RPC_ASYNC_NOTIFICATION_INFO.NotificationRoutine$VH.set(seg, x);
    }
    public static MemoryAddress NotificationRoutine$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_ASYNC_NOTIFICATION_INFO.NotificationRoutine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NotificationRoutine$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_ASYNC_NOTIFICATION_INFO.NotificationRoutine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_RPCNOTIFICATION_ROUTINE NotificationRoutine (MemorySegment segment, MemorySession session) {
        return PFN_RPCNOTIFICATION_ROUTINE.ofAddress(NotificationRoutine$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


