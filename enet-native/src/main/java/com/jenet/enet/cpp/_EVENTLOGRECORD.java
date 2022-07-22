// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _EVENTLOGRECORD {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Length"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("RecordNumber"),
        Constants$root.C_LONG$LAYOUT.withName("TimeGenerated"),
        Constants$root.C_LONG$LAYOUT.withName("TimeWritten"),
        Constants$root.C_LONG$LAYOUT.withName("EventID"),
        Constants$root.C_SHORT$LAYOUT.withName("EventType"),
        Constants$root.C_SHORT$LAYOUT.withName("NumStrings"),
        Constants$root.C_SHORT$LAYOUT.withName("EventCategory"),
        Constants$root.C_SHORT$LAYOUT.withName("ReservedFlags"),
        Constants$root.C_LONG$LAYOUT.withName("ClosingRecordNumber"),
        Constants$root.C_LONG$LAYOUT.withName("StringOffset"),
        Constants$root.C_LONG$LAYOUT.withName("UserSidLength"),
        Constants$root.C_LONG$LAYOUT.withName("UserSidOffset"),
        Constants$root.C_LONG$LAYOUT.withName("DataLength"),
        Constants$root.C_LONG$LAYOUT.withName("DataOffset")
    ).withName("_EVENTLOGRECORD");
    public static MemoryLayout $LAYOUT() {
        return _EVENTLOGRECORD.$struct$LAYOUT;
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _EVENTLOGRECORD.Length$VH;
    }
    public static int Length$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _EVENTLOGRECORD.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RecordNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RecordNumber"));
    public static VarHandle RecordNumber$VH() {
        return _EVENTLOGRECORD.RecordNumber$VH;
    }
    public static int RecordNumber$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.RecordNumber$VH.get(seg);
    }
    public static void RecordNumber$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.RecordNumber$VH.set(seg, x);
    }
    public static int RecordNumber$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.RecordNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RecordNumber$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.RecordNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeGenerated$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeGenerated"));
    public static VarHandle TimeGenerated$VH() {
        return _EVENTLOGRECORD.TimeGenerated$VH;
    }
    public static int TimeGenerated$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.TimeGenerated$VH.get(seg);
    }
    public static void TimeGenerated$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.TimeGenerated$VH.set(seg, x);
    }
    public static int TimeGenerated$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.TimeGenerated$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeGenerated$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.TimeGenerated$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeWritten$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeWritten"));
    public static VarHandle TimeWritten$VH() {
        return _EVENTLOGRECORD.TimeWritten$VH;
    }
    public static int TimeWritten$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.TimeWritten$VH.get(seg);
    }
    public static void TimeWritten$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.TimeWritten$VH.set(seg, x);
    }
    public static int TimeWritten$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.TimeWritten$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeWritten$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.TimeWritten$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EventID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EventID"));
    public static VarHandle EventID$VH() {
        return _EVENTLOGRECORD.EventID$VH;
    }
    public static int EventID$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.EventID$VH.get(seg);
    }
    public static void EventID$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.EventID$VH.set(seg, x);
    }
    public static int EventID$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.EventID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EventID$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.EventID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EventType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EventType"));
    public static VarHandle EventType$VH() {
        return _EVENTLOGRECORD.EventType$VH;
    }
    public static short EventType$get(MemorySegment seg) {
        return (short)_EVENTLOGRECORD.EventType$VH.get(seg);
    }
    public static void EventType$set( MemorySegment seg, short x) {
        _EVENTLOGRECORD.EventType$VH.set(seg, x);
    }
    public static short EventType$get(MemorySegment seg, long index) {
        return (short)_EVENTLOGRECORD.EventType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EventType$set(MemorySegment seg, long index, short x) {
        _EVENTLOGRECORD.EventType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumStrings$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumStrings"));
    public static VarHandle NumStrings$VH() {
        return _EVENTLOGRECORD.NumStrings$VH;
    }
    public static short NumStrings$get(MemorySegment seg) {
        return (short)_EVENTLOGRECORD.NumStrings$VH.get(seg);
    }
    public static void NumStrings$set( MemorySegment seg, short x) {
        _EVENTLOGRECORD.NumStrings$VH.set(seg, x);
    }
    public static short NumStrings$get(MemorySegment seg, long index) {
        return (short)_EVENTLOGRECORD.NumStrings$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumStrings$set(MemorySegment seg, long index, short x) {
        _EVENTLOGRECORD.NumStrings$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EventCategory$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EventCategory"));
    public static VarHandle EventCategory$VH() {
        return _EVENTLOGRECORD.EventCategory$VH;
    }
    public static short EventCategory$get(MemorySegment seg) {
        return (short)_EVENTLOGRECORD.EventCategory$VH.get(seg);
    }
    public static void EventCategory$set( MemorySegment seg, short x) {
        _EVENTLOGRECORD.EventCategory$VH.set(seg, x);
    }
    public static short EventCategory$get(MemorySegment seg, long index) {
        return (short)_EVENTLOGRECORD.EventCategory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EventCategory$set(MemorySegment seg, long index, short x) {
        _EVENTLOGRECORD.EventCategory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReservedFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReservedFlags"));
    public static VarHandle ReservedFlags$VH() {
        return _EVENTLOGRECORD.ReservedFlags$VH;
    }
    public static short ReservedFlags$get(MemorySegment seg) {
        return (short)_EVENTLOGRECORD.ReservedFlags$VH.get(seg);
    }
    public static void ReservedFlags$set( MemorySegment seg, short x) {
        _EVENTLOGRECORD.ReservedFlags$VH.set(seg, x);
    }
    public static short ReservedFlags$get(MemorySegment seg, long index) {
        return (short)_EVENTLOGRECORD.ReservedFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReservedFlags$set(MemorySegment seg, long index, short x) {
        _EVENTLOGRECORD.ReservedFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ClosingRecordNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ClosingRecordNumber"));
    public static VarHandle ClosingRecordNumber$VH() {
        return _EVENTLOGRECORD.ClosingRecordNumber$VH;
    }
    public static int ClosingRecordNumber$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.ClosingRecordNumber$VH.get(seg);
    }
    public static void ClosingRecordNumber$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.ClosingRecordNumber$VH.set(seg, x);
    }
    public static int ClosingRecordNumber$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.ClosingRecordNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClosingRecordNumber$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.ClosingRecordNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StringOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StringOffset"));
    public static VarHandle StringOffset$VH() {
        return _EVENTLOGRECORD.StringOffset$VH;
    }
    public static int StringOffset$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.StringOffset$VH.get(seg);
    }
    public static void StringOffset$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.StringOffset$VH.set(seg, x);
    }
    public static int StringOffset$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.StringOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StringOffset$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.StringOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UserSidLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserSidLength"));
    public static VarHandle UserSidLength$VH() {
        return _EVENTLOGRECORD.UserSidLength$VH;
    }
    public static int UserSidLength$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.UserSidLength$VH.get(seg);
    }
    public static void UserSidLength$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.UserSidLength$VH.set(seg, x);
    }
    public static int UserSidLength$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.UserSidLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserSidLength$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.UserSidLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UserSidOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserSidOffset"));
    public static VarHandle UserSidOffset$VH() {
        return _EVENTLOGRECORD.UserSidOffset$VH;
    }
    public static int UserSidOffset$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.UserSidOffset$VH.get(seg);
    }
    public static void UserSidOffset$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.UserSidOffset$VH.set(seg, x);
    }
    public static int UserSidOffset$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.UserSidOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserSidOffset$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.UserSidOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataLength"));
    public static VarHandle DataLength$VH() {
        return _EVENTLOGRECORD.DataLength$VH;
    }
    public static int DataLength$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.DataLength$VH.get(seg);
    }
    public static void DataLength$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.DataLength$VH.set(seg, x);
    }
    public static int DataLength$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.DataLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataLength$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.DataLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataOffset"));
    public static VarHandle DataOffset$VH() {
        return _EVENTLOGRECORD.DataOffset$VH;
    }
    public static int DataOffset$get(MemorySegment seg) {
        return (int)_EVENTLOGRECORD.DataOffset$VH.get(seg);
    }
    public static void DataOffset$set( MemorySegment seg, int x) {
        _EVENTLOGRECORD.DataOffset$VH.set(seg, x);
    }
    public static int DataOffset$get(MemorySegment seg, long index) {
        return (int)_EVENTLOGRECORD.DataOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataOffset$set(MemorySegment seg, long index, int x) {
        _EVENTLOGRECORD.DataOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


