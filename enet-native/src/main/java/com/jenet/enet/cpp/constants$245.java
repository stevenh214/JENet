// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$245 {

    static final FunctionDescriptor BAD_MEMORY_CALLBACK_ROUTINE$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle BAD_MEMORY_CALLBACK_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$245.BAD_MEMORY_CALLBACK_ROUTINE$FUNC
    );
    static final FunctionDescriptor PBAD_MEMORY_CALLBACK_ROUTINE$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PBAD_MEMORY_CALLBACK_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$245.PBAD_MEMORY_CALLBACK_ROUTINE$FUNC
    );
    static final FunctionDescriptor RegisterBadMemoryNotification$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterBadMemoryNotification$MH = RuntimeHelper.downcallHandle(
        "RegisterBadMemoryNotification",
        constants$245.RegisterBadMemoryNotification$FUNC
    );
    static final FunctionDescriptor UnregisterBadMemoryNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterBadMemoryNotification$MH = RuntimeHelper.downcallHandle(
        "UnregisterBadMemoryNotification",
        constants$245.UnregisterBadMemoryNotification$FUNC
    );
    static final FunctionDescriptor OfferVirtualMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OfferVirtualMemory$MH = RuntimeHelper.downcallHandle(
        "OfferVirtualMemory",
        constants$245.OfferVirtualMemory$FUNC
    );
}


