// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPSERVICE_MAIN_FUNCTIONA {

    void apply(int dwNumServicesArgs, java.lang.foreign.MemoryAddress lpServiceArgVectors);
    static MemorySegment allocate(LPSERVICE_MAIN_FUNCTIONA fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPSERVICE_MAIN_FUNCTIONA.class, fi, constants$1260.LPSERVICE_MAIN_FUNCTIONA$FUNC, session);
    }
    static LPSERVICE_MAIN_FUNCTIONA ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dwNumServicesArgs, java.lang.foreign.MemoryAddress _lpServiceArgVectors) -> {
            try {
                constants$1260.LPSERVICE_MAIN_FUNCTIONA$MH.invokeExact((Addressable)symbol, _dwNumServicesArgs, (java.lang.foreign.Addressable)_lpServiceArgVectors);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


