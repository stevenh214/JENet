// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IDropTargetVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("DragEnter"),
        Constants$root.C_POINTER$LAYOUT.withName("DragOver"),
        Constants$root.C_POINTER$LAYOUT.withName("DragLeave"),
        Constants$root.C_POINTER$LAYOUT.withName("Drop")
    ).withName("IDropTargetVtbl");
    public static MemoryLayout $LAYOUT() {
        return IDropTargetVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IDropTargetVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IDropTargetVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IDropTargetVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IDropTargetVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IDropTargetVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IDropTargetVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IDropTargetVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IDropTargetVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IDropTargetVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IDropTargetVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IDropTargetVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IDropTargetVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IDropTargetVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IDropTargetVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IDropTargetVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IDropTargetVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IDropTargetVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IDropTargetVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor DragEnter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("_POINTL"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DragEnter$MH = RuntimeHelper.downcallHandle(
        IDropTargetVtbl.DragEnter$FUNC
    );
    public interface DragEnter {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(DragEnter fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DragEnter.class, fi, IDropTargetVtbl.DragEnter$FUNC, session);
        }
        static DragEnter ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IDropTargetVtbl.DragEnter$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, __x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DragEnter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DragEnter"));
    public static VarHandle DragEnter$VH() {
        return IDropTargetVtbl.DragEnter$VH;
    }
    public static MemoryAddress DragEnter$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.DragEnter$VH.get(seg);
    }
    public static void DragEnter$set( MemorySegment seg, MemoryAddress x) {
        IDropTargetVtbl.DragEnter$VH.set(seg, x);
    }
    public static MemoryAddress DragEnter$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.DragEnter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DragEnter$set(MemorySegment seg, long index, MemoryAddress x) {
        IDropTargetVtbl.DragEnter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DragEnter DragEnter (MemorySegment segment, MemorySession session) {
        return DragEnter.ofAddress(DragEnter$get(segment), session);
    }
    static final FunctionDescriptor DragOver$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("_POINTL"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DragOver$MH = RuntimeHelper.downcallHandle(
        IDropTargetVtbl.DragOver$FUNC
    );
    public interface DragOver {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(DragOver fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DragOver.class, fi, IDropTargetVtbl.DragOver$FUNC, session);
        }
        static DragOver ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IDropTargetVtbl.DragOver$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DragOver$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DragOver"));
    public static VarHandle DragOver$VH() {
        return IDropTargetVtbl.DragOver$VH;
    }
    public static MemoryAddress DragOver$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.DragOver$VH.get(seg);
    }
    public static void DragOver$set( MemorySegment seg, MemoryAddress x) {
        IDropTargetVtbl.DragOver$VH.set(seg, x);
    }
    public static MemoryAddress DragOver$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.DragOver$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DragOver$set(MemorySegment seg, long index, MemoryAddress x) {
        IDropTargetVtbl.DragOver$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DragOver DragOver (MemorySegment segment, MemorySession session) {
        return DragOver.ofAddress(DragOver$get(segment), session);
    }
    static final FunctionDescriptor DragLeave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DragLeave$MH = RuntimeHelper.downcallHandle(
        IDropTargetVtbl.DragLeave$FUNC
    );
    public interface DragLeave {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(DragLeave fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DragLeave.class, fi, IDropTargetVtbl.DragLeave$FUNC, session);
        }
        static DragLeave ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IDropTargetVtbl.DragLeave$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DragLeave$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DragLeave"));
    public static VarHandle DragLeave$VH() {
        return IDropTargetVtbl.DragLeave$VH;
    }
    public static MemoryAddress DragLeave$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.DragLeave$VH.get(seg);
    }
    public static void DragLeave$set( MemorySegment seg, MemoryAddress x) {
        IDropTargetVtbl.DragLeave$VH.set(seg, x);
    }
    public static MemoryAddress DragLeave$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.DragLeave$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DragLeave$set(MemorySegment seg, long index, MemoryAddress x) {
        IDropTargetVtbl.DragLeave$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DragLeave DragLeave (MemorySegment segment, MemorySession session) {
        return DragLeave.ofAddress(DragLeave$get(segment), session);
    }
    static final FunctionDescriptor Drop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("_POINTL"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Drop$MH = RuntimeHelper.downcallHandle(
        IDropTargetVtbl.Drop$FUNC
    );
    public interface Drop {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(Drop fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Drop.class, fi, IDropTargetVtbl.Drop$FUNC, session);
        }
        static Drop ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IDropTargetVtbl.Drop$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, __x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Drop$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Drop"));
    public static VarHandle Drop$VH() {
        return IDropTargetVtbl.Drop$VH;
    }
    public static MemoryAddress Drop$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.Drop$VH.get(seg);
    }
    public static void Drop$set( MemorySegment seg, MemoryAddress x) {
        IDropTargetVtbl.Drop$VH.set(seg, x);
    }
    public static MemoryAddress Drop$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDropTargetVtbl.Drop$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Drop$set(MemorySegment seg, long index, MemoryAddress x) {
        IDropTargetVtbl.Drop$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Drop Drop (MemorySegment segment, MemorySession session) {
        return Drop.ofAddress(Drop$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


