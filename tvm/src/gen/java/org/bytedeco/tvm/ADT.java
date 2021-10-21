// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief reference to algebraic data type objects. */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class ADT extends ObjectRef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ADT(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ADT(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ADT position(long position) {
        return (ADT)super.position(position);
    }
    @Override public ADT getPointer(long i) {
        return new ADT((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief construct an ADT object reference.
   * @param tag The tag of the ADT object.
   * @param fields The fields of the ADT object.
   * @return The constructed ADT object reference.
   */
  public ADT(int tag, @StdVector ObjectRef fields) { super((Pointer)null); allocate(tag, fields); }
  private native void allocate(int tag, @StdVector ObjectRef fields);

  /**
   * \brief construct an ADT object reference.
   * @param tag The tag of the ADT object.
   * @param begin The begin iterator to the start of the fields array.
   * @param end The end iterator to the end of the fields array.
   * @return The constructed ADT object reference.
   */

  /**
   * \brief construct an ADT object reference.
   * @param tag The tag of the ADT object.
   * @param init The initializer list of fields.
   * @return The constructed ADT object reference.
   */

  /**
   * \brief Access element at index.
   *
   * @param idx The array index
   * @return const ObjectRef
   */
  public native @Const @ByRef @Name("operator []") ObjectRef get(@Cast("size_t") long idx);

  /**
   * \brief Return the ADT tag.
   */
  public native int tag();

  /**
   * \brief Return the number of fields.
   */
  public native @Cast("size_t") long size();

  /**
   * \brief Construct a tuple object.
   *
   * \tparam Args Type params of tuple feilds.
   * @param args Tuple fields.
   * @return ADT The tuple object reference.
   */

  public ADT() { super((Pointer)null); allocate(); }
  private native void allocate();
  public ADT(@ByVal ObjectPtr n) { super((Pointer)null); allocate(n); }
  private native void allocate(@ByVal ObjectPtr n);
  public ADT(@Const @ByRef ADT other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef ADT other);
  public native @ByRef @Name("operator =") ADT put(@Const @ByRef ADT other);
  public native @Const @Name("operator ->") ADTObj access();
  public native @Const ADTObj get();
}