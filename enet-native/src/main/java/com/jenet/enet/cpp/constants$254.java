// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$254 {

    static final FunctionDescriptor FreeLibraryWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeLibraryWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "FreeLibraryWhenCallbackReturns",
        constants$254.FreeLibraryWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor CallbackMayRunLong$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CallbackMayRunLong$MH = RuntimeHelper.downcallHandle(
        "CallbackMayRunLong",
        constants$254.CallbackMayRunLong$FUNC
    );
    static final FunctionDescriptor DisassociateCurrentThreadFromCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisassociateCurrentThreadFromCallback$MH = RuntimeHelper.downcallHandle(
        "DisassociateCurrentThreadFromCallback",
        constants$254.DisassociateCurrentThreadFromCallback$FUNC
    );
    static final FunctionDescriptor TrySubmitThreadpoolCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrySubmitThreadpoolCallback$MH = RuntimeHelper.downcallHandle(
        "TrySubmitThreadpoolCallback",
        constants$254.TrySubmitThreadpoolCallback$FUNC
    );
    static final FunctionDescriptor CreateThreadpoolWork$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateThreadpoolWork$MH = RuntimeHelper.downcallHandle(
        "CreateThreadpoolWork",
        constants$254.CreateThreadpoolWork$FUNC
    );
    static final FunctionDescriptor SubmitThreadpoolWork$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SubmitThreadpoolWork$MH = RuntimeHelper.downcallHandle(
        "SubmitThreadpoolWork",
        constants$254.SubmitThreadpoolWork$FUNC
    );
}


