// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$496 {

    static final FunctionDescriptor UnregisterTouchWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterTouchWindow$MH = RuntimeHelper.downcallHandle(
        "UnregisterTouchWindow",
        constants$496.UnregisterTouchWindow$FUNC
    );
    static final FunctionDescriptor IsTouchWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsTouchWindow$MH = RuntimeHelper.downcallHandle(
        "IsTouchWindow",
        constants$496.IsTouchWindow$FUNC
    );
    static final FunctionDescriptor InitializeTouchInjection$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InitializeTouchInjection$MH = RuntimeHelper.downcallHandle(
        "InitializeTouchInjection",
        constants$496.InitializeTouchInjection$FUNC
    );
    static final FunctionDescriptor InjectTouchInput$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InjectTouchInput$MH = RuntimeHelper.downcallHandle(
        "InjectTouchInput",
        constants$496.InjectTouchInput$FUNC
    );
    static final FunctionDescriptor GetPointerType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerType$MH = RuntimeHelper.downcallHandle(
        "GetPointerType",
        constants$496.GetPointerType$FUNC
    );
    static final FunctionDescriptor GetPointerCursorId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerCursorId$MH = RuntimeHelper.downcallHandle(
        "GetPointerCursorId",
        constants$496.GetPointerCursorId$FUNC
    );
}


