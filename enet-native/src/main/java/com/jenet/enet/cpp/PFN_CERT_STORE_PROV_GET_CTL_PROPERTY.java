// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_STORE_PROV_GET_CTL_PROPERTY {

    int apply(java.lang.foreign.MemoryAddress hStoreProv, java.lang.foreign.MemoryAddress pCtlContext, int dwPropId, int dwFlags, java.lang.foreign.MemoryAddress pvData, java.lang.foreign.MemoryAddress pcbData);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_GET_CTL_PROPERTY fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_GET_CTL_PROPERTY.class, fi, constants$804.PFN_CERT_STORE_PROV_GET_CTL_PROPERTY$FUNC, session);
    }
    static PFN_CERT_STORE_PROV_GET_CTL_PROPERTY ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hStoreProv, java.lang.foreign.MemoryAddress _pCtlContext, int _dwPropId, int _dwFlags, java.lang.foreign.MemoryAddress _pvData, java.lang.foreign.MemoryAddress _pcbData) -> {
            try {
                return (int)constants$804.PFN_CERT_STORE_PROV_GET_CTL_PROPERTY$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hStoreProv, (java.lang.foreign.Addressable)_pCtlContext, _dwPropId, _dwFlags, (java.lang.foreign.Addressable)_pvData, (java.lang.foreign.Addressable)_pcbData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


