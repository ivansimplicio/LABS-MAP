package enums;

public enum Status {
	
	DISPONIVEL("Disponível"), RESERVADO("Reservado"), INDISPONIVEL("Indisponível");
	
	private String status;
	
	Status(String status){
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
}