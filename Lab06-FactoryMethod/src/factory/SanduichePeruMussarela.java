package factory;

import ingredientes.OvoDeCapoeira;
import ingredientes.PresuntoDePeru;
import interfaces.Ovo;
import interfaces.Presunto;

public class SanduichePeruMussarela extends Sanduiche {

	@Override
	public Presunto adicionarPresunto() {
		return new PresuntoDePeru();
	}

	@Override
	public Ovo adicionarOvo() {
		return new OvoDeCapoeira();
	}
	
	@Override
	public String toString() {
		return "Sanduíche de Presunto de Peru e Queijo Mussarela";
	}
}