package principal;

import java.util.ArrayList;
import java.util.List;

public class RDM {
	
	private List<Disciplina> disciplinas;
	
	public RDM() {
		disciplinas = new ArrayList<>();
	}
	
	public boolean cadastrarDisciplina(Disciplina disc) {
		for(Disciplina d : disciplinas) {
			if(disc.equals(d) || disc.getHorario().equals(d.getHorario())) {
				return false;
			}
		}
		disciplinas.add(disc);
		return true;
	}
	
	public String listarDisciplinas() {
		StringBuilder string = new StringBuilder();
		for(Disciplina d : disciplinas) {
			string.append(d);
		}
		return string.toString();
	}
	
	public String listarHorarios() {
		StringBuilder string = new StringBuilder();
		for(Disciplina d : disciplinas) {
			string.append(d.getHorario()+"\n");
		}
		return string.toString();
	}
}
