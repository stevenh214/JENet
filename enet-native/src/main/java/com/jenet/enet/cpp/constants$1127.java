// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1127 {

    static final  GroupLayout CLSID_StdURLProtocol$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_StdURLProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_StdURLProtocol", constants$1127.CLSID_StdURLProtocol$LAYOUT);
    static final  GroupLayout CLSID_TBAuthProtocol$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_TBAuthProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_TBAuthProtocol", constants$1127.CLSID_TBAuthProtocol$LAYOUT);
    static final  GroupLayout CLSID_UrlMkBindCtx$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_UrlMkBindCtx$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_UrlMkBindCtx", constants$1127.CLSID_UrlMkBindCtx$LAYOUT);
    static final  GroupLayout CLSID_CdlProtocol$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CdlProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CdlProtocol", constants$1127.CLSID_CdlProtocol$LAYOUT);
    static final  GroupLayout CLSID_ClassInstallFilter$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_ClassInstallFilter$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_ClassInstallFilter", constants$1127.CLSID_ClassInstallFilter$LAYOUT);
    static final  GroupLayout IID_IAsyncBindCtx$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IAsyncBindCtx$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IAsyncBindCtx", constants$1127.IID_IAsyncBindCtx$LAYOUT);
}

