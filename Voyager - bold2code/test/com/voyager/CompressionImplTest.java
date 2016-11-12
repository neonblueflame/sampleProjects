package com.voyager;

import java.nio.charset.Charset;

import org.junit.Test;

public class CompressionImplTest {
	
	@Test
	public void testUsingProvidedParagraph() {
		StringBuffer sb = new StringBuffer();
		sb.append("Not too long ago, Voyager was launched into the digital expanse on a mission of transformation. ");
		sb.append("\n");
		sb.append("Spun off one the most influential groups in our innovation ecosystem - PLDT-Smart, ");
		sb.append("\n");
		sb.append("Voyager has since led change in emerging markets, introducing tools that ");
		sb.append("have allowed millions more to participate in the new digital economy and society. ");
		sb.append("\n");
		sb.append("Our strength is in our single-minded sense of purpose, unbridled creativity and irrepressible execution");
		
		System.out.println(sb.toString().getBytes(Charset.forName("utf-8")).length);
		
		CompressionImpl<String> stringCompression = new CompressionImpl<>();
		stringCompression.setMapFileName("mapProvidedParagraph.txt");
		byte[] compressed = stringCompression.compress(sb.toString());
		
		System.out.println(compressed.length);
		
	}
	
	@Test
	public void testUsingAlphabetUpperLowerCase() {
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		System.out.println(alphabets.getBytes(Charset.forName("utf-8")).length);
		
		CompressionImpl<String> stringCompression = new CompressionImpl<>();
		stringCompression.setMapFileName("mapAlphabetUpperLowerCase.txt");
		byte[] compressed = stringCompression.compress(alphabets);
		
		System.out.println(compressed.length);
		
	}
	
	@Test
	public void testUsingOneCharacter() {
		String alphabets = "a";
		
		System.out.println(alphabets.getBytes(Charset.forName("utf-8")).length);
		
		CompressionImpl<String> stringCompression = new CompressionImpl<>();
		stringCompression.setMapFileName("mapOneCharacter.txt");
		byte[] compressed = stringCompression.compress(alphabets);
		
		System.out.println(compressed.length);
	}
	
	@Test
	public void testUsingVeryLongString() {
		String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi ac lectus sed felis fringilla vehicula. Ut viverra dolor nec consequat ullamcorper. Morbi vulputate diam commodo arcu rutrum posuere. Etiam eros arcu, porta et venenatis quis, aliquet quis tellus. Etiam quis magna id tortor commodo vulputate sit amet sit amet arcu. Aliquam in elit scelerisque sapien consequat laoreet et nec mi. Nam a sagittis nunc, a commodo sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec diam sapien, accumsan sed condimentum non, euismod eu metus. Donec luctus commodo arcu nec cursus. Sed id commodo lectus. Integer elementum lacus purus, rhoncus pharetra justo volutpat non. Maecenas purus mi, suscipit a massa eget, vehicula volutpat augue. Praesent id ornare nulla. Donec iaculis facilisis imperdiet. Sed porttitor faucibus mi accumsan facilisis. Fusce magna erat, finibus et luctus ac, sollicitudin a ante. Aenean eu dui ut mauris vulputate laoreet id ac augue. Phasellus leo quam, euismod non urna eget, dignissim bibendum odio. Cras nec mauris a odio maximus malesuada. Aenean euismod mi congue, congue lorem id, maximus dolor. Aenean molestie, felis sed ultricies ullamcorper, lectus ipsum lobortis libero, ac feugiat velit lacus ut nisl. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ac elit eget mauris pulvinar commodo. Duis vel suscipit est, quis pulvinar urna. Integer lorem justo, porttitor in consequat sit amet, fermentum vel neque. Donec felis augue, cursus in libero nec, dapibus aliquet massa. Nulla accumsan, felis sit amet blandit vulputate, ante diam consectetur enim, ac luctus mi neque eget nibh. Praesent eu pretium ex. Vivamus sit amet finibus felis, nec laoreet elit. Aliquam erat volutpat. Maecenas egestas scelerisque nisi, sed sagittis libero. Curabitur tristique elit ipsum, et scelerisque ligula posuere faucibus. Sed dictum posuere dui, in mattis ex. Suspendisse rhoncus at orci sed tempus. Phasellus vel magna in tellus scelerisque condimentum ac vel ipsum. Morbi at efficitur massa, iaculis iaculis lectus. Mauris aliquam porttitor ex, eget gravida nisi. Vivamus nec justo at ex aliquet interdum nec ut mi. Nam quis viverra arcu, vitae volutpat augue. Phasellus ac magna eget velit mollis accumsan quis in metus. Cras pellentesque ornare elementum. Aliquam nec hendrerit est, id blandit metus. Vivamus cursus et nisl sit amet maximus. Ut varius felis erat, sit amet scelerisque libero consequat at. Aliquam libero metus, tristique vel odio quis, auctor venenatis metus. Aliquam erat volutpat. Nulla ullamcorper convallis velit, sed feugiat purus lacinia eu. Nullam id ligula fringilla, pulvinar mauris eu, facilisis nisl. Praesent condimentum eleifend sem, vitae vehicula nisl. Morbi mattis tristique dapibus. Ut a hendrerit neque. Suspendisse eu suscipit est. Suspendisse quis ornare ligula. Sed sapien odio, sodales id elementum id, consequat vel sem. Suspendisse porta sapien vel eleifend auctor. Nam rutrum accumsan bibendum. In vel volutpat elit. Vivamus interdum ullamcorper nunc a rutrum.Integer venenatis velit sed eros varius pellentesque. Nulla at eros pulvinar justo suscipit placerat. Sed consectetur iaculis felis. Sed odio nisl, lobortis eget dapibus a, volutpat tristique nunc. Suspendisse sed convallis nunc. Suspendisse mattis magna et accumsan tincidunt. Phasellus dignissim justo quis nunc accumsan vulputate. Sed in gravida nisi. Phasellus eu lectus rhoncus, accumsan ex ac, sodales neque. Sed ut nibh urna. Sed fringilla neque id nibh placerat, sit amet rhoncus est tristique. Curabitur vel quam aliquet, accumsan augue id, lobortis quam. Cras ac risus non dolor ultrices facilisis ac sit amet quam. Nam magna tortor, aliquet nec mollis quis, fermentum non lacus. Nunc cursus eu ligula ut dignissim.Vestibulum semper ligula non nunc volutpat efficitur. Suspendisse commodo, massa at condimentum aliquam, odio leo ullamcorper ipsum, in tristique lacus sem id lorem. Nulla eget dolor at velit dapibus maximus. Sed semper eleifend magna non consequat. Suspendisse felis nunc, dapibus eu sem at, gravida suscipit dolor. Etiam mollis dictum quam. Aenean pulvinar lobortis felis sed congue. Fusce auctor eu lorem sed volutpat. Sed a volutpat lectus, faucibus lacinia nunc.Integer nec ante ante. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam commodo urna vel turpis blandit congue. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Donec tempus mollis sapien, at faucibus velit tristique id. Sed eget nisl finibus, porta velit quis, congue justo. Vivamus ipsum tellus, finibus pharetra viverra nec, maximus id turpis. In quis quam in ex placerat maximus in id turpis.Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Mauris aliquam dictum euismod. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quis risus at augue imperdiet tristique eget vel nunc. Proin eu ullamcorper massa. Duis dignissim, neque vitae molestie molestie, eros enim egestas nulla, eu rutrum lectus arcu nec orci. Sed elementum bibendum dolor. Duis a pretium massa, ut fringilla urna. Integer fringilla, neque at volutpat posuere, ex ex posuere velit, quis convallis mi eros a nulla. Vestibulum interdum quam vel rutrum bibendum. Nullam porta congue tellus elementum aliquet. Sed vitae lacinia lorem. Aenean vestibulum bibendum imperdiet. Ut est libero, vulputate aliquam sollicitudin ut, consectetur nec justo.";
		
		System.out.println(loremIpsum.getBytes(Charset.forName("utf-8")).length);
		
		CompressionImpl<String> stringCompression = new CompressionImpl<>();
		stringCompression.setMapFileName("mapVeryLongString.txt");
		byte[] compressed = stringCompression.compress(loremIpsum);
		
		System.out.println(compressed.length);
	}
	
