// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$591 {

    static final FunctionDescriptor GetUserDefaultLangID$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetUserDefaultLangID$MH = RuntimeHelper.downcallHandle(
        "GetUserDefaultLangID",
        constants$591.GetUserDefaultLangID$FUNC
    );
    static final FunctionDescriptor GetSystemDefaultLangID$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetSystemDefaultLangID$MH = RuntimeHelper.downcallHandle(
        "GetSystemDefaultLangID",
        constants$591.GetSystemDefaultLangID$FUNC
    );
    static final FunctionDescriptor GetSystemDefaultLCID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetSystemDefaultLCID$MH = RuntimeHelper.downcallHandle(
        "GetSystemDefaultLCID",
        constants$591.GetSystemDefaultLCID$FUNC
    );
    static final FunctionDescriptor GetUserDefaultLCID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetUserDefaultLCID$MH = RuntimeHelper.downcallHandle(
        "GetUserDefaultLCID",
        constants$591.GetUserDefaultLCID$FUNC
    );
    static final FunctionDescriptor SetThreadUILanguage$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle SetThreadUILanguage$MH = RuntimeHelper.downcallHandle(
        "SetThreadUILanguage",
        constants$591.SetThreadUILanguage$FUNC
    );
    static final FunctionDescriptor GetThreadUILanguage$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetThreadUILanguage$MH = RuntimeHelper.downcallHandle(
        "GetThreadUILanguage",
        constants$591.GetThreadUILanguage$FUNC
    );
}

