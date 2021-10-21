// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.openpose;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import org.bytedeco.caffe.*;
import static org.bytedeco.caffe.global.caffe.*;

import static org.bytedeco.openpose.global.openpose.*;

    @Name("op::Point<int>") @NoOffset @Properties(inherit = org.bytedeco.openpose.presets.openpose.class)
public class IntPoint extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IntPoint(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public IntPoint(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public IntPoint position(long position) {
            return (IntPoint)super.position(position);
        }
        @Override public IntPoint getPointer(long i) {
            return new IntPoint((Pointer)this).offsetAddress(i);
        }
    
        public native int x(); public native IntPoint x(int setter);
        public native int y(); public native IntPoint y(int setter);

        public IntPoint(int x/*=0*/, int y/*=0*/) { super((Pointer)null); allocate(x, y); }
        private native void allocate(int x/*=0*/, int y/*=0*/);
        public IntPoint() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
         * Copy constructor.
         * It performs {@code fast copy}: For performance purpose, copying a Point<T> or Point<T> or cv::Mat just copies the
         * reference, it still shares the same internal data.
         * Modifying the copied element will modify the original one.
         * Use clone() for a slower but real copy, similarly to cv::Mat and Point<T>.
         * @param point Point to be copied.
         */
        public IntPoint(@Const @ByRef IntPoint point) { super((Pointer)null); allocate(point); }
        private native void allocate(@Const @ByRef IntPoint point);

        /**
         * Copy assignment.
         * Similar to Point<T>(const Point<T>& point).
         * @param point Point to be copied.
         * @return The resulting Point.
         */
        public native @ByRef @Name("operator =") IntPoint put(@Const @ByRef IntPoint point);

        /**
         * Move constructor.
         * It destroys the original Point to be moved.
         * @param point Point to be moved.
         */

        /**
         * Move assignment.
         * Similar to Point<T>(Point<T>&& point).
         * @param point Point to be moved.
         * @return The resulting Point.
         */

        public native int area();

        /**
         * It returns a string with the whole Point<T> data. Useful for debugging.
         * The format is: {@code [x, y]}
         * @return A string with the Point<T> values in the above format.
         */
        





        // ------------------------------ Comparison operators ------------------------------ //
        /**
         * Less comparison operator.
         * @param point Point<T> to be compared.
         * @return Whether the instance satisfies the condition with respect to point.
         */
        public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef IntPoint point);

        /**
         * Greater comparison operator.
         * @param point Point<T> to be compared.
         * @return Whether the instance satisfies the condition with respect to point.
         */
        public native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef IntPoint point);

        /**
         * Less or equal comparison operator.
         * @param point Point<T> to be compared.
         * @return Whether the instance satisfies the condition with respect to point.
         */
        public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef IntPoint point);

        /**
         * Greater or equal comparison operator.
         * @param point Point<T> to be compared.
         * @return Whether the instance satisfies the condition with respect to point.
         */
        public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef IntPoint point);

        /**
         * Equal comparison operator.
         * @param point Point<T> to be compared.
         * @return Whether the instance satisfies the condition with respect to point.
         */
        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef IntPoint point);

        /**
         * Not equal comparison operator.
         * @param point Point<T> to be compared.
         * @return Whether the instance satisfies the condition with respect to point.
         */
        public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef IntPoint point);





        // ------------------------------ Basic Operators ------------------------------ //
        public native @ByRef @Name("operator +=") IntPoint addPut(@Const @ByRef IntPoint point);

        public native @ByVal @Name("operator +") IntPoint add(@Const @ByRef IntPoint point);

        public native @ByRef @Name("operator +=") IntPoint addPut(int value);

        public native @ByVal @Name("operator +") IntPoint add(int value);

        public native @ByRef @Name("operator -=") IntPoint subtractPut(@Const @ByRef IntPoint point);

        public native @ByVal @Name("operator -") IntPoint subtract(@Const @ByRef IntPoint point);

        public native @ByRef @Name("operator -=") IntPoint subtractPut(int value);

        public native @ByVal @Name("operator -") IntPoint subtract(int value);

        public native @ByRef @Name("operator *=") IntPoint multiplyPut(int value);

        public native @ByVal @Name("operator *") IntPoint multiply(int value);

        public native @ByRef @Name("operator /=") IntPoint dividePut(int value);

        public native @ByVal @Name("operator /") IntPoint divide(int value);
    }