package enums;

public enum Dia {
	
	SEGUNDA("Segunda"),
	TER�A("Ter�a"),
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