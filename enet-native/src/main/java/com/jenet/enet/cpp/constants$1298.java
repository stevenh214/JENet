// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1298 {

    static final FunctionDescriptor WSASendDisconnect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSASendDisconnect$MH = RuntimeHelper.downcallHandle(
        "WSASendDisconnect",
        constants$1298.WSASendDisconnect$FUNC
    );
    static final FunctionDescriptor WSASendTo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSASendTo$MH = RuntimeHelper.downcallHandle(
        "WSASendTo",
        constants$1298.WSASendTo$FUNC
    );
    static final FunctionDescriptor WSASetEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSASetEvent$MH = RuntimeHelper.downcallHandle(
        "WSASetEvent",
        constants$1298.WSASetEvent$FUNC
    );
    static final FunctionDescriptor WSASocketA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSASocketA$MH = RuntimeHelper.downcallHandle(
        "WSASocketA",
        constants$1298.WSASocketA$FUNC
    );
    static final FunctionDescriptor WSASocketW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSASocketW$MH = RuntimeHelper.downcallHandle(
        "WSASocketW",
        constants$1298.WSASocketW$FUNC
    );
    static final FunctionDescriptor WSAWaitForMultipleEvents$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAWaitForMultipleEvents$MH = RuntimeHelper.downcallHandle(
        "WSAWaitForMultipleEvents",
        constants$1298.WSAWaitForMultipleEvents$FUNC
    );
}