	@Test
	public void testUsingNumberString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Not too long ago, Voyager was launched into the digital expanse on a mission of transformation. ");
		sb.append("\n");
		sb.append("Spun off one the most influential groups in our innovation ecosystem - PLDT-Smart, ");
		sb.append("\n");
		sb.append("Voyager has since led change in emerging markets, introducing tools that ");
		sb.append("have allowed millions more to participate in the new digital economy and society. ");
		sb.append("\n");
		sb.append("Our strength is in our single-minded sense of purpose, unbridled creativity and irrepressible execution");
		
	}
	
	@Test
	public void testUsingSymbolString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Not too long ago, Voyager was launched into the digital expanse on a mission of transformation. ");
		sb.append("\n");
		sb.append("Spun off one the most influential groups in our innovation ecosystem - PLDT-Smart, ");
		sb.append("\n");
		sb.append("Voyager has since led change in emerging markets, introducing tools that ");
		sb.append("have allowed millions more to participate in the new digital economy and society. ");
		sb.append("\n");
		sb.append("Our strength is in our single-minded sense of purpose, unbridled creativity and irrepressible execution");
		
	}
	
	@Test
	public void testUsingJapaneseCharacters() {
		StringBuffer sb = new StringBuffer();
		sb.append("Not too long ago, Voyager was launched into the digital expanse on a mission of transformation. ");
		sb.append("\n");
		sb.append("Spun off one the most influential groups in our innovation ecosystem - PLDT-Smart, ");
		sb.append("\n");
		sb.append("Voyager has since led change in emerging markets, introducing tools that ");
		sb.append("have allowed millions more to participate in the new digital economy and society. ");
		sb.append("\n");
		sb.append("Our strength is in our single-minded sense of purpose, unbridled creativity and irrepressible execution");
		
	}
	
	@Test
	public void testUsingMultipleWordOccurence() {
		StringBuffer sb = new StringBuffer();
		sb.append("Not too long ago, Voyager was launched into the digital expanse on a mission of transformation. ");
		sb.append("\n");
		sb.append("Spun off one the most influential groups in our innovation ecosystem - PLDT-Smart, ");
		sb.append("\n");
		sb.append("Voyager has since led change in emerging markets, introducing tools that ");
		sb.append("have allowed millions more to participate in the new digital economy and society. ");
		sb.append("\n");
		sb.append("Our strength is in our single-minded sense of purpose, unbridled creativity and irrepressible execution");
		
	}
}
