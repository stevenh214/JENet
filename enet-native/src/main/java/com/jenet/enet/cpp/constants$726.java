// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$726 {

    static final FunctionDescriptor I_RpcConnectionSetSockBuffSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcConnectionSetSockBuffSize$MH = RuntimeHelper.downcallHandle(
        "I_RpcConnectionSetSockBuffSize",
        constants$726.I_RpcConnectionSetSockBuffSize$FUNC
    );
    static final FunctionDescriptor RPCLT_PDU_FILTER_FUNC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RPCLT_PDU_FILTER_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$726.RPCLT_PDU_FILTER_FUNC$FUNC
    );
    static final FunctionDescriptor RPC_SETFILTER_FUNC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_SETFILTER_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$726.RPC_SETFILTER_FUNC$FUNC
    );
    static final FunctionDescriptor I_RpcServerStartListening$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerStartListening$MH = RuntimeHelper.downcallHandle(
        "I_RpcServerStartListening",
        constants$726.I_RpcServerStartListening$FUNC
    );
}


