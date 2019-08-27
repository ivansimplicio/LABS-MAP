package testes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import atores.Professor;

class ProfessorTest {
	
	private static Professor prof = null;

	@BeforeAll
	static void criarObjeto() {
		prof = new Professor("12345", "Viviane", 3200.00);
	}

	@Test
	void testEquals() {
		Professor prof2 = new Professor("12345", "Viviane", 3200.00);
		assertTrue(prof.equals(prof2));
		
		prof2.setSalario(2300.00);
		assertFalse(prof.equals(prof2));
	}
}