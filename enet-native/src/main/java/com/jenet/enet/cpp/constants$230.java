// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$230 {

    static final FunctionDescriptor GetThreadSelectedCpuSets$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadSelectedCpuSets$MH = RuntimeHelper.downcallHandle(
        "GetThreadSelectedCpuSets",
        constants$230.GetThreadSelectedCpuSets$FUNC
    );
    static final FunctionDescriptor SetThreadSelectedCpuSets$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadSelectedCpuSets$MH = RuntimeHelper.downcallHandle(
        "SetThreadSelectedCpuSets",
        constants$230.SetThreadSelectedCpuSets$FUNC
    );
    static final FunctionDescriptor CreateProcessAsUserA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateProcessAsUserA$MH = RuntimeHelper.downcallHandle(
        "CreateProcessAsUserA",
        constants$230.CreateProcessAsUserA$FUNC
    );
    static final FunctionDescriptor GetProcessShutdownParameters$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessShutdownParameters$MH = RuntimeHelper.downcallHandle(
        "GetProcessShutdownParameters",
        constants$230.GetProcessShutdownParameters$FUNC
    );
    static final FunctionDescriptor SetThreadDescription$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadDescription$MH = RuntimeHelper.downcallHandle(
        "SetThreadDescription",
        constants$230.SetThreadDescription$FUNC
    );
    static final FunctionDescriptor GetThreadDescription$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadDescription$MH = RuntimeHelper.downcallHandle(
        "GetThreadDescription",
        constants$230.GetThreadDescription$FUNC
    );
}


