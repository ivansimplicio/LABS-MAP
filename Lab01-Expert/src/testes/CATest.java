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
		//classe possui apenas m�todos de exibi��o de informa��es, n�o h� o que testar.
	}
}