// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$826 {

    static final FunctionDescriptor PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$826.PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC$FUNC
    );
    static final FunctionDescriptor CryptAcquireCertificatePrivateKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptAcquireCertificatePrivateKey$MH = RuntimeHelper.downcallHandle(
        "CryptAcquireCertificatePrivateKey",
        constants$826.CryptAcquireCertificatePrivateKey$FUNC
    );
    static final FunctionDescriptor CryptFindCertificateKeyProvInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptFindCertificateKeyProvInfo$MH = RuntimeHelper.downcallHandle(
        "CryptFindCertificateKeyProvInfo",
        constants$826.CryptFindCertificateKeyProvInfo$FUNC
    );
    static final FunctionDescriptor PFN_IMPORT_PRIV_KEY_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_IMPORT_PRIV_KEY_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$826.PFN_IMPORT_PRIV_KEY_FUNC$FUNC
    );
}


