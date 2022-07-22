// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IPersistMonikerVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetClassID"),
        Constants$root.C_POINTER$LAYOUT.withName("IsDirty"),
        Constants$root.C_POINTER$LAYOUT.withName("Load"),
        Constants$root.C_POINTER$LAYOUT.withName("Save"),
        Constants$root.C_POINTER$LAYOUT.withName("SaveCompleted"),
        Constants$root.C_POINTER$LAYOUT.withName("GetCurMoniker")
    ).withName("IPersistMonikerVtbl");
    public static MemoryLayout $LAYOUT() {
        return IPersistMonikerVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IPersistMonikerVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IPersistMonikerVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IPersistMonikerVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IPersistMonikerVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IPersistMonikerVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistMonikerVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IPersistMonikerVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IPersistMonikerVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPersistMonikerVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IPersistMonikerVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IPersistMonikerVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistMonikerVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IPersistMonikerVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IPersistMonikerVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPersistMonikerVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IPersistMonikerVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IPersistMonikerVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistMonikerVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetClassID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassID$MH = RuntimeHelper.downcallHandle(
        IPersistMonikerVtbl.GetClassID$FUNC
    );
    public interface GetClassID {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetClassID fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetClassID.class, fi, IPersistMonikerVtbl.GetClassID$FUNC, session);
        }
        static GetClassID ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IPersistMonikerVtbl.GetClassID$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetClassID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetClassID"));
    public static VarHandle GetClassID$VH() {
        return IPersistMonikerVtbl.GetClassID$VH;
    }
    public static MemoryAddress GetClassID$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.GetClassID$VH.get(seg);
    }
    public static void GetClassID$set( MemorySegment seg, MemoryAddress x) {
        IPersistMonikerVtbl.GetClassID$VH.set(seg, x);
    }
    public static MemoryAddress GetClassID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.GetClassID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetClassID$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistMonikerVtbl.GetClassID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetClassID GetClassID (MemorySegment segment, MemorySession session) {
        return GetClassID.ofAddress(GetClassID$get(segment), session);
    }
    static final FunctionDescriptor IsDirty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsDirty$MH = RuntimeHelper.downcallHandle(
        IPersistMonikerVtbl.IsDirty$FUNC
    );
    public interface IsDirty {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(IsDirty fi, MemorySession session) {
            return RuntimeHelper.upcallStub(IsDirty.class, fi, IPersistMonikerVtbl.IsDirty$FUNC, session);
        }
        static IsDirty ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPersistMonikerVtbl.IsDirty$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsDirty$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsDirty"));
    public static VarHandle IsDirty$VH() {
        return IPersistMonikerVtbl.IsDirty$VH;
    }
    public static MemoryAddress IsDirty$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.IsDirty$VH.get(seg);
    }
    public static void IsDirty$set( MemorySegment seg, MemoryAddress x) {
        IPersistMonikerVtbl.IsDirty$VH.set(seg, x);
    }
    public static MemoryAddress IsDirty$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.IsDirty$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsDirty$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistMonikerVtbl.IsDirty$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsDirty IsDirty (MemorySegment segment, MemorySession session) {
        return IsDirty.ofAddress(IsDirty$get(segment), session);
    }
    static final FunctionDescriptor Load$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Load$MH = RuntimeHelper.downcallHandle(
        IPersistMonikerVtbl.Load$FUNC
    );
    public interface Load {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, int _x4);
        static MemorySegment allocate(Load fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Load.class, fi, IPersistMonikerVtbl.Load$FUNC, session);
        }
        static Load ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, int __x4) -> {
                try {
                    return (int)IPersistMonikerVtbl.Load$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Load$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Load"));
    public static VarHandle Load$VH() {
        return IPersistMonikerVtbl.Load$VH;
    }
    public static MemoryAddress Load$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.Load$VH.get(seg);
    }
    public static void Load$set( MemorySegment seg, MemoryAddress x) {
        IPersistMonikerVtbl.Load$VH.set(seg, x);
    }
    public static MemoryAddress Load$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.Load$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Load$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistMonikerVtbl.Load$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Load Load (MemorySegment segment, MemorySession session) {
        return Load.ofAddress(Load$get(segment), session);
    }
    static final FunctionDescriptor Save$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Save$MH = RuntimeHelper.downcallHandle(
        IPersistMonikerVtbl.Save$FUNC
    );
    public interface Save {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3);
        static MemorySegment allocate(Save fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Save.class, fi, IPersistMonikerVtbl.Save$FUNC, session);
        }
        static Save ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3) -> {
                try {
                    return (int)IPersistMonikerVtbl.Save$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Save$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Save"));
    public static VarHandle Save$VH() {
        return IPersistMonikerVtbl.Save$VH;
    }
    public static MemoryAddress Save$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.Save$VH.get(seg);
    }
    public static void Save$set( MemorySegment seg, MemoryAddress x) {
        IPersistMonikerVtbl.Save$VH.set(seg, x);
    }
    public static MemoryAddress Save$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.Save$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Save$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistMonikerVtbl.Save$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Save Save (MemorySegment segment, MemorySession session) {
        return Save.ofAddress(Save$get(segment), session);
    }
    static final FunctionDescriptor SaveCompleted$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SaveCompleted$MH = RuntimeHelper.downcallHandle(
        IPersistMonikerVtbl.SaveCompleted$FUNC
    );
    public interface SaveCompleted {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(SaveCompleted fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SaveCompleted.class, fi, IPersistMonikerVtbl.SaveCompleted$FUNC, session);
        }
        static SaveCompleted ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IPersistMonikerVtbl.SaveCompleted$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SaveCompleted$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SaveCompleted"));
    public static VarHandle SaveCompleted$VH() {
        return IPersistMonikerVtbl.SaveCompleted$VH;
    }
    public static MemoryAddress SaveCompleted$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.SaveCompleted$VH.get(seg);
    }
    public static void SaveCompleted$set( MemorySegment seg, MemoryAddress x) {
        IPersistMonikerVtbl.SaveCompleted$VH.set(seg, x);
    }
    public static MemoryAddress SaveCompleted$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.SaveCompleted$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SaveCompleted$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistMonikerVtbl.SaveCompleted$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SaveCompleted SaveCompleted (MemorySegment segment, MemorySession session) {
        return SaveCompleted.ofAddress(SaveCompleted$get(segment), session);
    }
    static final FunctionDescriptor GetCurMoniker$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurMoniker$MH = RuntimeHelper.downcallHandle(
        IPersistMonikerVtbl.GetCurMoniker$FUNC
    );
    public interface GetCurMoniker {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetCurMoniker fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetCurMoniker.class, fi, IPersistMonikerVtbl.GetCurMoniker$FUNC, session);
        }
        static GetCurMoniker ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IPersistMonikerVtbl.GetCurMoniker$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCurMoniker$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetCurMoniker"));
    public static VarHandle GetCurMoniker$VH() {
        return IPersistMonikerVtbl.GetCurMoniker$VH;
    }
    public static MemoryAddress GetCurMoniker$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.GetCurMoniker$VH.get(seg);
    }
    public static void GetCurMoniker$set( MemorySegment seg, MemoryAddress x) {
        IPersistMonikerVtbl.GetCurMoniker$VH.set(seg, x);
    }
    public static MemoryAddress GetCurMoniker$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistMonikerVtbl.GetCurMoniker$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurMoniker$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistMonikerVtbl.GetCurMoniker$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurMoniker GetCurMoniker (MemorySegment segment, MemorySession session) {
        return GetCurMoniker.ofAddress(GetCurMoniker$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


