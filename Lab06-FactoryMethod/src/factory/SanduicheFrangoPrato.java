package factory;

import ingredientes.OvoDeGranja;
import ingredientes.PaoIntegral;
import ingredientes.PresuntoDeFrango;
import ingredientes.QueijoPrato;
import ingredientes.Tomate;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;

public class SanduicheFrangoPrato implements SanduicheIF{

	@Override
	public Pao adicionarPao() {
		return new PaoIntegral();
	}

	@Override
	public Queijo adicionarQueijo() {
		return new QueijoPrato();
	}

	@Override
	public Presunto adicionarPresunto() {
		return new PresuntoDeFrango();
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
		return "Sanduíche de Presunto de Frango e Queijo Prato";
	}
}