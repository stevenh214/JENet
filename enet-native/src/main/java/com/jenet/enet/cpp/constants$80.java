// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$80 {

    static final FunctionDescriptor strnlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strnlen$MH = RuntimeHelper.downcallHandle(
        "strnlen",
        constants$80.strnlen$FUNC
    );
    static final FunctionDescriptor strnlen_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strnlen_s$MH = RuntimeHelper.downcallHandle(
        "strnlen_s",
        constants$80.strnlen_s$FUNC
    );
    static final FunctionDescriptor _strnset_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _strnset_s$MH = RuntimeHelper.downcallHandle(
        "_strnset_s",
        constants$80._strnset_s$FUNC
    );
    static final FunctionDescriptor _strnset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _strnset$MH = RuntimeHelper.downcallHandle(
        "_strnset",
        constants$80._strnset$FUNC
    );
    static final FunctionDescriptor strpbrk$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strpbrk$MH = RuntimeHelper.downcallHandle(
        "strpbrk",
        constants$80.strpbrk$FUNC
    );
    static final FunctionDescriptor _strrev$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strrev$MH = RuntimeHelper.downcallHandle(
        "_strrev",
        constants$80._strrev$FUNC
    );
}

