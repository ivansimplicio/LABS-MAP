package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import enums.Dia;
import enums.Hora;
import principal.ControleAcademico;

class ControleAcademicoTest {
	
	private static ControleAcademico controle;

	@BeforeAll
	static void criarObjeto(){
		controle = new ControleAcademico();
	}

	@Test
	void testCadastrarDisciplina() {
		assertTrue(controle.cadastrarDisciplina("126451", "Cálculo III", Dia.SEGUNDA, Hora.PRIMEIRA_AULA));
		assertTrue(controle.cadastrarDisciplina("159155", "Física Moderna", Dia.QUARTA, Hora.SEGUNDA_AULA));
		
		assertFalse(controle.cadastrarDisciplina("126451", "Cálculo III", Dia.SEGUNDA, Hora.PRIMEIRA_AULA));
	}
	
	@Test
	void testCadastrarProfessor() {
		assertTrue(controle.cadastrarProfessor("111", "Antônio", 2300.00));
		assertTrue(controle.cadastrarProfessor("222", "Maria Madalena", 5200.00));
		
		assertFalse(controle.cadastrarProfessor("111", "Antônio", 2300.00));
	}
	
	@Test
	void testCadastrarAluno() {
		assertTrue(controle.cadastrarAluno("11111", "Ivan", "Computação"));
		assertTrue(controle.cadastrarAluno("22222", "Viviane", "Computação"));
		
		assertFalse(controle.cadastrarAluno("11111", "Ivan", "Computação"));
	}
	
	@Test
	void testAlocacao() {
		criarObjeto();
		controle.cadastrarDisciplina("126451", "Cálculo III", Dia.SEGUNDA, Hora.PRIMEIRA_AULA);
		controle.cadastrarDisciplina("159155", "Física Moderna", Dia.QUARTA, Hora.SEGUNDA_AULA);
		
		controle.cadastrarProfessor("111", "Antônio", 2300.00);
		controle.cadastrarProfessor("222", "Maria Madalena", 5200.00);
		
		controle.cadastrarAluno("11111", "Ivan", "Computação");
		controle.cadastrarAluno("22222", "Viviane", "Computação");
		
		assertTrue(controle.cadastrarProfessorNaDisciplina(0, 0));
		assertTrue(controle.cadastrarProfessorNaDisciplina(1, 1));
		assertTrue(controle.cadastrarAlunoNaDisciplina(0, 0));
		assertTrue(controle.cadastrarAlunoNaDisciplina(0, 1));
		assertTrue(controle.cadastrarAlunoNaDisciplina(1, 0));
		assertTrue(controle.cadastrarAlunoNaDisciplina(1, 1));
		
		assertFalse(controle.cadastrarProfessorNaDisciplina(0, 0));
		assertFalse(controle.cadastrarAlunoNaDisciplina(1, 1));
		
		criarObjeto();
	}
}
