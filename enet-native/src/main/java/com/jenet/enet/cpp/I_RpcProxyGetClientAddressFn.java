// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface I_RpcProxyGetClientAddressFn {

    int apply(java.lang.foreign.MemoryAddress Context, java.lang.foreign.MemoryAddress Buffer, java.lang.foreign.MemoryAddress BufferLength);
    static MemorySegment allocate(I_RpcProxyGetClientAddressFn fi, MemorySession session) {
        return RuntimeHelper.upcallStub(I_RpcProxyGetClientAddressFn.class, fi, constants$729.I_RpcProxyGetClientAddressFn$FUNC, session);
    }
    static I_RpcProxyGetClientAddressFn ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Context, java.lang.foreign.MemoryAddress _Buffer, java.lang.foreign.MemoryAddress _BufferLength) -> {
            try {
                return (int)constants$729.I_RpcProxyGetClientAddressFn$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Context, (java.lang.foreign.Addressable)_Buffer, (java.lang.foreign.Addressable)_BufferLength);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


