// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$111 {

    static final FunctionDescriptor ReadULong64Acquire$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadULong64Acquire$MH = RuntimeHelper.downcallHandle(
        "ReadULong64Acquire",
        constants$111.ReadULong64Acquire$FUNC
    );
    static final FunctionDescriptor ReadULong64NoFence$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadULong64NoFence$MH = RuntimeHelper.downcallHandle(
        "ReadULong64NoFence",
        constants$111.ReadULong64NoFence$FUNC
    );
    static final FunctionDescriptor ReadULong64Raw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadULong64Raw$MH = RuntimeHelper.downcallHandle(
        "ReadULong64Raw",
        constants$111.ReadULong64Raw$FUNC
    );
    static final FunctionDescriptor WriteULong64Release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteULong64Release$MH = RuntimeHelper.downcallHandle(
        "WriteULong64Release",
        constants$111.WriteULong64Release$FUNC
    );
    static final FunctionDescriptor WriteULong64NoFence$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteULong64NoFence$MH = RuntimeHelper.downcallHandle(
        "WriteULong64NoFence",
        constants$111.WriteULong64NoFence$FUNC
    );
    static final FunctionDescriptor WriteULong64Raw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteULong64Raw$MH = RuntimeHelper.downcallHandle(
        "WriteULong64Raw",
        constants$111.WriteULong64Raw$FUNC
    );
}


