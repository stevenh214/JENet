// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$473 {

    static final FunctionDescriptor DestroyWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyWindow$MH = RuntimeHelper.downcallHandle(
        "DestroyWindow",
        constants$473.DestroyWindow$FUNC
    );
    static final FunctionDescriptor ShowWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowWindow$MH = RuntimeHelper.downcallHandle(
        "ShowWindow",
        constants$473.ShowWindow$FUNC
    );
    static final FunctionDescriptor AnimateWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AnimateWindow$MH = RuntimeHelper.downcallHandle(
        "AnimateWindow",
        constants$473.AnimateWindow$FUNC
    );
    static final FunctionDescriptor UpdateLayeredWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UpdateLayeredWindow$MH = RuntimeHelper.downcallHandle(
        "UpdateLayeredWindow",
        constants$473.UpdateLayeredWindow$FUNC
    );
    static final FunctionDescriptor UpdateLayeredWindowIndirect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UpdateLayeredWindowIndirect$MH = RuntimeHelper.downcallHandle(
        "UpdateLayeredWindowIndirect",
        constants$473.UpdateLayeredWindowIndirect$FUNC
    );
    static final FunctionDescriptor GetLayeredWindowAttributes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLayeredWindowAttributes$MH = RuntimeHelper.downcallHandle(
        "GetLayeredWindowAttributes",
        constants$473.GetLayeredWindowAttributes$FUNC
    );
}


