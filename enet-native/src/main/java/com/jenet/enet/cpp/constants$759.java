// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$759 {

    static final FunctionDescriptor SHGetUnreadMailCountA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHGetUnreadMailCountA$MH = RuntimeHelper.downcallHandle(
        "SHGetUnreadMailCountA",
        constants$759.SHGetUnreadMailCountA$FUNC
    );
    static final FunctionDescriptor SHGetUnreadMailCountW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHGetUnreadMailCountW$MH = RuntimeHelper.downcallHandle(
        "SHGetUnreadMailCountW",
        constants$759.SHGetUnreadMailCountW$FUNC
    );
    static final FunctionDescriptor SHSetUnreadMailCountA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHSetUnreadMailCountA$MH = RuntimeHelper.downcallHandle(
        "SHSetUnreadMailCountA",
        constants$759.SHSetUnreadMailCountA$FUNC
    );
    static final FunctionDescriptor SHSetUnreadMailCountW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHSetUnreadMailCountW$MH = RuntimeHelper.downcallHandle(
        "SHSetUnreadMailCountW",
        constants$759.SHSetUnreadMailCountW$FUNC
    );
    static final FunctionDescriptor SHTestTokenMembership$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHTestTokenMembership$MH = RuntimeHelper.downcallHandle(
        "SHTestTokenMembership",
        constants$759.SHTestTokenMembership$FUNC
    );
    static final FunctionDescriptor SHGetImageList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetImageList$MH = RuntimeHelper.downcallHandle(
        "SHGetImageList",
        constants$759.SHGetImageList$FUNC
    );
}

