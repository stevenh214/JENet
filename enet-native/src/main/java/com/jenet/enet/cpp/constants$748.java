// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$748 {

    static final FunctionDescriptor RpcBindingUnbind$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingUnbind$MH = RuntimeHelper.downcallHandle(
        "RpcBindingUnbind",
        constants$748.RpcBindingUnbind$FUNC
    );
    static final FunctionDescriptor I_RpcAsyncSetHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcAsyncSetHandle$MH = RuntimeHelper.downcallHandle(
        "I_RpcAsyncSetHandle",
        constants$748.I_RpcAsyncSetHandle$FUNC
    );
    static final FunctionDescriptor I_RpcAsyncAbortCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcAsyncAbortCall$MH = RuntimeHelper.downcallHandle(
        "I_RpcAsyncAbortCall",
        constants$748.I_RpcAsyncAbortCall$FUNC
    );
    static final FunctionDescriptor I_RpcExceptionFilter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcExceptionFilter$MH = RuntimeHelper.downcallHandle(
        "I_RpcExceptionFilter",
        constants$748.I_RpcExceptionFilter$FUNC
    );
    static final FunctionDescriptor I_RpcBindingInqClientTokenAttributes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcBindingInqClientTokenAttributes$MH = RuntimeHelper.downcallHandle(
        "I_RpcBindingInqClientTokenAttributes",
        constants$748.I_RpcBindingInqClientTokenAttributes$FUNC
    );
    static final FunctionDescriptor CommandLineToArgvW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CommandLineToArgvW$MH = RuntimeHelper.downcallHandle(
        "CommandLineToArgvW",
        constants$748.CommandLineToArgvW$FUNC
    );
}

