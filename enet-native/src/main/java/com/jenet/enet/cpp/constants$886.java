// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$886 {

    static final FunctionDescriptor RpcSsSetClientAllocFree$ClientFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSsSetClientAllocFree$ClientFree$MH = RuntimeHelper.downcallHandle(
        constants$886.RpcSsSetClientAllocFree$ClientFree$FUNC
    );
    static final FunctionDescriptor RpcSsSetClientAllocFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSsSetClientAllocFree$MH = RuntimeHelper.downcallHandle(
        "RpcSsSetClientAllocFree",
        constants$886.RpcSsSetClientAllocFree$FUNC
    );
    static final FunctionDescriptor RpcSsSetThreadHandle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSsSetThreadHandle$MH = RuntimeHelper.downcallHandle(
        "RpcSsSetThreadHandle",
        constants$886.RpcSsSetThreadHandle$FUNC
    );
    static final FunctionDescriptor RpcSsSwapClientAllocFree$ClientAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RpcSsSwapClientAllocFree$ClientAlloc$MH = RuntimeHelper.downcallHandle(
        constants$886.RpcSsSwapClientAllocFree$ClientAlloc$FUNC
    );
}


