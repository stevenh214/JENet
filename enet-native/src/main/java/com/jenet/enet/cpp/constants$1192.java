// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1192 {

    static final FunctionDescriptor VarI4FromDec$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI4FromDec$MH = RuntimeHelper.downcallHandle(
        "VarI4FromDec",
        constants$1192.VarI4FromDec$FUNC
    );
    static final FunctionDescriptor VarI8FromUI1$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI8FromUI1$MH = RuntimeHelper.downcallHandle(
        "VarI8FromUI1",
        constants$1192.VarI8FromUI1$FUNC
    );
    static final FunctionDescriptor VarI8FromI2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI8FromI2$MH = RuntimeHelper.downcallHandle(
        "VarI8FromI2",
        constants$1192.VarI8FromI2$FUNC
    );
    static final FunctionDescriptor VarI8FromR4$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI8FromR4$MH = RuntimeHelper.downcallHandle(
        "VarI8FromR4",
        constants$1192.VarI8FromR4$FUNC
    );
    static final FunctionDescriptor VarI8FromR8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI8FromR8$MH = RuntimeHelper.downcallHandle(
        "VarI8FromR8",
        constants$1192.VarI8FromR8$FUNC
    );
    static final FunctionDescriptor VarI8FromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI8FromCy$MH = RuntimeHelper.downcallHandle(
        "VarI8FromCy",
        constants$1192.VarI8FromCy$FUNC
    );
}


