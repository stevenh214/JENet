// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$980 {

    static final  GroupLayout CLSID_AddrControl$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_AddrControl$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_AddrControl", constants$980.CLSID_AddrControl$LAYOUT);
    static final  GroupLayout CLSID_ContextSwitcher$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_ContextSwitcher$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_ContextSwitcher", constants$980.CLSID_ContextSwitcher$LAYOUT);
    static final  GroupLayout CLSID_CCDFormKrnl$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDFormKrnl$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDFormKrnl", constants$980.CLSID_CCDFormKrnl$LAYOUT);
    static final  GroupLayout CLSID_CCDPropertyPage$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDPropertyPage$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDPropertyPage", constants$980.CLSID_CCDPropertyPage$LAYOUT);
    static final  GroupLayout CLSID_CCDFormDialog$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDFormDialog$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDFormDialog", constants$980.CLSID_CCDFormDialog$LAYOUT);
    static final  GroupLayout CLSID_CCDCommandButton$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDCommandButton$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDCommandButton", constants$980.CLSID_CCDCommandButton$LAYOUT);
}


