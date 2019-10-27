package ingredientes;

import interfaces.Queijo;

public class QueijoCheddar implements Queijo{

	@Override
	public String getString() {
		return "Uma fatia de Queijo Cheddar";
	}
}