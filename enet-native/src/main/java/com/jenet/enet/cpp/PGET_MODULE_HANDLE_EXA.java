// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PGET_MODULE_HANDLE_EXA {

    int apply(int dwFlags, java.lang.foreign.MemoryAddress lpModuleName, java.lang.foreign.MemoryAddress phModule);
    static MemorySegment allocate(PGET_MODULE_HANDLE_EXA fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PGET_MODULE_HANDLE_EXA.class, fi, constants$265.PGET_MODULE_HANDLE_EXA$FUNC, session);
    }
    static PGET_MODULE_HANDLE_EXA ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dwFlags, java.lang.foreign.MemoryAddress _lpModuleName, java.lang.foreign.MemoryAddress _phModule) -> {
            try {
                return (int)constants$265.PGET_MODULE_HANDLE_EXA$MH.invokeExact((Addressable)symbol, _dwFlags, (java.lang.foreign.Addressable)_lpModuleName, (java.lang.foreign.Addressable)_phModule);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


