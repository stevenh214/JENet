// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$333 {

    static final FunctionDescriptor WritePrivateProfileStructA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WritePrivateProfileStructA$MH = RuntimeHelper.downcallHandle(
        "WritePrivateProfileStructA",
        constants$333.WritePrivateProfileStructA$FUNC
    );
    static final FunctionDescriptor WritePrivateProfileStructW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WritePrivateProfileStructW$MH = RuntimeHelper.downcallHandle(
        "WritePrivateProfileStructW",
        constants$333.WritePrivateProfileStructW$FUNC
    );
    static final FunctionDescriptor Wow64EnableWow64FsRedirection$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle Wow64EnableWow64FsRedirection$MH = RuntimeHelper.downcallHandle(
        "Wow64EnableWow64FsRedirection",
        constants$333.Wow64EnableWow64FsRedirection$FUNC
    );
    static final FunctionDescriptor PGET_SYSTEM_WOW64_DIRECTORY_A$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PGET_SYSTEM_WOW64_DIRECTORY_A$MH = RuntimeHelper.downcallHandle(
        constants$333.PGET_SYSTEM_WOW64_DIRECTORY_A$FUNC
    );
    static final FunctionDescriptor PGET_SYSTEM_WOW64_DIRECTORY_W$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
}


