// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1289 {

    static final FunctionDescriptor setsockopt$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle setsockopt$MH = RuntimeHelper.downcallHandle(
        "setsockopt",
        constants$1289.setsockopt$FUNC
    );
    static final FunctionDescriptor shutdown$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle shutdown$MH = RuntimeHelper.downcallHandle(
        "shutdown",
        constants$1289.shutdown$FUNC
    );
    static final FunctionDescriptor socket$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle socket$MH = RuntimeHelper.downcallHandle(
        "socket",
        constants$1289.socket$FUNC
    );
    static final FunctionDescriptor gethostbyaddr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gethostbyaddr$MH = RuntimeHelper.downcallHandle(
        "gethostbyaddr",
        constants$1289.gethostbyaddr$FUNC
    );
    static final FunctionDescriptor gethostbyname$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gethostbyname$MH = RuntimeHelper.downcallHandle(
        "gethostbyname",
        constants$1289.gethostbyname$FUNC
    );
    static final FunctionDescriptor gethostname$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gethostname$MH = RuntimeHelper.downcallHandle(
        "gethostname",
        constants$1289.gethostname$FUNC
    );
}


