// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface EDITWORDBREAKPROC {

    int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, int _x3);
    static MemorySegment allocate(EDITWORDBREAKPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(EDITWORDBREAKPROC.class, fi, constants$449.EDITWORDBREAKPROC$FUNC, session);
    }
    static EDITWORDBREAKPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, int __x3) -> {
            try {
                return (int)constants$449.EDITWORDBREAKPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


