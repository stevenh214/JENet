// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$615 {

    static final FunctionDescriptor GetConsoleAliasesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleAliasesW$MH = RuntimeHelper.downcallHandle(
        "GetConsoleAliasesW",
        constants$615.GetConsoleAliasesW$FUNC
    );
    static final FunctionDescriptor GetConsoleAliasExesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetConsoleAliasExesA$MH = RuntimeHelper.downcallHandle(
        "GetConsoleAliasExesA",
        constants$615.GetConsoleAliasExesA$FUNC
    );
    static final FunctionDescriptor GetConsoleAliasExesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetConsoleAliasExesW$MH = RuntimeHelper.downcallHandle(
        "GetConsoleAliasExesW",
        constants$615.GetConsoleAliasExesW$FUNC
    );
    static final FunctionDescriptor ExpungeConsoleCommandHistoryA$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ExpungeConsoleCommandHistoryA$MH = RuntimeHelper.downcallHandle(
        "ExpungeConsoleCommandHistoryA",
        constants$615.ExpungeConsoleCommandHistoryA$FUNC
    );
    static final FunctionDescriptor ExpungeConsoleCommandHistoryW$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ExpungeConsoleCommandHistoryW$MH = RuntimeHelper.downcallHandle(
        "ExpungeConsoleCommandHistoryW",
        constants$615.ExpungeConsoleCommandHistoryW$FUNC
    );
    static final FunctionDescriptor SetConsoleNumberOfCommandsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleNumberOfCommandsA$MH = RuntimeHelper.downcallHandle(
        "SetConsoleNumberOfCommandsA",
        constants$615.SetConsoleNumberOfCommandsA$FUNC
    );
}


