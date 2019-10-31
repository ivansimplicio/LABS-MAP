package principal;

import singleton.Circulo;
import singleton.Quadrado;
import singleton.Triangulo;
import singleton.TrianguloEquilatero;
import singleton.TrianguloIsosceles;
import singleton.TrianguloRetangulo;

public class Main {
	
	public static void main(String[] args) {
		
		Circulo c1 = Circulo.getInstance();
		c1.setRaio(2);
		System.out.println(c1);
		Circulo c2 = Circulo.getInstance();
		System.out.println(c2);
		
		System.out.println();
		Quadrado q1 = Quadrado.getInstance();
		q1.setTamLados(4);
		System.out.println(q1);
		
		Quadrado q2 = Quadrado.getInstance();
		System.out.println(q2);
		q2.setTamLados(10);
		System.out.println(q2);
		
		System.out.println();
		Triangulo te1 = TrianguloEquilatero.getInstance();
		((TrianguloEquilatero)te1).setTamLados(5);
		System.out.println(te1);
		
		Triangulo te2 = TrianguloEquilatero.getInstance();
		System.out.println(te2);
		System.out.println("Quantidade de triângulos instanciados: "+te1.qntInstancias());
		
		System.out.println();
		Triangulo ti1 = TrianguloIsosceles.getInstance();
		((TrianguloIsosceles)ti1).setBase(4);
		((TrianguloIsosceles)ti1).setLados(3);
		System.out.println(ti1);
		
		Triangulo ti2 = TrianguloIsosceles.getInstance();
		System.out.println(ti2);
		System.out.println("Quantidade de triângulos instanciados: "+ti1.qntInstancias());
		
		System.out.println();
		Triangulo tr1 = TrianguloRetangulo.getInstance();
		((TrianguloRetangulo)tr1).setCat1(3);
		((TrianguloRetangulo)tr1).setCat2(4);
		((TrianguloRetangulo)tr1).setHip(6);
		System.out.println(tr1);
		
		Triangulo tr2 = TrianguloRetangulo.getInstance();
		((TrianguloRetangulo)tr2).setHip(10);
		System.out.println(tr2);
		System.out.println("Quantidade de triângulos instanciados: "+tr1.qntInstancias());
	}
}