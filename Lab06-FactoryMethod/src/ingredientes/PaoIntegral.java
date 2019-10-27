package ingredientes;

import interfaces.Pao;

public class PaoIntegral implements Pao{

	@Override
	public String getString() {
		return "Duas fatias de Pão Integral";
	}
}