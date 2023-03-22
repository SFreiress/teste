package br.ce.wcaquino.servicos;

import org.junit.Test;

import org.junit.Assert;
import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {
	@Test
	public void teste_16_03() {
		Assert.assertTrue(!false);
		Assert.assertFalse(!true);
		Assert.assertEquals("Comparação de valor",1,1);
		Assert.assertEquals(5.2, 5.3, 0.1);
		
		int i = 5;
		Integer i2 = 5;
		Assert.assertEquals(Integer.valueOf(i), i2); //converto para objeto
		Assert.assertEquals(i, i2.intValue()); //converto para inteiro
		Assert.assertEquals("Comparação string", "bola", "bola");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("Usuario1");
		Usuario u2 = new Usuario("Usuario1");
		Usuario u3 = null;
		
		Assert.assertEquals(u1, u2); //conteudo
		//Assert.assertSame(u3, u2); //instancia
		Assert.assertNotSame(u1, u2); //instancia
		Assert.assertTrue(u3 == null);
		Assert.assertNull(u3);
		Assert.assertNotNull(u2);
	}
}
