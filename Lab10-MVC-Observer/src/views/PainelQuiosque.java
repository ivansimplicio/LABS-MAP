package views;

import models.Onibus;
import observer.OnibusEvent;
import observer.OnibusListerner;

public class PainelQuiosque implements OnibusListerner{
	
	private String nome;
	
	public PainelQuiosque(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void assentoOcupado(OnibusEvent e) {
		exibirInfo((Onibus)e.getSource());
	}

	@Override
	public void assentoReservado(OnibusEvent e) {
		exibirInfo((Onibus)e.getSource());
	}
	
	private void exibirInfo(Onibus onibus) {
		System.out.println("========== "+getClass().getName()+" ==========");
		System.out.println("========== "+getNome()+" ==========");
		System.out.println(onibus.toString());
	}
}