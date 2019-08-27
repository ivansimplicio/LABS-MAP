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
		turma = new Turma(new Disciplina("12345", "C�lculo III"), "Ter�a - 19h", "C107");
		turma.setProf(new Professor("54321", "Jos� Alves", 15000.00));
		turma.matricularAluno(new Aluno("11111", "Mateus", "F�sica"));
		turma.matricularAluno(new Aluno("22222", "Marta", "Computa��o"));
		turma.matricularAluno(new Aluno("33333", "Maria", "Matem�tica"));
		turma.matricularAluno(new Aluno("44444", "Alberto", "Estat�stica"));
	}

	@Test
	void testQntAlunos() {
		int numeroAlunosCadastrados = 4;
		assertEquals(numeroAlunosCadastrados, turma.quantidadeAlunos());
		
		turma.matricularAluno(new Aluno("55555", "Carlos", "Hist�ria"));
		numeroAlunosCadastrados++;
		
		assertEquals(numeroAlunosCadastrados, turma.quantidadeAlunos());
	}
}