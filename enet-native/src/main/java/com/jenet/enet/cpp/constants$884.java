// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$884 {

    static final FunctionDescriptor NdrMapCommAndFaultStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NdrMapCommAndFaultStatus$MH = RuntimeHelper.downcallHandle(
        "NdrMapCommAndFaultStatus",
        constants$884.NdrMapCommAndFaultStatus$FUNC
    );
    static final FunctionDescriptor RPC_CLIENT_ALLOC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RPC_CLIENT_ALLOC$MH = RuntimeHelper.downcallHandle(
        constants$884.RPC_CLIENT_ALLOC$FUNC
    );
    static final FunctionDescriptor RPC_CLIENT_FREE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_CLIENT_FREE$MH = RuntimeHelper.downcallHandle(
        constants$884.RPC_CLIENT_FREE$FUNC
    );
    static final FunctionDescriptor RpcSsAllocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RpcSsAllocate$MH = RuntimeHelper.downcallHandle(
        "RpcSsAllocate",
        constants$884.RpcSsAllocate$FUNC
    );
}

