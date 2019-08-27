package testes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import principal.ControleAcademico;

class CATest {
	
	private static ControleAcademico controle = null;
	
	@BeforeAll
	static void criarObjeto() {
		controle = new ControleAcademico();
	}

	@Test
	void testControle() {
		//classe possui apenas métodos de exibição de informações, não há o que testar.
	}
}