// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface I_RpcProxyGetClientSessionAndResourceUUID {

    int apply(java.lang.foreign.MemoryAddress Context, java.lang.foreign.MemoryAddress SessionIdPresent, java.lang.foreign.MemoryAddress SessionId, java.lang.foreign.MemoryAddress ResourceIdPresent, java.lang.foreign.MemoryAddress ResourceId);
    static MemorySegment allocate(I_RpcProxyGetClientSessionAndResourceUUID fi, MemorySession session) {
        return RuntimeHelper.upcallStub(I_RpcProxyGetClientSessionAndResourceUUID.class, fi, constants$730.I_RpcProxyGetClientSessionAndResourceUUID$FUNC, session);
    }
    static I_RpcProxyGetClientSessionAndResourceUUID ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Context, java.lang.foreign.MemoryAddress _SessionIdPresent, java.lang.foreign.MemoryAddress _SessionId, java.lang.foreign.MemoryAddress _ResourceIdPresent, java.lang.foreign.MemoryAddress _ResourceId) -> {
            try {
                return (int)constants$730.I_RpcProxyGetClientSessionAndResourceUUID$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Context, (java.lang.foreign.Addressable)_SessionIdPresent, (java.lang.foreign.Addressable)_SessionId, (java.lang.foreign.Addressable)_ResourceIdPresent, (java.lang.foreign.Addressable)_ResourceId);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


