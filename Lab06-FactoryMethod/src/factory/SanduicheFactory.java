package factory;

import java.util.ArrayList;
import java.util.List;

public class SanduicheFactory{
	
	private static SanduicheIF sanduiche;
	private List<String> ingredientes = new ArrayList<String>();
	
	public static SanduicheFactory criarSanduicheFrangoCheddar() {
		sanduiche = new SanduicheFrangoCheddar();
		return new SanduicheFactory();
	}
	
	public static SanduicheFactory criarSanduicheFrangoPrato() {
		sanduiche = new SanduicheFrangoPrato();
		return new SanduicheFactory();
	}
	
	public static SanduicheFactory criarSanduichePeruMussarela() {
		sanduiche = new SanduichePeruMussarela();
		return new SanduicheFactory();
	}
	
	public void montarSanduiche() {
		ingredientes.add(sanduiche.adicionarPao().getString());
		ingredientes.add(sanduiche.adicionarQueijo().getString());
		ingredientes.add(sanduiche.adicionarPresunto().getString());
		ingredientes.add(sanduiche.adicionarOvo().getString());
		ingredientes.add(sanduiche.adicionarTomate().getString());
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder(sanduiche.toString());
		string.append("\nLista de Ingredientes:\n");
		for(int i = 0; i < ingredientes.size(); i++) {
			string.append(ingredientes.get(i)+"\n");
		}
		return string.toString();
	}
}