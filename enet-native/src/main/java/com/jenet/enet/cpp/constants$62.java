// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$62 {

    static final FunctionDescriptor strrchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle strrchr$MH = RuntimeHelper.downcallHandle(
        "strrchr",
        constants$62.strrchr$FUNC
    );
    static final FunctionDescriptor strstr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strstr$MH = RuntimeHelper.downcallHandle(
        "strstr",
        constants$62.strstr$FUNC
    );
    static final FunctionDescriptor wcschr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle wcschr$MH = RuntimeHelper.downcallHandle(
        "wcschr",
        constants$62.wcschr$FUNC
    );
    static final FunctionDescriptor wcsrchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle wcsrchr$MH = RuntimeHelper.downcallHandle(
        "wcsrchr",
        constants$62.wcsrchr$FUNC
    );
    static final FunctionDescriptor wcsstr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcsstr$MH = RuntimeHelper.downcallHandle(
        "wcsstr",
        constants$62.wcsstr$FUNC
    );
    static final FunctionDescriptor memcpy_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle memcpy_s$MH = RuntimeHelper.downcallHandle(
        "memcpy_s",
        constants$62.memcpy_s$FUNC
    );
}


