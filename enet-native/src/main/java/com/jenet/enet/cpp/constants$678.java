// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$678 {

    static final FunctionDescriptor midiInClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInClose$MH = RuntimeHelper.downcallHandle(
        "midiInClose",
        constants$678.midiInClose$FUNC
    );
    static final FunctionDescriptor midiInPrepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInPrepareHeader$MH = RuntimeHelper.downcallHandle(
        "midiInPrepareHeader",
        constants$678.midiInPrepareHeader$FUNC
    );
    static final FunctionDescriptor midiInUnprepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInUnprepareHeader$MH = RuntimeHelper.downcallHandle(
        "midiInUnprepareHeader",
        constants$678.midiInUnprepareHeader$FUNC
    );
    static final FunctionDescriptor midiInAddBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInAddBuffer$MH = RuntimeHelper.downcallHandle(
        "midiInAddBuffer",
        constants$678.midiInAddBuffer$FUNC
    );
    static final FunctionDescriptor midiInStart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInStart$MH = RuntimeHelper.downcallHandle(
        "midiInStart",
        constants$678.midiInStart$FUNC
    );
    static final FunctionDescriptor midiInStop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInStop$MH = RuntimeHelper.downcallHandle(
        "midiInStop",
        constants$678.midiInStop$FUNC
    );
}

