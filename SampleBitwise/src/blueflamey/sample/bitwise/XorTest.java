package blueflamey.sample.bitwise;

public class XorTest {
	public static void main(String... args) {
		final int binaryOne = 0b0000_0001;
		
		final int resultOneXorOne = binaryOne ^ binaryOne;
		System.out.println(resultOneXorOne);
	}
}
