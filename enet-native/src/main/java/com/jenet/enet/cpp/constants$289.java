// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$289 {

    static final FunctionDescriptor GetThreadGroupAffinity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadGroupAffinity$MH = RuntimeHelper.downcallHandle(
        "GetThreadGroupAffinity",
        constants$289.GetThreadGroupAffinity$FUNC
    );
    static final FunctionDescriptor SetThreadGroupAffinity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadGroupAffinity$MH = RuntimeHelper.downcallHandle(
        "SetThreadGroupAffinity",
        constants$289.SetThreadGroupAffinity$FUNC
    );
    static final FunctionDescriptor GetAppContainerNamedObjectPath$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetAppContainerNamedObjectPath$MH = RuntimeHelper.downcallHandle(
        "GetAppContainerNamedObjectPath",
        constants$289.GetAppContainerNamedObjectPath$FUNC
    );
    static final FunctionDescriptor QueryThreadCycleTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryThreadCycleTime$MH = RuntimeHelper.downcallHandle(
        "QueryThreadCycleTime",
        constants$289.QueryThreadCycleTime$FUNC
    );
    static final FunctionDescriptor QueryProcessCycleTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryProcessCycleTime$MH = RuntimeHelper.downcallHandle(
        "QueryProcessCycleTime",
        constants$289.QueryProcessCycleTime$FUNC
    );
    static final FunctionDescriptor QueryIdleProcessorCycleTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryIdleProcessorCycleTime$MH = RuntimeHelper.downcallHandle(
        "QueryIdleProcessorCycleTime",
        constants$289.QueryIdleProcessorCycleTime$FUNC
    );
}


