package factory;

import ingredientes.OvoDeGranja;
import ingredientes.PaoFrances;
import ingredientes.PresuntoDePeru;
import ingredientes.QueijoMussarela;
import ingredientes.Tomate;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;

public class SanduichePeruMussarela implements SanduicheIF {

	@Override
	public Pao adicionarPao() {
		return new PaoFrances();
	}

	@Override
	public Queijo adicionarQueijo() {
		return new QueijoMussarela();
	}

	@Override
	public Presunto adicionarPresunto() {
		return new PresuntoDePeru();
	}

	@Override
	public Ovo adicionarOvo() {
		return new OvoDeGranja();
	}

	@Override
	public Tomate adicionarTomate() {
		return new Tomate();
	}
	
	@Override
	public String toString() {
		return "Sanduíche de Presunto de Peru e Queijo Mussarela";
	}
}