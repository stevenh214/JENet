// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$654 {

    static final FunctionDescriptor mciGetDeviceIDA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mciGetDeviceIDA$MH = RuntimeHelper.downcallHandle(
        "mciGetDeviceIDA",
        constants$654.mciGetDeviceIDA$FUNC
    );
    static final FunctionDescriptor mciGetDeviceIDW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mciGetDeviceIDW$MH = RuntimeHelper.downcallHandle(
        "mciGetDeviceIDW",
        constants$654.mciGetDeviceIDW$FUNC
    );
    static final FunctionDescriptor mciGetDeviceIDFromElementIDA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mciGetDeviceIDFromElementIDA$MH = RuntimeHelper.downcallHandle(
        "mciGetDeviceIDFromElementIDA",
        constants$654.mciGetDeviceIDFromElementIDA$FUNC
    );
    static final FunctionDescriptor mciGetDeviceIDFromElementIDW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mciGetDeviceIDFromElementIDW$MH = RuntimeHelper.downcallHandle(
        "mciGetDeviceIDFromElementIDW",
        constants$654.mciGetDeviceIDFromElementIDW$FUNC
    );
    static final FunctionDescriptor mciGetErrorStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mciGetErrorStringA$MH = RuntimeHelper.downcallHandle(
        "mciGetErrorStringA",
        constants$654.mciGetErrorStringA$FUNC
    );
    static final FunctionDescriptor mciGetErrorStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mciGetErrorStringW$MH = RuntimeHelper.downcallHandle(
        "mciGetErrorStringW",
        constants$654.mciGetErrorStringW$FUNC
    );
}


