// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1205 {

    static final FunctionDescriptor VarBstrFromI8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromI8$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromI8",
        constants$1205.VarBstrFromI8$FUNC
    );
    static final FunctionDescriptor VarBstrFromR4$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromR4$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromR4",
        constants$1205.VarBstrFromR4$FUNC
    );
    static final FunctionDescriptor VarBstrFromR8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromR8$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromR8",
        constants$1205.VarBstrFromR8$FUNC
    );
    static final FunctionDescriptor VarBstrFromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromCy$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromCy",
        constants$1205.VarBstrFromCy$FUNC
    );
    static final FunctionDescriptor VarBstrFromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromDate$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromDate",
        constants$1205.VarBstrFromDate$FUNC
    );
    static final FunctionDescriptor VarBstrFromDisp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromDisp$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromDisp",
        constants$1205.VarBstrFromDisp$FUNC
    );
}


