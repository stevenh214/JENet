// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PEXCEPTION_FILTER {

    int apply(java.lang.foreign.MemoryAddress ExceptionPointers, java.lang.foreign.MemoryAddress EstablisherFrame);
    static MemorySegment allocate(PEXCEPTION_FILTER fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PEXCEPTION_FILTER.class, fi, constants$102.PEXCEPTION_FILTER$FUNC, session);
    }
    static PEXCEPTION_FILTER ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _ExceptionPointers, java.lang.foreign.MemoryAddress _EstablisherFrame) -> {
            try {
                return (int)constants$102.PEXCEPTION_FILTER$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_ExceptionPointers, (java.lang.foreign.Addressable)_EstablisherFrame);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


