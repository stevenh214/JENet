// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$170 {

    static final FunctionDescriptor SetEnvironmentVariableA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEnvironmentVariableA$MH = RuntimeHelper.downcallHandle(
        "SetEnvironmentVariableA",
        constants$170.SetEnvironmentVariableA$FUNC
    );
    static final FunctionDescriptor SetEnvironmentVariableW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEnvironmentVariableW$MH = RuntimeHelper.downcallHandle(
        "SetEnvironmentVariableW",
        constants$170.SetEnvironmentVariableW$FUNC
    );
    static final FunctionDescriptor ExpandEnvironmentStringsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExpandEnvironmentStringsA$MH = RuntimeHelper.downcallHandle(
        "ExpandEnvironmentStringsA",
        constants$170.ExpandEnvironmentStringsA$FUNC
    );
    static final FunctionDescriptor ExpandEnvironmentStringsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExpandEnvironmentStringsW$MH = RuntimeHelper.downcallHandle(
        "ExpandEnvironmentStringsW",
        constants$170.ExpandEnvironmentStringsW$FUNC
    );
    static final FunctionDescriptor SetCurrentDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCurrentDirectoryA$MH = RuntimeHelper.downcallHandle(
        "SetCurrentDirectoryA",
        constants$170.SetCurrentDirectoryA$FUNC
    );
    static final FunctionDescriptor SetCurrentDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCurrentDirectoryW$MH = RuntimeHelper.downcallHandle(
        "SetCurrentDirectoryW",
        constants$170.SetCurrentDirectoryW$FUNC
    );
}


