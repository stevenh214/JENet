// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _KEY_EVENT_RECORD {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("bKeyDown"),
        Constants$root.C_SHORT$LAYOUT.withName("wRepeatCount"),
        Constants$root.C_SHORT$LAYOUT.withName("wVirtualKeyCode"),
        Constants$root.C_SHORT$LAYOUT.withName("wVirtualScanCode"),
        MemoryLayout.unionLayout(
            Constants$root.C_SHORT$LAYOUT.withName("UnicodeChar"),
            Constants$root.C_CHAR$LAYOUT.withName("AsciiChar")
        ).withName("uChar"),
        Constants$root.C_LONG$LAYOUT.withName("dwControlKeyState")
    ).withName("_KEY_EVENT_RECORD");
    public static MemoryLayout $LAYOUT() {
        return _KEY_EVENT_RECORD.$struct$LAYOUT;
    }
    static final VarHandle bKeyDown$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bKeyDown"));
    public static VarHandle bKeyDown$VH() {
        return _KEY_EVENT_RECORD.bKeyDown$VH;
    }
    public static int bKeyDown$get(MemorySegment seg) {
        return (int)_KEY_EVENT_RECORD.bKeyDown$VH.get(seg);
    }
    public static void bKeyDown$set( MemorySegment seg, int x) {
        _KEY_EVENT_RECORD.bKeyDown$VH.set(seg, x);
    }
    public static int bKeyDown$get(MemorySegment seg, long index) {
        return (int)_KEY_EVENT_RECORD.bKeyDown$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bKeyDown$set(MemorySegment seg, long index, int x) {
        _KEY_EVENT_RECORD.bKeyDown$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wRepeatCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wRepeatCount"));
    public static VarHandle wRepeatCount$VH() {
        return _KEY_EVENT_RECORD.wRepeatCount$VH;
    }
    public static short wRepeatCount$get(MemorySegment seg) {
        return (short)_KEY_EVENT_RECORD.wRepeatCount$VH.get(seg);
    }
    public static void wRepeatCount$set( MemorySegment seg, short x) {
        _KEY_EVENT_RECORD.wRepeatCount$VH.set(seg, x);
    }
    public static short wRepeatCount$get(MemorySegment seg, long index) {
        return (short)_KEY_EVENT_RECORD.wRepeatCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wRepeatCount$set(MemorySegment seg, long index, short x) {
        _KEY_EVENT_RECORD.wRepeatCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wVirtualKeyCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVirtualKeyCode"));
    public static VarHandle wVirtualKeyCode$VH() {
        return _KEY_EVENT_RECORD.wVirtualKeyCode$VH;
    }
    public static short wVirtualKeyCode$get(MemorySegment seg) {
        return (short)_KEY_EVENT_RECORD.wVirtualKeyCode$VH.get(seg);
    }
    public static void wVirtualKeyCode$set( MemorySegment seg, short x) {
        _KEY_EVENT_RECORD.wVirtualKeyCode$VH.set(seg, x);
    }
    public static short wVirtualKeyCode$get(MemorySegment seg, long index) {
        return (short)_KEY_EVENT_RECORD.wVirtualKeyCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVirtualKeyCode$set(MemorySegment seg, long index, short x) {
        _KEY_EVENT_RECORD.wVirtualKeyCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wVirtualScanCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVirtualScanCode"));
    public static VarHandle wVirtualScanCode$VH() {
        return _KEY_EVENT_RECORD.wVirtualScanCode$VH;
    }
    public static short wVirtualScanCode$get(MemorySegment seg) {
        return (short)_KEY_EVENT_RECORD.wVirtualScanCode$VH.get(seg);
    }
    public static void wVirtualScanCode$set( MemorySegment seg, short x) {
        _KEY_EVENT_RECORD.wVirtualScanCode$VH.set(seg, x);
    }
    public static short wVirtualScanCode$get(MemorySegment seg, long index) {
        return (short)_KEY_EVENT_RECORD.wVirtualScanCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVirtualScanCode$set(MemorySegment seg, long index, short x) {
        _KEY_EVENT_RECORD.wVirtualScanCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class uChar {

        static final  GroupLayout uChar$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_SHORT$LAYOUT.withName("UnicodeChar"),
            Constants$root.C_CHAR$LAYOUT.withName("AsciiChar")
        );
        public static MemoryLayout $LAYOUT() {
            return uChar.uChar$union$LAYOUT;
        }
        static final VarHandle UnicodeChar$VH = uChar$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnicodeChar"));
        public static VarHandle UnicodeChar$VH() {
            return uChar.UnicodeChar$VH;
        }
        public static short UnicodeChar$get(MemorySegment seg) {
            return (short)uChar.UnicodeChar$VH.get(seg);
        }
        public static void UnicodeChar$set( MemorySegment seg, short x) {
            uChar.UnicodeChar$VH.set(seg, x);
        }
        public static short UnicodeChar$get(MemorySegment seg, long index) {
            return (short)uChar.UnicodeChar$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void UnicodeChar$set(MemorySegment seg, long index, short x) {
            uChar.UnicodeChar$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle AsciiChar$VH = uChar$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AsciiChar"));
        public static VarHandle AsciiChar$VH() {
            return uChar.AsciiChar$VH;
        }
        public static byte AsciiChar$get(MemorySegment seg) {
            return (byte)uChar.AsciiChar$VH.get(seg);
        }
        public static void AsciiChar$set( MemorySegment seg, byte x) {
            uChar.AsciiChar$VH.set(seg, x);
        }
        public static byte AsciiChar$get(MemorySegment seg, long index) {
            return (byte)uChar.AsciiChar$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AsciiChar$set(MemorySegment seg, long index, byte x) {
            uChar.AsciiChar$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment uChar$slice(MemorySegment seg) {
        return seg.asSlice(10, 2);
    }
    static final VarHandle dwControlKeyState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwControlKeyState"));
    public static VarHandle dwControlKeyState$VH() {
        return _KEY_EVENT_RECORD.dwControlKeyState$VH;
    }
    public static int dwControlKeyState$get(MemorySegment seg) {
        return (int)_KEY_EVENT_RECORD.dwControlKeyState$VH.get(seg);
    }
    public static void dwControlKeyState$set( MemorySegment seg, int x) {
        _KEY_EVENT_RECORD.dwControlKeyState$VH.set(seg, x);
    }
    public static int dwControlKeyState$get(MemorySegment seg, long index) {
        return (int)_KEY_EVENT_RECORD.dwControlKeyState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwControlKeyState$set(MemorySegment seg, long index, int x) {
        _KEY_EVENT_RECORD.dwControlKeyState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


