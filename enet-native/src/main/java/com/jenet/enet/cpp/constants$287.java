// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$287 {

    static final FunctionDescriptor CveEventWrite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CveEventWrite$MH = RuntimeHelper.downcallHandle(
        "CveEventWrite",
        constants$287.CveEventWrite$FUNC
    );
    static final FunctionDescriptor DeriveCapabilitySidsFromName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeriveCapabilitySidsFromName$MH = RuntimeHelper.downcallHandle(
        "DeriveCapabilitySidsFromName",
        constants$287.DeriveCapabilitySidsFromName$FUNC
    );
    static final FunctionDescriptor CreatePrivateNamespaceW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePrivateNamespaceW$MH = RuntimeHelper.downcallHandle(
        "CreatePrivateNamespaceW",
        constants$287.CreatePrivateNamespaceW$FUNC
    );
    static final FunctionDescriptor OpenPrivateNamespaceW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenPrivateNamespaceW$MH = RuntimeHelper.downcallHandle(
        "OpenPrivateNamespaceW",
        constants$287.OpenPrivateNamespaceW$FUNC
    );
    static final FunctionDescriptor ClosePrivateNamespace$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ClosePrivateNamespace$MH = RuntimeHelper.downcallHandle(
        "ClosePrivateNamespace",
        constants$287.ClosePrivateNamespace$FUNC
    );
    static final FunctionDescriptor CreateBoundaryDescriptorW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateBoundaryDescriptorW$MH = RuntimeHelper.downcallHandle(
        "CreateBoundaryDescriptorW",
        constants$287.CreateBoundaryDescriptorW$FUNC
    );
}

