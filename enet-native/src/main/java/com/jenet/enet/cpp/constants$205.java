// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$205 {

    static final FunctionDescriptor AcquireSRWLockShared$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AcquireSRWLockShared$MH = RuntimeHelper.downcallHandle(
        "AcquireSRWLockShared",
        constants$205.AcquireSRWLockShared$FUNC
    );
    static final FunctionDescriptor TryAcquireSRWLockExclusive$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TryAcquireSRWLockExclusive$MH = RuntimeHelper.downcallHandle(
        "TryAcquireSRWLockExclusive",
        constants$205.TryAcquireSRWLockExclusive$FUNC
    );
    static final FunctionDescriptor TryAcquireSRWLockShared$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TryAcquireSRWLockShared$MH = RuntimeHelper.downcallHandle(
        "TryAcquireSRWLockShared",
        constants$205.TryAcquireSRWLockShared$FUNC
    );
    static final FunctionDescriptor InitializeCriticalSection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitializeCriticalSection$MH = RuntimeHelper.downcallHandle(
        "InitializeCriticalSection",
        constants$205.InitializeCriticalSection$FUNC
    );
    static final FunctionDescriptor EnterCriticalSection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnterCriticalSection$MH = RuntimeHelper.downcallHandle(
        "EnterCriticalSection",
        constants$205.EnterCriticalSection$FUNC
    );
    static final FunctionDescriptor LeaveCriticalSection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LeaveCriticalSection$MH = RuntimeHelper.downcallHandle(
        "LeaveCriticalSection",
        constants$205.LeaveCriticalSection$FUNC
    );
}

