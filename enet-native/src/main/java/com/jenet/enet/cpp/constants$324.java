// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$324 {

    static final FunctionDescriptor SetFirmwareEnvironmentVariableExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetFirmwareEnvironmentVariableExW$MH = RuntimeHelper.downcallHandle(
        "SetFirmwareEnvironmentVariableExW",
        constants$324.SetFirmwareEnvironmentVariableExW$FUNC
    );
    static final FunctionDescriptor GetFirmwareType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFirmwareType$MH = RuntimeHelper.downcallHandle(
        "GetFirmwareType",
        constants$324.GetFirmwareType$FUNC
    );
    static final FunctionDescriptor IsNativeVhdBoot$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsNativeVhdBoot$MH = RuntimeHelper.downcallHandle(
        "IsNativeVhdBoot",
        constants$324.IsNativeVhdBoot$FUNC
    );
    static final FunctionDescriptor FindResourceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindResourceA$MH = RuntimeHelper.downcallHandle(
        "FindResourceA",
        constants$324.FindResourceA$FUNC
    );
    static final FunctionDescriptor FindResourceExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle FindResourceExA$MH = RuntimeHelper.downcallHandle(
        "FindResourceExA",
        constants$324.FindResourceExA$FUNC
    );
    static final FunctionDescriptor EnumResourceTypesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumResourceTypesA$MH = RuntimeHelper.downcallHandle(
        "EnumResourceTypesA",
        constants$324.EnumResourceTypesA$FUNC
    );
}


