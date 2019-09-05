package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import atores.Aluno;
import atores.Professor;
import enums.Dia;
import enums.Hora;
import principal.Disciplina;

class DisciplinaTest {
	
	private static Disciplina disc;

	@BeforeAll
	static void criarObjeto() {
		disc = new Disciplina("111", "Banco de Dados", Dia.QUARTA, Hora.PRIMEIRA_AULA);
	}

	@Test
	void testCadastrarNaDisciplina() {
		assertTrue(disc.cadastrarProfessor(new Professor("11111", "Jos� Alves", 12500.00)));
		assertTrue(disc.matricularAluno(new Aluno("111", "Mateus", "Computa��o")));
		assertTrue(disc.matricularAluno(new Aluno("222", "Kleberson", "Computa��o")));
		assertTrue(disc.matricularAluno(new Aluno("333", "Algusto", "Computa��o")));
		
		assertFalse(disc.matricularAluno(new Aluno("111", "Mateus", "Computa��o")));
	}
	
	@Test
	void testEquals() {
		Disciplina d2 = new Disciplina("111", "Banco de Dados", Dia.QUARTA, Hora.PRIMEIRA_AULA);
		assertEquals(disc, d2);
		Disciplina d3 = new Disciplina("222", "MAP", Dia.QUARTA, Hora.PRIMEIRA_AULA);
		assertNotEquals(disc, d3);
	}
	
	@Test 
	void testToString(){
		String expected = "C�digo: 111\n" + 
				"Disciplina: Banco de Dados\n";
		assertEquals(expected, disc.toString());
	}
	
	@Test
	void testListarAlunos() {
		criarObjeto();
		disc.matricularAluno(new Aluno("111", "Ivan", "Computa��o"));
		String expected = "Dados do Aluno: \n" + 
				"Matr�cula: 111\n" + 
				"Nome: Ivan\n" + 
				"Curso: Computa��o\n";
		assertEquals(expected, disc.listarAlunos());
	}
	
	@Test
	void testQntAlunos() {
		disc.matricularAluno(new Aluno("111", "Ivan", "Computa��o"));
		disc.matricularAluno(new Aluno("222", "Viviane", "Computa��o"));
		disc.matricularAluno(new Aluno("333", "Alberto", "Computa��o"));
		assertEquals(3, disc.qntAlunos());
		disc.matricularAluno(new Aluno("444", "Jos�", "Computa��o"));
		assertEquals(4, disc.qntAlunos());
	}
}