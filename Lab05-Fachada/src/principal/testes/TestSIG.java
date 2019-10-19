package principal.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import principal.sig.SIG;
import setor.administrativo.Evento.TipoEvento;

class TestSIG {
	
	static SIG sig = null;

	@BeforeAll
	static void iniciarSistema(){
		sig = new SIG();
	}

	@Test
	void testAlunoSIG() {
		sig.matricularAluno("Sebasti�o", "Hist�ria");
		sig.matricularAlunoNaDisciplina(0, 123, "Hist�ria do Brasil");
		sig.matricularAlunoNaDisciplina(0, 432, "Hist�ria da Para�ba");
		sig.adicionarAoHistoricoDoAluno(0, 567, "�tica");
		sig.adicionarAoHistoricoDoAluno(0, 789, "Metodologia Cient�fica");
		
		String expected = "Aluno: Sebasti�o - Curso: Hist�ria\n" + 
				"RDM - Disciplinas Matriculadas:\n" + 
				"C�digo: 123 - Disciplina: Hist�ria do Brasil\n" + 
				"C�digo: 432 - Disciplina: Hist�ria da Para�ba\n";
		
		assertEquals(expected, sig.consultarAlunoRDM(0));
		
		expected = "Aluno: Sebasti�o - Curso: Hist�ria\n" + 
				"Hist�rico de Disciplinas:\n" + 
				"C�digo: 567 - Disciplina: �tica\n" + 
				"C�digo: 789 - Disciplina: Metodologia Cient�fica\n";
		
		assertEquals(expected, sig.consultarAlunoHistorico(0));
	}
	
	@Test
	void testProfessorSIG() {
		sig.matricularProfessor("Augusto", 3);
		sig.cadastrarProfessorNaDisciplina(0, 735, "Matem�tica B�sica");
		sig.cadastrarProfessorNaDisciplina(0, 679, "F�sica");
		
		String expected = "Professor: Augusto - Tempo de Casa: 3\n" + 
				"Alocado nas disciplinas:\n" + 
				"C�digo: 735 - Disciplina: Matem�tica B�sica\n" + 
				"C�digo: 679 - Disciplina: F�sica\n";
		
		assertEquals(expected, sig.consultarInfoProfessor(0));
	}
	
	@Test
	void testAdminSIG() {
		sig.cadastrarEventosAdmin(TipoEvento.ENTREVISTA, "30-12-2019");
		sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "12-12-2019");
		sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "15-12-2019");
		
		String expected = "Eventos da Diretoria: \n" + 
				"Evento: Entrevista - Data: 30-12-2019\n" + 
				"Evento: Reuni�o - Data: 12-12-2019\n" + 
				"Evento: Reuni�o - Data: 15-12-2019\n";
		
		assertEquals(expected, sig.listarEventosAdmin());
	}
	
	@Test
	void testAlmoxarifadoSIG() {
		sig.inserirNoEstoque("Desinfetante", 120);
		sig.inserirNoEstoque("Feij�o", 30);
		sig.inserirNoEstoque("Leite em P�", 8);
		
		String expected = "Estoque dos produtos:\n" + 
				"Produto: Desinfetante - Quantidade: 120\n" + 
				"Produto: Feij�o - Quantidade: 30\n" + 
				"Produto: Leite em P� - Quantidade: 8\n";

		assertEquals(expected, sig.consultarEstoque());
		
		sig.realizarPedido("Shampoo Dove", 24);
		sig.realizarPedido("Cerveja Itaipava", 300);
		sig.realizarPedido("Chocotone", 30);
		
		expected = "Lista de Pedidos:\n" + 
				"Produto: Shampoo Dove - Quantidade: 24\n" + 
				"Produto: Cerveja Itaipava - Quantidade: 300\n" + 
				"Produto: Chocotone - Quantidade: 30\n";
		
		assertEquals(expected, sig.consultarListaPedidos());
	}
	
	@Test
	void testFinanceiroSIG() {
		sig.novaFolhaDePagamento("Dezembro/2019");
		sig.adicionarFuncionarioAFolha(0, "Jos� Alves", 1550);
		sig.adicionarFuncionarioAFolha(0, "Maria Madalena", 2200);
		sig.adicionarFuncionarioAFolha(0, "Batista", 1100);
		
		String expected = "Folha de Pagamento do m�s de Dezembro/2019\n" + 
				"Funcion�rio: Jos� Alves - Sal�rio: 1550,00\n" + 
				"Funcion�rio: Maria Madalena - Sal�rio: 2200,00\n" + 
				"Funcion�rio: Batista - Sal�rio: 1100,00\n";

		assertEquals(expected, sig.consultarFolhaDePagamento(0));
		
		sig.novoBalanco("Novembro");
		sig.adicionarContaBalanco(0, "�gua", 59.50);
		sig.adicionarContaBalanco(0, "Energia", 231.00);
		sig.adicionarContaBalanco(0, "Internet", 119.90);
		sig.adicionarContaBalanco(0, "Combust�vel", 550.00);
		
		expected = "Contas do m�s de Novembro\n" + 
				"Conta: �gua - Valor: 59,50\n" + 
				"Conta: Energia - Valor: 231,00\n" + 
				"Conta: Internet - Valor: 119,90\n" + 
				"Conta: Combust�vel - Valor: 550,00\n";


		assertEquals(expected, sig.consultarBalanco(0));
	}
	
	@Test
	void testAlocacaoSIG() {
		sig.alocarSala("104", "B");
		sig.alocarSala("Lab. IV", "CIAC");
		sig.alocarSala("Lab. II", "CIAC");
		
		String expected = "Salas Alocadas:\n" + 
				"Sala: 104 - Bloco: B\n" + 
				"Sala: Lab. IV - Bloco: CIAC\n" + 
				"Sala: Lab. II - Bloco: CIAC\n";
		
		assertEquals(expected, sig.consultarSalasAlocadas());
	}
}