// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$727 {

    static final FunctionDescriptor I_RpcServerStopListening$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle I_RpcServerStopListening$MH = RuntimeHelper.downcallHandle(
        "I_RpcServerStopListening",
        constants$727.I_RpcServerStopListening$FUNC
    );
    static final FunctionDescriptor RPC_BLOCKING_FN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_BLOCKING_FN$MH = RuntimeHelper.downcallHandle(
        constants$727.RPC_BLOCKING_FN$FUNC
    );
    static final FunctionDescriptor I_RpcBindingSetAsync$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcBindingSetAsync$MH = RuntimeHelper.downcallHandle(
        "I_RpcBindingSetAsync",
        constants$727.I_RpcBindingSetAsync$FUNC
    );
    static final FunctionDescriptor I_RpcSetThreadParams$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcSetThreadParams$MH = RuntimeHelper.downcallHandle(
        "I_RpcSetThreadParams",
        constants$727.I_RpcSetThreadParams$FUNC
    );
    static final FunctionDescriptor I_RpcWindowProc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcWindowProc$MH = RuntimeHelper.downcallHandle(
        "I_RpcWindowProc",
        constants$727.I_RpcWindowProc$FUNC
    );
}


