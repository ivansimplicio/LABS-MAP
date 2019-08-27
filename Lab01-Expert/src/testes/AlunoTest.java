package testes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import atores.Aluno;

class AlunoTest {
	
	private static Aluno aluno = null;

	@BeforeAll
	static void criarObjeto() {
		aluno = new Aluno("12345", "Ivan", "Computação");
	}

	@Test
	void testEquals() {
		Aluno aluno2 = new Aluno("12345", "Ivan", "Computação");
		assertTrue(aluno.equals(aluno2));
		
		aluno2.setMatricula("54321");
		assertFalse(aluno.equals(aluno2));
	}
}