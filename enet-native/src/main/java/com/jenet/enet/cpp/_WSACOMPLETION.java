// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _WSACOMPLETION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("hWnd"),
                Constants$root.C_LONG$LAYOUT.withName("uMsg"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_LONG_LONG$LAYOUT.withName("context")
            ).withName("WindowMessage"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped")
            ).withName("Event"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped"),
                Constants$root.C_POINTER$LAYOUT.withName("lpfnCompletionProc")
            ).withName("Apc"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped"),
                Constants$root.C_POINTER$LAYOUT.withName("hPort"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("Key")
            ).withName("Port")
        ).withName("Parameters")
    ).withName("_WSACOMPLETION");
    public static MemoryLayout $LAYOUT() {
        return _WSACOMPLETION.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _WSACOMPLETION.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)_WSACOMPLETION.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        _WSACOMPLETION.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_WSACOMPLETION.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _WSACOMPLETION.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class Parameters {

        static final  GroupLayout Parameters$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("hWnd"),
                Constants$root.C_LONG$LAYOUT.withName("uMsg"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_LONG_LONG$LAYOUT.withName("context")
            ).withName("WindowMessage"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped")
            ).withName("Event"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped"),
                Constants$root.C_POINTER$LAYOUT.withName("lpfnCompletionProc")
            ).withName("Apc"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped"),
                Constants$root.C_POINTER$LAYOUT.withName("hPort"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("Key")
            ).withName("Port")
        );
        public static MemoryLayout $LAYOUT() {
            return Parameters.Parameters$union$LAYOUT;
        }
        public static class WindowMessage {

            static final  GroupLayout Parameters$WindowMessage$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("hWnd"),
                Constants$root.C_LONG$LAYOUT.withName("uMsg"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_LONG_LONG$LAYOUT.withName("context")
            );
            public static MemoryLayout $LAYOUT() {
                return WindowMessage.Parameters$WindowMessage$struct$LAYOUT;
            }
            static final VarHandle hWnd$VH = Parameters$WindowMessage$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hWnd"));
            public static VarHandle hWnd$VH() {
                return WindowMessage.hWnd$VH;
            }
            public static MemoryAddress hWnd$get(MemorySegment seg) {
                return (java.lang.foreign.MemoryAddress)WindowMessage.hWnd$VH.get(seg);
            }
            public static void hWnd$set( MemorySegment seg, MemoryAddress x) {
                WindowMessage.hWnd$VH.set(seg, x);
            }
            public static MemoryAddress hWnd$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemoryAddress)WindowMessage.hWnd$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void hWnd$set(MemorySegment seg, long index, MemoryAddress x) {
                WindowMessage.hWnd$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle uMsg$VH = Parameters$WindowMessage$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uMsg"));
            public static VarHandle uMsg$VH() {
                return WindowMessage.uMsg$VH;
            }
            public static int uMsg$get(MemorySegment seg) {
                return (int)WindowMessage.uMsg$VH.get(seg);
            }
            public static void uMsg$set( MemorySegment seg, int x) {
                WindowMessage.uMsg$VH.set(seg, x);
            }
            public static int uMsg$get(MemorySegment seg, long index) {
                return (int)WindowMessage.uMsg$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void uMsg$set(MemorySegment seg, long index, int x) {
                WindowMessage.uMsg$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle context$VH = Parameters$WindowMessage$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("context"));
            public static VarHandle context$VH() {
                return WindowMessage.context$VH;
            }
            public static long context$get(MemorySegment seg) {
                return (long)WindowMessage.context$VH.get(seg);
            }
            public static void context$set( MemorySegment seg, long x) {
                WindowMessage.context$VH.set(seg, x);
            }
            public static long context$get(MemorySegment seg, long index) {
                return (long)WindowMessage.context$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void context$set(MemorySegment seg, long index, long x) {
                WindowMessage.context$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment WindowMessage$slice(MemorySegment seg) {
            return seg.asSlice(0, 24);
        }
        public static class Event {

            static final  GroupLayout Parameters$Event$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped")
            );
            public static MemoryLayout $LAYOUT() {
                return Event.Parameters$Event$struct$LAYOUT;
            }
            static final VarHandle lpOverlapped$VH = Parameters$Event$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpOverlapped"));
            public static VarHandle lpOverlapped$VH() {
                return Event.lpOverlapped$VH;
            }
            public static MemoryAddress lpOverlapped$get(MemorySegment seg) {
                return (java.lang.foreign.MemoryAddress)Event.lpOverlapped$VH.get(seg);
            }
            public static void lpOverlapped$set( MemorySegment seg, MemoryAddress x) {
                Event.lpOverlapped$VH.set(seg, x);
            }
            public static MemoryAddress lpOverlapped$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemoryAddress)Event.lpOverlapped$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void lpOverlapped$set(MemorySegment seg, long index, MemoryAddress x) {
                Event.lpOverlapped$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment Event$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        public static class Apc {

            static final  GroupLayout Parameters$Apc$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped"),
                Constants$root.C_POINTER$LAYOUT.withName("lpfnCompletionProc")
            );
            public static MemoryLayout $LAYOUT() {
                return Apc.Parameters$Apc$struct$LAYOUT;
            }
            static final VarHandle lpOverlapped$VH = Parameters$Apc$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpOverlapped"));
            public static VarHandle lpOverlapped$VH() {
                return Apc.lpOverlapped$VH;
            }
            public static MemoryAddress lpOverlapped$get(MemorySegment seg) {
                return (java.lang.foreign.MemoryAddress)Apc.lpOverlapped$VH.get(seg);
            }
            public static void lpOverlapped$set( MemorySegment seg, MemoryAddress x) {
                Apc.lpOverlapped$VH.set(seg, x);
            }
            public static MemoryAddress lpOverlapped$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemoryAddress)Apc.lpOverlapped$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void lpOverlapped$set(MemorySegment seg, long index, MemoryAddress x) {
                Apc.lpOverlapped$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle lpfnCompletionProc$VH = Parameters$Apc$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnCompletionProc"));
            public static VarHandle lpfnCompletionProc$VH() {
                return Apc.lpfnCompletionProc$VH;
            }
            public static MemoryAddress lpfnCompletionProc$get(MemorySegment seg) {
                return (java.lang.foreign.MemoryAddress)Apc.lpfnCompletionProc$VH.get(seg);
            }
            public static void lpfnCompletionProc$set( MemorySegment seg, MemoryAddress x) {
                Apc.lpfnCompletionProc$VH.set(seg, x);
            }
            public static MemoryAddress lpfnCompletionProc$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemoryAddress)Apc.lpfnCompletionProc$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void lpfnCompletionProc$set(MemorySegment seg, long index, MemoryAddress x) {
                Apc.lpfnCompletionProc$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static LPWSAOVERLAPPED_COMPLETION_ROUTINE lpfnCompletionProc (MemorySegment segment, MemorySession session) {
                return LPWSAOVERLAPPED_COMPLETION_ROUTINE.ofAddress(lpfnCompletionProc$get(segment), session);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment Apc$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static class Port {

            static final  GroupLayout Parameters$Port$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped"),
                Constants$root.C_POINTER$LAYOUT.withName("hPort"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("Key")
            );
            public static MemoryLayout $LAYOUT() {
                return Port.Parameters$Port$struct$LAYOUT;
            }
            static final VarHandle lpOverlapped$VH = Parameters$Port$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpOverlapped"));
            public static VarHandle lpOverlapped$VH() {
                return Port.lpOverlapped$VH;
            }
            public static MemoryAddress lpOverlapped$get(MemorySegment seg) {
                return (java.lang.foreign.MemoryAddress)Port.lpOverlapped$VH.get(seg);
            }
            public static void lpOverlapped$set( MemorySegment seg, MemoryAddress x) {
                Port.lpOverlapped$VH.set(seg, x);
            }
            public static MemoryAddress lpOverlapped$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemoryAddress)Port.lpOverlapped$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void lpOverlapped$set(MemorySegment seg, long index, MemoryAddress x) {
                Port.lpOverlapped$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle hPort$VH = Parameters$Port$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hPort"));
            public static VarHandle hPort$VH() {
                return Port.hPort$VH;
            }
            public static MemoryAddress hPort$get(MemorySegment seg) {
                return (java.lang.foreign.MemoryAddress)Port.hPort$VH.get(seg);
            }
            public static void hPort$set( MemorySegment seg, MemoryAddress x) {
                Port.hPort$VH.set(seg, x);
            }
            public static MemoryAddress hPort$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemoryAddress)Port.hPort$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void hPort$set(MemorySegment seg, long index, MemoryAddress x) {
                Port.hPort$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Key$VH = Parameters$Port$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Key"));
            public static VarHandle Key$VH() {
                return Port.Key$VH;
            }
            public static long Key$get(MemorySegment seg) {
                return (long)Port.Key$VH.get(seg);
            }
            public static void Key$set( MemorySegment seg, long x) {
                Port.Key$VH.set(seg, x);
            }
            public static long Key$get(MemorySegment seg, long index) {
                return (long)Port.Key$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Key$set(MemorySegment seg, long index, long x) {
                Port.Key$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment Port$slice(MemorySegment seg) {
            return seg.asSlice(0, 24);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Parameters$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


