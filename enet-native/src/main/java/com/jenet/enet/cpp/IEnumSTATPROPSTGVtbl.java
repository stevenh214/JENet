// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IEnumSTATPROPSTGVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Next"),
        Constants$root.C_POINTER$LAYOUT.withName("Skip"),
        Constants$root.C_POINTER$LAYOUT.withName("Reset"),
        Constants$root.C_POINTER$LAYOUT.withName("Clone")
    ).withName("IEnumSTATPROPSTGVtbl");
    public static MemoryLayout $LAYOUT() {
        return IEnumSTATPROPSTGVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IEnumSTATPROPSTGVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IEnumSTATPROPSTGVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IEnumSTATPROPSTGVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IEnumSTATPROPSTGVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IEnumSTATPROPSTGVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IEnumSTATPROPSTGVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IEnumSTATPROPSTGVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IEnumSTATPROPSTGVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IEnumSTATPROPSTGVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IEnumSTATPROPSTGVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IEnumSTATPROPSTGVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IEnumSTATPROPSTGVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor Next$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Next$MH = RuntimeHelper.downcallHandle(
        IEnumSTATPROPSTGVtbl.Next$FUNC
    );
    public interface Next {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(Next fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Next.class, fi, IEnumSTATPROPSTGVtbl.Next$FUNC, session);
        }
        static Next ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IEnumSTATPROPSTGVtbl.Next$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Next"));
    public static VarHandle Next$VH() {
        return IEnumSTATPROPSTGVtbl.Next$VH;
    }
    public static MemoryAddress Next$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.Next$VH.get(seg);
    }
    public static void Next$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.Next$VH.set(seg, x);
    }
    public static MemoryAddress Next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.Next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Next$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.Next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Next Next (MemorySegment segment, MemorySession session) {
        return Next.ofAddress(Next$get(segment), session);
    }
    static final FunctionDescriptor Skip$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Skip$MH = RuntimeHelper.downcallHandle(
        IEnumSTATPROPSTGVtbl.Skip$FUNC
    );
    public interface Skip {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(Skip fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Skip.class, fi, IEnumSTATPROPSTGVtbl.Skip$FUNC, session);
        }
        static Skip ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IEnumSTATPROPSTGVtbl.Skip$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Skip$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Skip"));
    public static VarHandle Skip$VH() {
        return IEnumSTATPROPSTGVtbl.Skip$VH;
    }
    public static MemoryAddress Skip$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.Skip$VH.get(seg);
    }
    public static void Skip$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.Skip$VH.set(seg, x);
    }
    public static MemoryAddress Skip$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.Skip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Skip$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.Skip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Skip Skip (MemorySegment segment, MemorySession session) {
        return Skip.ofAddress(Skip$get(segment), session);
    }
    static final FunctionDescriptor Reset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Reset$MH = RuntimeHelper.downcallHandle(
        IEnumSTATPROPSTGVtbl.Reset$FUNC
    );
    public interface Reset {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Reset fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Reset.class, fi, IEnumSTATPROPSTGVtbl.Reset$FUNC, session);
        }
        static Reset ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IEnumSTATPROPSTGVtbl.Reset$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Reset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reset"));
    public static VarHandle Reset$VH() {
        return IEnumSTATPROPSTGVtbl.Reset$VH;
    }
    public static MemoryAddress Reset$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.Reset$VH.get(seg);
    }
    public static void Reset$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.Reset$VH.set(seg, x);
    }
    public static MemoryAddress Reset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.Reset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reset$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.Reset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Reset Reset (MemorySegment segment, MemorySession session) {
        return Reset.ofAddress(Reset$get(segment), session);
    }
    static final FunctionDescriptor Clone$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Clone$MH = RuntimeHelper.downcallHandle(
        IEnumSTATPROPSTGVtbl.Clone$FUNC
    );
    public interface Clone {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(Clone fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Clone.class, fi, IEnumSTATPROPSTGVtbl.Clone$FUNC, session);
        }
        static Clone ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IEnumSTATPROPSTGVtbl.Clone$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Clone$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Clone"));
    public static VarHandle Clone$VH() {
        return IEnumSTATPROPSTGVtbl.Clone$VH;
    }
    public static MemoryAddress Clone$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.Clone$VH.get(seg);
    }
    public static void Clone$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.Clone$VH.set(seg, x);
    }
    public static MemoryAddress Clone$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IEnumSTATPROPSTGVtbl.Clone$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Clone$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATPROPSTGVtbl.Clone$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Clone Clone (MemorySegment segment, MemorySession session) {
        return Clone.ofAddress(Clone$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


