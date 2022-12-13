// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Launch attributes union; used as value field of ::cudaLaunchAttribute
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaLaunchAttributeValue extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaLaunchAttributeValue() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaLaunchAttributeValue(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaLaunchAttributeValue(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaLaunchAttributeValue position(long position) {
        return (cudaLaunchAttributeValue)super.position(position);
    }
    @Override public cudaLaunchAttributeValue getPointer(long i) {
        return new cudaLaunchAttributeValue((Pointer)this).offsetAddress(i);
    }

    public native @Cast("char") byte pad(int i); public native cudaLaunchAttributeValue pad(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer pad(); /* Pad to 64 bytes */
    public native @ByRef cudaAccessPolicyWindow accessPolicyWindow(); public native cudaLaunchAttributeValue accessPolicyWindow(cudaAccessPolicyWindow setter);
    public native int cooperative(); public native cudaLaunchAttributeValue cooperative(int setter);
    public native @Cast("cudaSynchronizationPolicy") int syncPolicy(); public native cudaLaunchAttributeValue syncPolicy(int setter);
        @Name("clusterDim.x") public native @Cast("unsigned int") int clusterDim_x(); public native cudaLaunchAttributeValue clusterDim_x(int setter);
        @Name("clusterDim.y") public native @Cast("unsigned int") int clusterDim_y(); public native cudaLaunchAttributeValue clusterDim_y(int setter);
        @Name("clusterDim.z") public native @Cast("unsigned int") int clusterDim_z(); public native cudaLaunchAttributeValue clusterDim_z(int setter);
    public native @Cast("cudaClusterSchedulingPolicy") int clusterSchedulingPolicyPreference(); public native cudaLaunchAttributeValue clusterSchedulingPolicyPreference(int setter);
    public native int programmaticStreamSerializationAllowed(); public native cudaLaunchAttributeValue programmaticStreamSerializationAllowed(int setter);
        @Name("programmaticEvent.event") public native CUevent_st programmaticEvent_event(); public native cudaLaunchAttributeValue programmaticEvent_event(CUevent_st setter);
        @Name("programmaticEvent.flags") public native int programmaticEvent_flags(); public native cudaLaunchAttributeValue programmaticEvent_flags(int setter);
        @Name("programmaticEvent.triggerAtBlockStart") public native int programmaticEvent_triggerAtBlockStart(); public native cudaLaunchAttributeValue programmaticEvent_triggerAtBlockStart(int setter);
    public native int priority(); public native cudaLaunchAttributeValue priority(int setter);
}