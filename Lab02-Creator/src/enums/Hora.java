package enums;

public enum Hora {
	
	PRIMEIRA_AULA("18h às 20h"),
	SEGUNDA_AULA("20h às 22h");
	
	private String hora;
	
	Hora(String hora){
		this.hora = hora;
	}
	
	public String getHora() {
		return this.hora;
	}
}