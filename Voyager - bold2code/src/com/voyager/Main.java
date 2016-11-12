package com.voyager;

import java.nio.charset.Charset;

public class Main {


    public static void main(String[] args) {

        //Use example source string for minimum compliance
        String sourceString = "The main cast of TV's Silicon Valley: Thomas Middleditch, T.J Miller, Josh Brener, Martin Starr, Kumail Nanjiani, Zach Woods";

        //TODO: Replace DummyAlgorithm with your own implementation
        Compression<String> stringCompression  = new DummyAlgorithm();

        //Assume UTF-8 character set
        System.out.println("Original size in bytes: " + sourceString.getBytes(Charset.forName("utf-8")).length);
        byte[] compressed = stringCompression.compress(sourceString);

        System.out.println("Compressed size in bytes: " + compressed.length);
        String decodedString = stringCompression.decompress(compressed);


        if(sourceString.equals(decodedString)){
            System.out.println("Success");
        }else{
            System.out.println("Fail");
        }

    }
}
