// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1312 {

    static final FunctionDescriptor enet_host_random_seed$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle enet_host_random_seed$MH = RuntimeHelper.downcallHandle(
        "enet_host_random_seed",
        constants$1312.enet_host_random_seed$FUNC
    );
    static final FunctionDescriptor enet_peer_send$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_peer_send$MH = RuntimeHelper.downcallHandle(
        "enet_peer_send",
        constants$1312.enet_peer_send$FUNC
    );
    static final FunctionDescriptor enet_peer_receive$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_peer_receive$MH = RuntimeHelper.downcallHandle(
        "enet_peer_receive",
        constants$1312.enet_peer_receive$FUNC
    );
    static final FunctionDescriptor enet_peer_ping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_peer_ping$MH = RuntimeHelper.downcallHandle(
        "enet_peer_ping",
        constants$1312.enet_peer_ping$FUNC
    );
    static final FunctionDescriptor enet_peer_ping_interval$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle enet_peer_ping_interval$MH = RuntimeHelper.downcallHandle(
        "enet_peer_ping_interval",
        constants$1312.enet_peer_ping_interval$FUNC
    );
    static final FunctionDescriptor enet_peer_timeout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle enet_peer_timeout$MH = RuntimeHelper.downcallHandle(
        "enet_peer_timeout",
        constants$1312.enet_peer_timeout$FUNC
    );
}

