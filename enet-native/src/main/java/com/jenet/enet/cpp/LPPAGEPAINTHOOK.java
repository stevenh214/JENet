// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPPAGEPAINTHOOK {

    long apply(java.lang.foreign.MemoryAddress _x0, int _x1, long _x2, long _x3);
    static MemorySegment allocate(LPPAGEPAINTHOOK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPPAGEPAINTHOOK.class, fi, constants$1253.LPPAGEPAINTHOOK$FUNC, session);
    }
    static LPPAGEPAINTHOOK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, int __x1, long __x2, long __x3) -> {
            try {
                return (long)constants$1253.LPPAGEPAINTHOOK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


