package blueflamey.sample.bitwise;

/**
 * Uses Java 8 
 */
public class TestShift {
	public static void main(String... args) {
		
		final int binaryZero = 0b0000_0000;
		System.out.println(binaryZero);
		
		System.out.println(Integer.MAX_VALUE);
		
		final int resultWhenLeftShiftDoneToZero = binaryZero << 1;
		System.out.println(resultWhenLeftShiftDoneToZero);
		
		final int binaryOne = 0b0000_0001;
		System.out.println("bianry one: " + binaryOne);
		
		final int resultWhenLeftShiftDoneToOne = binaryOne << 1;
		System.out.println(resultWhenLeftShiftDoneToOne);
		
		final int resultWhenThreeLeftShiftDoneToOne = binaryOne << 3;
		System.out.println(resultWhenThreeLeftShiftDoneToOne);
		
		final int resultWhenMaxLeftShiftDoneToOne = binaryOne << Integer.MAX_VALUE;
		System.out.println(resultWhenMaxLeftShiftDoneToOne);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.MIN_VALUE & resultWhenMaxLeftShiftDoneToOne);
		
		final int resultWhenMinValueLeftShiftOne = Integer.MIN_VALUE << 1;
		System.out.println(resultWhenMinValueLeftShiftOne);
		
		final int resultWhenNegativeRightShiftDoneToOne = binaryOne >> -1;
		System.out.println(resultWhenNegativeRightShiftDoneToOne);
		
		final int resultWhenLargeNumberRightShiftDoneToOne = binaryOne >> (Integer.MAX_VALUE);
		System.out.println(resultWhenLargeNumberRightShiftDoneToOne);
		
		// Niko stuff
		System.out.println("Niko stuff");
		final int resultWhenRightShiftDoneToOne = ~-2 + 1;
		System.out.println(resultWhenRightShiftDoneToOne + " == 2");
	} 
}
