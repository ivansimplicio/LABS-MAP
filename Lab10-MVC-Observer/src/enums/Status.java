package enums;

public enum Status {
	
	DISPONIVEL("Dispon�vel"), RESERVADO("Reservado"), INDISPONIVEL("Indispon�vel");
	
	private String status;
	
	Status(String status){
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
}