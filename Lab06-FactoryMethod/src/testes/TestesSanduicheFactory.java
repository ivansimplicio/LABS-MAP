package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import factory.SanduicheFactory;

class TestesSanduicheFactory {
	
	private String expected;
	
	@Test
	public void testSanduicheSimplesFactory() {
		SanduicheFactory.criarSanduicheSimples();
		SanduicheFactory.montarSanduiche();
		
		expected = "Sanduíche Simples\n" + 
				"Lista de Ingredientes:\n" + 
				"Duas fatias de Pão Francês\n" + 
				"Uma fatia de Queijo Mussarela\n" + 
				"Uma fatia de Presunto de Frango\n" + 
				"Um ovo de Granja\n" + 
				"Tomate\n";
		assertEquals(expected, SanduicheFactory.getString());
	}
	
	@Test
	public void testSanduicheFrangoCheddarFactory() {
		SanduicheFactory.criarSanduicheFrangoCheddar();
		SanduicheFactory.montarSanduiche();
		
		expected = "Sanduíche de Presunto de Frango e Queijo Cheddar\n" + 
				"Lista de Ingredientes:\n" + 
				"Duas fatias de Pão Bola\n" + 
				"Uma fatia de Queijo Cheddar\n" + 
				"Uma fatia de Presunto de Frango\n" + 
				"Um ovo de Capoeira\n" + 
				"Tomate\n";
		assertEquals(expected, SanduicheFactory.getString());
	}
	
	@Test
	public void testSanduicheFrangoPratoFactory() {
		SanduicheFactory.criarSanduicheFrangoPrato();
		SanduicheFactory.montarSanduiche();
		
		expected = "Sanduíche de Presunto de Frango e Queijo Prato\n" + 
				"Lista de Ingredientes:\n" + 
				"Duas fatias de Pão Integral\n" + 
				"Uma fatia de Queijo Prato\n" + 
				"Uma fatia de Presunto de Frango\n" + 
				"Um ovo de Granja\n" + 
				"Tomate\n";
		assertEquals(expected, SanduicheFactory.getString());
	}
	
	@Test
	public void testSanduichePeruMussarelaFactory() {
		SanduicheFactory.criarSanduichePeruMussarela();
		SanduicheFactory.montarSanduiche();
		
		expected = "Sanduíche de Presunto de Peru e Queijo Mussarela\n" + 
				"Lista de Ingredientes:\n" + 
				"Duas fatias de Pão Francês\n" + 
				"Uma fatia de Queijo Mussarela\n" + 
				"Uma fatia de Presunto de Peru\n" + 
				"Um ovo de Capoeira\n" + 
				"Tomate\n";
		assertEquals(expected, SanduicheFactory.getString());
	}
}