// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RpcSsSetClientAllocFree$ClientAlloc {

    java.lang.foreign.Addressable apply(long _x0);
    static MemorySegment allocate(RpcSsSetClientAllocFree$ClientAlloc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RpcSsSetClientAllocFree$ClientAlloc.class, fi, constants$885.RpcSsSetClientAllocFree$ClientAlloc$FUNC, session);
    }
    static RpcSsSetClientAllocFree$ClientAlloc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long __x0) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$885.RpcSsSetClientAllocFree$ClientAlloc$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


