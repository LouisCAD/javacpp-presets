// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


/** <summary>
 *  Options for the CUDA provider that are passed to SessionOptionsAppendExecutionProvider_CUDA
 *  </summary> */
@NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtCUDAProviderOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtCUDAProviderOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OrtCUDAProviderOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OrtCUDAProviderOptions position(long position) {
        return (OrtCUDAProviderOptions)super.position(position);
    }
    @Override public OrtCUDAProviderOptions getPointer(long i) {
        return new OrtCUDAProviderOptions((Pointer)this).offsetAddress(i);
    }

// #ifdef __cplusplus
  public OrtCUDAProviderOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
// #endif

  /** \brief CUDA device Id
  *   Defaults to 0.
  */
  public native int device_id(); public native OrtCUDAProviderOptions device_id(int setter);

  /** \brief CUDA Convolution algorithm search configuration.
  *   See enum OrtCudnnConvAlgoSearch for more details.
  *   Defaults to OrtCudnnConvAlgoSearchExhaustive.
  */
  public native @Cast("OrtCudnnConvAlgoSearch") int cudnn_conv_algo_search(); public native OrtCUDAProviderOptions cudnn_conv_algo_search(int setter);

  /** \brief CUDA memory limit (To use all possible memory pass in maximum size_t)
  *   Defaults to SIZE_MAX.
  *   \note If a ::OrtArenaCfg has been applied, it will override this field
  */
  public native @Cast("size_t") long gpu_mem_limit(); public native OrtCUDAProviderOptions gpu_mem_limit(long setter);

  /** \brief Strategy used to grow the memory arena
  *   0 = kNextPowerOfTwo<br>
  *   1 = kSameAsRequested<br>
  *   Defaults to 0.
  *   \note If a ::OrtArenaCfg has been applied, it will override this field
  */
  public native int arena_extend_strategy(); public native OrtCUDAProviderOptions arena_extend_strategy(int setter);

  /** \brief Flag indicating if copying needs to take place on the same stream as the compute stream in the CUDA EP   
  *   0 = Use separate streams for copying and compute.
  *   1 = Use the same stream for copying and compute.
  *   Defaults to 1.
  *   WARNING: Setting this to 0 may result in data races for some models.
  *   Please see issue #4829 for more details.
  */
  public native int do_copy_in_default_stream(); public native OrtCUDAProviderOptions do_copy_in_default_stream(int setter);

  /** \brief Flag indicating if there is a user provided compute stream
  *   Defaults to 0.
  */
  public native int has_user_compute_stream(); public native OrtCUDAProviderOptions has_user_compute_stream(int setter);

  /** \brief User provided compute stream. 
  *   If provided, please set {@code has_user_compute_stream} to 1.
  */
  public native Pointer user_compute_stream(); public native OrtCUDAProviderOptions user_compute_stream(Pointer setter);

  /** \brief CUDA memory arena configuration parameters
  */
  public native OrtArenaCfg default_memory_arena_cfg(); public native OrtCUDAProviderOptions default_memory_arena_cfg(OrtArenaCfg setter);

}