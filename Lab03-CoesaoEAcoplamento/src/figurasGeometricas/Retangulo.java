package figurasGeometricas;

public class Retangulo implements FiguraGeometrica{
	
	private int altura;
	private int largura;
	
	public Retangulo(int altura, int largura) throws ValorInvalidoException {
		setAltura(altura);
		setLargura(largura);
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) throws ValorInvalidoException {
		if(altura > 0) {
			this.altura = altura;
		}else {
			throw new ValorInvalidoException();
		}		
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
		return (altura*largura);
	}

	@Override
	public int calcularPerimetro() {
		return (2*altura) + (2*largura);
	}
	
	@Override
	public String toString() {
		return String.format("O retângulo criado tem altura de tamanho = %d, e largura de tamanho = %d", getAltura(), getLargura());
	}
}