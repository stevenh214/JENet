// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1236 {

    static final FunctionDescriptor SetErrorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetErrorInfo$MH = RuntimeHelper.downcallHandle(
        "SetErrorInfo",
        constants$1236.SetErrorInfo$FUNC
    );
    static final FunctionDescriptor GetErrorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetErrorInfo$MH = RuntimeHelper.downcallHandle(
        "GetErrorInfo",
        constants$1236.GetErrorInfo$FUNC
    );
    static final FunctionDescriptor CreateErrorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateErrorInfo$MH = RuntimeHelper.downcallHandle(
        "CreateErrorInfo",
        constants$1236.CreateErrorInfo$FUNC
    );
    static final FunctionDescriptor GetRecordInfoFromTypeInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetRecordInfoFromTypeInfo$MH = RuntimeHelper.downcallHandle(
        "GetRecordInfoFromTypeInfo",
        constants$1236.GetRecordInfoFromTypeInfo$FUNC
    );
    static final FunctionDescriptor GetRecordInfoFromGuids$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetRecordInfoFromGuids$MH = RuntimeHelper.downcallHandle(
        "GetRecordInfoFromGuids",
        constants$1236.GetRecordInfoFromGuids$FUNC
    );
    static final FunctionDescriptor OaBuildVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle OaBuildVersion$MH = RuntimeHelper.downcallHandle(
        "OaBuildVersion",
        constants$1236.OaBuildVersion$FUNC
    );
}


