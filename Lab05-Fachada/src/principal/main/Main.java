package principal.main;

import principal.sig.SIG;
import setor.administrativo.Evento.TipoEvento;

public class Main {
	
	public static void main(String[] args) {
		SIG sig = new SIG();
		
		//MANIPULAÇÃO DAS INFORMAÇÕES DOS ALUNOS
		sig.matricularAluno("Ivan", "Computação");
		sig.matricularAlunoNaDisciplina(0, 123, "MAP");
		sig.matricularAlunoNaDisciplina(0, 432, "Álgebra");
		sig.adicionarAoHistoricoDoAluno(0, 567, "Cálculo");
		sig.adicionarAoHistoricoDoAluno(0, 789, "Geometria");
		System.out.println(sig.consultarAlunoRDM(0));
		System.out.println(sig.consultarAlunoHistorico(0));
		
		//MANIPULAÇÃO DAS INFORMAÇÕES DOS PROFESSORES
		sig.matricularProfessor("José Belarmino", 6);
		sig.cadastrarProfessorNaDisciplina(0, 735, "Algoritmos");
		sig.cadastrarProfessorNaDisciplina(0, 679, "Banco de Dados");
		System.out.println(sig.consultarInfoProfessor(0));
		
		//MANIPULAÇÃO DAS INFORMAÇÕES ADMINISTRATIVAS
		sig.cadastrarEventosAdmin(TipoEvento.ENTREVISTA, "30-12-2019");
		sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "12-12-2019");
		sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "15-12-2019");
		System.out.println(sig.listarEventosAdmin());
		
		//MANIPULAÇÃO DAS INFORMAÇÕES DO ALMOXARIFADO
		sig.inserirNoEstoque("Sabão Ypê", 240);
		sig.inserirNoEstoque("Arroz Tio João", 180);
		sig.inserirNoEstoque("Café São Braz", 60);
		System.out.println(sig.consultarEstoque());
		
		sig.realizarPedido("Creme Dental Colgate", 100);
		sig.realizarPedido("Fralda Pampers", 24);
		sig.realizarPedido("Panetone Cacau Show", 60);
		System.out.println(sig.consultarListaPedidos());
		
		//MANIPULAÇÃO DAS INFORMAÇÕES DO FINANCEIRO
		sig.novaFolhaDePagamento("Janeiro");
		sig.adicionarFuncionarioAFolha(0, "Sebastião", 1200);
		sig.adicionarFuncionarioAFolha(0, "Madalena", 1500);
		sig.adicionarFuncionarioAFolha(0, "Maria", 998);
		System.out.println(sig.consultarFolhaDePagamento(0));
		
		sig.novoBalanco("Novembro");
		sig.adicionarContaBalanco(0, "Água", 39.99);
		sig.adicionarContaBalanco(0, "Energia", 129.00);
		sig.adicionarContaBalanco(0, "Internet", 89.90);
		sig.adicionarContaBalanco(0, "Combustível", 450.00);
		System.out.println(sig.consultarBalanco(0));
		
		//MANIPULAÇÃO DAS INFORMAÇÕES DE INFRA-ESTRUTURA
		sig.alocarSala("104", "B");
		sig.alocarSala("Lab. IV", "CIAC");
		sig.alocarSala("Lab. II", "CIAC");
		System.out.println(sig.consultarSalasAlocadas());
	}
}