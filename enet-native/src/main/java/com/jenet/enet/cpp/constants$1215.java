// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1215 {

    static final FunctionDescriptor VarUI4FromI8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromI8$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromI8",
        constants$1215.VarUI4FromI8$FUNC
    );
    static final FunctionDescriptor VarUI4FromR4$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromR4$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromR4",
        constants$1215.VarUI4FromR4$FUNC
    );
    static final FunctionDescriptor VarUI4FromR8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromR8$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromR8",
        constants$1215.VarUI4FromR8$FUNC
    );
    static final FunctionDescriptor VarUI4FromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromDate$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromDate",
        constants$1215.VarUI4FromDate$FUNC
    );
    static final FunctionDescriptor VarUI4FromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromCy$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromCy",
        constants$1215.VarUI4FromCy$FUNC
    );
    static final FunctionDescriptor VarUI4FromStr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromStr$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromStr",
        constants$1215.VarUI4FromStr$FUNC
    );
}


