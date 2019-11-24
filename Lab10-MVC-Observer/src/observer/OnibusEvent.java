package observer;

import java.util.EventObject;

import models.Onibus;

public class OnibusEvent extends EventObject{

	private static final long serialVersionUID = 1L;

	public OnibusEvent(Onibus source) {
		super(source);
	}
}