package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.OnibusController;
import enums.Status;
import models.Assento;
import models.Onibus;

class TestOnibusController {
	
	private Onibus onibus;
	private OnibusController controller;
	private static final String ID_ONIBUS = "303";
	private static final int LOTACAO_MAX = 5;

	@BeforeEach
	void init(){
		onibus = new Onibus(ID_ONIBUS, LOTACAO_MAX);
		controller = new OnibusController(onibus);
	}

	@Test
	void testLotacaoInicial() {
		int expected = 0;
		assertEquals(expected, onibus.getLotacao());
	}
	
	@Test
	void testLotacao() throws Exception {
		controller.comprarPassagem();
		controller.reservarPassagem();
		int expected = 2;
		assertEquals(expected, onibus.getLotacao());
	}
	
	@Test
	void testEstaLotado() throws Exception {
		for(int i=0; i<LOTACAO_MAX; i++) {
			controller.comprarPassagem();
		}
		assertTrue(onibus.estaLotado());
	}
	
	@Test
	void testLotacaoExcecao(){
		assertThrows(Exception.class, () -> {
			for(int i=0; i<LOTACAO_MAX+1; i++) {
				controller.comprarPassagem();
			}
		});
	}
	
	@Test
	void testQndAssentos() {
		int expected = LOTACAO_MAX;
		assertEquals(expected, onibus.getQntAssentos());
	}
	
	@Test
	void testDisposicaoInicial() {
		Status expected = Status.DISPONIVEL;
		for(Assento assento : onibus.getAssentos()) {
			assento.getStatus().equals(expected);
		}
	}
	
	@Test
	void testDisposicao() throws Exception {
		Status[] status = {Status.INDISPONIVEL, Status.RESERVADO, Status.RESERVADO, Status.INDISPONIVEL, Status.DISPONIVEL};
		controller.comprarPassagem();
		controller.reservarPassagem();
		controller.reservarPassagem();
		controller.comprarPassagem();
		Assento[] assentos = onibus.getAssentos();
		for(int i=0; i<onibus.getLotacao(); i++) {
			assertEquals(assentos[i].getStatus(), status[i]);
		}
	}
	
	@Test
	void testListagem() throws Exception {
		controller.comprarPassagem();
		controller.reservarPassagem();
		controller.reservarPassagem();
		controller.comprarPassagem();
		
		String expected = "Assento: 01 - Status: Indisponível\n" + 
				"Assento: 02 - Status: Reservado\n" + 
				"Assento: 03 - Status: Reservado\n" + 
				"Assento: 04 - Status: Indisponível\n" + 
				"Assento: 05 - Status: Disponível\n";

		assertEquals(expected, onibus.listaAssentos());
	}
	
	@Test
	void testToString() throws Exception {
		controller.comprarPassagem();
		controller.reservarPassagem();
		controller.reservarPassagem();
		controller.comprarPassagem();
		
		String expected = "Ônibus: 303\n" + 
				"Capacidade: 5\n" + 
				"Lotação: 4\n" + 
				"Status dos assentos:\n" + 
				"Assento: 01 - Status: Indisponível\n" + 
				"Assento: 02 - Status: Reservado\n" + 
				"Assento: 03 - Status: Reservado\n" + 
				"Assento: 04 - Status: Indisponível\n" + 
				"Assento: 05 - Status: Disponível\n";
		
		assertEquals(expected, onibus.toString());
	}
}