// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1132 {

    static final FunctionDescriptor UrlMkSetSessionOption$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UrlMkSetSessionOption$MH = RuntimeHelper.downcallHandle(
        "UrlMkSetSessionOption",
        constants$1132.UrlMkSetSessionOption$FUNC
    );
    static final FunctionDescriptor UrlMkGetSessionOption$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UrlMkGetSessionOption$MH = RuntimeHelper.downcallHandle(
        "UrlMkGetSessionOption",
        constants$1132.UrlMkGetSessionOption$FUNC
    );
    static final FunctionDescriptor FindMimeFromData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindMimeFromData$MH = RuntimeHelper.downcallHandle(
        "FindMimeFromData",
        constants$1132.FindMimeFromData$FUNC
    );
    static final FunctionDescriptor ObtainUserAgentString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ObtainUserAgentString$MH = RuntimeHelper.downcallHandle(
        "ObtainUserAgentString",
        constants$1132.ObtainUserAgentString$FUNC
    );
    static final FunctionDescriptor CompareSecurityIds$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CompareSecurityIds$MH = RuntimeHelper.downcallHandle(
        "CompareSecurityIds",
        constants$1132.CompareSecurityIds$FUNC
    );
    static final FunctionDescriptor CompatFlagsFromClsid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CompatFlagsFromClsid$MH = RuntimeHelper.downcallHandle(
        "CompatFlagsFromClsid",
        constants$1132.CompatFlagsFromClsid$FUNC
    );
}

