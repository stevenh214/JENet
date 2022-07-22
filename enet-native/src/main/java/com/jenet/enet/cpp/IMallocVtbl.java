// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IMallocVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Alloc"),
        Constants$root.C_POINTER$LAYOUT.withName("Realloc"),
        Constants$root.C_POINTER$LAYOUT.withName("Free"),
        Constants$root.C_POINTER$LAYOUT.withName("GetSize"),
        Constants$root.C_POINTER$LAYOUT.withName("DidAlloc"),
        Constants$root.C_POINTER$LAYOUT.withName("HeapMinimize")
    ).withName("IMallocVtbl");
    public static MemoryLayout $LAYOUT() {
        return IMallocVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IMallocVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IMallocVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IMallocVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IMallocVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IMallocVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IMallocVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IMallocVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IMallocVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IMallocVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IMallocVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IMallocVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IMallocVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IMallocVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IMallocVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IMallocVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor Alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Alloc$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.Alloc$FUNC
    );
    public interface Alloc {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, long _x1);
        static MemorySegment allocate(Alloc fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Alloc.class, fi, IMallocVtbl.Alloc$FUNC, session);
        }
        static Alloc ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, long __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)IMallocVtbl.Alloc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Alloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Alloc"));
    public static VarHandle Alloc$VH() {
        return IMallocVtbl.Alloc$VH;
    }
    public static MemoryAddress Alloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.Alloc$VH.get(seg);
    }
    public static void Alloc$set( MemorySegment seg, MemoryAddress x) {
        IMallocVtbl.Alloc$VH.set(seg, x);
    }
    public static MemoryAddress Alloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.Alloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Alloc$set(MemorySegment seg, long index, MemoryAddress x) {
        IMallocVtbl.Alloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Alloc Alloc (MemorySegment segment, MemorySession session) {
        return Alloc.ofAddress(Alloc$get(segment), session);
    }
    static final FunctionDescriptor Realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Realloc$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.Realloc$FUNC
    );
    public interface Realloc {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, long _x2);
        static MemorySegment allocate(Realloc fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Realloc.class, fi, IMallocVtbl.Realloc$FUNC, session);
        }
        static Realloc ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, long __x2) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)IMallocVtbl.Realloc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Realloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Realloc"));
    public static VarHandle Realloc$VH() {
        return IMallocVtbl.Realloc$VH;
    }
    public static MemoryAddress Realloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.Realloc$VH.get(seg);
    }
    public static void Realloc$set( MemorySegment seg, MemoryAddress x) {
        IMallocVtbl.Realloc$VH.set(seg, x);
    }
    public static MemoryAddress Realloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.Realloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Realloc$set(MemorySegment seg, long index, MemoryAddress x) {
        IMallocVtbl.Realloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Realloc Realloc (MemorySegment segment, MemorySession session) {
        return Realloc.ofAddress(Realloc$get(segment), session);
    }
    static final FunctionDescriptor Free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Free$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.Free$FUNC
    );
    public interface Free {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(Free fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Free.class, fi, IMallocVtbl.Free$FUNC, session);
        }
        static Free ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    IMallocVtbl.Free$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Free$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Free"));
    public static VarHandle Free$VH() {
        return IMallocVtbl.Free$VH;
    }
    public static MemoryAddress Free$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.Free$VH.get(seg);
    }
    public static void Free$set( MemorySegment seg, MemoryAddress x) {
        IMallocVtbl.Free$VH.set(seg, x);
    }
    public static MemoryAddress Free$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.Free$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Free$set(MemorySegment seg, long index, MemoryAddress x) {
        IMallocVtbl.Free$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Free Free (MemorySegment segment, MemorySession session) {
        return Free.ofAddress(Free$get(segment), session);
    }
    static final FunctionDescriptor GetSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSize$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.GetSize$FUNC
    );
    public interface GetSize {

        long apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetSize fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetSize.class, fi, IMallocVtbl.GetSize$FUNC, session);
        }
        static GetSize ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (long)IMallocVtbl.GetSize$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetSize"));
    public static VarHandle GetSize$VH() {
        return IMallocVtbl.GetSize$VH;
    }
    public static MemoryAddress GetSize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.GetSize$VH.get(seg);
    }
    public static void GetSize$set( MemorySegment seg, MemoryAddress x) {
        IMallocVtbl.GetSize$VH.set(seg, x);
    }
    public static MemoryAddress GetSize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.GetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetSize$set(MemorySegment seg, long index, MemoryAddress x) {
        IMallocVtbl.GetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetSize GetSize (MemorySegment segment, MemorySession session) {
        return GetSize.ofAddress(GetSize$get(segment), session);
    }
    static final FunctionDescriptor DidAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DidAlloc$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.DidAlloc$FUNC
    );
    public interface DidAlloc {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(DidAlloc fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DidAlloc.class, fi, IMallocVtbl.DidAlloc$FUNC, session);
        }
        static DidAlloc ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IMallocVtbl.DidAlloc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DidAlloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DidAlloc"));
    public static VarHandle DidAlloc$VH() {
        return IMallocVtbl.DidAlloc$VH;
    }
    public static MemoryAddress DidAlloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.DidAlloc$VH.get(seg);
    }
    public static void DidAlloc$set( MemorySegment seg, MemoryAddress x) {
        IMallocVtbl.DidAlloc$VH.set(seg, x);
    }
    public static MemoryAddress DidAlloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.DidAlloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DidAlloc$set(MemorySegment seg, long index, MemoryAddress x) {
        IMallocVtbl.DidAlloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DidAlloc DidAlloc (MemorySegment segment, MemorySession session) {
        return DidAlloc.ofAddress(DidAlloc$get(segment), session);
    }
    static final FunctionDescriptor HeapMinimize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapMinimize$MH = RuntimeHelper.downcallHandle(
        IMallocVtbl.HeapMinimize$FUNC
    );
    public interface HeapMinimize {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(HeapMinimize fi, MemorySession session) {
            return RuntimeHelper.upcallStub(HeapMinimize.class, fi, IMallocVtbl.HeapMinimize$FUNC, session);
        }
        static HeapMinimize ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    IMallocVtbl.HeapMinimize$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle HeapMinimize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HeapMinimize"));
    public static VarHandle HeapMinimize$VH() {
        return IMallocVtbl.HeapMinimize$VH;
    }
    public static MemoryAddress HeapMinimize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.HeapMinimize$VH.get(seg);
    }
    public static void HeapMinimize$set( MemorySegment seg, MemoryAddress x) {
        IMallocVtbl.HeapMinimize$VH.set(seg, x);
    }
    public static MemoryAddress HeapMinimize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMallocVtbl.HeapMinimize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HeapMinimize$set(MemorySegment seg, long index, MemoryAddress x) {
        IMallocVtbl.HeapMinimize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static HeapMinimize HeapMinimize (MemorySegment segment, MemorySession session) {
        return HeapMinimize.ofAddress(HeapMinimize$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


