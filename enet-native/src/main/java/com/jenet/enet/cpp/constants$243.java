// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$243 {

    static final FunctionDescriptor CreateFileMappingNumaW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateFileMappingNumaW$MH = RuntimeHelper.downcallHandle(
        "CreateFileMappingNumaW",
        constants$243.CreateFileMappingNumaW$FUNC
    );
    static final FunctionDescriptor PrefetchVirtualMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrefetchVirtualMemory$MH = RuntimeHelper.downcallHandle(
        "PrefetchVirtualMemory",
        constants$243.PrefetchVirtualMemory$FUNC
    );
    static final FunctionDescriptor CreateFileMappingFromApp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFileMappingFromApp$MH = RuntimeHelper.downcallHandle(
        "CreateFileMappingFromApp",
        constants$243.CreateFileMappingFromApp$FUNC
    );
    static final FunctionDescriptor MapViewOfFileFromApp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle MapViewOfFileFromApp$MH = RuntimeHelper.downcallHandle(
        "MapViewOfFileFromApp",
        constants$243.MapViewOfFileFromApp$FUNC
    );
    static final FunctionDescriptor UnmapViewOfFileEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnmapViewOfFileEx$MH = RuntimeHelper.downcallHandle(
        "UnmapViewOfFileEx",
        constants$243.UnmapViewOfFileEx$FUNC
    );
    static final FunctionDescriptor AllocateUserPhysicalPages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AllocateUserPhysicalPages$MH = RuntimeHelper.downcallHandle(
        "AllocateUserPhysicalPages",
        constants$243.AllocateUserPhysicalPages$FUNC
    );
}

