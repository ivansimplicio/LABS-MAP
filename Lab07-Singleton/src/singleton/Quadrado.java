package singleton;

public class Quadrado implements FiguraGeometrica{
	
	private int tamLados;
	
	private Quadrado() {
	}
	
	public static Quadrado getInstance() {
		return new Quadrado();
	}
	
	public void setTamLados(int tamLados) {
		this.tamLados = tamLados;
	}
	
	public int getTamLados() {
		return this.tamLados;
	}
	
	@Override
	public String toString() {
		return "Quadrado com tamanho dos lados = "+getTamLados();
	}
}