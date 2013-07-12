/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * A packet of data that was read from a {@link Source} or  
 * will be written to a {@link Sink}.  
 */
public class Packet extends MediaEncoded {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected Packet(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGPacketUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected Packet(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGPacketUpcast(cPtr),
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
  protected static long getCPtr(Packet obj) {
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
   * Create a new Packet object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public Packet copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new Packet(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof Packet)
      equal = (((Packet)obj).swigCPtr == this.swigCPtr);
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
 * Create a new {@link Packet}  
 */
  public static Packet make() {
    long cPtr = VideoJNI.Packet_make__SWIG_0();
    return (cPtr == 0) ? null : new Packet(cPtr, false);
  }

/**
 * Get any underlying raw data available for this packet.  
 * @return	The raw data, or null if not accessible.  
 */
  public IBuffer getData() {
    long cPtr = VideoJNI.Packet_getData(swigCPtr, this);
    return (cPtr == 0) ? null : new IBuffer(cPtr, false);
  }

/**
 * Allocate a new packet that wraps an existing IBuffer.  
 * NOTE: At least 16 bytes of the passed in buffer will be used  
 * for header information, so the resulting {@link Packet.getSize() 
 * }  
 * will be smaller than {@link IBuffer.getBufferSize() }.  
 * @param	buffer The IBuffer to wrap.  
 * @return	a new packet or null on error.  
 */
  public static Packet make(IBuffer buffer) {
    long cPtr = VideoJNI.Packet_make__SWIG_1(IBuffer.getCPtr(buffer), buffer);
    return (cPtr == 0) ? null : new Packet(cPtr, false);
  }

/**
 * Allocate a new packet wrapping the existing contents of  
 * a passed in packet. Callers can then modify  
 * {@link #getPts()},  
 * {@link #getDts()} and other get/set methods without  
 * modifying the original packet.  
 * @param	packet Packet to reuse buffer from and to  
 * copy settings from.  
 * @param	copyData if true copy data from packet  
 * into our own buffer. If false, share the same  
 * data buffer that packet uses  
 * @return	a new packet or null on error.  
 */
  public static Packet make(Packet packet, boolean copyData) {
    long cPtr = VideoJNI.Packet_make__SWIG_2(Packet.getCPtr(packet), packet, copyData);
    return (cPtr == 0) ? null : new Packet(cPtr, false);
  }

/**
 * Allocate a new packet.  
 * <p>  
 * Note that any buffers this packet needs will be  
 * lazily allocated (i.e. we won't actually grab all  
 * the memory until we need it).  
 * </p>  
 * @param	size The maximum size, in bytes, of data you  
 * want to put in this packet.  
 * @return	a new packet, or null on error.  
 */
  public static Packet make(int size) {
    long cPtr = VideoJNI.Packet_make__SWIG_3(size);
    return (cPtr == 0) ? null : new Packet(cPtr, false);
  }

/**
 * Get the Presentation Time Stamp (PTS) for this packet.  
 * This is the time at which the payload for this packet should  
 * be <strong>presented</strong> to the user, in units of  
 * {@link #getTimeBase()}, relative to the start of stream.  
 * @return	Get the Presentation Timestamp for this packet.  
 */
  public long getPts() {
    return VideoJNI.Packet_getPts(swigCPtr, this);
  }

/**
 * Set a new Presentation Time Stamp (PTS) for this packet.  
 * @param	aPts a new PTS for this packet.  
 * @see		#getPts()  
 */
  public void setPts(long aPts) {
    VideoJNI.Packet_setPts(swigCPtr, this, aPts);
  }

/**
 * Get the Decompression Time Stamp (DTS) for this packet.  
 * <p>  
 * This is the time at which the payload for this packet should  
 * be <strong>decompressed</strong>, in units of  
 * {@link #getTimeBase()}, relative to the start of stream.  
 * </p>  
 * <p>  
 * Some media codecs can require packets from the &quot;future&quot; 
 * to  
 * be decompressed before earliest packets as an additional way to compress 
 *  
 * data. In general you don't need to worry about this, but if you're 
 *  
 * curious start reading about the difference between I-Frames, P-Frames 
 *  
 * and B-Frames (or Bi-Directional Frames). B-Frames can use information 
 *  
 * from future frames when compressed.  
 * </p>  
 * @return	Get the Decompression Timestamp (i.e. when this was read 
 *		 relative  
 * to the start of reading packets).  
 */
  public long getDts() {
    return VideoJNI.Packet_getDts(swigCPtr, this);
  }

/**
 * Set a new Decompression Time Stamp (DTS) for this packet.  
 * @param	aDts a new DTS for this packet.  
 * @see		#getDts()  
 */
  public void setDts(long aDts) {
    VideoJNI.Packet_setDts(swigCPtr, this, aDts);
  }

/**
 * Get the size in bytes of the payload currently in this packet.  
 * @return	Size (in bytes) of payload currently in packet.  
 */
  public int getSize() {
    return VideoJNI.Packet_getSize(swigCPtr, this);
  }

/**
 * Get the maximum size (in bytes) of payload this packet can hold. 
 *  
 * @return	Get maximum size (in bytes) of payload this packet can hold. 
 *		  
 */
  public int getMaxSize() {
    return VideoJNI.Packet_getMaxSize(swigCPtr, this);
  }

/**
 * Get the container-specific index for the stream this packet is  
 * part of.  
 * @return	Stream in container that this packet has data for.  
 */
  public int getStreamIndex() {
    return VideoJNI.Packet_getStreamIndex(swigCPtr, this);
  }

/**
 * Get any flags set on this packet, as a 4-byte binary-ORed bit-mask. 
 *  
 * This is access to raw FFMPEG  
 * flags, but it is easier to use the is* methods below.  
 * @return	Any flags on the packet.  
 */
  public int getFlags() {
    return VideoJNI.Packet_getFlags(swigCPtr, this);
  }

/**
 * Does this packet contain Key data? i.e. data that needs no other 
 *  
 * frames or samples to decode.  
 * @return	true if key; false otherwise.  
 */
  public boolean isKeyPacket() {
    return VideoJNI.Packet_isKeyPacket(swigCPtr, this);
  }

/**
 * Return the duration of this packet, in units of {@link #getTimeBase()} 
 *  
 * @return	Duration of this packet, in same time-base as the PTS.  
 */
  public long getDuration() {
    return VideoJNI.Packet_getDuration(swigCPtr, this);
  }

/**
 * Return the position (in bytes) of this packet in the stream.  
 * @return	The position of this packet in the stream, or -1 if  
 * unknown.  
 */
  public long getPosition() {
    return VideoJNI.Packet_getPosition(swigCPtr, this);
  }

/**
 * Set if this is a key packet.  
 * @param	keyPacket true for yes, false for no.  
 */
  public void setKeyPacket(boolean keyPacket) {
    VideoJNI.Packet_setKeyPacket(swigCPtr, this, keyPacket);
  }

/**
 * Set any internal flags.  
 * @param	flags Flags to set  
 */
  public void setFlags(int flags) {
    VideoJNI.Packet_setFlags(swigCPtr, this, flags);
  }

/**
 * Set the stream index for this packet.  
 * @param	streamIndex The stream index, as determined from the {@link 
 *		 IContainer} this packet will be written to.  
 */
  public void setStreamIndex(int streamIndex) {
    VideoJNI.Packet_setStreamIndex(swigCPtr, this, streamIndex);
  }

/**
 * Set the duration.  
 * @param	duration new duration  
 * @see		#getDuration()  
 */
  public void setDuration(long duration) {
    VideoJNI.Packet_setDuration(swigCPtr, this, duration);
  }

/**
 * Set the position.  
 * @param	position new position  
 * @see		#getPosition()  
 */
  public void setPosition(long position) {
    VideoJNI.Packet_setPosition(swigCPtr, this, position);
  }

/**
 * Time difference in {@link IStream#getTimeBase()} units  
 * from the presentation time stamp of this  
 * packet to the point at which the output from the decoder has converged 
 *  
 * independent from the availability of previous frames. That is, the 
 *  
 * frames are virtually identical no matter if decoding started from 
 *  
 * the very first frame or from this keyframe.  
 * Is {@link Global#NO_PTS} if unknown.  
 * This field is not the display duration of the current packet.  
 * <p>  
 * The purpose of this field is to allow seeking in streams that have 
 * no  
 * keyframes in the conventional sense. It corresponds to the  
 * recovery point SEI in H.264 and match_time_delta in NUT. It is also 
 *  
 *  
 * subtitles are correctly displayed after seeking.  
 * </p>  
 * <p>  
 * If you didn't follow that, try drinking one to two glasses  
 * of Absinthe. It won't help, but it'll be more fun.  
 * </p>  
 * @return	the convergence duration  
 */
  public long getConvergenceDuration() {
    return VideoJNI.Packet_getConvergenceDuration(swigCPtr, this);
  }

/**
 * Set the convergence duration.  
 * @param	duration the new duration  
 */
  public void setConvergenceDuration(long duration) {
    VideoJNI.Packet_setConvergenceDuration(swigCPtr, this, duration);
  }

/**
 * Discard the current payload and allocate a new payload.  
 * <p>  
 * Note that if any people have access to the old payload using  
 * getData(), the memory will continue to be available to them  
 * until they release their hold of the IBuffer.  
 * </p>  
 * <p>  
 * When requesting a packet size, the system  
 * may allocate a larger payloadSize.  
 * </p>  
 * @param	payloadSize The (minimum) payloadSize of this packet in bytes. 
 *		 It is ok to  
 * pass in 0 here, in which case the packet will later allocate memory 
 * if needed.  
 * @return	>= 0 if successful. < 0 if error.  
 */
  public int reset(int payloadSize) {
    return VideoJNI.Packet_reset(swigCPtr, this, payloadSize);
  }

}
