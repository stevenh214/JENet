// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$836 {

    static final FunctionDescriptor CryptCancelAsyncRetrieval$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptCancelAsyncRetrieval$MH = RuntimeHelper.downcallHandle(
        "CryptCancelAsyncRetrieval",
        constants$836.CryptCancelAsyncRetrieval$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$836.PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC$FUNC
    );
    static final FunctionDescriptor PFN_CANCEL_ASYNC_RETRIEVAL_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CANCEL_ASYNC_RETRIEVAL_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$836.PFN_CANCEL_ASYNC_RETRIEVAL_FUNC$FUNC
    );
    static final FunctionDescriptor CryptGetObjectUrl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetObjectUrl$MH = RuntimeHelper.downcallHandle(
        "CryptGetObjectUrl",
        constants$836.CryptGetObjectUrl$FUNC
    );
}

