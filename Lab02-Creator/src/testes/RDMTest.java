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
		
		registro.cadastrarDisciplina(new Disciplina("111", "Cálculo III", Dia.SEGUNDA, Hora.PRIMEIRA_AULA));
		registro.cadastrarDisciplina(new Disciplina("222", "Álgera Linear", Dia.TERÇA, Hora.PRIMEIRA_AULA));
		registro.cadastrarDisciplina(new Disciplina("333", "Geometria Analítica", Dia.SEXTA, Hora.SEGUNDA_AULA));
	}

	@Test
	void testCadastrarDisciplina() {
		assertTrue(registro.cadastrarDisciplina(new Disciplina("333", "Banco de Dados", Dia.QUINTA, Hora.SEGUNDA_AULA)));
		assertFalse(registro.cadastrarDisciplina(new Disciplina("111", "Cálculo III", Dia.TERÇA, Hora.SEGUNDA_AULA)));
		assertFalse(registro.cadastrarDisciplina(new Disciplina("555", "MAP", Dia.SEXTA, Hora.SEGUNDA_AULA)));
	}
	
	@Test
	void testListarDisciplinas() {
		String expected = "Código: 111\n" + 
				"Disciplina: Cálculo III\n" + 
				"Código: 222\n" + 
				"Disciplina: Álgera Linear\n" + 
				"Código: 333\n" + 
				"Disciplina: Geometria Analítica\n";
		assertEquals(expected, registro.listarDisciplinas());
	}
	
	@Test
	void testListarHorarios() {
		String expected = "Segunda - 18h às 20h\n" + 
				"Terça - 18h às 20h\n" + 
				"Sexta - 20h às 22h\n";
		assertEquals(expected, registro.listarHorarios());
	}
}