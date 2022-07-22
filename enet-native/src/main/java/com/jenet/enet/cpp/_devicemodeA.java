// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _devicemodeA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("dmDeviceName"),
        Constants$root.C_SHORT$LAYOUT.withName("dmSpecVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("dmDriverVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("dmSize"),
        Constants$root.C_SHORT$LAYOUT.withName("dmDriverExtra"),
        Constants$root.C_LONG$LAYOUT.withName("dmFields"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("dmOrientation"),
                Constants$root.C_SHORT$LAYOUT.withName("dmPaperSize"),
                Constants$root.C_SHORT$LAYOUT.withName("dmPaperLength"),
                Constants$root.C_SHORT$LAYOUT.withName("dmPaperWidth"),
                Constants$root.C_SHORT$LAYOUT.withName("dmScale"),
                Constants$root.C_SHORT$LAYOUT.withName("dmCopies"),
                Constants$root.C_SHORT$LAYOUT.withName("dmDefaultSource"),
                Constants$root.C_SHORT$LAYOUT.withName("dmPrintQuality")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("x"),
                    Constants$root.C_LONG$LAYOUT.withName("y")
                ).withName("dmPosition"),
                Constants$root.C_LONG$LAYOUT.withName("dmDisplayOrientation"),
                Constants$root.C_LONG$LAYOUT.withName("dmDisplayFixedOutput")
            ).withName("$anon$1")
        ).withName("$anon$0"),
        Constants$root.C_SHORT$LAYOUT.withName("dmColor"),
        Constants$root.C_SHORT$LAYOUT.withName("dmDuplex"),
        Constants$root.C_SHORT$LAYOUT.withName("dmYResolution"),
        Constants$root.C_SHORT$LAYOUT.withName("dmTTOption"),
        Constants$root.C_SHORT$LAYOUT.withName("dmCollate"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("dmFormName"),
        Constants$root.C_SHORT$LAYOUT.withName("dmLogPixels"),
        Constants$root.C_LONG$LAYOUT.withName("dmBitsPerPel"),
        Constants$root.C_LONG$LAYOUT.withName("dmPelsWidth"),
        Constants$root.C_LONG$LAYOUT.withName("dmPelsHeight"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("dmDisplayFlags"),
            Constants$root.C_LONG$LAYOUT.withName("dmNup")
        ).withName("$anon$1"),
        Constants$root.C_LONG$LAYOUT.withName("dmDisplayFrequency"),
        Constants$root.C_LONG$LAYOUT.withName("dmICMMethod"),
        Constants$root.C_LONG$LAYOUT.withName("dmICMIntent"),
        Constants$root.C_LONG$LAYOUT.withName("dmMediaType"),
        Constants$root.C_LONG$LAYOUT.withName("dmDitherType"),
        Constants$root.C_LONG$LAYOUT.withName("dmReserved1"),
        Constants$root.C_LONG$LAYOUT.withName("dmReserved2"),
        Constants$root.C_LONG$LAYOUT.withName("dmPanningWidth"),
        Constants$root.C_LONG$LAYOUT.withName("dmPanningHeight")
    ).withName("_devicemodeA");
    public static MemoryLayout $LAYOUT() {
        return _devicemodeA.$struct$LAYOUT;
    }
    public static MemorySegment dmDeviceName$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    static final VarHandle dmSpecVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmSpecVersion"));
    public static VarHandle dmSpecVersion$VH() {
        return _devicemodeA.dmSpecVersion$VH;
    }
    public static short dmSpecVersion$get(MemorySegment seg) {
        return (short)_devicemodeA.dmSpecVersion$VH.get(seg);
    }
    public static void dmSpecVersion$set( MemorySegment seg, short x) {
        _devicemodeA.dmSpecVersion$VH.set(seg, x);
    }
    public static short dmSpecVersion$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmSpecVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmSpecVersion$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmSpecVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmDriverVersion"));
    public static VarHandle dmDriverVersion$VH() {
        return _devicemodeA.dmDriverVersion$VH;
    }
    public static short dmDriverVersion$get(MemorySegment seg) {
        return (short)_devicemodeA.dmDriverVersion$VH.get(seg);
    }
    public static void dmDriverVersion$set( MemorySegment seg, short x) {
        _devicemodeA.dmDriverVersion$VH.set(seg, x);
    }
    public static short dmDriverVersion$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmDriverVersion$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmSize"));
    public static VarHandle dmSize$VH() {
        return _devicemodeA.dmSize$VH;
    }
    public static short dmSize$get(MemorySegment seg) {
        return (short)_devicemodeA.dmSize$VH.get(seg);
    }
    public static void dmSize$set( MemorySegment seg, short x) {
        _devicemodeA.dmSize$VH.set(seg, x);
    }
    public static short dmSize$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmSize$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmDriverExtra$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmDriverExtra"));
    public static VarHandle dmDriverExtra$VH() {
        return _devicemodeA.dmDriverExtra$VH;
    }
    public static short dmDriverExtra$get(MemorySegment seg) {
        return (short)_devicemodeA.dmDriverExtra$VH.get(seg);
    }
    public static void dmDriverExtra$set( MemorySegment seg, short x) {
        _devicemodeA.dmDriverExtra$VH.set(seg, x);
    }
    public static short dmDriverExtra$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmDriverExtra$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmDriverExtra$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmDriverExtra$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmFields$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmFields"));
    public static VarHandle dmFields$VH() {
        return _devicemodeA.dmFields$VH;
    }
    public static int dmFields$get(MemorySegment seg) {
        return (int)_devicemodeA.dmFields$VH.get(seg);
    }
    public static void dmFields$set( MemorySegment seg, int x) {
        _devicemodeA.dmFields$VH.set(seg, x);
    }
    public static int dmFields$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmFields$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmFields$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmFields$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmOrientation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dmOrientation"));
    public static VarHandle dmOrientation$VH() {
        return _devicemodeA.dmOrientation$VH;
    }
    public static short dmOrientation$get(MemorySegment seg) {
        return (short)_devicemodeA.dmOrientation$VH.get(seg);
    }
    public static void dmOrientation$set( MemorySegment seg, short x) {
        _devicemodeA.dmOrientation$VH.set(seg, x);
    }
    public static short dmOrientation$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmOrientation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmOrientation$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmOrientation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmPaperSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dmPaperSize"));
    public static VarHandle dmPaperSize$VH() {
        return _devicemodeA.dmPaperSize$VH;
    }
    public static short dmPaperSize$get(MemorySegment seg) {
        return (short)_devicemodeA.dmPaperSize$VH.get(seg);
    }
    public static void dmPaperSize$set( MemorySegment seg, short x) {
        _devicemodeA.dmPaperSize$VH.set(seg, x);
    }
    public static short dmPaperSize$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmPaperSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmPaperSize$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmPaperSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmPaperLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dmPaperLength"));
    public static VarHandle dmPaperLength$VH() {
        return _devicemodeA.dmPaperLength$VH;
    }
    public static short dmPaperLength$get(MemorySegment seg) {
        return (short)_devicemodeA.dmPaperLength$VH.get(seg);
    }
    public static void dmPaperLength$set( MemorySegment seg, short x) {
        _devicemodeA.dmPaperLength$VH.set(seg, x);
    }
    public static short dmPaperLength$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmPaperLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmPaperLength$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmPaperLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmPaperWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dmPaperWidth"));
    public static VarHandle dmPaperWidth$VH() {
        return _devicemodeA.dmPaperWidth$VH;
    }
    public static short dmPaperWidth$get(MemorySegment seg) {
        return (short)_devicemodeA.dmPaperWidth$VH.get(seg);
    }
    public static void dmPaperWidth$set( MemorySegment seg, short x) {
        _devicemodeA.dmPaperWidth$VH.set(seg, x);
    }
    public static short dmPaperWidth$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmPaperWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmPaperWidth$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmPaperWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmScale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dmScale"));
    public static VarHandle dmScale$VH() {
        return _devicemodeA.dmScale$VH;
    }
    public static short dmScale$get(MemorySegment seg) {
        return (short)_devicemodeA.dmScale$VH.get(seg);
    }
    public static void dmScale$set( MemorySegment seg, short x) {
        _devicemodeA.dmScale$VH.set(seg, x);
    }
    public static short dmScale$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmScale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmScale$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmScale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmCopies$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dmCopies"));
    public static VarHandle dmCopies$VH() {
        return _devicemodeA.dmCopies$VH;
    }
    public static short dmCopies$get(MemorySegment seg) {
        return (short)_devicemodeA.dmCopies$VH.get(seg);
    }
    public static void dmCopies$set( MemorySegment seg, short x) {
        _devicemodeA.dmCopies$VH.set(seg, x);
    }
    public static short dmCopies$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmCopies$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmCopies$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmCopies$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmDefaultSource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dmDefaultSource"));
    public static VarHandle dmDefaultSource$VH() {
        return _devicemodeA.dmDefaultSource$VH;
    }
    public static short dmDefaultSource$get(MemorySegment seg) {
        return (short)_devicemodeA.dmDefaultSource$VH.get(seg);
    }
    public static void dmDefaultSource$set( MemorySegment seg, short x) {
        _devicemodeA.dmDefaultSource$VH.set(seg, x);
    }
    public static short dmDefaultSource$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmDefaultSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmDefaultSource$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmDefaultSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmPrintQuality$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dmPrintQuality"));
    public static VarHandle dmPrintQuality$VH() {
        return _devicemodeA.dmPrintQuality$VH;
    }
    public static short dmPrintQuality$get(MemorySegment seg) {
        return (short)_devicemodeA.dmPrintQuality$VH.get(seg);
    }
    public static void dmPrintQuality$set( MemorySegment seg, short x) {
        _devicemodeA.dmPrintQuality$VH.set(seg, x);
    }
    public static short dmPrintQuality$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmPrintQuality$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmPrintQuality$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmPrintQuality$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dmPosition$slice(MemorySegment seg) {
        return seg.asSlice(44, 8);
    }
    static final VarHandle dmDisplayOrientation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("dmDisplayOrientation"));
    public static VarHandle dmDisplayOrientation$VH() {
        return _devicemodeA.dmDisplayOrientation$VH;
    }
    public static int dmDisplayOrientation$get(MemorySegment seg) {
        return (int)_devicemodeA.dmDisplayOrientation$VH.get(seg);
    }
    public static void dmDisplayOrientation$set( MemorySegment seg, int x) {
        _devicemodeA.dmDisplayOrientation$VH.set(seg, x);
    }
    public static int dmDisplayOrientation$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmDisplayOrientation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmDisplayOrientation$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmDisplayOrientation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmDisplayFixedOutput$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("dmDisplayFixedOutput"));
    public static VarHandle dmDisplayFixedOutput$VH() {
        return _devicemodeA.dmDisplayFixedOutput$VH;
    }
    public static int dmDisplayFixedOutput$get(MemorySegment seg) {
        return (int)_devicemodeA.dmDisplayFixedOutput$VH.get(seg);
    }
    public static void dmDisplayFixedOutput$set( MemorySegment seg, int x) {
        _devicemodeA.dmDisplayFixedOutput$VH.set(seg, x);
    }
    public static int dmDisplayFixedOutput$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmDisplayFixedOutput$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmDisplayFixedOutput$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmDisplayFixedOutput$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmColor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmColor"));
    public static VarHandle dmColor$VH() {
        return _devicemodeA.dmColor$VH;
    }
    public static short dmColor$get(MemorySegment seg) {
        return (short)_devicemodeA.dmColor$VH.get(seg);
    }
    public static void dmColor$set( MemorySegment seg, short x) {
        _devicemodeA.dmColor$VH.set(seg, x);
    }
    public static short dmColor$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmColor$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmColor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmDuplex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmDuplex"));
    public static VarHandle dmDuplex$VH() {
        return _devicemodeA.dmDuplex$VH;
    }
    public static short dmDuplex$get(MemorySegment seg) {
        return (short)_devicemodeA.dmDuplex$VH.get(seg);
    }
    public static void dmDuplex$set( MemorySegment seg, short x) {
        _devicemodeA.dmDuplex$VH.set(seg, x);
    }
    public static short dmDuplex$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmDuplex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmDuplex$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmDuplex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmYResolution$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmYResolution"));
    public static VarHandle dmYResolution$VH() {
        return _devicemodeA.dmYResolution$VH;
    }
    public static short dmYResolution$get(MemorySegment seg) {
        return (short)_devicemodeA.dmYResolution$VH.get(seg);
    }
    public static void dmYResolution$set( MemorySegment seg, short x) {
        _devicemodeA.dmYResolution$VH.set(seg, x);
    }
    public static short dmYResolution$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmYResolution$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmYResolution$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmYResolution$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmTTOption$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmTTOption"));
    public static VarHandle dmTTOption$VH() {
        return _devicemodeA.dmTTOption$VH;
    }
    public static short dmTTOption$get(MemorySegment seg) {
        return (short)_devicemodeA.dmTTOption$VH.get(seg);
    }
    public static void dmTTOption$set( MemorySegment seg, short x) {
        _devicemodeA.dmTTOption$VH.set(seg, x);
    }
    public static short dmTTOption$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmTTOption$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmTTOption$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmTTOption$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmCollate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmCollate"));
    public static VarHandle dmCollate$VH() {
        return _devicemodeA.dmCollate$VH;
    }
    public static short dmCollate$get(MemorySegment seg) {
        return (short)_devicemodeA.dmCollate$VH.get(seg);
    }
    public static void dmCollate$set( MemorySegment seg, short x) {
        _devicemodeA.dmCollate$VH.set(seg, x);
    }
    public static short dmCollate$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmCollate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmCollate$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmCollate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dmFormName$slice(MemorySegment seg) {
        return seg.asSlice(70, 32);
    }
    static final VarHandle dmLogPixels$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmLogPixels"));
    public static VarHandle dmLogPixels$VH() {
        return _devicemodeA.dmLogPixels$VH;
    }
    public static short dmLogPixels$get(MemorySegment seg) {
        return (short)_devicemodeA.dmLogPixels$VH.get(seg);
    }
    public static void dmLogPixels$set( MemorySegment seg, short x) {
        _devicemodeA.dmLogPixels$VH.set(seg, x);
    }
    public static short dmLogPixels$get(MemorySegment seg, long index) {
        return (short)_devicemodeA.dmLogPixels$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmLogPixels$set(MemorySegment seg, long index, short x) {
        _devicemodeA.dmLogPixels$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmBitsPerPel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmBitsPerPel"));
    public static VarHandle dmBitsPerPel$VH() {
        return _devicemodeA.dmBitsPerPel$VH;
    }
    public static int dmBitsPerPel$get(MemorySegment seg) {
        return (int)_devicemodeA.dmBitsPerPel$VH.get(seg);
    }
    public static void dmBitsPerPel$set( MemorySegment seg, int x) {
        _devicemodeA.dmBitsPerPel$VH.set(seg, x);
    }
    public static int dmBitsPerPel$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmBitsPerPel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmBitsPerPel$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmBitsPerPel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmPelsWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmPelsWidth"));
    public static VarHandle dmPelsWidth$VH() {
        return _devicemodeA.dmPelsWidth$VH;
    }
    public static int dmPelsWidth$get(MemorySegment seg) {
        return (int)_devicemodeA.dmPelsWidth$VH.get(seg);
    }
    public static void dmPelsWidth$set( MemorySegment seg, int x) {
        _devicemodeA.dmPelsWidth$VH.set(seg, x);
    }
    public static int dmPelsWidth$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmPelsWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmPelsWidth$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmPelsWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmPelsHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmPelsHeight"));
    public static VarHandle dmPelsHeight$VH() {
        return _devicemodeA.dmPelsHeight$VH;
    }
    public static int dmPelsHeight$get(MemorySegment seg) {
        return (int)_devicemodeA.dmPelsHeight$VH.get(seg);
    }
    public static void dmPelsHeight$set( MemorySegment seg, int x) {
        _devicemodeA.dmPelsHeight$VH.set(seg, x);
    }
    public static int dmPelsHeight$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmPelsHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmPelsHeight$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmPelsHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmDisplayFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("dmDisplayFlags"));
    public static VarHandle dmDisplayFlags$VH() {
        return _devicemodeA.dmDisplayFlags$VH;
    }
    public static int dmDisplayFlags$get(MemorySegment seg) {
        return (int)_devicemodeA.dmDisplayFlags$VH.get(seg);
    }
    public static void dmDisplayFlags$set( MemorySegment seg, int x) {
        _devicemodeA.dmDisplayFlags$VH.set(seg, x);
    }
    public static int dmDisplayFlags$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmDisplayFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmDisplayFlags$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmDisplayFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmNup$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("dmNup"));
    public static VarHandle dmNup$VH() {
        return _devicemodeA.dmNup$VH;
    }
    public static int dmNup$get(MemorySegment seg) {
        return (int)_devicemodeA.dmNup$VH.get(seg);
    }
    public static void dmNup$set( MemorySegment seg, int x) {
        _devicemodeA.dmNup$VH.set(seg, x);
    }
    public static int dmNup$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmNup$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmNup$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmNup$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmDisplayFrequency$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmDisplayFrequency"));
    public static VarHandle dmDisplayFrequency$VH() {
        return _devicemodeA.dmDisplayFrequency$VH;
    }
    public static int dmDisplayFrequency$get(MemorySegment seg) {
        return (int)_devicemodeA.dmDisplayFrequency$VH.get(seg);
    }
    public static void dmDisplayFrequency$set( MemorySegment seg, int x) {
        _devicemodeA.dmDisplayFrequency$VH.set(seg, x);
    }
    public static int dmDisplayFrequency$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmDisplayFrequency$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmDisplayFrequency$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmDisplayFrequency$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmICMMethod$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmICMMethod"));
    public static VarHandle dmICMMethod$VH() {
        return _devicemodeA.dmICMMethod$VH;
    }
    public static int dmICMMethod$get(MemorySegment seg) {
        return (int)_devicemodeA.dmICMMethod$VH.get(seg);
    }
    public static void dmICMMethod$set( MemorySegment seg, int x) {
        _devicemodeA.dmICMMethod$VH.set(seg, x);
    }
    public static int dmICMMethod$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmICMMethod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmICMMethod$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmICMMethod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmICMIntent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmICMIntent"));
    public static VarHandle dmICMIntent$VH() {
        return _devicemodeA.dmICMIntent$VH;
    }
    public static int dmICMIntent$get(MemorySegment seg) {
        return (int)_devicemodeA.dmICMIntent$VH.get(seg);
    }
    public static void dmICMIntent$set( MemorySegment seg, int x) {
        _devicemodeA.dmICMIntent$VH.set(seg, x);
    }
    public static int dmICMIntent$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmICMIntent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmICMIntent$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmICMIntent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmMediaType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmMediaType"));
    public static VarHandle dmMediaType$VH() {
        return _devicemodeA.dmMediaType$VH;
    }
    public static int dmMediaType$get(MemorySegment seg) {
        return (int)_devicemodeA.dmMediaType$VH.get(seg);
    }
    public static void dmMediaType$set( MemorySegment seg, int x) {
        _devicemodeA.dmMediaType$VH.set(seg, x);
    }
    public static int dmMediaType$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmMediaType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmMediaType$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmMediaType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmDitherType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmDitherType"));
    public static VarHandle dmDitherType$VH() {
        return _devicemodeA.dmDitherType$VH;
    }
    public static int dmDitherType$get(MemorySegment seg) {
        return (int)_devicemodeA.dmDitherType$VH.get(seg);
    }
    public static void dmDitherType$set( MemorySegment seg, int x) {
        _devicemodeA.dmDitherType$VH.set(seg, x);
    }
    public static int dmDitherType$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmDitherType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmDitherType$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmDitherType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmReserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmReserved1"));
    public static VarHandle dmReserved1$VH() {
        return _devicemodeA.dmReserved1$VH;
    }
    public static int dmReserved1$get(MemorySegment seg) {
        return (int)_devicemodeA.dmReserved1$VH.get(seg);
    }
    public static void dmReserved1$set( MemorySegment seg, int x) {
        _devicemodeA.dmReserved1$VH.set(seg, x);
    }
    public static int dmReserved1$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmReserved1$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmReserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmReserved2"));
    public static VarHandle dmReserved2$VH() {
        return _devicemodeA.dmReserved2$VH;
    }
    public static int dmReserved2$get(MemorySegment seg) {
        return (int)_devicemodeA.dmReserved2$VH.get(seg);
    }
    public static void dmReserved2$set( MemorySegment seg, int x) {
        _devicemodeA.dmReserved2$VH.set(seg, x);
    }
    public static int dmReserved2$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmReserved2$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmReserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmPanningWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmPanningWidth"));
    public static VarHandle dmPanningWidth$VH() {
        return _devicemodeA.dmPanningWidth$VH;
    }
    public static int dmPanningWidth$get(MemorySegment seg) {
        return (int)_devicemodeA.dmPanningWidth$VH.get(seg);
    }
    public static void dmPanningWidth$set( MemorySegment seg, int x) {
        _devicemodeA.dmPanningWidth$VH.set(seg, x);
    }
    public static int dmPanningWidth$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmPanningWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmPanningWidth$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmPanningWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dmPanningHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dmPanningHeight"));
    public static VarHandle dmPanningHeight$VH() {
        return _devicemodeA.dmPanningHeight$VH;
    }
    public static int dmPanningHeight$get(MemorySegment seg) {
        return (int)_devicemodeA.dmPanningHeight$VH.get(seg);
    }
    public static void dmPanningHeight$set( MemorySegment seg, int x) {
        _devicemodeA.dmPanningHeight$VH.set(seg, x);
    }
    public static int dmPanningHeight$get(MemorySegment seg, long index) {
        return (int)_devicemodeA.dmPanningHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dmPanningHeight$set(MemorySegment seg, long index, int x) {
        _devicemodeA.dmPanningHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


