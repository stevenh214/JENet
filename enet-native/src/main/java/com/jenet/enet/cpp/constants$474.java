// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$474 {

    static final FunctionDescriptor PrintWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrintWindow$MH = RuntimeHelper.downcallHandle(
        "PrintWindow",
        constants$474.PrintWindow$FUNC
    );
    static final FunctionDescriptor SetLayeredWindowAttributes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetLayeredWindowAttributes$MH = RuntimeHelper.downcallHandle(
        "SetLayeredWindowAttributes",
        constants$474.SetLayeredWindowAttributes$FUNC
    );
    static final FunctionDescriptor ShowWindowAsync$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowWindowAsync$MH = RuntimeHelper.downcallHandle(
        "ShowWindowAsync",
        constants$474.ShowWindowAsync$FUNC
    );
    static final FunctionDescriptor FlashWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FlashWindow$MH = RuntimeHelper.downcallHandle(
        "FlashWindow",
        constants$474.FlashWindow$FUNC
    );
    static final FunctionDescriptor FlashWindowEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FlashWindowEx$MH = RuntimeHelper.downcallHandle(
        "FlashWindowEx",
        constants$474.FlashWindowEx$FUNC
    );
    static final FunctionDescriptor ShowOwnedPopups$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowOwnedPopups$MH = RuntimeHelper.downcallHandle(
        "ShowOwnedPopups",
        constants$474.ShowOwnedPopups$FUNC
    );
}


