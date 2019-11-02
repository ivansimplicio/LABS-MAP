package factory;

import java.util.ArrayList;
import java.util.List;

public class SanduicheFactory{
	
	private static Sanduiche sanduiche;
	private static List<String> ingredientes = new ArrayList<String>();
	
	public static void criarSanduicheSimples() {
		sanduiche = new Sanduiche();
	}
	
	public static void criarSanduicheFrangoCheddar() {
		sanduiche = new SanduicheFrangoCheddar();
	}
	
	public static void criarSanduicheFrangoPrato() {
		sanduiche = new SanduicheFrangoPrato();
	}
	
	public static void criarSanduichePeruMussarela() {
		sanduiche = new SanduichePeruMussarela();
	}
	
	public static void montarSanduiche() {
		ingredientes.clear();
		ingredientes.add(sanduiche.adicionarPao().getString());
		ingredientes.add(sanduiche.adicionarQueijo().getString());
		ingredientes.add(sanduiche.adicionarPresunto().getString());
		ingredientes.add(sanduiche.adicionarOvo().getString());
		ingredientes.add(sanduiche.adicionarTomate().getString());
	}
	
	public static String getString() {
		StringBuilder string = new StringBuilder(sanduiche.toString());
		string.append("\nLista de Ingredientes:\n");
		for(int i = 0; i < ingredientes.size(); i++) {
			string.append(ingredientes.get(i)+"\n");
		}
		return string.toString();
	}
}