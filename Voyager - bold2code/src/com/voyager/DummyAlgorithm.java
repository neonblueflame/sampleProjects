package com.voyager;

/**
 * This is a sample implementation, do not use
 */
public class DummyAlgorithm implements Compression<String> {

    @Override
    public byte[] compress(String source) {
        return source.getBytes();
    }

    @Override
    public String decompress(byte[] compressed) {
        return new String(compressed);
    }
}
