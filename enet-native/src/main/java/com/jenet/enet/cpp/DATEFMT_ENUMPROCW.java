// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface DATEFMT_ENUMPROCW {

    int apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(DATEFMT_ENUMPROCW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(DATEFMT_ENUMPROCW.class, fi, constants$578.DATEFMT_ENUMPROCW$FUNC, session);
    }
    static DATEFMT_ENUMPROCW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                return (int)constants$578.DATEFMT_ENUMPROCW$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


