// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$849 {

    static final FunctionDescriptor EncryptionDisable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EncryptionDisable$MH = RuntimeHelper.downcallHandle(
        "EncryptionDisable",
        constants$849.EncryptionDisable$FUNC
    );
    static final FunctionDescriptor DuplicateEncryptionInfoFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DuplicateEncryptionInfoFile$MH = RuntimeHelper.downcallHandle(
        "DuplicateEncryptionInfoFile",
        constants$849.DuplicateEncryptionInfoFile$FUNC
    );
    static final FunctionDescriptor GetEncryptedFileMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetEncryptedFileMetadata$MH = RuntimeHelper.downcallHandle(
        "GetEncryptedFileMetadata",
        constants$849.GetEncryptedFileMetadata$FUNC
    );
    static final FunctionDescriptor SetEncryptedFileMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEncryptedFileMetadata$MH = RuntimeHelper.downcallHandle(
        "SetEncryptedFileMetadata",
        constants$849.SetEncryptedFileMetadata$FUNC
    );
    static final FunctionDescriptor FreeEncryptedFileMetadata$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeEncryptedFileMetadata$MH = RuntimeHelper.downcallHandle(
        "FreeEncryptedFileMetadata",
        constants$849.FreeEncryptedFileMetadata$FUNC
    );
    static final FunctionDescriptor I_RpcNsGetBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcNsGetBuffer$MH = RuntimeHelper.downcallHandle(
        "I_RpcNsGetBuffer",
        constants$849.I_RpcNsGetBuffer$FUNC
    );
}

