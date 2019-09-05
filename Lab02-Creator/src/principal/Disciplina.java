package principal;

import java.util.ArrayList;
import java.util.List;

import atores.Aluno;
import atores.Professor;
import enums.Dia;
import enums.Hora;

public class Disciplina {
	
	private String codigo;
	private String descricao;
	private Horario horario;
	private Professor professor;
	private List<Aluno> listaAlunos;
	
	public Disciplina(String codigo, String descricao, Dia dia, Hora horario) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.horario = new Horario(dia, horario);
		listaAlunos = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
	public boolean cadastrarProfessor(Professor professor) {
		if(professor.cadastrarNovaDisciplina(this)) {
			this.professor = professor;
			return true;
		}
		return false;		
	}
	
	public boolean matricularAluno(Aluno aluno) {
		for(Aluno a : listaAlunos) {
			if(aluno.equals(a)) {
				return false;
			}
		}
		if(aluno.cadastrarNovaDisciplina(this)) {
			listaAlunos.add(aluno);
			return true;
		}
		return false;
	}
	
	public String listarAlunos() {
		StringBuilder string = new StringBuilder();
		for(Aluno aluno : listaAlunos) {
			string.append(aluno);
		}
		return string.toString();
	}
	
	public int qntAlunos() {
		return this.listaAlunos.size();
	}
	
	@Override
	public boolean equals(Object obj) {
		Disciplina disc = (Disciplina) obj;
		
		return getCodigo().equals(disc.getCodigo()) && getDescricao().equals(disc.getDescricao());
	}

	@Override
	public String toString() {
		return String.format("Código: %s\nDisciplina: %s\n", getCodigo(), getDescricao());
	}
}