// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1311 {

    static final FunctionDescriptor enet_host_broadcast$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_host_broadcast$MH = RuntimeHelper.downcallHandle(
        "enet_host_broadcast",
        constants$1311.enet_host_broadcast$FUNC
    );
    static final FunctionDescriptor enet_host_compress$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_host_compress$MH = RuntimeHelper.downcallHandle(
        "enet_host_compress",
        constants$1311.enet_host_compress$FUNC
    );
    static final FunctionDescriptor enet_host_compress_with_range_coder$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_host_compress_with_range_coder$MH = RuntimeHelper.downcallHandle(
        "enet_host_compress_with_range_coder",
        constants$1311.enet_host_compress_with_range_coder$FUNC
    );
    static final FunctionDescriptor enet_host_channel_limit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle enet_host_channel_limit$MH = RuntimeHelper.downcallHandle(
        "enet_host_channel_limit",
        constants$1311.enet_host_channel_limit$FUNC
    );
    static final FunctionDescriptor enet_host_bandwidth_limit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle enet_host_bandwidth_limit$MH = RuntimeHelper.downcallHandle(
        "enet_host_bandwidth_limit",
        constants$1311.enet_host_bandwidth_limit$FUNC
    );
    static final FunctionDescriptor enet_host_bandwidth_throttle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_host_bandwidth_throttle$MH = RuntimeHelper.downcallHandle(
        "enet_host_bandwidth_throttle",
        constants$1311.enet_host_bandwidth_throttle$FUNC
    );
}

