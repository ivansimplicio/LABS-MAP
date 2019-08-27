package principal;

import java.util.ArrayList;
import java.util.List;

import atores.Aluno;
import atores.Professor;

public class ControleAcademico {
	
	private List<Turma> turmas;
	
	public ControleAcademico() {
		turmas = new ArrayList<>();
	}
	
	public void criarTurma(Turma turma) {
		turmas.add(turma);
	}
	
	public Turma getTurma(int index) {
		return turmas.get(index);
	}
	
	public void listarTurmas() {
		System.out.println("Lista de todas as turmas:");
		for(Turma t : turmas) {
			System.out.println(t);
		}
	}
	
	public void horariosProfessor(Professor prof) {
		System.out.println("Horários do professor: "+prof.getNome());
		for(Turma t : this.turmas) {
			if(t.getProf().equals(prof)) {
				System.out.println(t.getHorario());
			}
		}
	}
	
	public void horariosAluno(Aluno aluno) {
		System.out.println("Horários do aluno: "+aluno.getNome());
		for(Turma t : this.turmas) {
			if(t.getAlunos().contains(aluno)) {
				System.out.println(t.getHorario());
			}
		}
	}
	
	public void disciplinasProfessor(Professor prof) {
		System.out.println("Disciplinas do professor: "+prof.getNome());
		for(Turma t : this.turmas) {
			if(t.getProf().equals(prof)) {
				System.out.println(t.getDisc());
			}
		}
	}
	
	public void disciplinasAluno(Aluno aluno) {
		System.out.println("Disciplinas do aluno: "+aluno.getNome());
		for(Turma t : this.turmas) {
			if(t.getAlunos().contains(aluno)) {
				System.out.println(t.getDisc());
			}
		}
	}
}