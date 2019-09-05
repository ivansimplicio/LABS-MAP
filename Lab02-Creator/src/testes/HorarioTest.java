package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import enums.Dia;
import enums.Hora;
import principal.Horario;

class HorarioTest {

	private static Horario horario;
	
	@BeforeAll
	static void criarObjecto() {
		horario = new Horario(Dia.QUARTA, Hora.PRIMEIRA_AULA);
	}

	@Test
	void testEquals() {
		Horario h2 = new Horario(Dia.QUARTA, Hora.PRIMEIRA_AULA);
		assertEquals(horario, h2);
		Horario h3 = new Horario(Dia.SEXTA, Hora.SEGUNDA_AULA);
		assertNotEquals(horario, h3);
	}
	
	@Test
	void testToString() {
		String expected = "Quarta - 18h às 20h";
		assertEquals(expected, horario.toString());
	}
}
