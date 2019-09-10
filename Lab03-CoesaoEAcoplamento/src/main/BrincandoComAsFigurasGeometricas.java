package main;

import javax.swing.JOptionPane;

import figurasGeometricas.Circulo;
import figurasGeometricas.FiguraGeometrica;
import figurasGeometricas.Quadrado;
import figurasGeometricas.Retangulo;
import figurasGeometricas.ValorInvalidoException;

public class BrincandoComAsFigurasGeometricas {
	
	public static void main(String[] args) {
		FiguraGeometrica circulo = null;
		FiguraGeometrica quadrado = null;
		FiguraGeometrica retangulo = null;
		try {
			circulo = new Circulo(2);
			quadrado = new Quadrado(10);
			retangulo = new Retangulo(5, 4);
		}catch(ValorInvalidoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.WARNING_MESSAGE);
		}
		
		System.out.println(circulo
							+"\n Sua área é = "+circulo.calcularArea()
							+"\n Seu perímetro é = "+circulo.calcularPerimetro());
		System.out.println(quadrado
							+"\n Sua área é = "+quadrado.calcularArea()
							+"\n Seu perímetro é = "+quadrado.calcularPerimetro());
		System.out.println(retangulo
							+"\n Sua área é = "+retangulo.calcularArea()
							+"\n Seu perímetro é = "+retangulo.calcularPerimetro());
		
	}
}
