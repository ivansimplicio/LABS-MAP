package singleton;

import enums.TipoTriangulo;

public class TrianguloIsosceles extends Triangulo{
	
	private int lados;
	private int base;
	
	private TrianguloIsosceles() {	
	}
	
	public static Triangulo getInstance() {
		Triangulo isosceles = triangulosInstances.get(TipoTriangulo.ISOSCELES);
		
		if(isosceles == null) {
			isosceles = new TrianguloIsosceles();
			triangulosInstances.put(TipoTriangulo.ISOSCELES, isosceles);
		}		
		return isosceles;		
	}
	
	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	@Override
	public String toString() {
		return String.format("Triângulo Isosceles com lados = %d e base = %d", getLados(), getBase());
	}
}