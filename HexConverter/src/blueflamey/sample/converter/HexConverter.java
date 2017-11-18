package blueflamey.sample.converter;

import org.h2.util.StringUtils;
//import javax.xml.bind.DatatypeConverter;

public class HexConverter {
	
	public static String convertBytesToHex(final String text) {
		String[] bytesText = text.trim().split(", ");
		int bytesTextLength = bytesText.length;
		
		final byte[] bytes = new byte[bytesTextLength];
		for (int i=0; i < bytesTextLength; i++) {
			bytes[i] = Byte.parseByte(bytesText[i]);
		}		
		
//		return DatatypeConverter.printHexBinary(bytes);
		return StringUtils.convertBytesToHex(bytes);
	}
	
	public static byte[] convertHexToBytes(final String hex) {
//		return DatatypeConverter.parseHexBinary(hex);
		return StringUtils.convertHexToBytes(hex);
	}
	
	public static String convertHexToBytesString(final String hex) {
		byte[] bytes = convertHexToBytes(hex);
		
		StringBuffer buffer = new StringBuffer();
		for (byte varByte : bytes) {
			buffer.append(varByte);
			buffer.append(", ");
		}
		
		return buffer.toString().trim();
	}
	
	public static void main(String[] args) {
//		String text = "6b2d5511acc2f7d3bc392226abaa566f3132a35abe45604b34488ff647a17a8aeed65100032f204e35237622b9e34243972474d24f58b95a22e6906628b14d2d";
//		System.out.println(convertHexToBytesString(text));
		
		String bytesText = "48, -127, -109, 2, 1, 0, 48, 19, 6, 7, 42, -122, 72, -50, 61, 2, 1, 6, 8, 42, -122, 72, -50, 61, 3, 1, 7, 4, 121, 48, 119, 2, 1, 1, 4, 32, -52, -7, 118, 8, -91, 8, 27, -113, 71, -113, -70, -80, 12, -2, 111, 90, 80, -79, -62, 60, 75, 66, -23, 94, -1, -35, -5, 45, -47, -83, 102, 118, -96, 10, 6, 8, 42, -122, 72, -50, 61, 3, 1, 7, -95, 68, 3, 66, 0, 4, -11, -46, -1, -75, 41, 62, -39, 83, 5, 61, -81, 8, 101, -9, -4, -82, -23, 121, 2, 22, -83, -122, 18, 70, 119, 123, 60, -53, -28, 7, 123, -94, 97, -69, -118, -103, -99, -39, -43, 111, -104, 126, 90, -56, 84, -118, -5, -91, -79, 26, -111, -89, -122, -84, -4, -92, -104, 43, 24, -59, 25, 45, 21, -54";
		System.out.println(convertBytesToHex(bytesText));
		
		
	}
	
}
