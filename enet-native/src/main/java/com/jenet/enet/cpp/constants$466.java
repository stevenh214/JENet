// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$466 {

    static final FunctionDescriptor BroadcastSystemMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle BroadcastSystemMessageW$MH = RuntimeHelper.downcallHandle(
        "BroadcastSystemMessageW",
        constants$466.BroadcastSystemMessageW$FUNC
    );
    static final FunctionDescriptor RegisterDeviceNotificationA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterDeviceNotificationA$MH = RuntimeHelper.downcallHandle(
        "RegisterDeviceNotificationA",
        constants$466.RegisterDeviceNotificationA$FUNC
    );
    static final FunctionDescriptor RegisterDeviceNotificationW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterDeviceNotificationW$MH = RuntimeHelper.downcallHandle(
        "RegisterDeviceNotificationW",
        constants$466.RegisterDeviceNotificationW$FUNC
    );
    static final FunctionDescriptor UnregisterDeviceNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterDeviceNotification$MH = RuntimeHelper.downcallHandle(
        "UnregisterDeviceNotification",
        constants$466.UnregisterDeviceNotification$FUNC
    );
    static final FunctionDescriptor RegisterPowerSettingNotification$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterPowerSettingNotification$MH = RuntimeHelper.downcallHandle(
        "RegisterPowerSettingNotification",
        constants$466.RegisterPowerSettingNotification$FUNC
    );
    static final FunctionDescriptor UnregisterPowerSettingNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterPowerSettingNotification$MH = RuntimeHelper.downcallHandle(
        "UnregisterPowerSettingNotification",
        constants$466.UnregisterPowerSettingNotification$FUNC
    );
}


