// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_OID_FUNC_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszOID"),
        Constants$root.C_POINTER$LAYOUT.withName("pvFuncAddr")
    ).withName("_CRYPT_OID_FUNC_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_OID_FUNC_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle pszOID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszOID"));
    public static VarHandle pszOID$VH() {
        return _CRYPT_OID_FUNC_ENTRY.pszOID$VH;
    }
    public static MemoryAddress pszOID$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_OID_FUNC_ENTRY.pszOID$VH.get(seg);
    }
    public static void pszOID$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_OID_FUNC_ENTRY.pszOID$VH.set(seg, x);
    }
    public static MemoryAddress pszOID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_OID_FUNC_ENTRY.pszOID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszOID$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_OID_FUNC_ENTRY.pszOID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvFuncAddr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvFuncAddr"));
    public static VarHandle pvFuncAddr$VH() {
        return _CRYPT_OID_FUNC_ENTRY.pvFuncAddr$VH;
    }
    public static MemoryAddress pvFuncAddr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_OID_FUNC_ENTRY.pvFuncAddr$VH.get(seg);
    }
    public static void pvFuncAddr$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_OID_FUNC_ENTRY.pvFuncAddr$VH.set(seg, x);
    }
    public static MemoryAddress pvFuncAddr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_OID_FUNC_ENTRY.pvFuncAddr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvFuncAddr$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_OID_FUNC_ENTRY.pvFuncAddr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


