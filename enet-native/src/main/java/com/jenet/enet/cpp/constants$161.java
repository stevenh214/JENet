// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$161 {

    static final FunctionDescriptor RtlSwitchedVVI$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RtlSwitchedVVI$MH = RuntimeHelper.downcallHandle(
        "RtlSwitchedVVI",
        constants$161.RtlSwitchedVVI$FUNC
    );
    static final FunctionDescriptor PTP_SIMPLE_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_SIMPLE_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$161.PTP_SIMPLE_CALLBACK$FUNC
    );
    static final FunctionDescriptor PTP_CLEANUP_GROUP_CANCEL_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_CLEANUP_GROUP_CANCEL_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$161.PTP_CLEANUP_GROUP_CANCEL_CALLBACK$FUNC
    );
    static final FunctionDescriptor TpInitializeCallbackEnviron$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpInitializeCallbackEnviron$MH = RuntimeHelper.downcallHandle(
        "TpInitializeCallbackEnviron",
        constants$161.TpInitializeCallbackEnviron$FUNC
    );
}


