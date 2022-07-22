// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NCRYPT_EXPORTED_ISOLATED_KEY_ENVELOPE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Version"),
            Constants$root.C_LONG$LAYOUT.withName("KeyUsage"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(1).withName("PerBootKey"),
                MemoryLayout.paddingLayout(31).withName("Reserved")
            ),
            Constants$root.C_LONG$LAYOUT.withName("cbAlgName"),
            Constants$root.C_LONG$LAYOUT.withName("cbNonce"),
            Constants$root.C_LONG$LAYOUT.withName("cbAuthTag"),
            Constants$root.C_LONG$LAYOUT.withName("cbWrappingKey"),
            Constants$root.C_LONG$LAYOUT.withName("cbIsolatedKey")
        ).withName("Header")
    ).withName("_NCRYPT_EXPORTED_ISOLATED_KEY_ENVELOPE");
    public static MemoryLayout $LAYOUT() {
        return _NCRYPT_EXPORTED_ISOLATED_KEY_ENVELOPE.$struct$LAYOUT;
    }
    public static MemorySegment Header$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


