package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figurasGeometricas.Quadrado;
import figurasGeometricas.ValorInvalidoException;

class QuadradoTest {
	Quadrado quadrado = null;
	
	@BeforeEach
	void criarQuadrado() throws ValorInvalidoException {
		quadrado = new Quadrado(5);
	}
	
	@Test 
	void testInicializacao(){
		try {
			quadrado = new Quadrado(10);
		}catch(ValorInvalidoException e) {
			fail("Não deve entrar aqui: "+e.getMessage());
		}
	}
	
	@Test
	void testErroInicializacao() {
		assertThrows(ValorInvalidoException.class, () -> {
			quadrado = new Quadrado(-2);
		});
		assertThrows(ValorInvalidoException.class, () -> {
			quadrado = new Quadrado(0);
		});
	}
	
	@Test
	void calcularArea() throws ValorInvalidoException {
		int expected = 25;
		assertEquals(expected, quadrado.calcularArea());
		quadrado.setLargura(6);
		expected = 36;
		assertEquals(expected, quadrado.calcularArea());
	}
	
	@Test
	void calcularPerimetro() throws ValorInvalidoException {
		int expected = 20;
		assertEquals(expected, quadrado.calcularPerimetro());
		quadrado.setLargura(6);
		expected = 24;
		assertEquals(expected, quadrado.calcularPerimetro());
	}
	
	@Test
	void testToString() {
		String expected = "O quadrado criado tem lados de tamanho = 5";
		assertEquals(expected, quadrado.toString());
	}
}