package observer;

import java.util.EventListener;

public interface OnibusListerner extends EventListener{
	
	void assentoOcupado(OnibusEvent e);
	
	void assentoReservado(OnibusEvent e);

}