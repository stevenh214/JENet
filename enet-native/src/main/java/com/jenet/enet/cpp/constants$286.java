// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$286 {

    static final FunctionDescriptor SetSecurityDescriptorOwner$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSecurityDescriptorOwner$MH = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorOwner",
        constants$286.SetSecurityDescriptorOwner$FUNC
    );
    static final FunctionDescriptor SetSecurityDescriptorRMControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetSecurityDescriptorRMControl$MH = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorRMControl",
        constants$286.SetSecurityDescriptorRMControl$FUNC
    );
    static final FunctionDescriptor SetSecurityDescriptorSacl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSecurityDescriptorSacl$MH = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorSacl",
        constants$286.SetSecurityDescriptorSacl$FUNC
    );
    static final FunctionDescriptor SetTokenInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetTokenInformation$MH = RuntimeHelper.downcallHandle(
        "SetTokenInformation",
        constants$286.SetTokenInformation$FUNC
    );
    static final FunctionDescriptor SetCachedSigningLevel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCachedSigningLevel$MH = RuntimeHelper.downcallHandle(
        "SetCachedSigningLevel",
        constants$286.SetCachedSigningLevel$FUNC
    );
    static final FunctionDescriptor GetCachedSigningLevel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCachedSigningLevel$MH = RuntimeHelper.downcallHandle(
        "GetCachedSigningLevel",
        constants$286.GetCachedSigningLevel$FUNC
    );
}


