// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$671 {

    static final FunctionDescriptor waveInReset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInReset$MH = RuntimeHelper.downcallHandle(
        "waveInReset",
        constants$671.waveInReset$FUNC
    );
    static final FunctionDescriptor waveInGetPosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInGetPosition$MH = RuntimeHelper.downcallHandle(
        "waveInGetPosition",
        constants$671.waveInGetPosition$FUNC
    );
    static final FunctionDescriptor waveInGetID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInGetID$MH = RuntimeHelper.downcallHandle(
        "waveInGetID",
        constants$671.waveInGetID$FUNC
    );
    static final FunctionDescriptor waveInMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle waveInMessage$MH = RuntimeHelper.downcallHandle(
        "waveInMessage",
        constants$671.waveInMessage$FUNC
    );
    static final FunctionDescriptor MIDICALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle MIDICALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$671.MIDICALLBACK$FUNC
    );
}

