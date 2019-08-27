package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import atores.Aluno;
import atores.Professor;
import principal.Disciplina;
import principal.Turma;

class TurmaTest {
	
	private static Turma turma = null;

	@BeforeAll
	static void criarObjeto() {
		turma = new Turma(new Disciplina("12345", "Cálculo III"), "Terça - 19h", "C107");
		turma.setProf(new Professor("54321", "José Alves", 15000.00));
		turma.matricularAluno(new Aluno("11111", "Mateus", "Física"));
		turma.matricularAluno(new Aluno("22222", "Marta", "Computação"));
		turma.matricularAluno(new Aluno("33333", "Maria", "Matemática"));
		turma.matricularAluno(new Aluno("44444", "Alberto", "Estatística"));
	}

	@Test
	void testQntAlunos() {
		int numeroAlunosCadastrados = 4;
		assertEquals(numeroAlunosCadastrados, turma.quantidadeAlunos());
		
		turma.matricularAluno(new Aluno("55555", "Carlos", "História"));
		numeroAlunosCadastrados++;
		
		assertEquals(numeroAlunosCadastrados, turma.quantidadeAlunos());
	}
}