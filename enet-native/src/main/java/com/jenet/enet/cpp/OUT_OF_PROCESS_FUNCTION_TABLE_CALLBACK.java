// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK {

    int apply(java.lang.foreign.MemoryAddress Process, java.lang.foreign.MemoryAddress TableAddress, java.lang.foreign.MemoryAddress Entries, java.lang.foreign.MemoryAddress Functions);
    static MemorySegment allocate(OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK.class, fi, constants$101.OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$FUNC, session);
    }
    static OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Process, java.lang.foreign.MemoryAddress _TableAddress, java.lang.foreign.MemoryAddress _Entries, java.lang.foreign.MemoryAddress _Functions) -> {
            try {
                return (int)constants$102.OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Process, (java.lang.foreign.Addressable)_TableAddress, (java.lang.foreign.Addressable)_Entries, (java.lang.foreign.Addressable)_Functions);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


