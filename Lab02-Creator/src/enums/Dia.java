package enums;

public enum Dia {
	
	SEGUNDA("Segunda"),
	TERÇA("Terça"),
	QUARTA("Quarta"),
	QUINTA("Quinta"),
	SEXTA("Sexta");
	
	private String dia;
	
	Dia(String dia){
		this.dia = dia;
	}
	
	public String getDia() {
		return this.dia;
	}
}