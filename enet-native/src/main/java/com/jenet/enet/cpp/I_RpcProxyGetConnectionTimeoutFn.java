// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface I_RpcProxyGetConnectionTimeoutFn {

    int apply(java.lang.foreign.MemoryAddress ConnectionTimeout);
    static MemorySegment allocate(I_RpcProxyGetConnectionTimeoutFn fi, MemorySession session) {
        return RuntimeHelper.upcallStub(I_RpcProxyGetConnectionTimeoutFn.class, fi, constants$729.I_RpcProxyGetConnectionTimeoutFn$FUNC, session);
    }
    static I_RpcProxyGetConnectionTimeoutFn ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _ConnectionTimeout) -> {
            try {
                return (int)constants$729.I_RpcProxyGetConnectionTimeoutFn$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_ConnectionTimeout);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


