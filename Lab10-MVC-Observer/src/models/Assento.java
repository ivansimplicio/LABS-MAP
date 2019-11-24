package models;

import enums.Status;

public class Assento {
	
	private Status status;
	private int numeracao;
	
	public Assento(int numeracao, Status status) {
		this.numeracao = numeracao;
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getNumeracao() {
		return numeracao;
	}
	
	@Override
	public String toString() {
		return String.format("Assento: %02d - Status: %s\n", getNumeracao(), getStatus().getStatus());
	}
}