// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$645 {

    static final FunctionDescriptor DdeInitializeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeInitializeW$MH = RuntimeHelper.downcallHandle(
        "DdeInitializeW",
        constants$645.DdeInitializeW$FUNC
    );
    static final FunctionDescriptor DdeUninitialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeUninitialize$MH = RuntimeHelper.downcallHandle(
        "DdeUninitialize",
        constants$645.DdeUninitialize$FUNC
    );
    static final FunctionDescriptor DdeConnectList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeConnectList$MH = RuntimeHelper.downcallHandle(
        "DdeConnectList",
        constants$645.DdeConnectList$FUNC
    );
    static final FunctionDescriptor DdeQueryNextServer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeQueryNextServer$MH = RuntimeHelper.downcallHandle(
        "DdeQueryNextServer",
        constants$645.DdeQueryNextServer$FUNC
    );
    static final FunctionDescriptor DdeDisconnectList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeDisconnectList$MH = RuntimeHelper.downcallHandle(
        "DdeDisconnectList",
        constants$645.DdeDisconnectList$FUNC
    );
    static final FunctionDescriptor DdeConnect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeConnect$MH = RuntimeHelper.downcallHandle(
        "DdeConnect",
        constants$645.DdeConnect$FUNC
    );
}

