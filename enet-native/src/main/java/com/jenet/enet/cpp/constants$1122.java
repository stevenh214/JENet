// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1122 {

    static final  GroupLayout IID_IXMLError$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IXMLError$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IXMLError", constants$1122.IID_IXMLError$LAYOUT);
    static final  GroupLayout CLSID_XMLDocument$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_XMLDocument$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_XMLDocument", constants$1122.CLSID_XMLDocument$LAYOUT);
    static final  OfAddress __MIDL_itf_msxml_0000_0001_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_msxml_0000_0001_v0_0_c_ifspec$VH = constants$1122.__MIDL_itf_msxml_0000_0001_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_msxml_0000_0001_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_msxml_0000_0001_v0_0_c_ifspec", constants$1122.__MIDL_itf_msxml_0000_0001_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_msxml_0000_0001_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_msxml_0000_0001_v0_0_s_ifspec$VH = constants$1122.__MIDL_itf_msxml_0000_0001_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_msxml_0000_0001_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_msxml_0000_0001_v0_0_s_ifspec", constants$1122.__MIDL_itf_msxml_0000_0001_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout CLSID_SBS_StdURLMoniker$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_StdURLMoniker$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_SBS_StdURLMoniker", constants$1122.CLSID_SBS_StdURLMoniker$LAYOUT);
    static final  GroupLayout CLSID_SBS_HttpProtocol$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_HttpProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_SBS_HttpProtocol", constants$1122.CLSID_SBS_HttpProtocol$LAYOUT);
}

