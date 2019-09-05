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
		assertTrue(disc.cadastrarProfessor(new Professor("11111", "José Alves", 12500.00)));
		assertTrue(disc.matricularAluno(new Aluno("111", "Mateus", "Computação")));
		assertTrue(disc.matricularAluno(new Aluno("222", "Kleberson", "Computação")));
		assertTrue(disc.matricularAluno(new Aluno("333", "Algusto", "Computação")));
		
		assertFalse(disc.matricularAluno(new Aluno("111", "Mateus", "Computação")));
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
		String expected = "Código: 111\n" + 
				"Disciplina: Banco de Dados\n";
		assertEquals(expected, disc.toString());
	}
	
	@Test
	void testListarAlunos() {
		criarObjeto();
		disc.matricularAluno(new Aluno("111", "Ivan", "Computação"));
		String expected = "Dados do Aluno: \n" + 
				"Matrícula: 111\n" + 
				"Nome: Ivan\n" + 
				"Curso: Computação\n";
		assertEquals(expected, disc.listarAlunos());
	}
	
	@Test
	void testQntAlunos() {
		disc.matricularAluno(new Aluno("111", "Ivan", "Computação"));
		disc.matricularAluno(new Aluno("222", "Viviane", "Computação"));
		disc.matricularAluno(new Aluno("333", "Alberto", "Computação"));
		assertEquals(3, disc.qntAlunos());
		disc.matricularAluno(new Aluno("444", "José", "Computação"));
		assertEquals(4, disc.qntAlunos());
	}
}