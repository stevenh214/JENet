// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$775 {

    static final FunctionDescriptor BCryptCreateContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptCreateContext$MH = RuntimeHelper.downcallHandle(
        "BCryptCreateContext",
        constants$775.BCryptCreateContext$FUNC
    );
    static final FunctionDescriptor BCryptDeleteContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptDeleteContext$MH = RuntimeHelper.downcallHandle(
        "BCryptDeleteContext",
        constants$775.BCryptDeleteContext$FUNC
    );
    static final FunctionDescriptor BCryptEnumContexts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptEnumContexts$MH = RuntimeHelper.downcallHandle(
        "BCryptEnumContexts",
        constants$775.BCryptEnumContexts$FUNC
    );
    static final FunctionDescriptor BCryptConfigureContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptConfigureContext$MH = RuntimeHelper.downcallHandle(
        "BCryptConfigureContext",
        constants$775.BCryptConfigureContext$FUNC
    );
    static final FunctionDescriptor BCryptQueryContextConfiguration$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptQueryContextConfiguration$MH = RuntimeHelper.downcallHandle(
        "BCryptQueryContextConfiguration",
        constants$775.BCryptQueryContextConfiguration$FUNC
    );
    static final FunctionDescriptor BCryptAddContextFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptAddContextFunction$MH = RuntimeHelper.downcallHandle(
        "BCryptAddContextFunction",
        constants$775.BCryptAddContextFunction$FUNC
    );
}


