// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1241 {

    static final FunctionDescriptor OleLoadFromStream$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleLoadFromStream$MH = RuntimeHelper.downcallHandle(
        "OleLoadFromStream",
        constants$1241.OleLoadFromStream$FUNC
    );
    static final FunctionDescriptor OleSaveToStream$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleSaveToStream$MH = RuntimeHelper.downcallHandle(
        "OleSaveToStream",
        constants$1241.OleSaveToStream$FUNC
    );
    static final FunctionDescriptor OleSetContainedObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OleSetContainedObject$MH = RuntimeHelper.downcallHandle(
        "OleSetContainedObject",
        constants$1241.OleSetContainedObject$FUNC
    );
    static final FunctionDescriptor OleNoteObjectVisible$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OleNoteObjectVisible$MH = RuntimeHelper.downcallHandle(
        "OleNoteObjectVisible",
        constants$1241.OleNoteObjectVisible$FUNC
    );
    static final FunctionDescriptor RegisterDragDrop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterDragDrop$MH = RuntimeHelper.downcallHandle(
        "RegisterDragDrop",
        constants$1241.RegisterDragDrop$FUNC
    );
    static final FunctionDescriptor RevokeDragDrop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RevokeDragDrop$MH = RuntimeHelper.downcallHandle(
        "RevokeDragDrop",
        constants$1241.RevokeDragDrop$FUNC
    );
}


