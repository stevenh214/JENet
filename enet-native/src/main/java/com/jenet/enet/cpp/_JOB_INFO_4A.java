// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _JOB_INFO_4A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("JobId"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pPrinterName"),
        Constants$root.C_POINTER$LAYOUT.withName("pMachineName"),
        Constants$root.C_POINTER$LAYOUT.withName("pUserName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDocument"),
        Constants$root.C_POINTER$LAYOUT.withName("pNotifyName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDatatype"),
        Constants$root.C_POINTER$LAYOUT.withName("pPrintProcessor"),
        Constants$root.C_POINTER$LAYOUT.withName("pParameters"),
        Constants$root.C_POINTER$LAYOUT.withName("pDriverName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDevMode"),
        Constants$root.C_POINTER$LAYOUT.withName("pStatus"),
        Constants$root.C_POINTER$LAYOUT.withName("pSecurityDescriptor"),
        Constants$root.C_LONG$LAYOUT.withName("Status"),
        Constants$root.C_LONG$LAYOUT.withName("Priority"),
        Constants$root.C_LONG$LAYOUT.withName("Position"),
        Constants$root.C_LONG$LAYOUT.withName("StartTime"),
        Constants$root.C_LONG$LAYOUT.withName("UntilTime"),
        Constants$root.C_LONG$LAYOUT.withName("TotalPages"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("wYear"),
            Constants$root.C_SHORT$LAYOUT.withName("wMonth"),
            Constants$root.C_SHORT$LAYOUT.withName("wDayOfWeek"),
            Constants$root.C_SHORT$LAYOUT.withName("wDay"),
            Constants$root.C_SHORT$LAYOUT.withName("wHour"),
            Constants$root.C_SHORT$LAYOUT.withName("wMinute"),
            Constants$root.C_SHORT$LAYOUT.withName("wSecond"),
            Constants$root.C_SHORT$LAYOUT.withName("wMilliseconds")
        ).withName("Submitted"),
        Constants$root.C_LONG$LAYOUT.withName("Time"),
        Constants$root.C_LONG$LAYOUT.withName("PagesPrinted"),
        Constants$root.C_LONG$LAYOUT.withName("SizeHigh")
    ).withName("_JOB_INFO_4A");
    public static MemoryLayout $LAYOUT() {
        return _JOB_INFO_4A.$struct$LAYOUT;
    }
    static final VarHandle JobId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobId"));
    public static VarHandle JobId$VH() {
        return _JOB_INFO_4A.JobId$VH;
    }
    public static int JobId$get(MemorySegment seg) {
        return (int)_JOB_INFO_4A.JobId$VH.get(seg);
    }
    public static void JobId$set( MemorySegment seg, int x) {
        _JOB_INFO_4A.JobId$VH.set(seg, x);
    }
    public static int JobId$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_4A.JobId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobId$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_4A.JobId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPrinterName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrinterName"));
    public static VarHandle pPrinterName$VH() {
        return _JOB_INFO_4A.pPrinterName$VH;
    }
    public static MemoryAddress pPrinterName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pPrinterName$VH.get(seg);
    }
    public static void pPrinterName$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pPrinterName$VH.set(seg, x);
    }
    public static MemoryAddress pPrinterName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pPrinterName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrinterName$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pPrinterName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMachineName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pMachineName"));
    public static VarHandle pMachineName$VH() {
        return _JOB_INFO_4A.pMachineName$VH;
    }
    public static MemoryAddress pMachineName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pMachineName$VH.get(seg);
    }
    public static void pMachineName$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pMachineName$VH.set(seg, x);
    }
    public static MemoryAddress pMachineName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pMachineName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMachineName$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pMachineName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUserName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUserName"));
    public static VarHandle pUserName$VH() {
        return _JOB_INFO_4A.pUserName$VH;
    }
    public static MemoryAddress pUserName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pUserName$VH.get(seg);
    }
    public static void pUserName$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pUserName$VH.set(seg, x);
    }
    public static MemoryAddress pUserName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pUserName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUserName$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pUserName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDocument$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDocument"));
    public static VarHandle pDocument$VH() {
        return _JOB_INFO_4A.pDocument$VH;
    }
    public static MemoryAddress pDocument$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pDocument$VH.get(seg);
    }
    public static void pDocument$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pDocument$VH.set(seg, x);
    }
    public static MemoryAddress pDocument$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pDocument$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDocument$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pDocument$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pNotifyName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pNotifyName"));
    public static VarHandle pNotifyName$VH() {
        return _JOB_INFO_4A.pNotifyName$VH;
    }
    public static MemoryAddress pNotifyName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pNotifyName$VH.get(seg);
    }
    public static void pNotifyName$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pNotifyName$VH.set(seg, x);
    }
    public static MemoryAddress pNotifyName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pNotifyName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pNotifyName$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pNotifyName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDatatype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDatatype"));
    public static VarHandle pDatatype$VH() {
        return _JOB_INFO_4A.pDatatype$VH;
    }
    public static MemoryAddress pDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pDatatype$VH.get(seg);
    }
    public static void pDatatype$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pDatatype$VH.set(seg, x);
    }
    public static MemoryAddress pDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pDatatype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pDatatype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPrintProcessor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrintProcessor"));
    public static VarHandle pPrintProcessor$VH() {
        return _JOB_INFO_4A.pPrintProcessor$VH;
    }
    public static MemoryAddress pPrintProcessor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pPrintProcessor$VH.get(seg);
    }
    public static void pPrintProcessor$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pPrintProcessor$VH.set(seg, x);
    }
    public static MemoryAddress pPrintProcessor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pPrintProcessor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrintProcessor$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pPrintProcessor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pParameters$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pParameters"));
    public static VarHandle pParameters$VH() {
        return _JOB_INFO_4A.pParameters$VH;
    }
    public static MemoryAddress pParameters$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pParameters$VH.get(seg);
    }
    public static void pParameters$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pParameters$VH.set(seg, x);
    }
    public static MemoryAddress pParameters$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pParameters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pParameters$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pParameters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDriverName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDriverName"));
    public static VarHandle pDriverName$VH() {
        return _JOB_INFO_4A.pDriverName$VH;
    }
    public static MemoryAddress pDriverName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pDriverName$VH.get(seg);
    }
    public static void pDriverName$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pDriverName$VH.set(seg, x);
    }
    public static MemoryAddress pDriverName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pDriverName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDriverName$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pDriverName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDevMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDevMode"));
    public static VarHandle pDevMode$VH() {
        return _JOB_INFO_4A.pDevMode$VH;
    }
    public static MemoryAddress pDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pDevMode$VH.get(seg);
    }
    public static void pDevMode$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pDevMode$VH.set(seg, x);
    }
    public static MemoryAddress pDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDevMode$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pDevMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pStatus"));
    public static VarHandle pStatus$VH() {
        return _JOB_INFO_4A.pStatus$VH;
    }
    public static MemoryAddress pStatus$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pStatus$VH.get(seg);
    }
    public static void pStatus$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pStatus$VH.set(seg, x);
    }
    public static MemoryAddress pStatus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pStatus$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSecurityDescriptor"));
    public static VarHandle pSecurityDescriptor$VH() {
        return _JOB_INFO_4A.pSecurityDescriptor$VH;
    }
    public static MemoryAddress pSecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pSecurityDescriptor$VH.get(seg);
    }
    public static void pSecurityDescriptor$set( MemorySegment seg, MemoryAddress x) {
        _JOB_INFO_4A.pSecurityDescriptor$VH.set(seg, x);
    }
    public static MemoryAddress pSecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOB_INFO_4A.pSecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSecurityDescriptor$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOB_INFO_4A.pSecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Status"));
    public static VarHandle Status$VH() {
        return _JOB_INFO_4A.Status$VH;
    }
    public static int Status$get(MemorySegment seg) {
        return (int)_JOB_INFO_4A.Status$VH.get(seg);
    }
    public static void Status$set( MemorySegment seg, int x) {
        _JOB_INFO_4A.Status$VH.set(seg, x);
    }
    public static int Status$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_4A.Status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Status$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_4A.Status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Priority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Priority"));
    public static VarHandle Priority$VH() {
        return _JOB_INFO_4A.Priority$VH;
    }
    public static int Priority$get(MemorySegment seg) {
        return (int)_JOB_INFO_4A.Priority$VH.get(seg);
    }
    public static void Priority$set( MemorySegment seg, int x) {
        _JOB_INFO_4A.Priority$VH.set(seg, x);
    }
    public static int Priority$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_4A.Priority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Priority$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_4A.Priority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Position$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Position"));
    public static VarHandle Position$VH() {
        return _JOB_INFO_4A.Position$VH;
    }
    public static int Position$get(MemorySegment seg) {
        return (int)_JOB_INFO_4A.Position$VH.get(seg);
    }
    public static void Position$set( MemorySegment seg, int x) {
        _JOB_INFO_4A.Position$VH.set(seg, x);
    }
    public static int Position$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_4A.Position$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Position$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_4A.Position$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StartTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartTime"));
    public static VarHandle StartTime$VH() {
        return _JOB_INFO_4A.StartTime$VH;
    }
    public static int StartTime$get(MemorySegment seg) {
        return (int)_JOB_INFO_4A.StartTime$VH.get(seg);
    }
    public static void StartTime$set( MemorySegment seg, int x) {
        _JOB_INFO_4A.StartTime$VH.set(seg, x);
    }
    public static int StartTime$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_4A.StartTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartTime$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_4A.StartTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UntilTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UntilTime"));
    public static VarHandle UntilTime$VH() {
        return _JOB_INFO_4A.UntilTime$VH;
    }
    public static int UntilTime$get(MemorySegment seg) {
        return (int)_JOB_INFO_4A.UntilTime$VH.get(seg);
    }
    public static void UntilTime$set( MemorySegment seg, int x) {
        _JOB_INFO_4A.UntilTime$VH.set(seg, x);
    }
    public static int UntilTime$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_4A.UntilTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UntilTime$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_4A.UntilTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalPages$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalPages"));
    public static VarHandle TotalPages$VH() {
        return _JOB_INFO_4A.TotalPages$VH;
    }
    public static int TotalPages$get(MemorySegment seg) {
        return (int)_JOB_INFO_4A.TotalPages$VH.get(seg);
    }
    public static void TotalPages$set( MemorySegment seg, int x) {
        _JOB_INFO_4A.TotalPages$VH.set(seg, x);
    }
    public static int TotalPages$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_4A.TotalPages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalPages$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_4A.TotalPages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _JOB_INFO_4A.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_JOB_INFO_4A.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _JOB_INFO_4A.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_4A.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_4A.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Submitted$slice(MemorySegment seg) {
        return seg.asSlice(132, 16);
    }
    static final VarHandle Time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Time"));
    public static VarHandle Time$VH() {
        return _JOB_INFO_4A.Time$VH;
    }
    public static int Time$get(MemorySegment seg) {
        return (int)_JOB_INFO_4A.Time$VH.get(seg);
    }
    public static void Time$set( MemorySegment seg, int x) {
        _JOB_INFO_4A.Time$VH.set(seg, x);
    }
    public static int Time$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_4A.Time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Time$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_4A.Time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PagesPrinted$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PagesPrinted"));
    public static VarHandle PagesPrinted$VH() {
        return _JOB_INFO_4A.PagesPrinted$VH;
    }
    public static int PagesPrinted$get(MemorySegment seg) {
        return (int)_JOB_INFO_4A.PagesPrinted$VH.get(seg);
    }
    public static void PagesPrinted$set( MemorySegment seg, int x) {
        _JOB_INFO_4A.PagesPrinted$VH.set(seg, x);
    }
    public static int PagesPrinted$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_4A.PagesPrinted$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PagesPrinted$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_4A.PagesPrinted$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeHigh$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeHigh"));
    public static VarHandle SizeHigh$VH() {
        return _JOB_INFO_4A.SizeHigh$VH;
    }
    public static int SizeHigh$get(MemorySegment seg) {
        return (int)_JOB_INFO_4A.SizeHigh$VH.get(seg);
    }
    public static void SizeHigh$set( MemorySegment seg, int x) {
        _JOB_INFO_4A.SizeHigh$VH.set(seg, x);
    }
    public static int SizeHigh$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_4A.SizeHigh$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeHigh$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_4A.SizeHigh$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


