// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$401 {

    static final FunctionDescriptor GetRegionData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetRegionData$MH = RuntimeHelper.downcallHandle(
        "GetRegionData",
        constants$401.GetRegionData$FUNC
    );
    static final FunctionDescriptor GetRgnBox$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetRgnBox$MH = RuntimeHelper.downcallHandle(
        "GetRgnBox",
        constants$401.GetRgnBox$FUNC
    );
    static final FunctionDescriptor GetStockObject$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetStockObject$MH = RuntimeHelper.downcallHandle(
        "GetStockObject",
        constants$401.GetStockObject$FUNC
    );
    static final FunctionDescriptor GetStretchBltMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetStretchBltMode$MH = RuntimeHelper.downcallHandle(
        "GetStretchBltMode",
        constants$401.GetStretchBltMode$FUNC
    );
    static final FunctionDescriptor GetSystemPaletteEntries$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemPaletteEntries$MH = RuntimeHelper.downcallHandle(
        "GetSystemPaletteEntries",
        constants$401.GetSystemPaletteEntries$FUNC
    );
    static final FunctionDescriptor GetSystemPaletteUse$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemPaletteUse$MH = RuntimeHelper.downcallHandle(
        "GetSystemPaletteUse",
        constants$401.GetSystemPaletteUse$FUNC
    );
}

