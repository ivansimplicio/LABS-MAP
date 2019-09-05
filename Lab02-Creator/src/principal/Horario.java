package principal;

import enums.*;

public class Horario {
	
	private Dia diaDaSemana;
	private Hora horarioDaAula;
	
	public Horario(Dia dia, Hora hora){
		this.diaDaSemana = dia;
		this.horarioDaAula = hora;
	}
	
	@Override
	public boolean equals(Object obj) {
		Horario h = (Horario) obj;
		
		return diaDaSemana.getDia().equals(h.diaDaSemana.getDia()) && horarioDaAula.getHora().equals(h.horarioDaAula.getHora());
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s", diaDaSemana.getDia(), horarioDaAula.getHora());
	}
}