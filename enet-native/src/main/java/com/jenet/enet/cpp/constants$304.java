// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$304 {

    static final FunctionDescriptor PowerClearRequest$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PowerClearRequest$MH = RuntimeHelper.downcallHandle(
        "PowerClearRequest",
        constants$304.PowerClearRequest$FUNC
    );
    static final FunctionDescriptor SetFileCompletionNotificationModes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle SetFileCompletionNotificationModes$MH = RuntimeHelper.downcallHandle(
        "SetFileCompletionNotificationModes",
        constants$304.SetFileCompletionNotificationModes$FUNC
    );
    static final FunctionDescriptor Wow64GetThreadSelectorEntry$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Wow64GetThreadSelectorEntry$MH = RuntimeHelper.downcallHandle(
        "Wow64GetThreadSelectorEntry",
        constants$304.Wow64GetThreadSelectorEntry$FUNC
    );
    static final FunctionDescriptor DebugSetProcessKillOnExit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DebugSetProcessKillOnExit$MH = RuntimeHelper.downcallHandle(
        "DebugSetProcessKillOnExit",
        constants$304.DebugSetProcessKillOnExit$FUNC
    );
    static final FunctionDescriptor DebugBreakProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DebugBreakProcess$MH = RuntimeHelper.downcallHandle(
        "DebugBreakProcess",
        constants$304.DebugBreakProcess$FUNC
    );
    static final FunctionDescriptor PulseEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PulseEvent$MH = RuntimeHelper.downcallHandle(
        "PulseEvent",
        constants$304.PulseEvent$FUNC
    );
}

