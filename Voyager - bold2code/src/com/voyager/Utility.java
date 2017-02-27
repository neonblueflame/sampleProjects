package com.voyager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility methods used by various classes
 * 
 */
public class Utility {

	/**
	 * Match text to regex and return the matcher object
	 * 
	 * @param text
	 *            String to compare
	 * @param text
	 *            String to compare
	 * @return matcher object that resulted from comparing
	 */
	public static Matcher matchString(String regex, String text) {
		return Pattern.compile(regex).matcher(text);
	}

	public static int countOccurence(String key, String text) {
		int occurence = 0;

		Matcher matcher = matchString(key, text);
		while (matcher.find()) {
			occurence++;
		}

		return occurence;
	}
}
