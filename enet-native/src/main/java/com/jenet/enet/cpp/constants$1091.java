// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1091 {

    static final FunctionDescriptor CoRevokeMallocSpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoRevokeMallocSpy$MH = RuntimeHelper.downcallHandle(
        "CoRevokeMallocSpy",
        constants$1091.CoRevokeMallocSpy$FUNC
    );
    static final FunctionDescriptor CoCreateStandardMalloc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoCreateStandardMalloc$MH = RuntimeHelper.downcallHandle(
        "CoCreateStandardMalloc",
        constants$1091.CoCreateStandardMalloc$FUNC
    );
    static final FunctionDescriptor CoRegisterInitializeSpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterInitializeSpy$MH = RuntimeHelper.downcallHandle(
        "CoRegisterInitializeSpy",
        constants$1091.CoRegisterInitializeSpy$FUNC
    );
    static final FunctionDescriptor CoRevokeInitializeSpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER")
    );
    static final MethodHandle CoRevokeInitializeSpy$MH = RuntimeHelper.downcallHandle(
        "CoRevokeInitializeSpy",
        constants$1091.CoRevokeInitializeSpy$FUNC
    );
    static final FunctionDescriptor CoGetSystemSecurityPermissions$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetSystemSecurityPermissions$MH = RuntimeHelper.downcallHandle(
        "CoGetSystemSecurityPermissions",
        constants$1091.CoGetSystemSecurityPermissions$FUNC
    );
    static final FunctionDescriptor CoLoadLibrary$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoLoadLibrary$MH = RuntimeHelper.downcallHandle(
        "CoLoadLibrary",
        constants$1091.CoLoadLibrary$FUNC
    );
}


