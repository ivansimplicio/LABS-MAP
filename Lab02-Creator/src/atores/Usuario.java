package atores;

import principal.Disciplina;
import principal.RDM;

public class Usuario {
	
	private String matricula;
	private String nome;
	private RDM registro;
	
	public Usuario(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
		this.registro = new RDM();
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public RDM getRDM() {
		return this.registro;
	}
	
	public boolean cadastrarNovaDisciplina(Disciplina disc) {
		return registro.cadastrarDisciplina(disc);
	}
	
	@Override
	public boolean equals(Object usuario) {
		Usuario u = (Usuario) usuario;
		return getMatricula().equals(u.getMatricula()) && getNome().equalsIgnoreCase(u.getNome());
	}
	
	@Override
	public String toString() {
		return String.format("Matrícula: %s\nNome: %s\n", getMatricula(), getNome());
	}
}