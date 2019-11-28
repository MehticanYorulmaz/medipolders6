package ders6;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MetinIslemleriTest {

	@Test
	public void testBuyukHarf() {
		String sonuc = MetinIslemleri
				.buyukHarf ("ali");
		Assert.assertEquals("ALÝ", sonuc);
		
		fail("Not yet implemented");
	}

}
