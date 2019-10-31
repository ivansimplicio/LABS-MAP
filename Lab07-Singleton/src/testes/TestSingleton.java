package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import singleton.Circulo;
import singleton.Quadrado;
import singleton.Triangulo;
import singleton.TrianguloEquilatero;
import singleton.TrianguloIsosceles;
import singleton.TrianguloRetangulo;

class TestSingleton {

	@Test
	void testCirculo() {
		Circulo c1 = Circulo.getInstance();
		c1.setRaio(2);
		Circulo c2 = Circulo.getInstance();
		Circulo c3 = Circulo.getInstance();
	
		assertEquals(c1, c2);
		assertEquals(c2, c3);
	}
	
	@Test
	void testQuadrado() {
		Quadrado q1 = Quadrado.getInstance();
		q1.setTamLados(4);
		
		Quadrado q2 = Quadrado.getInstance();
		q2.setTamLados(10);
		
		Quadrado q3 = Quadrado.getInstance();
		
		assertNotEquals(q1, q2);
		assertNotEquals(q2, q3);
		assertNotEquals(q1, q3);
	}
	
	@Test
	void testTriangulos() {
		
		Triangulo te1 = TrianguloEquilatero.getInstance();
		((TrianguloEquilatero)te1).setTamLados(5);
		
		Triangulo te2 = TrianguloEquilatero.getInstance();
		
		assertEquals(te1, te2);
		int qntTriangulosCriados = 1;
		assertEquals(qntTriangulosCriados, te1.qntInstancias());
		
		Triangulo ti1 = TrianguloIsosceles.getInstance();
		((TrianguloIsosceles)ti1).setBase(4);
		((TrianguloIsosceles)ti1).setLados(3);
		
		Triangulo ti2 = TrianguloIsosceles.getInstance();
		
		assertEquals(ti1, ti2);
		qntTriangulosCriados = 2;
		assertEquals(qntTriangulosCriados, ti1.qntInstancias());

		Triangulo tr1 = TrianguloRetangulo.getInstance();
		((TrianguloRetangulo)tr1).setCat1(3);
		((TrianguloRetangulo)tr1).setCat2(4);
		((TrianguloRetangulo)tr1).setHip(6);
		
		Triangulo tr2 = TrianguloRetangulo.getInstance();
		((TrianguloRetangulo)tr2).setHip(10);
		
		assertEquals(tr1, tr2);
		qntTriangulosCriados = 3;
		assertEquals(qntTriangulosCriados, tr1.qntInstancias());
	}
}