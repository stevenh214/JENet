// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$612 {

    static final FunctionDescriptor GetCurrentConsoleFont$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentConsoleFont$MH = RuntimeHelper.downcallHandle(
        "GetCurrentConsoleFont",
        constants$612.GetCurrentConsoleFont$FUNC
    );
    static final FunctionDescriptor GetCurrentConsoleFontEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentConsoleFontEx$MH = RuntimeHelper.downcallHandle(
        "GetCurrentConsoleFontEx",
        constants$612.GetCurrentConsoleFontEx$FUNC
    );
    static final FunctionDescriptor SetCurrentConsoleFontEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCurrentConsoleFontEx$MH = RuntimeHelper.downcallHandle(
        "SetCurrentConsoleFontEx",
        constants$612.SetCurrentConsoleFontEx$FUNC
    );
    static final FunctionDescriptor GetConsoleSelectionInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleSelectionInfo$MH = RuntimeHelper.downcallHandle(
        "GetConsoleSelectionInfo",
        constants$612.GetConsoleSelectionInfo$FUNC
    );
    static final FunctionDescriptor GetConsoleHistoryInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleHistoryInfo$MH = RuntimeHelper.downcallHandle(
        "GetConsoleHistoryInfo",
        constants$612.GetConsoleHistoryInfo$FUNC
    );
    static final FunctionDescriptor SetConsoleHistoryInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleHistoryInfo$MH = RuntimeHelper.downcallHandle(
        "SetConsoleHistoryInfo",
        constants$612.SetConsoleHistoryInfo$FUNC
    );
}

