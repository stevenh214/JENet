// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface MMIOPROC {

    long apply(java.lang.foreign.MemoryAddress lpmmioinfo, int uMsg, long lParam1, long lParam2);
    static MemorySegment allocate(MMIOPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(MMIOPROC.class, fi, constants$658.MMIOPROC$FUNC, session);
    }
    static MMIOPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _lpmmioinfo, int _uMsg, long _lParam1, long _lParam2) -> {
            try {
                return (long)constants$658.MMIOPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_lpmmioinfo, _uMsg, _lParam1, _lParam2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


