// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$793 {

    static final FunctionDescriptor PFN_CMSG_IMPORT_ENCRYPT_KEY$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_IMPORT_ENCRYPT_KEY$MH = RuntimeHelper.downcallHandle(
        constants$793.PFN_CMSG_IMPORT_ENCRYPT_KEY$FUNC
    );
    static final FunctionDescriptor PFN_CMSG_GEN_CONTENT_ENCRYPT_KEY$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_GEN_CONTENT_ENCRYPT_KEY$MH = RuntimeHelper.downcallHandle(
        constants$793.PFN_CMSG_GEN_CONTENT_ENCRYPT_KEY$FUNC
    );
    static final FunctionDescriptor PFN_CMSG_EXPORT_KEY_TRANS$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_EXPORT_KEY_TRANS$MH = RuntimeHelper.downcallHandle(
        constants$793.PFN_CMSG_EXPORT_KEY_TRANS$FUNC
    );
}


