// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class xid_newobjectfunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    xid_newobjectfunc(Pointer p) { super(p); }
    protected xid_newobjectfunc() { allocate(); }
    private native void allocate();
    public native PyObject call(_PyCrossInterpreterData arg0);
}
