/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * Encodes MediaAudio, MediaPicture or MediaSubtitle objects into MediaPacket objects.
 */
public class Encoder extends Coder {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    Buffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected Encoder(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.Encoder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected Encoder(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.Encoder_SWIGUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(Encoder obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new Encoder object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public Encoder copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new Encoder(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Encoder)
      equal = (((Encoder)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

/**
 * Create a Encoder that will use the given Codec.<br>
 * <br>
 * @return a Encoder<br>
 * @throws InvalidArgument if codec is null or codec cannot decode.
 */
  public static Encoder make(Codec codec) {
    long cPtr = VideoJNI.Encoder_make__SWIG_0(Codec.getCPtr(codec), codec);
    return (cPtr == 0) ? null : new Encoder(cPtr, false);
  }

/**
 * Creates a Encoder from a given Encoder<br>
 * @return a Encoder<br>
 * @throws InvalidArgument if src is null
 */
  public static Encoder make(Coder src) {
    long cPtr = VideoJNI.Encoder_make__SWIG_1(Coder.getCPtr(src), src);
    return (cPtr == 0) ? null : new Encoder(cPtr, false);
  }

/**
 * Open this Coder, using the given bag of Codec-specific options.<br>
 * <br>
 * @param inputOptions If non-null, a bag of codec-specific options.<br>
 * @param unsetOptions If non-null, the bag will be emptied and then filled with<br>
 *                     the options in <code>inputOptions</code> that were not set.
 */
  public void open(KeyValueBag inputOptions, KeyValueBag unsetOptions) {
    VideoJNI.Encoder_open(swigCPtr, this, KeyValueBag.getCPtr(inputOptions), inputOptions, KeyValueBag.getCPtr(unsetOptions), unsetOptions);
  }

/**
 * Encode the given MediaPicture using this encoder.<br>
 * <br>
 * The MediaPicture will allocate a buffer to use internally for this, and<br>
 * will free it when the frame destroys itself.<br>
 * <br>
 * Also, when done in order to flush the encoder, caller should call<br>
 * this method passing in 0 (null) for frame to tell the encoder<br>
 * to flush any data it was keeping a hold of.<br>
 * <br>
 * @param output [out] The packet to encode into.  It will point<br>
 *     to a buffer allocated in the frame.  Caller should check MediaPacket.isComplete()<br>
 *     after call to find out if we had enough information to encode a full packet.<br>
 * @param frame [in/out] The frame to encode
 */
  public void encodeVideo(MediaPacket output, MediaPicture frame) {
    VideoJNI.Encoder_encodeVideo(swigCPtr, this, MediaPacket.getCPtr(output), output, MediaPicture.getCPtr(frame), frame);
  }

/**
 * Encode the given MediaAudio using this encoder.<br>
 * <br>
 * Callers should call this repeatedly on a set of samples until<br>
 * we consume all the samples.<br>
 * <br>
 * Also, when done in order to flush the encoder, caller should call<br>
 * this method passing in 0 (null) for samples to tell the encoder<br>
 * to flush any data it was keeping a hold of.<br>
 * <br>
 * @param output [out] The packet to encode into.  It will point<br>
 *          to a buffer allocated in the frame.  Caller should check MediaPacket.isComplete()<br>
 *     after call to find out if we had enough information to encode a full packet.<br>
 * @param samples [in] The samples to consume
 */
  public void encodeAudio(MediaPacket output, MediaAudio samples) {
    VideoJNI.Encoder_encodeAudio(swigCPtr, this, MediaPacket.getCPtr(output), output, MediaAudio.getCPtr(samples), samples);
  }

}
