package singleton;

import java.util.HashMap;

import enums.TipoTriangulo;

public abstract class Triangulo implements FiguraGeometrica{

	protected static final HashMap<TipoTriangulo, Triangulo> triangulosInstances = new HashMap<TipoTriangulo, Triangulo>();
	
	Triangulo() {
	}
	
	public int qntInstancias() {
		return triangulosInstances.size();
	}
}