// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1169 {

    static final  GroupLayout IID_IEncodingFilterFactory$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEncodingFilterFactory$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IEncodingFilterFactory", constants$1169.IID_IEncodingFilterFactory$LAYOUT);
    static final FunctionDescriptor IsLoggingEnabledA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsLoggingEnabledA$MH = RuntimeHelper.downcallHandle(
        "IsLoggingEnabledA",
        constants$1169.IsLoggingEnabledA$FUNC
    );
    static final FunctionDescriptor IsLoggingEnabledW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsLoggingEnabledW$MH = RuntimeHelper.downcallHandle(
        "IsLoggingEnabledW",
        constants$1169.IsLoggingEnabledW$FUNC
    );
    static final FunctionDescriptor WriteHitLogging$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WriteHitLogging$MH = RuntimeHelper.downcallHandle(
        "WriteHitLogging",
        constants$1169.WriteHitLogging$FUNC
    );
    static final  GroupLayout GUID_CUSTOM_CONFIRMOBJECTSAFETY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_CUSTOM_CONFIRMOBJECTSAFETY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_CUSTOM_CONFIRMOBJECTSAFETY", constants$1169.GUID_CUSTOM_CONFIRMOBJECTSAFETY$LAYOUT);
    static final  OfAddress __MIDL_itf_urlmon_0000_0051_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0051_v0_0_c_ifspec$VH = constants$1169.__MIDL_itf_urlmon_0000_0051_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0051_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0051_v0_0_c_ifspec", constants$1169.__MIDL_itf_urlmon_0000_0051_v0_0_c_ifspec$LAYOUT);
}

