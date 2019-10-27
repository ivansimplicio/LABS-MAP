package factory;

import interfaces.*;
import ingredientes.*;

public interface SanduicheIF {

	public Pao adicionarPao();
	
	public Queijo adicionarQueijo();
	
	public Presunto adicionarPresunto();
	
	public Ovo adicionarOvo();
	
	public Tomate adicionarTomate();
}