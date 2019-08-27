package principal;

import atores.*;

public class Main {
	
	public static void main(String[] args) {
		ControleAcademico controle = new ControleAcademico();
		
		//PREENCHIMENTO DE DADOS DO SISTEMA
		
		Aluno a1 = new Aluno("11111", "Ivan", "Computação");
		Aluno a2 = new Aluno("22222", "Viviane", "Computação");
		Aluno a3 = new Aluno("33333", "José", "Matemática");
		Aluno a4 = new Aluno("44444", "Sebastião", "Física");
		Aluno a5 = new Aluno("55555", "Maria", "Química");
		Aluno a6 = new Aluno("66666", "Michelle", "Estatística");
		
		Professor p1 = new Professor("111", "Antônio", 2300.00);
		Professor p2 = new Professor("222", "Maria Madalena", 5200.00);
		Professor p3 = new Professor("333", "Carlos Alberto", 3100.00);
		
		Disciplina d1 = new Disciplina("126451", "Cálculo III");
		Disciplina d2 = new Disciplina("159155", "Física Moderna");
		Disciplina d3 = new Disciplina("894121", "Metodologia Científica");
		Disciplina d4 = new Disciplina("412123", "Banco de Dados");
		
		Turma t1 = new Turma(d1, "Terça  - 18h", "C107");
		Turma t2 = new Turma(d2, "Sexta  - 20h", "B202");
		Turma t3 = new Turma(d3, "Quarta - 16h", "A101");
		Turma t4 = new Turma(d4, "Quinta - 11h", "Lab. III");
		
		t1.setProf(p1);
		t2.setProf(p2);
		t3.setProf(p3);
		t4.setProf(p3);
		
		t1.matricularAluno(a1);
		t1.matricularAluno(a3);
		t1.matricularAluno(a5);
		
		t2.matricularAluno(a2);
		t2.matricularAluno(a4);
		t2.matricularAluno(a6);
		
		t3.matricularAluno(a1);
		t3.matricularAluno(a2);
		t3.matricularAluno(a3);
		t3.matricularAluno(a4);
		
		t4.matricularAluno(a3);
		t4.matricularAluno(a4);
		t4.matricularAluno(a5);
		t4.matricularAluno(a6);
		
		controle.criarTurma(t1);
		controle.criarTurma(t2);
		controle.criarTurma(t3);
		controle.criarTurma(t4);
		
		//TESTES DOS METODOS
		t3.listarAlunos();
		System.out.println("Numero de alunos: "+t3.quantidadeAlunos()+"\n");
		
		t1.listarAlunos();
		System.out.println("Numero de alunos: "+t1.quantidadeAlunos()+"\n");
		
		controle.disciplinasAluno(a1);
		System.out.println();
		controle.disciplinasAluno(a3);
		
		System.out.println();
		controle.disciplinasProfessor(p1);
		System.out.println();
		controle.disciplinasProfessor(p3);
		
		System.out.println();
		controle.horariosAluno(a2);
		System.out.println();
		controle.horariosAluno(a4);
		
		System.out.println();
		controle.horariosProfessor(p2);
		System.out.println();
		controle.horariosProfessor(p3);		
	}
}