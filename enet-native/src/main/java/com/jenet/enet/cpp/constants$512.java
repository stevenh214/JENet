// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$512 {

    static final FunctionDescriptor GetMenuCheckMarkDimensions$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMenuCheckMarkDimensions$MH = RuntimeHelper.downcallHandle(
        "GetMenuCheckMarkDimensions",
        constants$512.GetMenuCheckMarkDimensions$FUNC
    );
    static final FunctionDescriptor TrackPopupMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrackPopupMenu$MH = RuntimeHelper.downcallHandle(
        "TrackPopupMenu",
        constants$512.TrackPopupMenu$FUNC
    );
    static final FunctionDescriptor TrackPopupMenuEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrackPopupMenuEx$MH = RuntimeHelper.downcallHandle(
        "TrackPopupMenuEx",
        constants$512.TrackPopupMenuEx$FUNC
    );
    static final FunctionDescriptor CalculatePopupWindowPosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CalculatePopupWindowPosition$MH = RuntimeHelper.downcallHandle(
        "CalculatePopupWindowPosition",
        constants$512.CalculatePopupWindowPosition$FUNC
    );
    static final FunctionDescriptor GetMenuInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuInfo$MH = RuntimeHelper.downcallHandle(
        "GetMenuInfo",
        constants$512.GetMenuInfo$FUNC
    );
    static final FunctionDescriptor SetMenuInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMenuInfo$MH = RuntimeHelper.downcallHandle(
        "SetMenuInfo",
        constants$512.SetMenuInfo$FUNC
    );
}

