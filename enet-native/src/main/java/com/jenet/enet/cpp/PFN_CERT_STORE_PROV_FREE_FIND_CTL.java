// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_STORE_PROV_FREE_FIND_CTL {

    int apply(java.lang.foreign.MemoryAddress hStoreProv, java.lang.foreign.MemoryAddress pCtlContext, java.lang.foreign.MemoryAddress pvStoreProvFindInfo, int dwFlags);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_FREE_FIND_CTL fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_FREE_FIND_CTL.class, fi, constants$804.PFN_CERT_STORE_PROV_FREE_FIND_CTL$FUNC, session);
    }
    static PFN_CERT_STORE_PROV_FREE_FIND_CTL ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hStoreProv, java.lang.foreign.MemoryAddress _pCtlContext, java.lang.foreign.MemoryAddress _pvStoreProvFindInfo, int _dwFlags) -> {
            try {
                return (int)constants$804.PFN_CERT_STORE_PROV_FREE_FIND_CTL$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hStoreProv, (java.lang.foreign.Addressable)_pCtlContext, (java.lang.foreign.Addressable)_pvStoreProvFindInfo, _dwFlags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


