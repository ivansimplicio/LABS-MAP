package factory;

import ingredientes.OvoDeCapoeira;
import ingredientes.PaoBola;
import ingredientes.PresuntoDeFrango;
import ingredientes.QueijoCheddar;
import ingredientes.Tomate;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;

public class SanduicheFrangoCheddar implements SanduicheIF {

	@Override
	public Pao adicionarPao() {
		return new PaoBola();
	}

	@Override
	public Queijo adicionarQueijo() {
		return new QueijoCheddar();
	}

	@Override
	public Presunto adicionarPresunto() {
		return new PresuntoDeFrango();
	}

	@Override
	public Ovo adicionarOvo() {
		return new OvoDeCapoeira();
	}

	@Override
	public Tomate adicionarTomate() {
		return new Tomate();
	}
	
	@Override
	public String toString() {
		return "Sanduíche de Presunto de Frango e Queijo Cheddar";
	}
}