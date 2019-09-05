package principal;

import java.util.ArrayList;
import java.util.List;

import atores.Aluno;
import atores.Professor;
import enums.*;

public class ControleAcademico {
	
	private List<Disciplina> listaDisciplinas;
	private List<Aluno> alunosCadastrados;
	private List<Professor> professoresCadastrados;
	
	public ControleAcademico() {
		listaDisciplinas = new ArrayList<>();
		alunosCadastrados = new ArrayList<>();
		professoresCadastrados = new ArrayList<>();
	}
	
	public boolean cadastrarDisciplina(String codigo, String descricao, Dia dia, Hora horario) {
		Disciplina disc = new Disciplina(codigo, descricao, dia, horario);
		
		for(Disciplina d : listaDisciplinas) {
			if(disc.equals(d)) {
				return false;
			}
		}
		listaDisciplinas.add(disc);
		return true;
	}
	
	public boolean cadastrarProfessor(String matricula, String nome, Double salario) {
		Professor prof = new Professor(matricula, nome, salario);
		
		for(Professor p : professoresCadastrados) {
			if(prof.equals(p)) {
				return false;
			}
		}
		professoresCadastrados.add(prof);
		return true;
	}
	
	public boolean cadastrarAluno(String matricula, String nome, String curso) {
		Aluno aluno = new Aluno(matricula, nome, curso);
		
		for(Aluno a : alunosCadastrados) {
			if(aluno.equals(a)) {
				return false;
			}
		}
		alunosCadastrados.add(aluno);
		return true;
	}
	
	public Professor getProfessor(int index) {
		return this.professoresCadastrados.get(index);
	}
	
	public Aluno getAluno(int index) {
		return this.alunosCadastrados.get(index);
	}
	
	public Disciplina getDisciplina(int index) {
		return this.listaDisciplinas.get(index);
	}
	
	public boolean cadastrarProfessorNaDisciplina(int indexProfessor, int indexDisciplina) {
		return listaDisciplinas.get(indexDisciplina).cadastrarProfessor(professoresCadastrados.get(indexProfessor));
	}
	
	public boolean cadastrarAlunoNaDisciplina(int indexAluno, int indexDisciplina) {
		return listaDisciplinas.get(indexDisciplina).matricularAluno(alunosCadastrados.get(indexAluno));
	}
}