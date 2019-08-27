package principal;

import java.util.ArrayList;
import java.util.List;

import atores.Aluno;
import atores.Professor;

public class Turma {
	
	private Disciplina disc;
	private Professor prof;
	private List<Aluno> alunos;
	private String horario;
	private String sala;
	
	public Turma(Disciplina disc, String horario, String sala) {
		this.disc = disc;
		this.horario = horario;
		this.sala = sala;
		alunos = new ArrayList<Aluno>();
	}

	public Disciplina getDisc() {
		return disc;
	}
	
	public void setDisc(Disciplina disc) {
		this.disc = disc;
	}
	
	public Professor getProf() {
		return prof;
	}
	
	public void setProf(Professor prof) {
		this.prof = prof;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String getSala() {
		return sala;
	}
	
	public void setSala(String sala) {
		this.sala = sala;
	}
	
	public List<Aluno> getAlunos(){
		return this.alunos;
	}
	
	public void listarAlunos() {
		System.out.println("Lista de alunos: "+getDisc().getDescricao()+"\n");
		for(Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
	
	public void matricularAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public int quantidadeAlunos() {
		return this.alunos.size();
	}
	
	@Override
	public String toString() {
		return String.format("Dados da turma:\nDisciplina: %s\nHorário: %s\nSala: %s\n", disc.getDescricao(), getHorario(), getSala());
	}
}