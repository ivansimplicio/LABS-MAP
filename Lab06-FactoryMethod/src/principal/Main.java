package principal;

import factory.SanduicheFactory;

public class Main {

	public static void main(String[] args) {
		
		SanduicheFactory sanduiche = SanduicheFactory.criarSanduicheFrangoCheddar();
		sanduiche.montarSanduiche();
		System.out.println(sanduiche);
		
		sanduiche = SanduicheFactory.criarSanduicheFrangoPrato();
		sanduiche.montarSanduiche();
		System.out.println(sanduiche);
		
		sanduiche = SanduicheFactory.criarSanduichePeruMussarela();
		sanduiche.montarSanduiche();
		System.out.println(sanduiche);
	}
}