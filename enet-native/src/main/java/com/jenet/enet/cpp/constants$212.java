// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$212 {

    static final FunctionDescriptor SetWaitableTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWaitableTimer$MH = RuntimeHelper.downcallHandle(
        "SetWaitableTimer",
        constants$212.SetWaitableTimer$FUNC
    );
    static final FunctionDescriptor CancelWaitableTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CancelWaitableTimer$MH = RuntimeHelper.downcallHandle(
        "CancelWaitableTimer",
        constants$212.CancelWaitableTimer$FUNC
    );
    static final FunctionDescriptor CreateMutexExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateMutexExA$MH = RuntimeHelper.downcallHandle(
        "CreateMutexExA",
        constants$212.CreateMutexExA$FUNC
    );
    static final FunctionDescriptor CreateMutexExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateMutexExW$MH = RuntimeHelper.downcallHandle(
        "CreateMutexExW",
        constants$212.CreateMutexExW$FUNC
    );
    static final FunctionDescriptor CreateEventExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateEventExA$MH = RuntimeHelper.downcallHandle(
        "CreateEventExA",
        constants$212.CreateEventExA$FUNC
    );
    static final FunctionDescriptor CreateEventExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateEventExW$MH = RuntimeHelper.downcallHandle(
        "CreateEventExW",
        constants$212.CreateEventExW$FUNC
    );
}


