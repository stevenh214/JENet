// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$881 {

    static final FunctionDescriptor NdrNsGetBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrNsGetBuffer$MH = RuntimeHelper.downcallHandle(
        "NdrNsGetBuffer",
        constants$881.NdrNsGetBuffer$FUNC
    );
    static final FunctionDescriptor NdrSendReceive$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrSendReceive$MH = RuntimeHelper.downcallHandle(
        "NdrSendReceive",
        constants$881.NdrSendReceive$FUNC
    );
    static final FunctionDescriptor NdrNsSendReceive$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrNsSendReceive$MH = RuntimeHelper.downcallHandle(
        "NdrNsSendReceive",
        constants$881.NdrNsSendReceive$FUNC
    );
    static final FunctionDescriptor NdrFreeBuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrFreeBuffer$MH = RuntimeHelper.downcallHandle(
        "NdrFreeBuffer",
        constants$881.NdrFreeBuffer$FUNC
    );
    static final FunctionDescriptor NdrGetDcomProtocolVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrGetDcomProtocolVersion$MH = RuntimeHelper.downcallHandle(
        "NdrGetDcomProtocolVersion",
        constants$881.NdrGetDcomProtocolVersion$FUNC
    );
    static final FunctionDescriptor NdrClientCall2$FUNC = FunctionDescriptor.of(MemoryLayout.unionLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Pointer"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Simple")
    ).withName("_CLIENT_CALL_RETURN"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrClientCall2$MH = RuntimeHelper.downcallHandleVariadic(
        "NdrClientCall2",
        constants$881.NdrClientCall2$FUNC
    );
}


