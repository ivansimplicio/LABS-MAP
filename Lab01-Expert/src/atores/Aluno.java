package atores;

public class Aluno extends Usuario{
	
	private String curso;
	
	public Aluno(String matricula, String nome, String curso) {
		super(matricula, nome);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public boolean equals(Object aluno) {
		Aluno al = (Aluno) aluno;
		return super.equals(aluno) && getCurso().equals(al.getCurso());
	}
	
	@Override
	public String toString() {
		return String.format("Dados do Aluno: \n%sCurso: %s\n", super.toString(), getCurso());
	}
}