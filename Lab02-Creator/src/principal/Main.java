package principal;

import enums.Dia;
import enums.Hora;

public class Main {
	
	public static void main(String[] args) {
		ControleAcademico ca = new ControleAcademico();
		
		ca.cadastrarDisciplina("126451", "Cálculo III", Dia.SEGUNDA, Hora.PRIMEIRA_AULA);
		ca.cadastrarDisciplina("159155", "Física Moderna", Dia.QUARTA, Hora.SEGUNDA_AULA);
		ca.cadastrarDisciplina("894121", "Metodologia Científica", Dia.TERÇA, Hora.PRIMEIRA_AULA);
		ca.cadastrarDisciplina("412123", "Banco de Dados", Dia.SEXTA, Hora.SEGUNDA_AULA);
		
		ca.cadastrarProfessor("111", "Antônio", 2300.00);
		ca.cadastrarProfessor("222", "Maria Madalena", 5200.00);
		ca.cadastrarProfessor("333", "Carlos Alberto", 3100.00);
		
		ca.cadastrarAluno("11111", "Ivan", "Computação");
		ca.cadastrarAluno("22222", "Viviane", "Computação");
		ca.cadastrarAluno("33333", "José", "Matemática");
		ca.cadastrarAluno("44444", "Sebastião", "Física");
		ca.cadastrarAluno("55555", "Maria", "Química");
		ca.cadastrarAluno("66666", "Michelle", "Estatística");
		
		ca.cadastrarProfessorNaDisciplina(0, 0);
		ca.cadastrarProfessorNaDisciplina(1, 1);
		ca.cadastrarProfessorNaDisciplina(2, 2);
		ca.cadastrarProfessorNaDisciplina(0, 3);
		
		System.out.println(ca.getProfessor(0).getRDM().listarDisciplinas());
		System.out.println(ca.getProfessor(0).getRDM().listarHorarios());
		System.out.println(ca.getProfessor(1).getRDM().listarDisciplinas());
		System.out.println(ca.getProfessor(1).getRDM().listarHorarios());
		System.out.println(ca.getProfessor(2).getRDM().listarDisciplinas());
		System.out.println(ca.getProfessor(2).getRDM().listarHorarios());
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		ca.cadastrarAlunoNaDisciplina(0, 0);
		ca.cadastrarAlunoNaDisciplina(0, 1);
		ca.cadastrarAlunoNaDisciplina(1, 1);
		ca.cadastrarAlunoNaDisciplina(1, 2);
		ca.cadastrarAlunoNaDisciplina(1, 3);
		ca.cadastrarAlunoNaDisciplina(2, 1);
		ca.cadastrarAlunoNaDisciplina(3, 0);
		ca.cadastrarAlunoNaDisciplina(4, 2);
		ca.cadastrarAlunoNaDisciplina(4, 3);
		ca.cadastrarAlunoNaDisciplina(5, 0);
		ca.cadastrarAlunoNaDisciplina(5, 1);
		ca.cadastrarAlunoNaDisciplina(5, 2);
		
		System.out.println(ca.getAluno(0).getRDM().listarDisciplinas());
		System.out.println(ca.getAluno(0).getRDM().listarHorarios());
		System.out.println(ca.getAluno(1).getRDM().listarDisciplinas());
		System.out.println(ca.getAluno(1).getRDM().listarHorarios());
		System.out.println(ca.getAluno(2).getRDM().listarDisciplinas());
		System.out.println(ca.getAluno(2).getRDM().listarHorarios());
		System.out.println(ca.getAluno(3).getRDM().listarDisciplinas());
		System.out.println(ca.getAluno(3).getRDM().listarHorarios());
		System.out.println(ca.getAluno(4).getRDM().listarDisciplinas());
		System.out.println(ca.getAluno(4).getRDM().listarHorarios());
		System.out.println(ca.getAluno(5).getRDM().listarDisciplinas());
		System.out.println(ca.getAluno(5).getRDM().listarHorarios());
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println(ca.getDisciplina(0).listarAlunos());
		System.out.println("Número de alunos: "+ca.getDisciplina(0).qntAlunos()+"\n\n");
		System.out.println(ca.getDisciplina(1).listarAlunos());
		System.out.println("Número de alunos: "+ca.getDisciplina(1).qntAlunos()+"\n\n");
		System.out.println(ca.getDisciplina(2).listarAlunos());
		System.out.println("Número de alunos: "+ca.getDisciplina(2).qntAlunos()+"\n\n");
		System.out.println(ca.getDisciplina(3).listarAlunos());
		System.out.println("Número de alunos: "+ca.getDisciplina(3).qntAlunos()+"\n\n");
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
}