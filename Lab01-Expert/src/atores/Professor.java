package atores;

public class Professor extends Usuario{

	private Double salario;
	
	public Professor(String matricula, String nome, Double salario) {
		super(matricula, nome);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public boolean equals(Object professor) {
		Professor prof = (Professor) professor;
		return super.equals(professor) && getSalario().equals(prof.getSalario());
	}
	
	@Override
	public String toString() {
		return String.format("Dados do Professor: \n%sSalário: R$ %.2f\n", super.toString(), getSalario());
	}
}