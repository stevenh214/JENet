// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$300 {

    static final FunctionDescriptor PUMS_SCHEDULER_ENTRY_POINT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PUMS_SCHEDULER_ENTRY_POINT$MH = RuntimeHelper.downcallHandle(
        constants$300.PUMS_SCHEDULER_ENTRY_POINT$FUNC
    );
    static final FunctionDescriptor CreateUmsCompletionList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateUmsCompletionList$MH = RuntimeHelper.downcallHandle(
        "CreateUmsCompletionList",
        constants$300.CreateUmsCompletionList$FUNC
    );
    static final FunctionDescriptor DequeueUmsCompletionListItems$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DequeueUmsCompletionListItems$MH = RuntimeHelper.downcallHandle(
        "DequeueUmsCompletionListItems",
        constants$300.DequeueUmsCompletionListItems$FUNC
    );
    static final FunctionDescriptor GetUmsCompletionListEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUmsCompletionListEvent$MH = RuntimeHelper.downcallHandle(
        "GetUmsCompletionListEvent",
        constants$300.GetUmsCompletionListEvent$FUNC
    );
    static final FunctionDescriptor ExecuteUmsThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ExecuteUmsThread$MH = RuntimeHelper.downcallHandle(
        "ExecuteUmsThread",
        constants$300.ExecuteUmsThread$FUNC
    );
    static final FunctionDescriptor UmsThreadYield$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UmsThreadYield$MH = RuntimeHelper.downcallHandle(
        "UmsThreadYield",
        constants$300.UmsThreadYield$FUNC
    );
}

