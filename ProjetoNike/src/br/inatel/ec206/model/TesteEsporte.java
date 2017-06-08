package br.inatel.ec206.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteEsporte {

	@Test
	public void testGettersESetters()
	{
		Esporte esporte = new Esporte();
		esporte.setID_Esporte(1);
		esporte.setNome_Esporte("Ping Pong");
		
		
		assertEquals(1, esporte.getID_Esporte());
		assertEquals("Ping Pong", esporte.getNome_Esporte());
	}

}
