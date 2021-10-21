// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("c10::ArrayRef<int64_t>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LongArrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LongArrayRef(Pointer p) { super(p); }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty ArrayRef. */
  /* implicit */ public LongArrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /** Construct an ArrayRef from a single element. */
  // TODO Make this explicit
  public LongArrayRef(@Cast("const int64_t") long OneElt) { super((Pointer)null); allocate(OneElt); }
  private native void allocate(@Cast("const int64_t") long OneElt);

  /** Construct an ArrayRef from a pointer and length. */
  public LongArrayRef(@Cast("const int64_t*") LongPointer data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Cast("const int64_t*") LongPointer data, @Cast("size_t") long length);
  public LongArrayRef(@Cast("const int64_t*") LongBuffer data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Cast("const int64_t*") LongBuffer data, @Cast("size_t") long length);
  public LongArrayRef(@Cast("const int64_t*") long[] data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Cast("const int64_t*") long[] data, @Cast("size_t") long length);

  /** Construct an ArrayRef from a range. */
  public LongArrayRef(@Cast("const int64_t*") LongPointer begin, @Cast("const int64_t*") LongPointer end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Cast("const int64_t*") LongPointer begin, @Cast("const int64_t*") LongPointer end);
  public LongArrayRef(@Cast("const int64_t*") LongBuffer begin, @Cast("const int64_t*") LongBuffer end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Cast("const int64_t*") LongBuffer begin, @Cast("const int64_t*") LongBuffer end);
  public LongArrayRef(@Cast("const int64_t*") long[] begin, @Cast("const int64_t*") long[] end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Cast("const int64_t*") long[] begin, @Cast("const int64_t*") long[] end);

  /** Construct an ArrayRef from a SmallVector. This is templated in order to
   *  avoid instantiating SmallVectorTemplateCommon<T> whenever we
   *  copy-construct an ArrayRef. */

  /** Construct an ArrayRef from a std::vector. */
  // The enable_if stuff here makes sure that this isn't used for
  // std::vector<bool>, because ArrayRef can't work on a std::vector<bool>
  // bitfield.

  /** Construct an ArrayRef from a std::array */

  /** Construct an ArrayRef from a C array. */

  /** Construct an ArrayRef from a std::initializer_list. */
  /* implicit */

  /** \}
   *  \name Simple Operations
   *  \{ */

  public native @Cast("const c10::ArrayRef<int64_t>::iterator") long begin();
  public native @Cast("const c10::ArrayRef<int64_t>::iterator") long end();

  // These are actually the same as iterator, since ArrayRef only
  // gives you const iterators.
  public native @Cast("const c10::ArrayRef<int64_t>::const_iterator") long cbegin();
  public native @Cast("const c10::ArrayRef<int64_t>::const_iterator") long cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  public native @Cast("const int64_t*") LongPointer data();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */
  public native @Cast("const int64_t") long front();

  /** back - Get the last element. */
  public native @Cast("const int64_t") long back();

  /** equals - Check for element-wise equality. */
  public native @Cast("const bool") boolean equals(@ByVal @Cast("c10::ArrayRef<int64_t>*") LongArrayRef RHS);
  public native @Cast("const bool") boolean equals(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long... RHS);

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @ByVal @Cast("c10::ArrayRef<int64_t>*") LongArrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @ByVal @Cast("c10::ArrayRef<int64_t>*") LongArrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */
  public native @Cast("const int64_t") @Name("operator []") long get(@Cast("size_t") long Index);

  /** Vector compatibility */
  
  ///
  public native @Cast("const int64_t") long at(@Cast("size_t") long Index);

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** \}
   *  \name Expensive Operations
   *  \{ */
  public native @ByVal @Cast("std::vector<int64_t>*") LongVector vec();

  /** \} */
}