// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$116 {

    static final  GroupLayout GUID_EXECUTION_REQUIRED_REQUEST_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_EXECUTION_REQUIRED_REQUEST_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_EXECUTION_REQUIRED_REQUEST_TIMEOUT", constants$116.GUID_EXECUTION_REQUIRED_REQUEST_TIMEOUT$LAYOUT);
    static final  GroupLayout GUID_VIDEO_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_SUBGROUP", constants$116.GUID_VIDEO_SUBGROUP$LAYOUT);
    static final  GroupLayout GUID_VIDEO_POWERDOWN_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_POWERDOWN_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_POWERDOWN_TIMEOUT", constants$116.GUID_VIDEO_POWERDOWN_TIMEOUT$LAYOUT);
    static final  GroupLayout GUID_VIDEO_ANNOYANCE_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_ANNOYANCE_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_ANNOYANCE_TIMEOUT", constants$116.GUID_VIDEO_ANNOYANCE_TIMEOUT$LAYOUT);
    static final  GroupLayout GUID_VIDEO_ADAPTIVE_PERCENT_INCREASE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_ADAPTIVE_PERCENT_INCREASE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_ADAPTIVE_PERCENT_INCREASE", constants$116.GUID_VIDEO_ADAPTIVE_PERCENT_INCREASE$LAYOUT);
    static final  GroupLayout GUID_VIDEO_DIM_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_DIM_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_DIM_TIMEOUT", constants$116.GUID_VIDEO_DIM_TIMEOUT$LAYOUT);
}


