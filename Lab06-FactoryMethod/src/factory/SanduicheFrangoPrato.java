package factory;

import ingredientes.PaoIntegral;
import ingredientes.QueijoPrato;
import interfaces.Pao;
import interfaces.Queijo;

public class SanduicheFrangoPrato extends Sanduiche{

	@Override
	public Pao adicionarPao() {
		return new PaoIntegral();
	}

	@Override
	public Queijo adicionarQueijo() {
		return new QueijoPrato();
	}
	
	@Override
	public String toString() {
		return "Sanduíche de Presunto de Frango e Queijo Prato";
	}
}