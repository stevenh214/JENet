// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class OPENCARDNAME {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hSCardContext"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrGroupNames"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxGroupNames"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrCardNames"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxCardNames"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgguidInterfaces"),
        Constants$root.C_LONG$LAYOUT.withName("cguidInterfaces"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrRdr"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxRdr"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrCard"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxCard"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrTitle"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pvUserData"),
        Constants$root.C_LONG$LAYOUT.withName("dwShareMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwPreferredProtocols"),
        Constants$root.C_LONG$LAYOUT.withName("dwActiveProtocol"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnConnect"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnCheck"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnDisconnect"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hCardHandle")
    );
    public static MemoryLayout $LAYOUT() {
        return OPENCARDNAME.$struct$LAYOUT;
    }
    static final VarHandle dwStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStructSize"));
    public static VarHandle dwStructSize$VH() {
        return OPENCARDNAME.dwStructSize$VH;
    }
    public static int dwStructSize$get(MemorySegment seg) {
        return (int)OPENCARDNAME.dwStructSize$VH.get(seg);
    }
    public static void dwStructSize$set( MemorySegment seg, int x) {
        OPENCARDNAME.dwStructSize$VH.set(seg, x);
    }
    public static int dwStructSize$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME.dwStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStructSize$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME.dwStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return OPENCARDNAME.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hSCardContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hSCardContext"));
    public static VarHandle hSCardContext$VH() {
        return OPENCARDNAME.hSCardContext$VH;
    }
    public static long hSCardContext$get(MemorySegment seg) {
        return (long)OPENCARDNAME.hSCardContext$VH.get(seg);
    }
    public static void hSCardContext$set( MemorySegment seg, long x) {
        OPENCARDNAME.hSCardContext$VH.set(seg, x);
    }
    public static long hSCardContext$get(MemorySegment seg, long index) {
        return (long)OPENCARDNAME.hSCardContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hSCardContext$set(MemorySegment seg, long index, long x) {
        OPENCARDNAME.hSCardContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrGroupNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrGroupNames"));
    public static VarHandle lpstrGroupNames$VH() {
        return OPENCARDNAME.lpstrGroupNames$VH;
    }
    public static MemoryAddress lpstrGroupNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpstrGroupNames$VH.get(seg);
    }
    public static void lpstrGroupNames$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME.lpstrGroupNames$VH.set(seg, x);
    }
    public static MemoryAddress lpstrGroupNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpstrGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrGroupNames$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME.lpstrGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxGroupNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxGroupNames"));
    public static VarHandle nMaxGroupNames$VH() {
        return OPENCARDNAME.nMaxGroupNames$VH;
    }
    public static int nMaxGroupNames$get(MemorySegment seg) {
        return (int)OPENCARDNAME.nMaxGroupNames$VH.get(seg);
    }
    public static void nMaxGroupNames$set( MemorySegment seg, int x) {
        OPENCARDNAME.nMaxGroupNames$VH.set(seg, x);
    }
    public static int nMaxGroupNames$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME.nMaxGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxGroupNames$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME.nMaxGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCardNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrCardNames"));
    public static VarHandle lpstrCardNames$VH() {
        return OPENCARDNAME.lpstrCardNames$VH;
    }
    public static MemoryAddress lpstrCardNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpstrCardNames$VH.get(seg);
    }
    public static void lpstrCardNames$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME.lpstrCardNames$VH.set(seg, x);
    }
    public static MemoryAddress lpstrCardNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpstrCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCardNames$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME.lpstrCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCardNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxCardNames"));
    public static VarHandle nMaxCardNames$VH() {
        return OPENCARDNAME.nMaxCardNames$VH;
    }
    public static int nMaxCardNames$get(MemorySegment seg) {
        return (int)OPENCARDNAME.nMaxCardNames$VH.get(seg);
    }
    public static void nMaxCardNames$set( MemorySegment seg, int x) {
        OPENCARDNAME.nMaxCardNames$VH.set(seg, x);
    }
    public static int nMaxCardNames$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME.nMaxCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCardNames$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME.nMaxCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgguidInterfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgguidInterfaces"));
    public static VarHandle rgguidInterfaces$VH() {
        return OPENCARDNAME.rgguidInterfaces$VH;
    }
    public static MemoryAddress rgguidInterfaces$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.rgguidInterfaces$VH.get(seg);
    }
    public static void rgguidInterfaces$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME.rgguidInterfaces$VH.set(seg, x);
    }
    public static MemoryAddress rgguidInterfaces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.rgguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgguidInterfaces$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME.rgguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cguidInterfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cguidInterfaces"));
    public static VarHandle cguidInterfaces$VH() {
        return OPENCARDNAME.cguidInterfaces$VH;
    }
    public static int cguidInterfaces$get(MemorySegment seg) {
        return (int)OPENCARDNAME.cguidInterfaces$VH.get(seg);
    }
    public static void cguidInterfaces$set( MemorySegment seg, int x) {
        OPENCARDNAME.cguidInterfaces$VH.set(seg, x);
    }
    public static int cguidInterfaces$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME.cguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cguidInterfaces$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME.cguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrRdr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrRdr"));
    public static VarHandle lpstrRdr$VH() {
        return OPENCARDNAME.lpstrRdr$VH;
    }
    public static MemoryAddress lpstrRdr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpstrRdr$VH.get(seg);
    }
    public static void lpstrRdr$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME.lpstrRdr$VH.set(seg, x);
    }
    public static MemoryAddress lpstrRdr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpstrRdr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrRdr$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME.lpstrRdr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxRdr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxRdr"));
    public static VarHandle nMaxRdr$VH() {
        return OPENCARDNAME.nMaxRdr$VH;
    }
    public static int nMaxRdr$get(MemorySegment seg) {
        return (int)OPENCARDNAME.nMaxRdr$VH.get(seg);
    }
    public static void nMaxRdr$set( MemorySegment seg, int x) {
        OPENCARDNAME.nMaxRdr$VH.set(seg, x);
    }
    public static int nMaxRdr$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME.nMaxRdr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxRdr$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME.nMaxRdr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrCard"));
    public static VarHandle lpstrCard$VH() {
        return OPENCARDNAME.lpstrCard$VH;
    }
    public static MemoryAddress lpstrCard$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpstrCard$VH.get(seg);
    }
    public static void lpstrCard$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME.lpstrCard$VH.set(seg, x);
    }
    public static MemoryAddress lpstrCard$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpstrCard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCard$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME.lpstrCard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxCard"));
    public static VarHandle nMaxCard$VH() {
        return OPENCARDNAME.nMaxCard$VH;
    }
    public static int nMaxCard$get(MemorySegment seg) {
        return (int)OPENCARDNAME.nMaxCard$VH.get(seg);
    }
    public static void nMaxCard$set( MemorySegment seg, int x) {
        OPENCARDNAME.nMaxCard$VH.set(seg, x);
    }
    public static int nMaxCard$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME.nMaxCard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCard$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME.nMaxCard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrTitle"));
    public static VarHandle lpstrTitle$VH() {
        return OPENCARDNAME.lpstrTitle$VH;
    }
    public static MemoryAddress lpstrTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpstrTitle$VH.get(seg);
    }
    public static void lpstrTitle$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME.lpstrTitle$VH.set(seg, x);
    }
    public static MemoryAddress lpstrTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpstrTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrTitle$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME.lpstrTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return OPENCARDNAME.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)OPENCARDNAME.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        OPENCARDNAME.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvUserData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvUserData"));
    public static VarHandle pvUserData$VH() {
        return OPENCARDNAME.pvUserData$VH;
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.pvUserData$VH.get(seg);
    }
    public static void pvUserData$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME.pvUserData$VH.set(seg, x);
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.pvUserData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvUserData$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME.pvUserData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwShareMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwShareMode"));
    public static VarHandle dwShareMode$VH() {
        return OPENCARDNAME.dwShareMode$VH;
    }
    public static int dwShareMode$get(MemorySegment seg) {
        return (int)OPENCARDNAME.dwShareMode$VH.get(seg);
    }
    public static void dwShareMode$set( MemorySegment seg, int x) {
        OPENCARDNAME.dwShareMode$VH.set(seg, x);
    }
    public static int dwShareMode$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME.dwShareMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwShareMode$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME.dwShareMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPreferredProtocols$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPreferredProtocols"));
    public static VarHandle dwPreferredProtocols$VH() {
        return OPENCARDNAME.dwPreferredProtocols$VH;
    }
    public static int dwPreferredProtocols$get(MemorySegment seg) {
        return (int)OPENCARDNAME.dwPreferredProtocols$VH.get(seg);
    }
    public static void dwPreferredProtocols$set( MemorySegment seg, int x) {
        OPENCARDNAME.dwPreferredProtocols$VH.set(seg, x);
    }
    public static int dwPreferredProtocols$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME.dwPreferredProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPreferredProtocols$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME.dwPreferredProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwActiveProtocol$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwActiveProtocol"));
    public static VarHandle dwActiveProtocol$VH() {
        return OPENCARDNAME.dwActiveProtocol$VH;
    }
    public static int dwActiveProtocol$get(MemorySegment seg) {
        return (int)OPENCARDNAME.dwActiveProtocol$VH.get(seg);
    }
    public static void dwActiveProtocol$set( MemorySegment seg, int x) {
        OPENCARDNAME.dwActiveProtocol$VH.set(seg, x);
    }
    public static int dwActiveProtocol$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME.dwActiveProtocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwActiveProtocol$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME.dwActiveProtocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnConnect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnConnect"));
    public static VarHandle lpfnConnect$VH() {
        return OPENCARDNAME.lpfnConnect$VH;
    }
    public static MemoryAddress lpfnConnect$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpfnConnect$VH.get(seg);
    }
    public static void lpfnConnect$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME.lpfnConnect$VH.set(seg, x);
    }
    public static MemoryAddress lpfnConnect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpfnConnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnConnect$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME.lpfnConnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCONNPROCA lpfnConnect (MemorySegment segment, MemorySession session) {
        return LPOCNCONNPROCA.ofAddress(lpfnConnect$get(segment), session);
    }
    static final VarHandle lpfnCheck$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnCheck"));
    public static VarHandle lpfnCheck$VH() {
        return OPENCARDNAME.lpfnCheck$VH;
    }
    public static MemoryAddress lpfnCheck$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpfnCheck$VH.get(seg);
    }
    public static void lpfnCheck$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME.lpfnCheck$VH.set(seg, x);
    }
    public static MemoryAddress lpfnCheck$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpfnCheck$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnCheck$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME.lpfnCheck$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCHKPROC lpfnCheck (MemorySegment segment, MemorySession session) {
        return LPOCNCHKPROC.ofAddress(lpfnCheck$get(segment), session);
    }
    static final VarHandle lpfnDisconnect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnDisconnect"));
    public static VarHandle lpfnDisconnect$VH() {
        return OPENCARDNAME.lpfnDisconnect$VH;
    }
    public static MemoryAddress lpfnDisconnect$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpfnDisconnect$VH.get(seg);
    }
    public static void lpfnDisconnect$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME.lpfnDisconnect$VH.set(seg, x);
    }
    public static MemoryAddress lpfnDisconnect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAME.lpfnDisconnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnDisconnect$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME.lpfnDisconnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNDSCPROC lpfnDisconnect (MemorySegment segment, MemorySession session) {
        return LPOCNDSCPROC.ofAddress(lpfnDisconnect$get(segment), session);
    }
    static final VarHandle hCardHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCardHandle"));
    public static VarHandle hCardHandle$VH() {
        return OPENCARDNAME.hCardHandle$VH;
    }
    public static long hCardHandle$get(MemorySegment seg) {
        return (long)OPENCARDNAME.hCardHandle$VH.get(seg);
    }
    public static void hCardHandle$set( MemorySegment seg, long x) {
        OPENCARDNAME.hCardHandle$VH.set(seg, x);
    }
    public static long hCardHandle$get(MemorySegment seg, long index) {
        return (long)OPENCARDNAME.hCardHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCardHandle$set(MemorySegment seg, long index, long x) {
        OPENCARDNAME.hCardHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


