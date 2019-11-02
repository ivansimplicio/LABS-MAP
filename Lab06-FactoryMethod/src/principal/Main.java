package principal;

import factory.SanduicheFactory;

public class Main {

	public static void main(String[] args) {
		
		SanduicheFactory.criarSanduicheSimples();
		SanduicheFactory.montarSanduiche();
		System.out.println(SanduicheFactory.getString());
		
		SanduicheFactory.criarSanduicheFrangoCheddar();
		SanduicheFactory.montarSanduiche();
		System.out.println(SanduicheFactory.getString());
		
		SanduicheFactory.criarSanduicheFrangoPrato();
		SanduicheFactory.montarSanduiche();
		System.out.println(SanduicheFactory.getString());
		
		SanduicheFactory.criarSanduichePeruMussarela();
		SanduicheFactory.montarSanduiche();
		System.out.println(SanduicheFactory.getString());
	}
}