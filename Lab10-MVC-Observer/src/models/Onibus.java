package models;

import java.util.ArrayList;
import java.util.Collection;

import enums.Status;
import observer.OnibusEvent;
import observer.OnibusListerner;

public class Onibus {
	
	private String id;
	private Assento[] assentos;
	private int lotacao;
	
	private Collection<OnibusListerner> onibusListeners;
	
	public Onibus(String id, int capacidadeMax) {
		this.id = id;
		onibusListeners = new ArrayList<OnibusListerner>();
		inicializar(capacidadeMax);
	}
	
	private void inicializar(int capacidadeMax) {
		assentos = new Assento[capacidadeMax];
		for(int i = 0; i < assentos.length; i++) {
			assentos[i] = new Assento(i+1, Status.DISPONIVEL);
		}
	};
	
	public String getID() {
		return this.id;
	}
	
	public int getLotacao() {
		return this.lotacao;
	}
	
	public Assento[] getAssentos() {
		return this.assentos;
	}
	
	public int getQntAssentos() {
		return assentos.length;
	}
	
	public void reservarAssento() throws Exception {
		if(!estaLotado()) {
			Assento assento = procurarAssentoDisponivel();
			assento.setStatus(Status.RESERVADO);
			incrementaLocatao();
		}else {
			throw new Exception("O ônibus está lotado!");
		}
		disparaAssentoReservado();
	}
	
	public void ocuparAssento() throws Exception{
		if(!estaLotado()) {
			Assento assento = procurarAssentoDisponivel();
			assento.setStatus(Status.INDISPONIVEL);
			incrementaLocatao();
		}else {
			throw new Exception("O ônibus está lotado!");
		}
		disparaAssentoOcupado();
	}
	
	private void incrementaLocatao() {
		this.lotacao++;
	}
	
	public boolean estaLotado() {
		return getLotacao() == assentos.length;
	}
	
	private Assento procurarAssentoDisponivel() {
		for(Assento assento : assentos) {
			if(assento.getStatus() == Status.DISPONIVEL) {
				return assento;
			}
		}
		return null;
	}
	
	public String listaAssentos() {
		StringBuilder listagem = new StringBuilder();
		for(Assento assento : assentos) {
			listagem.append(assento);
		}
		return listagem.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(
				String.format("Ônibus: %s\nCapacidade: %d\nLotação: %d\n", getID(), assentos.length, getLotacao()));
		info.append("Status dos assentos:\n");
		info.append(listaAssentos());
		return info.toString();
	}
	
	public synchronized void addOnibusListerner(OnibusListerner gl) {
		if(!onibusListeners.contains(gl)) {
			onibusListeners.add(gl);
		}
	}
	
	public synchronized void removeOnibusListerner(OnibusListerner gl) {
		if(onibusListeners.contains(gl)) {
			onibusListeners.add(gl);
		}
	}
	
	private void disparaAssentoOcupado() {
		OnibusEvent event = new OnibusEvent(this);
		for(OnibusListerner listerner : onibusListeners) {
			listerner.assentoOcupado(event);
		}
	}
	
	private void disparaAssentoReservado() {
		OnibusEvent event = new OnibusEvent(this);
		for(OnibusListerner listerner : onibusListeners) {
			listerner.assentoReservado(event);
		}
	}
}