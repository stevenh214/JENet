// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPCONDITIONPROC {

    int apply(java.lang.foreign.MemoryAddress lpCallerId, java.lang.foreign.MemoryAddress lpCallerData, java.lang.foreign.MemoryAddress lpSQOS, java.lang.foreign.MemoryAddress lpGQOS, java.lang.foreign.MemoryAddress lpCalleeId, java.lang.foreign.MemoryAddress lpCalleeData, java.lang.foreign.MemoryAddress g, long dwCallbackData);
    static MemorySegment allocate(LPCONDITIONPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPCONDITIONPROC.class, fi, constants$1284.LPCONDITIONPROC$FUNC, session);
    }
    static LPCONDITIONPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _lpCallerId, java.lang.foreign.MemoryAddress _lpCallerData, java.lang.foreign.MemoryAddress _lpSQOS, java.lang.foreign.MemoryAddress _lpGQOS, java.lang.foreign.MemoryAddress _lpCalleeId, java.lang.foreign.MemoryAddress _lpCalleeData, java.lang.foreign.MemoryAddress _g, long _dwCallbackData) -> {
            try {
                return (int)constants$1284.LPCONDITIONPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_lpCallerId, (java.lang.foreign.Addressable)_lpCallerData, (java.lang.foreign.Addressable)_lpSQOS, (java.lang.foreign.Addressable)_lpGQOS, (java.lang.foreign.Addressable)_lpCalleeId, (java.lang.foreign.Addressable)_lpCalleeData, (java.lang.foreign.Addressable)_g, _dwCallbackData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


