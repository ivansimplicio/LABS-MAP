package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figurasGeometricas.Circulo;
import figurasGeometricas.ValorInvalidoException;

class CirculoTest {
	Circulo circulo = null;
	
	@BeforeEach
	void criarCirculo() throws ValorInvalidoException {
		circulo = new Circulo(2);
	}
	
	@Test 
	void testInicializacao(){
		try {
			circulo = new Circulo(10);
		}catch(ValorInvalidoException e) {
			fail("Não deve entrar aqui: "+e.getMessage());
		}
	}
	
	@Test
	void testErroInicializacao() {
		assertThrows(ValorInvalidoException.class, () -> {
			circulo = new Circulo(-2);
		});
		assertThrows(ValorInvalidoException.class, () -> {
			circulo = new Circulo(0);
		});
	}
	
	@Test
	void calcularArea() throws ValorInvalidoException {
		int expected = 12;
		assertEquals(expected, circulo.calcularArea());
		circulo.setRaio(3);
		expected = 28;
		assertEquals(expected, circulo.calcularArea());
	}
	
	@Test
	void calcularPerimetro() throws ValorInvalidoException {
		int expected = 12;
		assertEquals(expected, circulo.calcularPerimetro());
		circulo.setRaio(3);
		expected = 18;
		assertEquals(expected, circulo.calcularPerimetro());
	}
	
	@Test
	void testToString() {
		String expected = "O circulo criado tem raio de tamanho = 2";
		assertEquals(expected, circulo.toString());
	}
}