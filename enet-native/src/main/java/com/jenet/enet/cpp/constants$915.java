// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$915 {

    static final FunctionDescriptor SCardStatusW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardStatusW$MH = RuntimeHelper.downcallHandle(
        "SCardStatusW",
        constants$915.SCardStatusW$FUNC
    );
    static final FunctionDescriptor SCardTransmit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardTransmit$MH = RuntimeHelper.downcallHandle(
        "SCardTransmit",
        constants$915.SCardTransmit$FUNC
    );
    static final FunctionDescriptor SCardGetTransmitCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetTransmitCount$MH = RuntimeHelper.downcallHandle(
        "SCardGetTransmitCount",
        constants$915.SCardGetTransmitCount$FUNC
    );
    static final FunctionDescriptor SCardControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardControl$MH = RuntimeHelper.downcallHandle(
        "SCardControl",
        constants$915.SCardControl$FUNC
    );
    static final FunctionDescriptor SCardGetAttrib$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetAttrib$MH = RuntimeHelper.downcallHandle(
        "SCardGetAttrib",
        constants$915.SCardGetAttrib$FUNC
    );
    static final FunctionDescriptor SCardSetAttrib$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardSetAttrib$MH = RuntimeHelper.downcallHandle(
        "SCardSetAttrib",
        constants$915.SCardSetAttrib$FUNC
    );
}


