// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RpcSsSetClientAllocFree$ClientFree {

    void apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(RpcSsSetClientAllocFree$ClientFree fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RpcSsSetClientAllocFree$ClientFree.class, fi, constants$886.RpcSsSetClientAllocFree$ClientFree$FUNC, session);
    }
    static RpcSsSetClientAllocFree$ClientFree ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                constants$886.RpcSsSetClientAllocFree$ClientFree$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


