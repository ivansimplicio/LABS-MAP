package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import principal.Disciplina;

class DisciplinaTest {
	
	private static Disciplina disc = null;

	@BeforeAll
	static void criarObjeto() throws Exception {
		disc = new Disciplina("12345", "M�todos Avan�ados de Programa��o");
	}

	@Test
	void testToString() {
		String toString = "C�digo: 12345\n" + 
				"Disciplina: M�todos Avan�ados de Programa��o";
		assertEquals(toString, disc.toString());
		
		toString = toString.concat("\n");
		assertNotEquals(toString, disc.toString());
	}
}