// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1308 {

    static final FunctionDescriptor enet_socket_get_option$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_socket_get_option$MH = RuntimeHelper.downcallHandle(
        "enet_socket_get_option",
        constants$1308.enet_socket_get_option$FUNC
    );
    static final FunctionDescriptor enet_socket_shutdown$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle enet_socket_shutdown$MH = RuntimeHelper.downcallHandle(
        "enet_socket_shutdown",
        constants$1308.enet_socket_shutdown$FUNC
    );
    static final FunctionDescriptor enet_socket_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle enet_socket_destroy$MH = RuntimeHelper.downcallHandle(
        "enet_socket_destroy",
        constants$1308.enet_socket_destroy$FUNC
    );
    static final FunctionDescriptor enet_socketset_select$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle enet_socketset_select$MH = RuntimeHelper.downcallHandle(
        "enet_socketset_select",
        constants$1308.enet_socketset_select$FUNC
    );
    static final FunctionDescriptor enet_address_set_host_ip$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_address_set_host_ip$MH = RuntimeHelper.downcallHandle(
        "enet_address_set_host_ip",
        constants$1308.enet_address_set_host_ip$FUNC
    );
    static final FunctionDescriptor enet_address_set_host$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_address_set_host$MH = RuntimeHelper.downcallHandle(
        "enet_address_set_host",
        constants$1308.enet_address_set_host$FUNC
    );
}

