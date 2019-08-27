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
		disc = new Disciplina("12345", "Métodos Avançados de Programação");
	}

	@Test
	void testToString() {
		String toString = "Código: 12345\n" + 
				"Disciplina: Métodos Avançados de Programação";
		assertEquals(toString, disc.toString());
		
		toString = toString.concat("\n");
		assertNotEquals(toString, disc.toString());
	}
}