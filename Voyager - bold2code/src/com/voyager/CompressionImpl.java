package com.voyager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

/**
 * http://javarevisited.blogspot.com/2011/09/generics-java-example-tutorial.html
 * https://docs.oracle.com/javase/tutorial/java/generics/types.html
 * http://stackoverflow.com/questions/3649485/how-to-compress-a-string-in-java
 * http://algs4.cs.princeton.edu/55compression/Huffman.java.html
 */
public class CompressionImpl<T> implements Compression<T> {
	
	private String mapFileName;
	private Properties dictionary;
	
	//* turn to lower binary...
	@Override
	public byte[] compress(T source) {
		String sourceString = source.toString();
		char[] sourceCharArray = sourceString.toCharArray();
		byte[] convertedArray = new byte[sourceCharArray.length];
		dictionary = new Properties();

		int replacement = 1;
		for (char c : sourceCharArray) {
			if (null == dictionary.putIfAbsent(c, Integer.toString(replacement)))
				replacement++;
		}
		// Problem in converting into byte 
		for (int i=0; i < sourceCharArray.length; i++) {
			convertedArray[i] = Byte.parseByte(dictionary.getProperty(Character.toString(sourceCharArray[i])));
		}
		
		try {
			FileWriter writer = new FileWriter(new File(mapFileName));
			dictionary.store(writer, null);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return convertedArray;
	}
	//*/

	@Override
	public T decompress(byte[] compressed) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setMapFileName(String text) {
		mapFileName = text;
	}
	
	/*
	@Override
	public byte[] compress(T source) {
		Map<Integer, Character> charTally = new TreeMap<Integer, Character>(new Comparator<Integer>() {

			// Reverse result for -1 and 1 so that sorting will be descending
			// instead
			@Override
			public int compare(Integer tally1, Integer tally2) {
				if (tally1 > tally2)
					return -1;

				else if (tally1 < tally2)
					return 1;

				else
					return 0;
			}
		});
		
		String sourceString = source.toString();
		char[] sourceCharArray = sourceString.toCharArray();
		
		for (char c : sourceCharArray) {
			String regex = Character.toString(c);

			// Check for '.' character which may mean any character match in regex
			if (c == '.')
				regex = "\\" + c;
			
			charTally.putIfAbsent(Utility.countOccurence(regex, sourceString), c);
		}
		
		Properties dictionary = new Properties();
		
		return null;
	}
	//*/
}
