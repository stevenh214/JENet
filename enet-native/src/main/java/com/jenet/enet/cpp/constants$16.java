// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$16 {

    static final FunctionDescriptor _exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _exit$MH = RuntimeHelper.downcallHandle(
        "_exit",
        constants$16._exit$FUNC
    );
    static final FunctionDescriptor _Exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _Exit$MH = RuntimeHelper.downcallHandle(
        "_Exit",
        constants$16._Exit$FUNC
    );
    static final FunctionDescriptor quick_exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle quick_exit$MH = RuntimeHelper.downcallHandle(
        "quick_exit",
        constants$16.quick_exit$FUNC
    );
    static final FunctionDescriptor abort$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle abort$MH = RuntimeHelper.downcallHandle(
        "abort",
        constants$16.abort$FUNC
    );
    static final FunctionDescriptor _set_abort_behavior$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _set_abort_behavior$MH = RuntimeHelper.downcallHandle(
        "_set_abort_behavior",
        constants$16._set_abort_behavior$FUNC
    );
    static final FunctionDescriptor _onexit_t$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
}

