// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$461 {

    static final FunctionDescriptor DrawAnimatedRects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DrawAnimatedRects$MH = RuntimeHelper.downcallHandle(
        "DrawAnimatedRects",
        constants$461.DrawAnimatedRects$FUNC
    );
    static final FunctionDescriptor GetMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMessageA$MH = RuntimeHelper.downcallHandle(
        "GetMessageA",
        constants$461.GetMessageA$FUNC
    );
    static final FunctionDescriptor GetMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMessageW$MH = RuntimeHelper.downcallHandle(
        "GetMessageW",
        constants$461.GetMessageW$FUNC
    );
    static final FunctionDescriptor TranslateMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TranslateMessage$MH = RuntimeHelper.downcallHandle(
        "TranslateMessage",
        constants$461.TranslateMessage$FUNC
    );
    static final FunctionDescriptor DispatchMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DispatchMessageA$MH = RuntimeHelper.downcallHandle(
        "DispatchMessageA",
        constants$461.DispatchMessageA$FUNC
    );
    static final FunctionDescriptor DispatchMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DispatchMessageW$MH = RuntimeHelper.downcallHandle(
        "DispatchMessageW",
        constants$461.DispatchMessageW$FUNC
    );
}


