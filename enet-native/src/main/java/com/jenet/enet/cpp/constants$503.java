// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$503 {

    static final FunctionDescriptor GetQueueStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetQueueStatus$MH = RuntimeHelper.downcallHandle(
        "GetQueueStatus",
        constants$503.GetQueueStatus$FUNC
    );
    static final FunctionDescriptor GetCapture$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetCapture$MH = RuntimeHelper.downcallHandle(
        "GetCapture",
        constants$503.GetCapture$FUNC
    );
    static final FunctionDescriptor SetCapture$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCapture$MH = RuntimeHelper.downcallHandle(
        "SetCapture",
        constants$503.SetCapture$FUNC
    );
    static final FunctionDescriptor ReleaseCapture$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle ReleaseCapture$MH = RuntimeHelper.downcallHandle(
        "ReleaseCapture",
        constants$503.ReleaseCapture$FUNC
    );
    static final FunctionDescriptor MsgWaitForMultipleObjects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MsgWaitForMultipleObjects$MH = RuntimeHelper.downcallHandle(
        "MsgWaitForMultipleObjects",
        constants$503.MsgWaitForMultipleObjects$FUNC
    );
    static final FunctionDescriptor MsgWaitForMultipleObjectsEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MsgWaitForMultipleObjectsEx$MH = RuntimeHelper.downcallHandle(
        "MsgWaitForMultipleObjectsEx",
        constants$503.MsgWaitForMultipleObjectsEx$FUNC
    );
}

