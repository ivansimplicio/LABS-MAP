package ingredientes;

import interfaces.Queijo;

public class QueijoPrato implements Queijo{

	@Override
	public String getString() {
		return "Uma fatia de Queijo Prato";
	}
}