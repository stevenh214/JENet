// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1251 {

    static final FunctionDescriptor ReplaceTextW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReplaceTextW$MH = RuntimeHelper.downcallHandle(
        "ReplaceTextW",
        constants$1251.ReplaceTextW$FUNC
    );
    static final FunctionDescriptor LPCFHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPCFHOOKPROC$MH = RuntimeHelper.downcallHandle(
        constants$1251.LPCFHOOKPROC$FUNC
    );
    static final FunctionDescriptor ChooseFontA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChooseFontA$MH = RuntimeHelper.downcallHandle(
        "ChooseFontA",
        constants$1251.ChooseFontA$FUNC
    );
    static final FunctionDescriptor ChooseFontW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChooseFontW$MH = RuntimeHelper.downcallHandle(
        "ChooseFontW",
        constants$1251.ChooseFontW$FUNC
    );
    static final FunctionDescriptor LPPRINTHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
}


