// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$821 {

    static final FunctionDescriptor CryptSignCertificate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptSignCertificate$MH = RuntimeHelper.downcallHandle(
        "CryptSignCertificate",
        constants$821.CryptSignCertificate$FUNC
    );
    static final FunctionDescriptor CryptSignAndEncodeCertificate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptSignAndEncodeCertificate$MH = RuntimeHelper.downcallHandle(
        "CryptSignAndEncodeCertificate",
        constants$821.CryptSignAndEncodeCertificate$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$821.PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$821.PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC$FUNC
    );
}


