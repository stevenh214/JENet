// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$905 {

    static final  GroupLayout FILE_TYPE_NOTIFICATION_GUID_HIBERNATION_FILE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FILE_TYPE_NOTIFICATION_GUID_HIBERNATION_FILE$SEGMENT = RuntimeHelper.lookupGlobalVariable("FILE_TYPE_NOTIFICATION_GUID_HIBERNATION_FILE", constants$905.FILE_TYPE_NOTIFICATION_GUID_HIBERNATION_FILE$LAYOUT);
    static final  GroupLayout FILE_TYPE_NOTIFICATION_GUID_CRASHDUMP_FILE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FILE_TYPE_NOTIFICATION_GUID_CRASHDUMP_FILE$SEGMENT = RuntimeHelper.lookupGlobalVariable("FILE_TYPE_NOTIFICATION_GUID_CRASHDUMP_FILE", constants$905.FILE_TYPE_NOTIFICATION_GUID_CRASHDUMP_FILE$LAYOUT);
    static final FunctionDescriptor PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$905.PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK$FUNC
    );
    static final  GroupLayout GUID_DEVINTERFACE_SMARTCARD_READER$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVINTERFACE_SMARTCARD_READER$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEVINTERFACE_SMARTCARD_READER", constants$905.GUID_DEVINTERFACE_SMARTCARD_READER$LAYOUT);
    static final  GroupLayout g_rgSCardT0Pci$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwProtocol"),
        Constants$root.C_LONG$LAYOUT.withName("cbPciLength")
    ).withName("_SCARD_IO_REQUEST");
    static final MemorySegment g_rgSCardT0Pci$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_rgSCardT0Pci", constants$905.g_rgSCardT0Pci$LAYOUT);
}


