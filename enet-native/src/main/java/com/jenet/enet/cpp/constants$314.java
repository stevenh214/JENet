// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$314 {

    static final FunctionDescriptor DecryptFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DecryptFileA$MH = RuntimeHelper.downcallHandle(
        "DecryptFileA",
        constants$314.DecryptFileA$FUNC
    );
    static final FunctionDescriptor DecryptFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DecryptFileW$MH = RuntimeHelper.downcallHandle(
        "DecryptFileW",
        constants$314.DecryptFileW$FUNC
    );
    static final FunctionDescriptor FileEncryptionStatusA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FileEncryptionStatusA$MH = RuntimeHelper.downcallHandle(
        "FileEncryptionStatusA",
        constants$314.FileEncryptionStatusA$FUNC
    );
    static final FunctionDescriptor FileEncryptionStatusW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FileEncryptionStatusW$MH = RuntimeHelper.downcallHandle(
        "FileEncryptionStatusW",
        constants$314.FileEncryptionStatusW$FUNC
    );
    static final FunctionDescriptor PFE_EXPORT_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFE_EXPORT_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$314.PFE_EXPORT_FUNC$FUNC
    );
}


