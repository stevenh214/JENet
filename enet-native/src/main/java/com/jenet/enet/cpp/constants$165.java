// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$165 {

    static final FunctionDescriptor GetFiberData$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetFiberData$MH = RuntimeHelper.downcallHandle(
        "GetFiberData",
        constants$165.GetFiberData$FUNC
    );
    static final FunctionDescriptor FARPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle FARPROC$MH = RuntimeHelper.downcallHandle(
        constants$165.FARPROC$FUNC
    );
    static final FunctionDescriptor NEARPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle NEARPROC$MH = RuntimeHelper.downcallHandle(
        constants$165.NEARPROC$FUNC
    );
    static final FunctionDescriptor PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
}

