// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PTP_SIMPLE_CALLBACK {

    void apply(java.lang.foreign.MemoryAddress Instance, java.lang.foreign.MemoryAddress Context);
    static MemorySegment allocate(PTP_SIMPLE_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PTP_SIMPLE_CALLBACK.class, fi, constants$161.PTP_SIMPLE_CALLBACK$FUNC, session);
    }
    static PTP_SIMPLE_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Instance, java.lang.foreign.MemoryAddress _Context) -> {
            try {
                constants$161.PTP_SIMPLE_CALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Instance, (java.lang.foreign.Addressable)_Context);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


