package ingredientes;

import interfaces.Queijo;

public class QueijoMussarela implements Queijo{

	@Override
	public String getString() {
		return "Uma fatia de Queijo Mussarela";
	}
}