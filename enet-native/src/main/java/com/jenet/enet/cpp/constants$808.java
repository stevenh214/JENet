// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$808 {

    static final FunctionDescriptor CertDuplicateCRLContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDuplicateCRLContext$MH = RuntimeHelper.downcallHandle(
        "CertDuplicateCRLContext",
        constants$808.CertDuplicateCRLContext$FUNC
    );
    static final FunctionDescriptor CertCreateCRLContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertCreateCRLContext$MH = RuntimeHelper.downcallHandle(
        "CertCreateCRLContext",
        constants$808.CertCreateCRLContext$FUNC
    );
    static final FunctionDescriptor CertFreeCRLContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCRLContext$MH = RuntimeHelper.downcallHandle(
        "CertFreeCRLContext",
        constants$808.CertFreeCRLContext$FUNC
    );
    static final FunctionDescriptor CertSetCRLContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSetCRLContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertSetCRLContextProperty",
        constants$808.CertSetCRLContextProperty$FUNC
    );
    static final FunctionDescriptor CertGetCRLContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetCRLContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertGetCRLContextProperty",
        constants$808.CertGetCRLContextProperty$FUNC
    );
    static final FunctionDescriptor CertEnumCRLContextProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertEnumCRLContextProperties$MH = RuntimeHelper.downcallHandle(
        "CertEnumCRLContextProperties",
        constants$808.CertEnumCRLContextProperties$FUNC
    );
}


