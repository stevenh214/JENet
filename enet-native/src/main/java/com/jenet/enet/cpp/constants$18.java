// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$18 {

    static final FunctionDescriptor at_quick_exit$x0$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle at_quick_exit$x0$MH = RuntimeHelper.downcallHandle(
        constants$18.at_quick_exit$x0$FUNC
    );
    static final FunctionDescriptor at_quick_exit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle at_quick_exit$MH = RuntimeHelper.downcallHandle(
        "at_quick_exit",
        constants$18.at_quick_exit$FUNC
    );
    static final FunctionDescriptor _purecall_handler$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _purecall_handler$MH = RuntimeHelper.downcallHandle(
        constants$18._purecall_handler$FUNC
    );
    static final FunctionDescriptor _invalid_parameter_handler$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _invalid_parameter_handler$MH = RuntimeHelper.downcallHandle(
        constants$18._invalid_parameter_handler$FUNC
    );
}


