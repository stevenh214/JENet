// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1008 {

    static final  OfAddress __MIDL_itf_objidl_0000_0061_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0061_v0_0_s_ifspec$VH = constants$1008.__MIDL_itf_objidl_0000_0061_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0061_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0061_v0_0_s_ifspec", constants$1008.__MIDL_itf_objidl_0000_0061_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IROTData$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IROTData$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IROTData", constants$1008.IID_IROTData$LAYOUT);
    static final  OfAddress __MIDL_itf_objidl_0000_0062_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0062_v0_0_c_ifspec$VH = constants$1008.__MIDL_itf_objidl_0000_0062_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0062_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0062_v0_0_c_ifspec", constants$1008.__MIDL_itf_objidl_0000_0062_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_objidl_0000_0062_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0062_v0_0_s_ifspec$VH = constants$1008.__MIDL_itf_objidl_0000_0062_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0062_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0062_v0_0_s_ifspec", constants$1008.__MIDL_itf_objidl_0000_0062_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IEnumSTATSTG$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnumSTATSTG$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IEnumSTATSTG", constants$1008.IID_IEnumSTATSTG$LAYOUT);
    static final FunctionDescriptor IEnumSTATSTG_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumSTATSTG_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        "IEnumSTATSTG_RemoteNext_Proxy",
        constants$1008.IEnumSTATSTG_RemoteNext_Proxy$FUNC
    );
}


