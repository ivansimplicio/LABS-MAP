package factory;

import interfaces.*;
import ingredientes.*;

public class Sanduiche {

	public Pao adicionarPao() {
		return new PaoFrances();
	}
	
	public Queijo adicionarQueijo() {
		return new QueijoMussarela();
	}
	
	public Presunto adicionarPresunto() {
		return new PresuntoDeFrango();
	}
	
	public Ovo adicionarOvo() {
		return new OvoDeGranja();
	}
	
	public Tomate adicionarTomate() {
		return new Tomate();
	}
	
	@Override
	public String toString() {
		return "Sanduíche Simples";
	}
}