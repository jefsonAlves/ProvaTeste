package provateste;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import provateste.Valores;

public class ValoresTest {
	private Valores valores;

	@Before
	public void inicializa() {
		valores = new Valores();
	}

	@Test
	public void tentaInserir11NaLista() {
		for (int i = 1; i <= 10; i++) {
			valores.ins(i);
		}
		boolean resultado = valores.ins(11);
		assertFalse(resultado);
		//System.out.println(resultado);
	}

	@Test
	public void tentaInserirValorNegativo() {
		boolean resultado = valores.ins(-1);
		assertFalse(resultado);
		//System.out.println(resultado);
	}

	@Test
	public void tentaInserirValorValidoEmListaNaoCheia() {
		boolean resultado = valores.ins(1);
		assertTrue(resultado);
		//System.out.println(resultado);

	}

	@Test
	public void deletarIndice0EmListaVazia() {
		long resultado = valores.del(0);
		assertEquals(-1, resultado);
		//System.out.println(resultado);
	}

	@Test
	public void deletarIndice0EmListaDe1item() {
		valores.ins(6);
		int resultado = valores.del(0);
		assertEquals(6, resultado);
		// System.out.println(resultado);
	}

	@Test
	public void tentaDeletarIndice1EmListaDe2itens() {
		valores.ins(24);
		valores.ins(27);
		valores.ins(30);
		int resultado = valores.del(0);
		assertEquals(24, resultado);
		//System.out.println(resultado);
	}

	@Test
	public void tentarDeletarEmIndiceVazio() {
		valores.ins(27);
		int resultado = valores.del(24);
		assertEquals(-1, resultado);
		//System.out.println(resultado);
	}

	@Test
	public void tentaObterTamanhoEmListaVazia() {
		int resultado = valores.size();
		assertEquals(0, resultado);
		//System.out.println(resultado);
	}

	@Test
	public void tentaObterTamanhoEmListaDe1Item() {
		valores.ins(3);
		int resultado = valores.size();
		assertEquals(1, resultado);
		//System.out.println(resultado);
	}

	@Test
	public void tentaObterTamanhoEmListaDe10Itens() {
		for (int i = 1; i <= 10; i++) {
			valores.ins(i);
		}
		int resultado = valores.size();
		assertEquals(10, resultado);
		//System.out.println(resultado);
	}

	@Test
	public void mediaDeListaVazia() {
		double resultado = valores.mean();
		assertEquals("ruim", 0.0, resultado, 0.001);
		//System.out.println(resultado);
	}

	@Test
	public void mediaDeLista1Item() {
		valores.ins(3);
		double resultado = valores.mean();
		assertEquals("", 3, resultado, 0.001);
		//System.out.println(resultado);
	}

	@Test
	public void mediaEmLista4Itens() {
		valores.ins(6);
		valores.ins(12);
		valores.ins(18);
		valores.ins(24);
		double resultado = valores.mean();
		assertEquals("", 15, resultado, 0.001);
		//System.out.println(resultado);
	}

	@Test
	public void tentaObterOMaiorValorDeListaVazia() {
		int resultado = valores.greater();
		assertEquals(-1, resultado);
		//System.out.println(resultado);
	}

	@Test
	public void tentaObterOMaiorValorDeLista1Item() {
		valores.ins(3);
		int resultado = valores.greater();
		assertEquals(3, resultado);
		//System.out.println(resultado);
	}

	public void tentaObterOMaiorValorDeLista2Itens() {
		valores.ins(3);
		valores.ins(9);
		int resultado = valores.greater();
		assertEquals(9, resultado);
		//System.out.println(resultado);
	}

	public void tentaObterOMenorValorDeListaVazia() {
		int resultado = valores.lower();
		assertEquals(-1, resultado);
		//System.out.println(resultado);
	}

	public void tentaObterOMenorValorDeLista1Item() {
		valores.ins(3);
		int resultado = valores.lower();
		assertEquals(3, resultado);
		//System.out.println(resultado);
	}

	public void tentaObterOMenorValorDeLista2Itens() {
		valores.ins(3);
		valores.ins(1);
		int resultado = valores.lower();
		assertEquals(1, resultado);
		//System.out.println(resultado);
	}
}
