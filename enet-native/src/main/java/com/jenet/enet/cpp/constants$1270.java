// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1270 {

    static final FunctionDescriptor NotifyServiceStatusChangeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NotifyServiceStatusChangeW$MH = RuntimeHelper.downcallHandle(
        "NotifyServiceStatusChangeW",
        constants$1270.NotifyServiceStatusChangeW$FUNC
    );
    static final FunctionDescriptor ControlServiceExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ControlServiceExA$MH = RuntimeHelper.downcallHandle(
        "ControlServiceExA",
        constants$1270.ControlServiceExA$FUNC
    );
    static final FunctionDescriptor ControlServiceExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ControlServiceExW$MH = RuntimeHelper.downcallHandle(
        "ControlServiceExW",
        constants$1270.ControlServiceExW$FUNC
    );
    static final FunctionDescriptor QueryServiceDynamicInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryServiceDynamicInformation$MH = RuntimeHelper.downcallHandle(
        "QueryServiceDynamicInformation",
        constants$1270.QueryServiceDynamicInformation$FUNC
    );
    static final FunctionDescriptor SC_NOTIFICATION_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SC_NOTIFICATION_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$1270.SC_NOTIFICATION_CALLBACK$FUNC
    );
}

