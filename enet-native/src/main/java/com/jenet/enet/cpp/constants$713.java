// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$713 {

    static final FunctionDescriptor RpcServerInterfaceGroupDeactivate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcServerInterfaceGroupDeactivate$MH = RuntimeHelper.downcallHandle(
        "RpcServerInterfaceGroupDeactivate",
        constants$713.RpcServerInterfaceGroupDeactivate$FUNC
    );
    static final FunctionDescriptor RpcServerInterfaceGroupInqBindings$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerInterfaceGroupInqBindings$MH = RuntimeHelper.downcallHandle(
        "RpcServerInterfaceGroupInqBindings",
        constants$713.RpcServerInterfaceGroupInqBindings$FUNC
    );
    static final FunctionDescriptor RPC_FORWARD_FUNCTION$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_FORWARD_FUNCTION$MH = RuntimeHelper.downcallHandle(
        constants$713.RPC_FORWARD_FUNCTION$FUNC
    );
    static final FunctionDescriptor RPC_ADDRESS_CHANGE_FN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_ADDRESS_CHANGE_FN$MH = RuntimeHelper.downcallHandle(
        constants$713.RPC_ADDRESS_CHANGE_FN$FUNC
    );
}

