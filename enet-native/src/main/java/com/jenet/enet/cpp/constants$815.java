// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$815 {

    static final FunctionDescriptor CertRegisterPhysicalStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertRegisterPhysicalStore$MH = RuntimeHelper.downcallHandle(
        "CertRegisterPhysicalStore",
        constants$815.CertRegisterPhysicalStore$FUNC
    );
    static final FunctionDescriptor CertUnregisterSystemStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertUnregisterSystemStore$MH = RuntimeHelper.downcallHandle(
        "CertUnregisterSystemStore",
        constants$815.CertUnregisterSystemStore$FUNC
    );
    static final FunctionDescriptor CertUnregisterPhysicalStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertUnregisterPhysicalStore$MH = RuntimeHelper.downcallHandle(
        "CertUnregisterPhysicalStore",
        constants$815.CertUnregisterPhysicalStore$FUNC
    );
    static final FunctionDescriptor PFN_CERT_ENUM_SYSTEM_STORE_LOCATION$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_ENUM_SYSTEM_STORE_LOCATION$MH = RuntimeHelper.downcallHandle(
        constants$815.PFN_CERT_ENUM_SYSTEM_STORE_LOCATION$FUNC
    );
    static final FunctionDescriptor PFN_CERT_ENUM_SYSTEM_STORE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

