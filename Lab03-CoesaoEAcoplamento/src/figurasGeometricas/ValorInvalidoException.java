package figurasGeometricas;

public class ValorInvalidoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ValorInvalidoException() {
		super("O valor passado n�o pode ser menor ou igual a zero!");
	}
}