// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$213 {

    static final FunctionDescriptor CreateSemaphoreExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateSemaphoreExW$MH = RuntimeHelper.downcallHandle(
        "CreateSemaphoreExW",
        constants$213.CreateSemaphoreExW$FUNC
    );
    static final FunctionDescriptor CreateWaitableTimerExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateWaitableTimerExW$MH = RuntimeHelper.downcallHandle(
        "CreateWaitableTimerExW",
        constants$213.CreateWaitableTimerExW$FUNC
    );
    static final FunctionDescriptor EnterSynchronizationBarrier$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnterSynchronizationBarrier$MH = RuntimeHelper.downcallHandle(
        "EnterSynchronizationBarrier",
        constants$213.EnterSynchronizationBarrier$FUNC
    );
    static final FunctionDescriptor InitializeSynchronizationBarrier$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InitializeSynchronizationBarrier$MH = RuntimeHelper.downcallHandle(
        "InitializeSynchronizationBarrier",
        constants$213.InitializeSynchronizationBarrier$FUNC
    );
    static final FunctionDescriptor DeleteSynchronizationBarrier$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteSynchronizationBarrier$MH = RuntimeHelper.downcallHandle(
        "DeleteSynchronizationBarrier",
        constants$213.DeleteSynchronizationBarrier$FUNC
    );
    static final FunctionDescriptor Sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Sleep$MH = RuntimeHelper.downcallHandle(
        "Sleep",
        constants$213.Sleep$FUNC
    );
}


