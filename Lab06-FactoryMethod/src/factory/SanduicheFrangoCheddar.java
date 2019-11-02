package factory;

import ingredientes.OvoDeCapoeira;
import ingredientes.PaoBola;
import ingredientes.QueijoCheddar;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Queijo;

public class SanduicheFrangoCheddar extends Sanduiche {

	@Override
	public Pao adicionarPao() {
		return new PaoBola();
	}

	@Override
	public Queijo adicionarQueijo() {
		return new QueijoCheddar();
	}

	@Override
	public Ovo adicionarOvo() {
		return new OvoDeCapoeira();
	}
	
	@Override
	public String toString() {
		return "Sanduíche de Presunto de Frango e Queijo Cheddar";
	}
}