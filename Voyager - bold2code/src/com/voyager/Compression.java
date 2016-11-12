package com.voyager;

/**
 * A compression / decompression routine
 */
public interface Compression<T> {


    byte[] compress(T source);
    T decompress(byte[] compressed);

}
