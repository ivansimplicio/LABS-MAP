package setor.academico;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private String curso;
	private List<Disciplina> rdm;
	private List<Disciplina> historico;
	
	public Aluno(String nome, String curso) {
		setNome(nome);
		setCurso(curso);
		rdm = new ArrayList<>();
		historico = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public List<Disciplina> getRDM() {
		return rdm;
	}

	public void matricularDisciplina(int cod, String disc) {
		rdm.add(new Disciplina(cod, disc));
	}

	public List<Disciplina> getHistorico() {
		return historico;
	}

	public void adicionarAoHistorico(int cod, String disc) {
		historico.add(new Disciplina(cod, disc));
	}
	
	public String consultarRDM() {
		StringBuilder string = new StringBuilder(this.toString());
		string.append("RDM - Disciplinas Matriculadas:\n");
		if(rdm.isEmpty()) {
			string.append("O aluno n�o est� matriculado em nenhuma disciplina.\n");
		}else {
			for(Disciplina disc : rdm) {
				string.append(disc);
			}
		}
		return string.toString();
	}
	
	public String consultarHistorico() {
		StringBuilder string = new StringBuilder(this.toString());
		string.append("Hist�rico de Disciplinas:\n");
		if(historico.isEmpty()) {
			string.append("Nenhuma disciplina foi cursada.\n");
		}else {
			for(Disciplina disc : historico) {
				string.append(disc);
			}
		}
		return string.toString();
	}
	
	@Override
	public String toString() {
		return String.format("Aluno: %s - Curso: %s\n", getNome(), getCurso());
	}
}