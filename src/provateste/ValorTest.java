package provateste;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import provateste.Valor;



public class ValorTest {
	private Valor valores;
	
	@Before
	public void inicializa() {
		valores = new Valor();
	}
	
	@Test
	public void inserir11naLista() {
		for(int t = 1; t <= 10; t++) {
			valores.ins(t);
		}
		boolean resultado = valores.ins(11);

		assertFalse(resultado);
	}
	
	@Test
	public void inserirvalorNegativo() {
		boolean resultado = valores.ins(-1);
		assertFalse(resultado);
	}
	
	@Test
	public void inserirvalidonalistanaoCheia() {
		boolean resultado = valores.ins(1);
		assertTrue(resultado);
	}
	
	@Test
	public void deletaoindice0ListaVazia() {
		
		long resultado = valores.del(0);
		assertEquals(-1l, resultado);
	}

	@Test
	public void deletaoindice0nalistade1Item() {
	
		valores.ins(2);
		int resultado = valores.del(0);
		assertEquals(2, resultado);
	}
	
	@Test
	public void deletarindice1emListados2itens() {
		
		valores.ins(9);
		valores.ins(7);
		valores.ins(3);
		int resultado = valores.del(0);
		assertEquals(9, resultado);
	}
	
	@Test
	public void deletaremindiceVazio() {
		
		
		valores.ins(7);
		int resultado = valores.del(9);
		assertEquals(-1, resultado);
	}
	
	@Test
	public void obterTamanhoEmListaVazia() {
		int resultado = valores.size();
		assertEquals(0, resultado);
	}
	
	@Test
	public void obterTamanhoEmListaDe1Item() {
		valores.ins(6);
		int resultado = valores.size();
		assertEquals(1, resultado);
	}
	
	@Test
	public void obterTamanhoEmListaDe10Itens() {
		for(int t = 1; t <= 11; t++) {
			valores.ins(t);
		}
		int resultado = valores.size();
		assertEquals(10, resultado);
	}
	
	@Test
	public void mediaDeListaVazia() {
		double resultado = valores.mean();
		assertEquals("deu ruim", 0.0, resultado, 0.001);
	}
	
	@Test
	public void mediaDeLista1Item() {
		valores.ins(2);
		double resultado = valores.mean();
		assertEquals("", 2, resultado, 0.001);
	}
	
	@Test
	public void mediaEmLista4Itens() {
		valores.ins(10);
		valores.ins(8);
		valores.ins(23);
		valores.ins(12);
		double resultado = valores.mean();
		assertEquals("" , 13.25, resultado, 0.001);
	}
	
	@Test
	public void obterOMaiorValorDeListaVazia() {
		int resultado = valores.greater();
		assertEquals( -1, resultado);
	}
	
	@Test
	public void obterOMaiorValorDeLista1Item() {
		valores.ins(2);
		int resultado = valores.greater();
		assertEquals( 2, resultado);
	}
	
	public void obterOMaiorValorDeLista2Itens() {
		valores.ins(2);
		valores.ins(5);
		int resultado = valores.greater();
		assertEquals( 5, resultado);
	}
	
	public void obterOMenorValorDeListaVazia() {
		int resultado = valores.lower();
		assertEquals( -1, resultado);
	}
	
	public void obterOMenorValorDeLista1Item() {
		valores.ins(2);
		int resultado = valores.lower();
		assertEquals( 2, resultado);
	}
	
	public void oObterOMenorValorDeLista2Itens() {
		valores.ins(5);
		valores.ins(2);
		int resultado = valores.lower();
		assertEquals( 2, resultado);
	}
}

