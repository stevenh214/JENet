// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$157 {

    static final FunctionDescriptor RtlExtendCorrelationVector$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlExtendCorrelationVector$MH = RuntimeHelper.downcallHandle(
        "RtlExtendCorrelationVector",
        constants$157.RtlExtendCorrelationVector$FUNC
    );
    static final FunctionDescriptor RtlValidateCorrelationVector$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlValidateCorrelationVector$MH = RuntimeHelper.downcallHandle(
        "RtlValidateCorrelationVector",
        constants$157.RtlValidateCorrelationVector$FUNC
    );
    static final FunctionDescriptor CUSTOM_SYSTEM_EVENT_TRIGGER_INIT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CUSTOM_SYSTEM_EVENT_TRIGGER_INIT$MH = RuntimeHelper.downcallHandle(
        "CUSTOM_SYSTEM_EVENT_TRIGGER_INIT",
        constants$157.CUSTOM_SYSTEM_EVENT_TRIGGER_INIT$FUNC
    );
    static final FunctionDescriptor RtlRaiseCustomSystemEventTrigger$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlRaiseCustomSystemEventTrigger$MH = RuntimeHelper.downcallHandle(
        "RtlRaiseCustomSystemEventTrigger",
        constants$157.RtlRaiseCustomSystemEventTrigger$FUNC
    );
    static final FunctionDescriptor RtlIsZeroMemory$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RtlIsZeroMemory$MH = RuntimeHelper.downcallHandle(
        "RtlIsZeroMemory",
        constants$157.RtlIsZeroMemory$FUNC
    );
    static final FunctionDescriptor RtlNormalizeSecurityDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle RtlNormalizeSecurityDescriptor$MH = RuntimeHelper.downcallHandle(
        "RtlNormalizeSecurityDescriptor",
        constants$157.RtlNormalizeSecurityDescriptor$FUNC
    );
}


