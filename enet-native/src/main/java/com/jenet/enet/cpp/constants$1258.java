// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1258 {

    static final  GroupLayout DOMAIN_LEAVE_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment DOMAIN_LEAVE_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("DOMAIN_LEAVE_GUID", constants$1258.DOMAIN_LEAVE_GUID$LAYOUT);
    static final  GroupLayout FIREWALL_PORT_OPEN_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FIREWALL_PORT_OPEN_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("FIREWALL_PORT_OPEN_GUID", constants$1258.FIREWALL_PORT_OPEN_GUID$LAYOUT);
    static final  GroupLayout FIREWALL_PORT_CLOSE_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FIREWALL_PORT_CLOSE_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("FIREWALL_PORT_CLOSE_GUID", constants$1258.FIREWALL_PORT_CLOSE_GUID$LAYOUT);
    static final  GroupLayout MACHINE_POLICY_PRESENT_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment MACHINE_POLICY_PRESENT_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("MACHINE_POLICY_PRESENT_GUID", constants$1258.MACHINE_POLICY_PRESENT_GUID$LAYOUT);
    static final  GroupLayout USER_POLICY_PRESENT_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment USER_POLICY_PRESENT_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("USER_POLICY_PRESENT_GUID", constants$1258.USER_POLICY_PRESENT_GUID$LAYOUT);
    static final  GroupLayout RPC_INTERFACE_EVENT_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment RPC_INTERFACE_EVENT_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("RPC_INTERFACE_EVENT_GUID", constants$1258.RPC_INTERFACE_EVENT_GUID$LAYOUT);
}


