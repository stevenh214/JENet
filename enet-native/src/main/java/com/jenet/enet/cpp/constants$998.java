// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$998 {

    static final FunctionDescriptor StringFromGUID2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle StringFromGUID2$MH = RuntimeHelper.downcallHandle(
        "StringFromGUID2",
        constants$998.StringFromGUID2$FUNC
    );
    static final FunctionDescriptor CoCreateGuid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoCreateGuid$MH = RuntimeHelper.downcallHandle(
        "CoCreateGuid",
        constants$998.CoCreateGuid$FUNC
    );
    static final FunctionDescriptor PropVariantCopy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PropVariantCopy$MH = RuntimeHelper.downcallHandle(
        "PropVariantCopy",
        constants$998.PropVariantCopy$FUNC
    );
    static final FunctionDescriptor PropVariantClear$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PropVariantClear$MH = RuntimeHelper.downcallHandle(
        "PropVariantClear",
        constants$998.PropVariantClear$FUNC
    );
    static final FunctionDescriptor FreePropVariantArray$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreePropVariantArray$MH = RuntimeHelper.downcallHandle(
        "FreePropVariantArray",
        constants$998.FreePropVariantArray$FUNC
    );
    static final FunctionDescriptor CoWaitForMultipleHandles$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoWaitForMultipleHandles$MH = RuntimeHelper.downcallHandle(
        "CoWaitForMultipleHandles",
        constants$998.CoWaitForMultipleHandles$FUNC
    );
}


