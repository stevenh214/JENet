// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IMarshal2Vtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetUnmarshalClass"),
        Constants$root.C_POINTER$LAYOUT.withName("GetMarshalSizeMax"),
        Constants$root.C_POINTER$LAYOUT.withName("MarshalInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("UnmarshalInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("ReleaseMarshalData"),
        Constants$root.C_POINTER$LAYOUT.withName("DisconnectObject")
    ).withName("IMarshal2Vtbl");
    public static MemoryLayout $LAYOUT() {
        return IMarshal2Vtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IMarshal2Vtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IMarshal2Vtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IMarshal2Vtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IMarshal2Vtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IMarshal2Vtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IMarshal2Vtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IMarshal2Vtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IMarshal2Vtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IMarshal2Vtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetUnmarshalClass$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUnmarshalClass$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.GetUnmarshalClass$FUNC
    );
    public interface GetUnmarshalClass {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3, java.lang.foreign.MemoryAddress _x4, int _x5, java.lang.foreign.MemoryAddress _x6);
        static MemorySegment allocate(GetUnmarshalClass fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetUnmarshalClass.class, fi, IMarshal2Vtbl.GetUnmarshalClass$FUNC, session);
        }
        static GetUnmarshalClass ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3, java.lang.foreign.MemoryAddress __x4, int __x5, java.lang.foreign.MemoryAddress __x6) -> {
                try {
                    return (int)IMarshal2Vtbl.GetUnmarshalClass$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3, (java.lang.foreign.Addressable)__x4, __x5, (java.lang.foreign.Addressable)__x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetUnmarshalClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetUnmarshalClass"));
    public static VarHandle GetUnmarshalClass$VH() {
        return IMarshal2Vtbl.GetUnmarshalClass$VH;
    }
    public static MemoryAddress GetUnmarshalClass$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.GetUnmarshalClass$VH.get(seg);
    }
    public static void GetUnmarshalClass$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.GetUnmarshalClass$VH.set(seg, x);
    }
    public static MemoryAddress GetUnmarshalClass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.GetUnmarshalClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetUnmarshalClass$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.GetUnmarshalClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetUnmarshalClass GetUnmarshalClass (MemorySegment segment, MemorySession session) {
        return GetUnmarshalClass.ofAddress(GetUnmarshalClass$get(segment), session);
    }
    static final FunctionDescriptor GetMarshalSizeMax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMarshalSizeMax$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.GetMarshalSizeMax$FUNC
    );
    public interface GetMarshalSizeMax {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3, java.lang.foreign.MemoryAddress _x4, int _x5, java.lang.foreign.MemoryAddress _x6);
        static MemorySegment allocate(GetMarshalSizeMax fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetMarshalSizeMax.class, fi, IMarshal2Vtbl.GetMarshalSizeMax$FUNC, session);
        }
        static GetMarshalSizeMax ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3, java.lang.foreign.MemoryAddress __x4, int __x5, java.lang.foreign.MemoryAddress __x6) -> {
                try {
                    return (int)IMarshal2Vtbl.GetMarshalSizeMax$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3, (java.lang.foreign.Addressable)__x4, __x5, (java.lang.foreign.Addressable)__x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetMarshalSizeMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetMarshalSizeMax"));
    public static VarHandle GetMarshalSizeMax$VH() {
        return IMarshal2Vtbl.GetMarshalSizeMax$VH;
    }
    public static MemoryAddress GetMarshalSizeMax$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.GetMarshalSizeMax$VH.get(seg);
    }
    public static void GetMarshalSizeMax$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.GetMarshalSizeMax$VH.set(seg, x);
    }
    public static MemoryAddress GetMarshalSizeMax$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.GetMarshalSizeMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetMarshalSizeMax$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.GetMarshalSizeMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetMarshalSizeMax GetMarshalSizeMax (MemorySegment segment, MemorySession session) {
        return GetMarshalSizeMax.ofAddress(GetMarshalSizeMax$get(segment), session);
    }
    static final FunctionDescriptor MarshalInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MarshalInterface$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.MarshalInterface$FUNC
    );
    public interface MarshalInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, int _x4, java.lang.foreign.MemoryAddress _x5, int _x6);
        static MemorySegment allocate(MarshalInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(MarshalInterface.class, fi, IMarshal2Vtbl.MarshalInterface$FUNC, session);
        }
        static MarshalInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, int __x4, java.lang.foreign.MemoryAddress __x5, int __x6) -> {
                try {
                    return (int)IMarshal2Vtbl.MarshalInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, __x4, (java.lang.foreign.Addressable)__x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle MarshalInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MarshalInterface"));
    public static VarHandle MarshalInterface$VH() {
        return IMarshal2Vtbl.MarshalInterface$VH;
    }
    public static MemoryAddress MarshalInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.MarshalInterface$VH.get(seg);
    }
    public static void MarshalInterface$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.MarshalInterface$VH.set(seg, x);
    }
    public static MemoryAddress MarshalInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.MarshalInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MarshalInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.MarshalInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MarshalInterface MarshalInterface (MemorySegment segment, MemorySession session) {
        return MarshalInterface.ofAddress(MarshalInterface$get(segment), session);
    }
    static final FunctionDescriptor UnmarshalInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnmarshalInterface$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.UnmarshalInterface$FUNC
    );
    public interface UnmarshalInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(UnmarshalInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(UnmarshalInterface.class, fi, IMarshal2Vtbl.UnmarshalInterface$FUNC, session);
        }
        static UnmarshalInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IMarshal2Vtbl.UnmarshalInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle UnmarshalInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnmarshalInterface"));
    public static VarHandle UnmarshalInterface$VH() {
        return IMarshal2Vtbl.UnmarshalInterface$VH;
    }
    public static MemoryAddress UnmarshalInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.UnmarshalInterface$VH.get(seg);
    }
    public static void UnmarshalInterface$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.UnmarshalInterface$VH.set(seg, x);
    }
    public static MemoryAddress UnmarshalInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.UnmarshalInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnmarshalInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.UnmarshalInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static UnmarshalInterface UnmarshalInterface (MemorySegment segment, MemorySession session) {
        return UnmarshalInterface.ofAddress(UnmarshalInterface$get(segment), session);
    }
    static final FunctionDescriptor ReleaseMarshalData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseMarshalData$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.ReleaseMarshalData$FUNC
    );
    public interface ReleaseMarshalData {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(ReleaseMarshalData fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ReleaseMarshalData.class, fi, IMarshal2Vtbl.ReleaseMarshalData$FUNC, session);
        }
        static ReleaseMarshalData ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IMarshal2Vtbl.ReleaseMarshalData$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReleaseMarshalData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReleaseMarshalData"));
    public static VarHandle ReleaseMarshalData$VH() {
        return IMarshal2Vtbl.ReleaseMarshalData$VH;
    }
    public static MemoryAddress ReleaseMarshalData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.ReleaseMarshalData$VH.get(seg);
    }
    public static void ReleaseMarshalData$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.ReleaseMarshalData$VH.set(seg, x);
    }
    public static MemoryAddress ReleaseMarshalData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.ReleaseMarshalData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReleaseMarshalData$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.ReleaseMarshalData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReleaseMarshalData ReleaseMarshalData (MemorySegment segment, MemorySession session) {
        return ReleaseMarshalData.ofAddress(ReleaseMarshalData$get(segment), session);
    }
    static final FunctionDescriptor DisconnectObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DisconnectObject$MH = RuntimeHelper.downcallHandle(
        IMarshal2Vtbl.DisconnectObject$FUNC
    );
    public interface DisconnectObject {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(DisconnectObject fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DisconnectObject.class, fi, IMarshal2Vtbl.DisconnectObject$FUNC, session);
        }
        static DisconnectObject ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IMarshal2Vtbl.DisconnectObject$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DisconnectObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DisconnectObject"));
    public static VarHandle DisconnectObject$VH() {
        return IMarshal2Vtbl.DisconnectObject$VH;
    }
    public static MemoryAddress DisconnectObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.DisconnectObject$VH.get(seg);
    }
    public static void DisconnectObject$set( MemorySegment seg, MemoryAddress x) {
        IMarshal2Vtbl.DisconnectObject$VH.set(seg, x);
    }
    public static MemoryAddress DisconnectObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IMarshal2Vtbl.DisconnectObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DisconnectObject$set(MemorySegment seg, long index, MemoryAddress x) {
        IMarshal2Vtbl.DisconnectObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DisconnectObject DisconnectObject (MemorySegment segment, MemorySession session) {
        return DisconnectObject.ofAddress(DisconnectObject$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


