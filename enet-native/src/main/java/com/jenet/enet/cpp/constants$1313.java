// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1313 {

    static final FunctionDescriptor enet_peer_reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_peer_reset$MH = RuntimeHelper.downcallHandle(
        "enet_peer_reset",
        constants$1313.enet_peer_reset$FUNC
    );
    static final FunctionDescriptor enet_peer_disconnect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle enet_peer_disconnect$MH = RuntimeHelper.downcallHandle(
        "enet_peer_disconnect",
        constants$1313.enet_peer_disconnect$FUNC
    );
    static final FunctionDescriptor enet_peer_disconnect_now$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle enet_peer_disconnect_now$MH = RuntimeHelper.downcallHandle(
        "enet_peer_disconnect_now",
        constants$1313.enet_peer_disconnect_now$FUNC
    );
    static final FunctionDescriptor enet_peer_disconnect_later$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle enet_peer_disconnect_later$MH = RuntimeHelper.downcallHandle(
        "enet_peer_disconnect_later",
        constants$1313.enet_peer_disconnect_later$FUNC
    );
    static final FunctionDescriptor enet_peer_throttle_configure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle enet_peer_throttle_configure$MH = RuntimeHelper.downcallHandle(
        "enet_peer_throttle_configure",
        constants$1313.enet_peer_throttle_configure$FUNC
    );
    static final FunctionDescriptor enet_peer_throttle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle enet_peer_throttle$MH = RuntimeHelper.downcallHandle(
        "enet_peer_throttle",
        constants$1313.enet_peer_throttle$FUNC
    );
}

