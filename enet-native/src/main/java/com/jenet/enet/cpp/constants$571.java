// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$571 {

    static final FunctionDescriptor GetAutoRotationState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetAutoRotationState$MH = RuntimeHelper.downcallHandle(
        "GetAutoRotationState",
        constants$571.GetAutoRotationState$FUNC
    );
    static final FunctionDescriptor GetDisplayAutoRotationPreferences$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDisplayAutoRotationPreferences$MH = RuntimeHelper.downcallHandle(
        "GetDisplayAutoRotationPreferences",
        constants$571.GetDisplayAutoRotationPreferences$FUNC
    );
    static final FunctionDescriptor GetDisplayAutoRotationPreferencesByProcessId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDisplayAutoRotationPreferencesByProcessId$MH = RuntimeHelper.downcallHandle(
        "GetDisplayAutoRotationPreferencesByProcessId",
        constants$571.GetDisplayAutoRotationPreferencesByProcessId$FUNC
    );
    static final FunctionDescriptor SetDisplayAutoRotationPreferences$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetDisplayAutoRotationPreferences$MH = RuntimeHelper.downcallHandle(
        "SetDisplayAutoRotationPreferences",
        constants$571.SetDisplayAutoRotationPreferences$FUNC
    );
    static final FunctionDescriptor IsImmersiveProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsImmersiveProcess$MH = RuntimeHelper.downcallHandle(
        "IsImmersiveProcess",
        constants$571.IsImmersiveProcess$FUNC
    );
    static final FunctionDescriptor SetProcessRestrictionExemption$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessRestrictionExemption$MH = RuntimeHelper.downcallHandle(
        "SetProcessRestrictionExemption",
        constants$571.SetProcessRestrictionExemption$FUNC
    );
}


