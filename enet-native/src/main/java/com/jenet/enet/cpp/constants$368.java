// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$368 {

    static final FunctionDescriptor SetVolumeMountPointW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetVolumeMountPointW$MH = RuntimeHelper.downcallHandle(
        "SetVolumeMountPointW",
        constants$368.SetVolumeMountPointW$FUNC
    );
    static final FunctionDescriptor DeleteVolumeMountPointA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteVolumeMountPointA$MH = RuntimeHelper.downcallHandle(
        "DeleteVolumeMountPointA",
        constants$368.DeleteVolumeMountPointA$FUNC
    );
    static final FunctionDescriptor GetVolumeNameForVolumeMountPointA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetVolumeNameForVolumeMountPointA$MH = RuntimeHelper.downcallHandle(
        "GetVolumeNameForVolumeMountPointA",
        constants$368.GetVolumeNameForVolumeMountPointA$FUNC
    );
    static final FunctionDescriptor GetVolumePathNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetVolumePathNameA$MH = RuntimeHelper.downcallHandle(
        "GetVolumePathNameA",
        constants$368.GetVolumePathNameA$FUNC
    );
    static final FunctionDescriptor GetVolumePathNamesForVolumeNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetVolumePathNamesForVolumeNameA$MH = RuntimeHelper.downcallHandle(
        "GetVolumePathNamesForVolumeNameA",
        constants$368.GetVolumePathNamesForVolumeNameA$FUNC
    );
    static final FunctionDescriptor CreateActCtxA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateActCtxA$MH = RuntimeHelper.downcallHandle(
        "CreateActCtxA",
        constants$368.CreateActCtxA$FUNC
    );
}

