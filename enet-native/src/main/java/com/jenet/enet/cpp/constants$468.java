// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$468 {

    static final FunctionDescriptor AttachThreadInput$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AttachThreadInput$MH = RuntimeHelper.downcallHandle(
        "AttachThreadInput",
        constants$468.AttachThreadInput$FUNC
    );
    static final FunctionDescriptor ReplyMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ReplyMessage$MH = RuntimeHelper.downcallHandle(
        "ReplyMessage",
        constants$468.ReplyMessage$FUNC
    );
    static final FunctionDescriptor WaitMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle WaitMessage$MH = RuntimeHelper.downcallHandle(
        "WaitMessage",
        constants$468.WaitMessage$FUNC
    );
    static final FunctionDescriptor WaitForInputIdle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForInputIdle$MH = RuntimeHelper.downcallHandle(
        "WaitForInputIdle",
        constants$468.WaitForInputIdle$FUNC
    );
    static final FunctionDescriptor DefWindowProcA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DefWindowProcA$MH = RuntimeHelper.downcallHandle(
        "DefWindowProcA",
        constants$468.DefWindowProcA$FUNC
    );
    static final FunctionDescriptor DefWindowProcW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DefWindowProcW$MH = RuntimeHelper.downcallHandle(
        "DefWindowProcW",
        constants$468.DefWindowProcW$FUNC
    );
}


