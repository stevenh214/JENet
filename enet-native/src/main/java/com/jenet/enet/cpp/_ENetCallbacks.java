// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ENetCallbacks {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("malloc"),
        Constants$root.C_POINTER$LAYOUT.withName("free"),
        Constants$root.C_POINTER$LAYOUT.withName("no_memory")
    ).withName("_ENetCallbacks");
    public static MemoryLayout $LAYOUT() {
        return _ENetCallbacks.$struct$LAYOUT;
    }
    static final FunctionDescriptor malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle malloc$MH = RuntimeHelper.downcallHandle(
        _ENetCallbacks.malloc$FUNC
    );
    public interface malloc {

        java.lang.foreign.Addressable apply(long _x0);
        static MemorySegment allocate(malloc fi, MemorySession session) {
            return RuntimeHelper.upcallStub(malloc.class, fi, _ENetCallbacks.malloc$FUNC, session);
        }
        static malloc ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (long __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_ENetCallbacks.malloc$MH.invokeExact((Addressable)symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle malloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("malloc"));
    public static VarHandle malloc$VH() {
        return _ENetCallbacks.malloc$VH;
    }
    public static MemoryAddress malloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ENetCallbacks.malloc$VH.get(seg);
    }
    public static void malloc$set( MemorySegment seg, MemoryAddress x) {
        _ENetCallbacks.malloc$VH.set(seg, x);
    }
    public static MemoryAddress malloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ENetCallbacks.malloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void malloc$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENetCallbacks.malloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static malloc malloc (MemorySegment segment, MemorySession session) {
        return malloc.ofAddress(malloc$get(segment), session);
    }
    static final FunctionDescriptor free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle free$MH = RuntimeHelper.downcallHandle(
        _ENetCallbacks.free$FUNC
    );
    public interface free {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(free fi, MemorySession session) {
            return RuntimeHelper.upcallStub(free.class, fi, _ENetCallbacks.free$FUNC, session);
        }
        static free ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _ENetCallbacks.free$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle free$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("free"));
    public static VarHandle free$VH() {
        return _ENetCallbacks.free$VH;
    }
    public static MemoryAddress free$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ENetCallbacks.free$VH.get(seg);
    }
    public static void free$set( MemorySegment seg, MemoryAddress x) {
        _ENetCallbacks.free$VH.set(seg, x);
    }
    public static MemoryAddress free$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ENetCallbacks.free$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void free$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENetCallbacks.free$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static free free (MemorySegment segment, MemorySession session) {
        return free.ofAddress(free$get(segment), session);
    }
    static final FunctionDescriptor no_memory$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle no_memory$MH = RuntimeHelper.downcallHandle(
        _ENetCallbacks.no_memory$FUNC
    );
    public interface no_memory {

        void apply();
        static MemorySegment allocate(no_memory fi, MemorySession session) {
            return RuntimeHelper.upcallStub(no_memory.class, fi, _ENetCallbacks.no_memory$FUNC, session);
        }
        static no_memory ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _ENetCallbacks.no_memory$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle no_memory$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("no_memory"));
    public static VarHandle no_memory$VH() {
        return _ENetCallbacks.no_memory$VH;
    }
    public static MemoryAddress no_memory$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ENetCallbacks.no_memory$VH.get(seg);
    }
    public static void no_memory$set( MemorySegment seg, MemoryAddress x) {
        _ENetCallbacks.no_memory$VH.set(seg, x);
    }
    public static MemoryAddress no_memory$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ENetCallbacks.no_memory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void no_memory$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENetCallbacks.no_memory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static no_memory no_memory (MemorySegment segment, MemorySession session) {
        return no_memory.ofAddress(no_memory$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

