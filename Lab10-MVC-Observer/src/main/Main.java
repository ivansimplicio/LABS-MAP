package main;

import controllers.OnibusController;
import models.Onibus;
import views.PainelCentral;
import views.PainelQuiosque;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Onibus onibus = new Onibus("303", 10);
		
		OnibusController controller = new OnibusController(onibus);
		PainelCentral painelCentral = new PainelCentral();
		PainelQuiosque quiosque1 = new PainelQuiosque("Quiosque do Zé");
		PainelQuiosque quiosque2 = new PainelQuiosque("Quiosque da Maria");
		
		onibus.addOnibusListerner(painelCentral);
		onibus.addOnibusListerner(quiosque1);
		onibus.addOnibusListerner(quiosque2);
		
		controller.reservarPassagem();
		controller.comprarPassagem();
		controller.reservarPassagem();
		controller.reservarPassagem();
		controller.comprarPassagem();
	}
}