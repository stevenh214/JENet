// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$250 {

    static final FunctionDescriptor TerminateEnclave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TerminateEnclave$MH = RuntimeHelper.downcallHandle(
        "TerminateEnclave",
        constants$250.TerminateEnclave$FUNC
    );
    static final FunctionDescriptor DeleteEnclave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteEnclave$MH = RuntimeHelper.downcallHandle(
        "DeleteEnclave",
        constants$250.DeleteEnclave$FUNC
    );
    static final FunctionDescriptor QueueUserWorkItem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle QueueUserWorkItem$MH = RuntimeHelper.downcallHandle(
        "QueueUserWorkItem",
        constants$250.QueueUserWorkItem$FUNC
    );
    static final FunctionDescriptor UnregisterWaitEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterWaitEx$MH = RuntimeHelper.downcallHandle(
        "UnregisterWaitEx",
        constants$250.UnregisterWaitEx$FUNC
    );
    static final FunctionDescriptor CreateTimerQueue$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle CreateTimerQueue$MH = RuntimeHelper.downcallHandle(
        "CreateTimerQueue",
        constants$250.CreateTimerQueue$FUNC
    );
    static final FunctionDescriptor CreateTimerQueueTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateTimerQueueTimer$MH = RuntimeHelper.downcallHandle(
        "CreateTimerQueueTimer",
        constants$250.CreateTimerQueueTimer$FUNC
    );
}


