// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IDataObjectVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetData"),
        Constants$root.C_POINTER$LAYOUT.withName("GetDataHere"),
        Constants$root.C_POINTER$LAYOUT.withName("QueryGetData"),
        Constants$root.C_POINTER$LAYOUT.withName("GetCanonicalFormatEtc"),
        Constants$root.C_POINTER$LAYOUT.withName("SetData"),
        Constants$root.C_POINTER$LAYOUT.withName("EnumFormatEtc"),
        Constants$root.C_POINTER$LAYOUT.withName("DAdvise"),
        Constants$root.C_POINTER$LAYOUT.withName("DUnadvise"),
        Constants$root.C_POINTER$LAYOUT.withName("EnumDAdvise")
    ).withName("IDataObjectVtbl");
    public static MemoryLayout $LAYOUT() {
        return IDataObjectVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IDataObjectVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IDataObjectVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IDataObjectVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IDataObjectVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IDataObjectVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IDataObjectVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IDataObjectVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IDataObjectVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IDataObjectVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetData$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.GetData$FUNC
    );
    public interface GetData {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(GetData fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetData.class, fi, IDataObjectVtbl.GetData$FUNC, session);
        }
        static GetData ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IDataObjectVtbl.GetData$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetData"));
    public static VarHandle GetData$VH() {
        return IDataObjectVtbl.GetData$VH;
    }
    public static MemoryAddress GetData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.GetData$VH.get(seg);
    }
    public static void GetData$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.GetData$VH.set(seg, x);
    }
    public static MemoryAddress GetData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.GetData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetData$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.GetData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetData GetData (MemorySegment segment, MemorySession session) {
        return GetData.ofAddress(GetData$get(segment), session);
    }
    static final FunctionDescriptor GetDataHere$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDataHere$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.GetDataHere$FUNC
    );
    public interface GetDataHere {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(GetDataHere fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetDataHere.class, fi, IDataObjectVtbl.GetDataHere$FUNC, session);
        }
        static GetDataHere ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IDataObjectVtbl.GetDataHere$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetDataHere$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetDataHere"));
    public static VarHandle GetDataHere$VH() {
        return IDataObjectVtbl.GetDataHere$VH;
    }
    public static MemoryAddress GetDataHere$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.GetDataHere$VH.get(seg);
    }
    public static void GetDataHere$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.GetDataHere$VH.set(seg, x);
    }
    public static MemoryAddress GetDataHere$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.GetDataHere$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetDataHere$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.GetDataHere$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetDataHere GetDataHere (MemorySegment segment, MemorySession session) {
        return GetDataHere.ofAddress(GetDataHere$get(segment), session);
    }
    static final FunctionDescriptor QueryGetData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryGetData$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.QueryGetData$FUNC
    );
    public interface QueryGetData {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(QueryGetData fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryGetData.class, fi, IDataObjectVtbl.QueryGetData$FUNC, session);
        }
        static QueryGetData ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IDataObjectVtbl.QueryGetData$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryGetData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryGetData"));
    public static VarHandle QueryGetData$VH() {
        return IDataObjectVtbl.QueryGetData$VH;
    }
    public static MemoryAddress QueryGetData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.QueryGetData$VH.get(seg);
    }
    public static void QueryGetData$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.QueryGetData$VH.set(seg, x);
    }
    public static MemoryAddress QueryGetData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.QueryGetData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryGetData$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.QueryGetData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryGetData QueryGetData (MemorySegment segment, MemorySession session) {
        return QueryGetData.ofAddress(QueryGetData$get(segment), session);
    }
    static final FunctionDescriptor GetCanonicalFormatEtc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCanonicalFormatEtc$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.GetCanonicalFormatEtc$FUNC
    );
    public interface GetCanonicalFormatEtc {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(GetCanonicalFormatEtc fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetCanonicalFormatEtc.class, fi, IDataObjectVtbl.GetCanonicalFormatEtc$FUNC, session);
        }
        static GetCanonicalFormatEtc ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IDataObjectVtbl.GetCanonicalFormatEtc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCanonicalFormatEtc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetCanonicalFormatEtc"));
    public static VarHandle GetCanonicalFormatEtc$VH() {
        return IDataObjectVtbl.GetCanonicalFormatEtc$VH;
    }
    public static MemoryAddress GetCanonicalFormatEtc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.GetCanonicalFormatEtc$VH.get(seg);
    }
    public static void GetCanonicalFormatEtc$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.GetCanonicalFormatEtc$VH.set(seg, x);
    }
    public static MemoryAddress GetCanonicalFormatEtc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.GetCanonicalFormatEtc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCanonicalFormatEtc$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.GetCanonicalFormatEtc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCanonicalFormatEtc GetCanonicalFormatEtc (MemorySegment segment, MemorySession session) {
        return GetCanonicalFormatEtc.ofAddress(GetCanonicalFormatEtc$get(segment), session);
    }
    static final FunctionDescriptor SetData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetData$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.SetData$FUNC
    );
    public interface SetData {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3);
        static MemorySegment allocate(SetData fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetData.class, fi, IDataObjectVtbl.SetData$FUNC, session);
        }
        static SetData ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3) -> {
                try {
                    return (int)IDataObjectVtbl.SetData$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetData"));
    public static VarHandle SetData$VH() {
        return IDataObjectVtbl.SetData$VH;
    }
    public static MemoryAddress SetData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.SetData$VH.get(seg);
    }
    public static void SetData$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.SetData$VH.set(seg, x);
    }
    public static MemoryAddress SetData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.SetData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetData$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.SetData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetData SetData (MemorySegment segment, MemorySession session) {
        return SetData.ofAddress(SetData$get(segment), session);
    }
    static final FunctionDescriptor EnumFormatEtc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumFormatEtc$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.EnumFormatEtc$FUNC
    );
    public interface EnumFormatEtc {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(EnumFormatEtc fi, MemorySession session) {
            return RuntimeHelper.upcallStub(EnumFormatEtc.class, fi, IDataObjectVtbl.EnumFormatEtc$FUNC, session);
        }
        static EnumFormatEtc ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IDataObjectVtbl.EnumFormatEtc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnumFormatEtc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnumFormatEtc"));
    public static VarHandle EnumFormatEtc$VH() {
        return IDataObjectVtbl.EnumFormatEtc$VH;
    }
    public static MemoryAddress EnumFormatEtc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.EnumFormatEtc$VH.get(seg);
    }
    public static void EnumFormatEtc$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.EnumFormatEtc$VH.set(seg, x);
    }
    public static MemoryAddress EnumFormatEtc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.EnumFormatEtc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumFormatEtc$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.EnumFormatEtc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumFormatEtc EnumFormatEtc (MemorySegment segment, MemorySession session) {
        return EnumFormatEtc.ofAddress(EnumFormatEtc$get(segment), session);
    }
    static final FunctionDescriptor DAdvise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DAdvise$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.DAdvise$FUNC
    );
    public interface DAdvise {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(DAdvise fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DAdvise.class, fi, IDataObjectVtbl.DAdvise$FUNC, session);
        }
        static DAdvise ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IDataObjectVtbl.DAdvise$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DAdvise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DAdvise"));
    public static VarHandle DAdvise$VH() {
        return IDataObjectVtbl.DAdvise$VH;
    }
    public static MemoryAddress DAdvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.DAdvise$VH.get(seg);
    }
    public static void DAdvise$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.DAdvise$VH.set(seg, x);
    }
    public static MemoryAddress DAdvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.DAdvise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DAdvise$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.DAdvise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DAdvise DAdvise (MemorySegment segment, MemorySession session) {
        return DAdvise.ofAddress(DAdvise$get(segment), session);
    }
    static final FunctionDescriptor DUnadvise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DUnadvise$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.DUnadvise$FUNC
    );
    public interface DUnadvise {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(DUnadvise fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DUnadvise.class, fi, IDataObjectVtbl.DUnadvise$FUNC, session);
        }
        static DUnadvise ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IDataObjectVtbl.DUnadvise$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DUnadvise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DUnadvise"));
    public static VarHandle DUnadvise$VH() {
        return IDataObjectVtbl.DUnadvise$VH;
    }
    public static MemoryAddress DUnadvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.DUnadvise$VH.get(seg);
    }
    public static void DUnadvise$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.DUnadvise$VH.set(seg, x);
    }
    public static MemoryAddress DUnadvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.DUnadvise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DUnadvise$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.DUnadvise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DUnadvise DUnadvise (MemorySegment segment, MemorySession session) {
        return DUnadvise.ofAddress(DUnadvise$get(segment), session);
    }
    static final FunctionDescriptor EnumDAdvise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumDAdvise$MH = RuntimeHelper.downcallHandle(
        IDataObjectVtbl.EnumDAdvise$FUNC
    );
    public interface EnumDAdvise {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(EnumDAdvise fi, MemorySession session) {
            return RuntimeHelper.upcallStub(EnumDAdvise.class, fi, IDataObjectVtbl.EnumDAdvise$FUNC, session);
        }
        static EnumDAdvise ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IDataObjectVtbl.EnumDAdvise$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnumDAdvise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnumDAdvise"));
    public static VarHandle EnumDAdvise$VH() {
        return IDataObjectVtbl.EnumDAdvise$VH;
    }
    public static MemoryAddress EnumDAdvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.EnumDAdvise$VH.get(seg);
    }
    public static void EnumDAdvise$set( MemorySegment seg, MemoryAddress x) {
        IDataObjectVtbl.EnumDAdvise$VH.set(seg, x);
    }
    public static MemoryAddress EnumDAdvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDataObjectVtbl.EnumDAdvise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumDAdvise$set(MemorySegment seg, long index, MemoryAddress x) {
        IDataObjectVtbl.EnumDAdvise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumDAdvise EnumDAdvise (MemorySegment segment, MemorySession session) {
        return EnumDAdvise.ofAddress(EnumDAdvise$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


