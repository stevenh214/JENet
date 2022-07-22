// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IHttpNegotiateVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("BeginningTransaction"),
        Constants$root.C_POINTER$LAYOUT.withName("OnResponse")
    ).withName("IHttpNegotiateVtbl");
    public static MemoryLayout $LAYOUT() {
        return IHttpNegotiateVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiateVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IHttpNegotiateVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IHttpNegotiateVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IHttpNegotiateVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiateVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiateVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiateVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiateVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiateVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IHttpNegotiateVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IHttpNegotiateVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IHttpNegotiateVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiateVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiateVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiateVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiateVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiateVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IHttpNegotiateVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IHttpNegotiateVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IHttpNegotiateVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiateVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiateVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiateVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiateVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor BeginningTransaction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BeginningTransaction$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiateVtbl.BeginningTransaction$FUNC
    );
    public interface BeginningTransaction {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(BeginningTransaction fi, MemorySession session) {
            return RuntimeHelper.upcallStub(BeginningTransaction.class, fi, IHttpNegotiateVtbl.BeginningTransaction$FUNC, session);
        }
        static BeginningTransaction ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IHttpNegotiateVtbl.BeginningTransaction$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle BeginningTransaction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BeginningTransaction"));
    public static VarHandle BeginningTransaction$VH() {
        return IHttpNegotiateVtbl.BeginningTransaction$VH;
    }
    public static MemoryAddress BeginningTransaction$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiateVtbl.BeginningTransaction$VH.get(seg);
    }
    public static void BeginningTransaction$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiateVtbl.BeginningTransaction$VH.set(seg, x);
    }
    public static MemoryAddress BeginningTransaction$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiateVtbl.BeginningTransaction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BeginningTransaction$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiateVtbl.BeginningTransaction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static BeginningTransaction BeginningTransaction (MemorySegment segment, MemorySession session) {
        return BeginningTransaction.ofAddress(BeginningTransaction$get(segment), session);
    }
    static final FunctionDescriptor OnResponse$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnResponse$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiateVtbl.OnResponse$FUNC
    );
    public interface OnResponse {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(OnResponse fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnResponse.class, fi, IHttpNegotiateVtbl.OnResponse$FUNC, session);
        }
        static OnResponse ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IHttpNegotiateVtbl.OnResponse$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnResponse$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnResponse"));
    public static VarHandle OnResponse$VH() {
        return IHttpNegotiateVtbl.OnResponse$VH;
    }
    public static MemoryAddress OnResponse$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiateVtbl.OnResponse$VH.get(seg);
    }
    public static void OnResponse$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiateVtbl.OnResponse$VH.set(seg, x);
    }
    public static MemoryAddress OnResponse$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiateVtbl.OnResponse$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnResponse$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiateVtbl.OnResponse$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnResponse OnResponse (MemorySegment segment, MemorySession session) {
        return OnResponse.ofAddress(OnResponse$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


