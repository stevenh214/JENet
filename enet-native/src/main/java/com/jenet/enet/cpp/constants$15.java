// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$15 {

    static final FunctionDescriptor _wputenv_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wputenv_s$MH = RuntimeHelper.downcallHandle(
        "_wputenv_s",
        constants$15._wputenv_s$FUNC
    );
    static final FunctionDescriptor _wsearchenv_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _wsearchenv_s$MH = RuntimeHelper.downcallHandle(
        "_wsearchenv_s",
        constants$15._wsearchenv_s$FUNC
    );
    static final FunctionDescriptor _wsearchenv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wsearchenv$MH = RuntimeHelper.downcallHandle(
        "_wsearchenv",
        constants$15._wsearchenv$FUNC
    );
    static final FunctionDescriptor _wsystem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wsystem$MH = RuntimeHelper.downcallHandle(
        "_wsystem",
        constants$15._wsystem$FUNC
    );
    static final FunctionDescriptor _swab$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _swab$MH = RuntimeHelper.downcallHandle(
        "_swab",
        constants$15._swab$FUNC
    );
    static final FunctionDescriptor exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle exit$MH = RuntimeHelper.downcallHandle(
        "exit",
        constants$15.exit$FUNC
    );
}


