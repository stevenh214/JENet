// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$219 {

    static final FunctionDescriptor ExitThread$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExitThread$MH = RuntimeHelper.downcallHandle(
        "ExitThread",
        constants$219.ExitThread$FUNC
    );
    static final FunctionDescriptor TerminateThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TerminateThread$MH = RuntimeHelper.downcallHandle(
        "TerminateThread",
        constants$219.TerminateThread$FUNC
    );
    static final FunctionDescriptor GetExitCodeThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetExitCodeThread$MH = RuntimeHelper.downcallHandle(
        "GetExitCodeThread",
        constants$219.GetExitCodeThread$FUNC
    );
    static final FunctionDescriptor SuspendThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SuspendThread$MH = RuntimeHelper.downcallHandle(
        "SuspendThread",
        constants$219.SuspendThread$FUNC
    );
    static final FunctionDescriptor ResumeThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ResumeThread$MH = RuntimeHelper.downcallHandle(
        "ResumeThread",
        constants$219.ResumeThread$FUNC
    );
    static final FunctionDescriptor TlsAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle TlsAlloc$MH = RuntimeHelper.downcallHandle(
        "TlsAlloc",
        constants$219.TlsAlloc$FUNC
    );
}


