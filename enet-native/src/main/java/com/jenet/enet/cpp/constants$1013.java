// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1013 {

    static final FunctionDescriptor IEnumSTATDATA_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumSTATDATA_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        "IEnumSTATDATA_RemoteNext_Stub",
        constants$1013.IEnumSTATDATA_RemoteNext_Stub$FUNC
    );
    static final  GroupLayout IID_IRootStorage$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IRootStorage$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IRootStorage", constants$1013.IID_IRootStorage$LAYOUT);
    static final  GroupLayout IID_IAdviseSink$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IAdviseSink$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IAdviseSink", constants$1013.IID_IAdviseSink$LAYOUT);
    static final FunctionDescriptor IAdviseSink_RemoteOnDataChange_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IAdviseSink_RemoteOnDataChange_Proxy$MH = RuntimeHelper.downcallHandle(
        "IAdviseSink_RemoteOnDataChange_Proxy",
        constants$1013.IAdviseSink_RemoteOnDataChange_Proxy$FUNC
    );
    static final FunctionDescriptor IAdviseSink_RemoteOnDataChange_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IAdviseSink_RemoteOnDataChange_Stub$MH = RuntimeHelper.downcallHandle(
        "IAdviseSink_RemoteOnDataChange_Stub",
        constants$1013.IAdviseSink_RemoteOnDataChange_Stub$FUNC
    );
    static final FunctionDescriptor IAdviseSink_RemoteOnViewChange_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IAdviseSink_RemoteOnViewChange_Proxy$MH = RuntimeHelper.downcallHandle(
        "IAdviseSink_RemoteOnViewChange_Proxy",
        constants$1013.IAdviseSink_RemoteOnViewChange_Proxy$FUNC
    );
}


