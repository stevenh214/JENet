// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$749 {

    static final FunctionDescriptor DragQueryFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DragQueryFileA$MH = RuntimeHelper.downcallHandle(
        "DragQueryFileA",
        constants$749.DragQueryFileA$FUNC
    );
    static final FunctionDescriptor DragQueryFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DragQueryFileW$MH = RuntimeHelper.downcallHandle(
        "DragQueryFileW",
        constants$749.DragQueryFileW$FUNC
    );
    static final FunctionDescriptor DragQueryPoint$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DragQueryPoint$MH = RuntimeHelper.downcallHandle(
        "DragQueryPoint",
        constants$749.DragQueryPoint$FUNC
    );
    static final FunctionDescriptor DragFinish$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DragFinish$MH = RuntimeHelper.downcallHandle(
        "DragFinish",
        constants$749.DragFinish$FUNC
    );
    static final FunctionDescriptor DragAcceptFiles$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DragAcceptFiles$MH = RuntimeHelper.downcallHandle(
        "DragAcceptFiles",
        constants$749.DragAcceptFiles$FUNC
    );
    static final FunctionDescriptor ShellExecuteA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShellExecuteA$MH = RuntimeHelper.downcallHandle(
        "ShellExecuteA",
        constants$749.ShellExecuteA$FUNC
    );
}

