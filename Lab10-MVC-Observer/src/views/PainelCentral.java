package views;

import models.Onibus;
import observer.OnibusEvent;
import observer.OnibusListerner;

public class PainelCentral implements OnibusListerner{

	@Override
	public void assentoOcupado(OnibusEvent e) {
		listaStatusAssentos((Onibus)e.getSource());
	}

	@Override
	public void assentoReservado(OnibusEvent e) {
		listaStatusAssentos((Onibus)e.getSource());
	}
	
	private void listaStatusAssentos(Onibus onibus) {
		System.out.println("========== "+getClass().getName()+" ==========");
		System.out.println(onibus.listaAssentos());
	}
}