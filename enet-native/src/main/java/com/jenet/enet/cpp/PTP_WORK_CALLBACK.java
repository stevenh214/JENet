// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PTP_WORK_CALLBACK {

    void apply(java.lang.foreign.MemoryAddress Instance, java.lang.foreign.MemoryAddress Context, java.lang.foreign.MemoryAddress Work);
    static MemorySegment allocate(PTP_WORK_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PTP_WORK_CALLBACK.class, fi, constants$163.PTP_WORK_CALLBACK$FUNC, session);
    }
    static PTP_WORK_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Instance, java.lang.foreign.MemoryAddress _Context, java.lang.foreign.MemoryAddress _Work) -> {
            try {
                constants$163.PTP_WORK_CALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Instance, (java.lang.foreign.Addressable)_Context, (java.lang.foreign.Addressable)_Work);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


