// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$492 {

    static final FunctionDescriptor GetActiveWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetActiveWindow$MH = RuntimeHelper.downcallHandle(
        "GetActiveWindow",
        constants$492.GetActiveWindow$FUNC
    );
    static final FunctionDescriptor GetFocus$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetFocus$MH = RuntimeHelper.downcallHandle(
        "GetFocus",
        constants$492.GetFocus$FUNC
    );
    static final FunctionDescriptor GetKBCodePage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetKBCodePage$MH = RuntimeHelper.downcallHandle(
        "GetKBCodePage",
        constants$492.GetKBCodePage$FUNC
    );
    static final FunctionDescriptor GetKeyState$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetKeyState$MH = RuntimeHelper.downcallHandle(
        "GetKeyState",
        constants$492.GetKeyState$FUNC
    );
    static final FunctionDescriptor GetAsyncKeyState$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAsyncKeyState$MH = RuntimeHelper.downcallHandle(
        "GetAsyncKeyState",
        constants$492.GetAsyncKeyState$FUNC
    );
    static final FunctionDescriptor GetKeyboardState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetKeyboardState$MH = RuntimeHelper.downcallHandle(
        "GetKeyboardState",
        constants$492.GetKeyboardState$FUNC
    );
}


