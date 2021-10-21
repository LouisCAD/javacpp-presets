// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class TransformFinish extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TransformFinish() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TransformFinish(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformFinish(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TransformFinish position(long position) {
        return (TransformFinish)super.position(position);
    }
    @Override public TransformFinish getPointer(long i) {
        return new TransformFinish((Pointer)this).offsetAddress(i);
    }

  
}