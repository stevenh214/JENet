// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_FREE_ENCODED_OBJECT_FUNC {

    void apply(java.lang.foreign.MemoryAddress pszObjectOid, java.lang.foreign.MemoryAddress pObject, java.lang.foreign.MemoryAddress pvFreeContext);
    static MemorySegment allocate(PFN_FREE_ENCODED_OBJECT_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_FREE_ENCODED_OBJECT_FUNC.class, fi, constants$834.PFN_FREE_ENCODED_OBJECT_FUNC$FUNC, session);
    }
    static PFN_FREE_ENCODED_OBJECT_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pszObjectOid, java.lang.foreign.MemoryAddress _pObject, java.lang.foreign.MemoryAddress _pvFreeContext) -> {
            try {
                constants$834.PFN_FREE_ENCODED_OBJECT_FUNC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pszObjectOid, (java.lang.foreign.Addressable)_pObject, (java.lang.foreign.Addressable)_pvFreeContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


