// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$990 {

    static final FunctionDescriptor CoAddRefServerProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoAddRefServerProcess$MH = RuntimeHelper.downcallHandle(
        "CoAddRefServerProcess",
        constants$990.CoAddRefServerProcess$FUNC
    );
    static final FunctionDescriptor CoReleaseServerProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoReleaseServerProcess$MH = RuntimeHelper.downcallHandle(
        "CoReleaseServerProcess",
        constants$990.CoReleaseServerProcess$FUNC
    );
    static final FunctionDescriptor CoGetPSClsid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetPSClsid$MH = RuntimeHelper.downcallHandle(
        "CoGetPSClsid",
        constants$990.CoGetPSClsid$FUNC
    );
    static final FunctionDescriptor CoRegisterPSClsid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterPSClsid$MH = RuntimeHelper.downcallHandle(
        "CoRegisterPSClsid",
        constants$990.CoRegisterPSClsid$FUNC
    );
    static final FunctionDescriptor CoRegisterSurrogate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterSurrogate$MH = RuntimeHelper.downcallHandle(
        "CoRegisterSurrogate",
        constants$990.CoRegisterSurrogate$FUNC
    );
    static final FunctionDescriptor CoGetMarshalSizeMax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoGetMarshalSizeMax$MH = RuntimeHelper.downcallHandle(
        "CoGetMarshalSizeMax",
        constants$990.CoGetMarshalSizeMax$FUNC
    );
}


