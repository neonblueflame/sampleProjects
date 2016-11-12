package com.voyager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CompressionImpl<T> implements Compression<T> {
	
	private String mapFileName;
	
	@Override
	public byte[] compress(T source) {
		String sourceString = source.toString();
		char[] sourceCharArray = sourceString.toCharArray();
		Properties charMap = new Properties();

		int replacement = 1;
		for (char c : sourceCharArray) {
			String charString = Character.toString(c);
			
			// Checks if adding the character as key is successful
			if (null == charMap.putIfAbsent(charString, Integer.toString(replacement))) {
				String regex = charString;

				// Check for '.' character which may mean any character match in regex
				if (c == '.')
					regex = "\\" + c;

				sourceString = sourceString.replaceAll(regex, replacement + "+");
				replacement++;
			}
		}
		
		// Remove last "+" as it doesn't separate any number
		sourceString = sourceString.substring(sourceString.length() - 2, sourceString.length() - 1);

		try {
			FileWriter writer = new FileWriter(new File(mapFileName));
			charMap.store(writer, null);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sourceString.getBytes();
	}

	@Override
	public T decompress(byte[] compressed) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setMapFileName(String text) {
		mapFileName = text;
	}
}
