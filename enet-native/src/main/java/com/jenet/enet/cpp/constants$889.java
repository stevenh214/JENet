// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$889 {

    static final FunctionDescriptor RpcSmFree$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSmFree$MH = RuntimeHelper.downcallHandle(
        "RpcSmFree",
        constants$889.RpcSmFree$FUNC
    );
    static final FunctionDescriptor RpcSmGetThreadHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSmGetThreadHandle$MH = RuntimeHelper.downcallHandle(
        "RpcSmGetThreadHandle",
        constants$889.RpcSmGetThreadHandle$FUNC
    );
    static final FunctionDescriptor RpcSmSetClientAllocFree$ClientAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RpcSmSetClientAllocFree$ClientAlloc$MH = RuntimeHelper.downcallHandle(
        constants$889.RpcSmSetClientAllocFree$ClientAlloc$FUNC
    );
    static final FunctionDescriptor RpcSmSetClientAllocFree$ClientFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSmSetClientAllocFree$ClientFree$MH = RuntimeHelper.downcallHandle(
        constants$889.RpcSmSetClientAllocFree$ClientFree$FUNC
    );
}


