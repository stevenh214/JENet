// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$308 {

    static final FunctionDescriptor GetCommProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommProperties$MH = RuntimeHelper.downcallHandle(
        "GetCommProperties",
        constants$308.GetCommProperties$FUNC
    );
    static final FunctionDescriptor GetCommModemStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommModemStatus$MH = RuntimeHelper.downcallHandle(
        "GetCommModemStatus",
        constants$308.GetCommModemStatus$FUNC
    );
    static final FunctionDescriptor GetCommState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommState$MH = RuntimeHelper.downcallHandle(
        "GetCommState",
        constants$308.GetCommState$FUNC
    );
    static final FunctionDescriptor GetCommTimeouts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommTimeouts$MH = RuntimeHelper.downcallHandle(
        "GetCommTimeouts",
        constants$308.GetCommTimeouts$FUNC
    );
    static final FunctionDescriptor PurgeComm$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PurgeComm$MH = RuntimeHelper.downcallHandle(
        "PurgeComm",
        constants$308.PurgeComm$FUNC
    );
    static final FunctionDescriptor SetCommBreak$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCommBreak$MH = RuntimeHelper.downcallHandle(
        "SetCommBreak",
        constants$308.SetCommBreak$FUNC
    );
}


