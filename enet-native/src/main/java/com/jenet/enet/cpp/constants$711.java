// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$711 {

    static final FunctionDescriptor RpcMgmtSetAuthorizationFn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcMgmtSetAuthorizationFn$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtSetAuthorizationFn",
        constants$711.RpcMgmtSetAuthorizationFn$FUNC
    );
    static final FunctionDescriptor RpcExceptionFilter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcExceptionFilter$MH = RuntimeHelper.downcallHandle(
        "RpcExceptionFilter",
        constants$711.RpcExceptionFilter$FUNC
    );
    static final FunctionDescriptor RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN$MH = RuntimeHelper.downcallHandle(
        constants$711.RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN$FUNC
    );
    static final FunctionDescriptor RpcServerInterfaceGroupCreateW$IdleCallbackFn$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcServerInterfaceGroupCreateW$IdleCallbackFn$MH = RuntimeHelper.downcallHandle(
        constants$711.RpcServerInterfaceGroupCreateW$IdleCallbackFn$FUNC
    );
}


