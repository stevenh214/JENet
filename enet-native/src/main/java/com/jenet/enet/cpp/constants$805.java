// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$805 {

    static final FunctionDescriptor CertSaveStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertSaveStore$MH = RuntimeHelper.downcallHandle(
        "CertSaveStore",
        constants$805.CertSaveStore$FUNC
    );
    static final FunctionDescriptor CertCloseStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertCloseStore$MH = RuntimeHelper.downcallHandle(
        "CertCloseStore",
        constants$805.CertCloseStore$FUNC
    );
    static final FunctionDescriptor CertGetSubjectCertificateFromStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetSubjectCertificateFromStore$MH = RuntimeHelper.downcallHandle(
        "CertGetSubjectCertificateFromStore",
        constants$805.CertGetSubjectCertificateFromStore$FUNC
    );
    static final FunctionDescriptor CertEnumCertificatesInStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumCertificatesInStore$MH = RuntimeHelper.downcallHandle(
        "CertEnumCertificatesInStore",
        constants$805.CertEnumCertificatesInStore$FUNC
    );
    static final FunctionDescriptor CertFindCertificateInStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFindCertificateInStore$MH = RuntimeHelper.downcallHandle(
        "CertFindCertificateInStore",
        constants$805.CertFindCertificateInStore$FUNC
    );
    static final FunctionDescriptor CertGetIssuerCertificateFromStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetIssuerCertificateFromStore$MH = RuntimeHelper.downcallHandle(
        "CertGetIssuerCertificateFromStore",
        constants$805.CertGetIssuerCertificateFromStore$FUNC
    );
}


