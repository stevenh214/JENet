// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$365 {

    static final FunctionDescriptor SystemTimeToTzSpecificLocalTimeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SystemTimeToTzSpecificLocalTimeEx$MH = RuntimeHelper.downcallHandle(
        "SystemTimeToTzSpecificLocalTimeEx",
        constants$365.SystemTimeToTzSpecificLocalTimeEx$FUNC
    );
    static final FunctionDescriptor TzSpecificLocalTimeToSystemTimeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TzSpecificLocalTimeToSystemTimeEx$MH = RuntimeHelper.downcallHandle(
        "TzSpecificLocalTimeToSystemTimeEx",
        constants$365.TzSpecificLocalTimeToSystemTimeEx$FUNC
    );
    static final FunctionDescriptor LocalFileTimeToLocalSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalFileTimeToLocalSystemTime$MH = RuntimeHelper.downcallHandle(
        "LocalFileTimeToLocalSystemTime",
        constants$365.LocalFileTimeToLocalSystemTime$FUNC
    );
    static final FunctionDescriptor LocalSystemTimeToLocalFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalSystemTimeToLocalFileTime$MH = RuntimeHelper.downcallHandle(
        "LocalSystemTimeToLocalFileTime",
        constants$365.LocalSystemTimeToLocalFileTime$FUNC
    );
    static final FunctionDescriptor SetSystemPowerState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSystemPowerState$MH = RuntimeHelper.downcallHandle(
        "SetSystemPowerState",
        constants$365.SetSystemPowerState$FUNC
    );
    static final FunctionDescriptor GetSystemPowerStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemPowerStatus$MH = RuntimeHelper.downcallHandle(
        "GetSystemPowerStatus",
        constants$365.GetSystemPowerStatus$FUNC
    );
}


