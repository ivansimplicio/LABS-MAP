package testes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import enums.Dia;
import enums.Hora;
import principal.Disciplina;
import principal.RDM;

class RDMTest {
	
	private static RDM registro;

	@BeforeAll
	static void criarObjeto(){
		registro = new RDM();
		
		registro.cadastrarDisciplina(new Disciplina("111", "C�lculo III", Dia.SEGUNDA, Hora.PRIMEIRA_AULA));
		registro.cadastrarDisciplina(new Disciplina("222", "�lgera Linear", Dia.TER�A, Hora.PRIMEIRA_AULA));
		registro.cadastrarDisciplina(new Disciplina("333", "Geometria Anal�tica", Dia.SEXTA, Hora.SEGUNDA_AULA));
	}

	@Test
	void testCadastrarDisciplina() {
		assertTrue(registro.cadastrarDisciplina(new Disciplina("333", "Banco de Dados", Dia.QUINTA, Hora.SEGUNDA_AULA)));
		assertFalse(registro.cadastrarDisciplina(new Disciplina("111", "C�lculo III", Dia.TER�A, Hora.SEGUNDA_AULA)));
		assertFalse(registro.cadastrarDisciplina(new Disciplina("555", "MAP", Dia.SEXTA, Hora.SEGUNDA_AULA)));
	}
	
	@Test
	void testListarDisciplinas() {
		String expected = "C�digo: 111\n" + 
				"Disciplina: C�lculo III\n" + 
				"C�digo: 222\n" + 
				"Disciplina: �lgera Linear\n" + 
				"C�digo: 333\n" + 
				"Disciplina: Geometria Anal�tica\n";
		assertEquals(expected, registro.listarDisciplinas());
	}
	
	@Test
	void testListarHorarios() {
		String expected = "Segunda - 18h �s 20h\n" + 
				"Ter�a - 18h �s 20h\n" + 
				"Sexta - 20h �s 22h\n";
		assertEquals(expected, registro.listarHorarios());
	}
}