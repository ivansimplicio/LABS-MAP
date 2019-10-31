package singleton;

import enums.TipoTriangulo;

public class TrianguloRetangulo extends Triangulo{
	
	private int hip;
	private int cat1;
	private int cat2;

	private TrianguloRetangulo() {	
	}
	
	public static Triangulo getInstance() {
		Triangulo retangulo = triangulosInstances.get(TipoTriangulo.RETANGULO);
		
		if(retangulo == null) {
			retangulo = new TrianguloRetangulo();
			triangulosInstances.put(TipoTriangulo.RETANGULO, retangulo);
		}		
		return retangulo;		
	}

	public int getHip() {
		return hip;
	}

	public void setHip(int hip) {
		this.hip = hip;
	}

	public int getCat1() {
		return cat1;
	}

	public void setCat1(int cat1) {
		this.cat1 = cat1;
	}

	public int getCat2() {
		return cat2;
	}

	public void setCat2(int cat2) {
		this.cat2 = cat2;
	}
	
	@Override
	public String toString() {
		return String.format("Triângulo Retângulo com Hip = %d, Cateto1 = %d, Cateto2 = %d", getHip(), getCat1(), getCat2());
	}
}