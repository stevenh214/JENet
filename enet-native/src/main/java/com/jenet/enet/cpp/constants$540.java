// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$540 {

    static final FunctionDescriptor GetProcessDefaultLayout$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessDefaultLayout$MH = RuntimeHelper.downcallHandle(
        "GetProcessDefaultLayout",
        constants$540.GetProcessDefaultLayout$FUNC
    );
    static final FunctionDescriptor SetProcessDefaultLayout$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessDefaultLayout$MH = RuntimeHelper.downcallHandle(
        "SetProcessDefaultLayout",
        constants$540.SetProcessDefaultLayout$FUNC
    );
    static final FunctionDescriptor GetDesktopWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetDesktopWindow$MH = RuntimeHelper.downcallHandle(
        "GetDesktopWindow",
        constants$540.GetDesktopWindow$FUNC
    );
    static final FunctionDescriptor GetParent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetParent$MH = RuntimeHelper.downcallHandle(
        "GetParent",
        constants$540.GetParent$FUNC
    );
    static final FunctionDescriptor SetParent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetParent$MH = RuntimeHelper.downcallHandle(
        "SetParent",
        constants$540.SetParent$FUNC
    );
    static final FunctionDescriptor EnumChildWindows$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumChildWindows$MH = RuntimeHelper.downcallHandle(
        "EnumChildWindows",
        constants$540.EnumChildWindows$FUNC
    );
}

