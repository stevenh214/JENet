// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RPC_AUTH_KEY_RETRIEVAL_FN {

    void apply(java.lang.foreign.MemoryAddress Arg, java.lang.foreign.MemoryAddress ServerPrincName, int KeyVer, java.lang.foreign.MemoryAddress Key, java.lang.foreign.MemoryAddress Status);
    static MemorySegment allocate(RPC_AUTH_KEY_RETRIEVAL_FN fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RPC_AUTH_KEY_RETRIEVAL_FN.class, fi, constants$705.RPC_AUTH_KEY_RETRIEVAL_FN$FUNC, session);
    }
    static RPC_AUTH_KEY_RETRIEVAL_FN ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Arg, java.lang.foreign.MemoryAddress _ServerPrincName, int _KeyVer, java.lang.foreign.MemoryAddress _Key, java.lang.foreign.MemoryAddress _Status) -> {
            try {
                constants$705.RPC_AUTH_KEY_RETRIEVAL_FN$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Arg, (java.lang.foreign.Addressable)_ServerPrincName, _KeyVer, (java.lang.foreign.Addressable)_Key, (java.lang.foreign.Addressable)_Status);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


