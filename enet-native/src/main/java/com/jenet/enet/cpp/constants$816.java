// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$816 {

    static final FunctionDescriptor PFN_CERT_ENUM_SYSTEM_STORE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_ENUM_SYSTEM_STORE$MH = RuntimeHelper.downcallHandle(
        constants$816.PFN_CERT_ENUM_SYSTEM_STORE$FUNC
    );
    static final FunctionDescriptor PFN_CERT_ENUM_PHYSICAL_STORE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_ENUM_PHYSICAL_STORE$MH = RuntimeHelper.downcallHandle(
        constants$816.PFN_CERT_ENUM_PHYSICAL_STORE$FUNC
    );
    static final FunctionDescriptor CertEnumSystemStoreLocation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumSystemStoreLocation$MH = RuntimeHelper.downcallHandle(
        "CertEnumSystemStoreLocation",
        constants$816.CertEnumSystemStoreLocation$FUNC
    );
    static final FunctionDescriptor CertEnumSystemStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumSystemStore$MH = RuntimeHelper.downcallHandle(
        "CertEnumSystemStore",
        constants$816.CertEnumSystemStore$FUNC
    );
    static final FunctionDescriptor CertEnumPhysicalStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumPhysicalStore$MH = RuntimeHelper.downcallHandle(
        "CertEnumPhysicalStore",
        constants$816.CertEnumPhysicalStore$FUNC
    );
}

