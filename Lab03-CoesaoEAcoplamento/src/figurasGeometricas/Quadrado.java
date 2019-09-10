package figurasGeometricas;

public class Quadrado implements FiguraGeometrica{
	
	private int largura;
	
	public Quadrado(int largura) throws ValorInvalidoException {
		setLargura(largura);
	}	

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) throws ValorInvalidoException {
		if(largura > 0) {
			this.largura = largura;
		}else {
			throw new ValorInvalidoException();
		}		
	}

	@Override
	public int calcularArea() {
		return largura*largura;
	}

	@Override
	public int calcularPerimetro() {
		return (4 * largura);
	}
	
	@Override
	public String toString() {
		return String.format("O quadrado criado tem lados de tamanho = %d", getLargura());
	}
}