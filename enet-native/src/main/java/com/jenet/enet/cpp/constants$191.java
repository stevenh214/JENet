// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$191 {

    static final FunctionDescriptor WaitForDebugEventEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForDebugEventEx$MH = RuntimeHelper.downcallHandle(
        "WaitForDebugEventEx",
        constants$191.WaitForDebugEventEx$FUNC
    );
    static final FunctionDescriptor EncodePointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncodePointer$MH = RuntimeHelper.downcallHandle(
        "EncodePointer",
        constants$191.EncodePointer$FUNC
    );
    static final FunctionDescriptor DecodePointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DecodePointer$MH = RuntimeHelper.downcallHandle(
        "DecodePointer",
        constants$191.DecodePointer$FUNC
    );
    static final FunctionDescriptor EncodeSystemPointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncodeSystemPointer$MH = RuntimeHelper.downcallHandle(
        "EncodeSystemPointer",
        constants$191.EncodeSystemPointer$FUNC
    );
    static final FunctionDescriptor DecodeSystemPointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DecodeSystemPointer$MH = RuntimeHelper.downcallHandle(
        "DecodeSystemPointer",
        constants$191.DecodeSystemPointer$FUNC
    );
    static final FunctionDescriptor EncodeRemotePointer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncodeRemotePointer$MH = RuntimeHelper.downcallHandle(
        "EncodeRemotePointer",
        constants$191.EncodeRemotePointer$FUNC
    );
}


