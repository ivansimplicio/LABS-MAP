package principal;

public class Disciplina {
	
	private String codigo;
	private String descricao;
	
	public Disciplina(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
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
	
	@Override
	public String toString() {
		return String.format("Código: %s\nDisciplina: %s", getCodigo(), getDescricao());
	}
}