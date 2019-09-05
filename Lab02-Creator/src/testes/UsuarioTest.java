package testes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import atores.Usuario;
import enums.Dia;
import enums.Hora;
import principal.Disciplina;

class UsuarioTest {
	
	private static Usuario usuario = null;

	@BeforeAll
	static void criarObjeto() {
		usuario = new Usuario("12345", "Ivan");
	}

	@Test
	void testEquals() {
		Usuario usuario2 = new Usuario("12345", "Ivan");
		assertTrue(usuario.equals(usuario2));
		
		usuario2.setMatricula("54321");
		assertFalse(usuario.equals(usuario2));
	}
	
	@Test
	void testCadastrarDisciplina() {
		assertTrue(usuario.cadastrarNovaDisciplina(new Disciplina("111", "Cálculo III", Dia.SEGUNDA, Hora.PRIMEIRA_AULA)));
		assertFalse(usuario.cadastrarNovaDisciplina(new Disciplina("111", "Cálculo III", Dia.TERÇA, Hora.PRIMEIRA_AULA)));
		assertFalse(usuario.cadastrarNovaDisciplina(new Disciplina("222", "Banco de Dados", Dia.SEGUNDA, Hora.PRIMEIRA_AULA)));
	}
}