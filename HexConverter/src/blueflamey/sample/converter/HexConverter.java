package blueflamey.sample.converter;

import org.h2.util.StringUtils;

public class HexConverter {
	
	public static String convertBytesToHex(final String text) {
		String[] bytesText = text.trim().split(" ");
		int bytesTextLength = bytesText.length;
		
		final byte[] bytes = new byte[bytesTextLength];
		for (int i=0; i < bytesTextLength; i++) {
			bytes[i] = Byte.parseByte(bytesText[i]);
		}		
		
		return StringUtils.convertBytesToHex(bytes);
	}
	
	public static String convertHexToBytes(final String hex) {
		byte[] bytes = StringUtils.convertHexToBytes(hex);
		
		StringBuffer buffer = new StringBuffer();
		for (byte varByte : bytes) {
			buffer.append(varByte);
			buffer.append(" ");
		}
		
		return buffer.toString().trim();
	}
	
	public static void main(String[] args) {
//		String text = "6b2d5511acc2f7d3bc392226abaa566f3132a35abe45604b34488ff647a17a8aeed65100032f204e35237622b9e34243972474d24f58b95a22e6906628b14d2d";
//		System.out.println(convertHexToBytes(text));
		
		String bytesText = "107 45 85 17 -84 -62 -9 -45 -68 57 34 38 -85 -86 86 111 49 50 -93 90 -66 69 96 75 52 72 -113 -10 71 -95 122 -118 -18 -42 81 0 3 47 32 78 53 35 118 34 -71 -29 66 67 -105 36 116 -46 79 88 -71 90 34 -26 -112 102 40 -79 77 45";
		System.out.println(convertBytesToHex(bytesText));
	}
	
}
