// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$39 {

    static final FunctionDescriptor __p__environ$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __p__environ$MH = RuntimeHelper.downcallHandle(
        "__p__environ",
        constants$39.__p__environ$FUNC
    );
    static final FunctionDescriptor __p__wenviron$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __p__wenviron$MH = RuntimeHelper.downcallHandle(
        "__p__wenviron",
        constants$39.__p__wenviron$FUNC
    );
    static final FunctionDescriptor getenv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getenv$MH = RuntimeHelper.downcallHandle(
        "getenv",
        constants$39.getenv$FUNC
    );
    static final FunctionDescriptor _dupenv_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _dupenv_s$MH = RuntimeHelper.downcallHandle(
        "_dupenv_s",
        constants$39._dupenv_s$FUNC
    );
    static final FunctionDescriptor system$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle system$MH = RuntimeHelper.downcallHandle(
        "system",
        constants$39.system$FUNC
    );
    static final FunctionDescriptor _putenv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _putenv$MH = RuntimeHelper.downcallHandle(
        "_putenv",
        constants$39._putenv$FUNC
    );
}


