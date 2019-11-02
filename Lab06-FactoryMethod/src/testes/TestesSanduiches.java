package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import factory.*;
import ingredientes.*;
import interfaces.Ingrediente;

public class TestesSanduiches {

	private Sanduiche sanduiche;
	
	public void testaSanduicheSimples() {
		
		sanduiche = new Sanduiche();
		
		Ingrediente expected = new PaoFrances();
		assertEquals(expected.getString(), sanduiche.adicionarPao().getString());
		
		expected = new PresuntoDeFrango();
		assertEquals(expected.getString(), sanduiche.adicionarPresunto().getString());
		
		expected = new QueijoMussarela();
		assertEquals(expected.getString(), sanduiche.adicionarQueijo().getString());
		
		expected = new OvoDeGranja();
		assertEquals(expected.getString(), sanduiche.adicionarOvo().getString());
		
		expected = new Tomate();
		assertEquals(expected.getString(), sanduiche.adicionarTomate().getString());
	}
	
	@Test
	public void testaSanduicheFrangoCheddar(){
		
		sanduiche = new SanduicheFrangoCheddar();
		
		Ingrediente expected = new PaoBola();
		assertEquals(expected.getString(), sanduiche.adicionarPao().getString());
		
		expected = new PresuntoDeFrango();
		assertEquals(expected.getString(), sanduiche.adicionarPresunto().getString());
		
		expected = new QueijoCheddar();
		assertEquals(expected.getString(), sanduiche.adicionarQueijo().getString());
		
		expected = new OvoDeCapoeira();
		assertEquals(expected.getString(), sanduiche.adicionarOvo().getString());
		
		expected = new Tomate();
		assertEquals(expected.getString(), sanduiche.adicionarTomate().getString());
	}
	
	@Test
	public void testaSanduicheFrangoPrato(){
		
		sanduiche = new SanduicheFrangoPrato();
		
		Ingrediente expected = new PaoIntegral();
		assertEquals(expected.getString(), sanduiche.adicionarPao().getString());
		
		expected = new PresuntoDeFrango();
		assertEquals(expected.getString(), sanduiche.adicionarPresunto().getString());
		
		expected = new QueijoPrato();
		assertEquals(expected.getString(), sanduiche.adicionarQueijo().getString());
		
		expected = new OvoDeGranja();
		assertEquals(expected.getString(), sanduiche.adicionarOvo().getString());
		
		expected = new Tomate();
		assertEquals(expected.getString(), sanduiche.adicionarTomate().getString());
	}
	
	@Test
	public void testaSanduichePeruMussarela(){
		
		sanduiche = new SanduichePeruMussarela();
		
		Ingrediente expected = new PaoFrances();
		assertEquals(expected.getString(), sanduiche.adicionarPao().getString());
		
		expected = new PresuntoDePeru();
		assertEquals(expected.getString(), sanduiche.adicionarPresunto().getString());
		
		expected = new QueijoMussarela();
		assertEquals(expected.getString(), sanduiche.adicionarQueijo().getString());
		
		expected = new OvoDeCapoeira();
		assertEquals(expected.getString(), sanduiche.adicionarOvo().getString());
		
		expected = new Tomate();
		assertEquals(expected.getString(), sanduiche.adicionarTomate().getString());
	}
}