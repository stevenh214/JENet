// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$569 {

    static final FunctionDescriptor ChangeWindowMessageFilter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ChangeWindowMessageFilter$MH = RuntimeHelper.downcallHandle(
        "ChangeWindowMessageFilter",
        constants$569.ChangeWindowMessageFilter$FUNC
    );
    static final FunctionDescriptor ChangeWindowMessageFilterEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChangeWindowMessageFilterEx$MH = RuntimeHelper.downcallHandle(
        "ChangeWindowMessageFilterEx",
        constants$569.ChangeWindowMessageFilterEx$FUNC
    );
    static final FunctionDescriptor GetGestureInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGestureInfo$MH = RuntimeHelper.downcallHandle(
        "GetGestureInfo",
        constants$569.GetGestureInfo$FUNC
    );
    static final FunctionDescriptor GetGestureExtraArgs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGestureExtraArgs$MH = RuntimeHelper.downcallHandle(
        "GetGestureExtraArgs",
        constants$569.GetGestureExtraArgs$FUNC
    );
    static final FunctionDescriptor CloseGestureInfoHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseGestureInfoHandle$MH = RuntimeHelper.downcallHandle(
        "CloseGestureInfoHandle",
        constants$569.CloseGestureInfoHandle$FUNC
    );
    static final FunctionDescriptor SetGestureConfig$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetGestureConfig$MH = RuntimeHelper.downcallHandle(
        "SetGestureConfig",
        constants$569.SetGestureConfig$FUNC
    );
}


