// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RPC_MGMT_AUTHORIZATION_FN {

    int apply(java.lang.foreign.MemoryAddress ClientBinding, int RequestedMgmtOperation, java.lang.foreign.MemoryAddress Status);
    static MemorySegment allocate(RPC_MGMT_AUTHORIZATION_FN fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RPC_MGMT_AUTHORIZATION_FN.class, fi, constants$710.RPC_MGMT_AUTHORIZATION_FN$FUNC, session);
    }
    static RPC_MGMT_AUTHORIZATION_FN ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _ClientBinding, int _RequestedMgmtOperation, java.lang.foreign.MemoryAddress _Status) -> {
            try {
                return (int)constants$710.RPC_MGMT_AUTHORIZATION_FN$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_ClientBinding, _RequestedMgmtOperation, (java.lang.foreign.Addressable)_Status);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


