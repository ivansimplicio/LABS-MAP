package figurasGeometricas;

public class Circulo implements FiguraGeometrica{
	
	private int raio;
	
	public Circulo(int raio) throws ValorInvalidoException {
		setRaio(raio);
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) throws ValorInvalidoException{
		if(raio > 0) {
			this.raio = raio;
		}else {
			throw new ValorInvalidoException();
		}		
	}

	@Override
	public int calcularArea() {
		return (int)(2 * Math.PI * raio);
	}

	@Override
	public int calcularPerimetro() {
		return (int)(Math.PI * raio);
	}
	
	@Override
	public String toString() {
		return String.format("O circulo criado tem raio de tamanho = %d", getRaio());
	}
}