// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$648 {

    static final FunctionDescriptor DdeGetData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeGetData$MH = RuntimeHelper.downcallHandle(
        "DdeGetData",
        constants$648.DdeGetData$FUNC
    );
    static final FunctionDescriptor DdeAccessData$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeAccessData$MH = RuntimeHelper.downcallHandle(
        "DdeAccessData",
        constants$648.DdeAccessData$FUNC
    );
    static final FunctionDescriptor DdeUnaccessData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeUnaccessData$MH = RuntimeHelper.downcallHandle(
        "DdeUnaccessData",
        constants$648.DdeUnaccessData$FUNC
    );
    static final FunctionDescriptor DdeFreeDataHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeFreeDataHandle$MH = RuntimeHelper.downcallHandle(
        "DdeFreeDataHandle",
        constants$648.DdeFreeDataHandle$FUNC
    );
    static final FunctionDescriptor DdeGetLastError$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeGetLastError$MH = RuntimeHelper.downcallHandle(
        "DdeGetLastError",
        constants$648.DdeGetLastError$FUNC
    );
    static final FunctionDescriptor DdeCreateStringHandleA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeCreateStringHandleA$MH = RuntimeHelper.downcallHandle(
        "DdeCreateStringHandleA",
        constants$648.DdeCreateStringHandleA$FUNC
    );
}

