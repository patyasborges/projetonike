package br.inatel.ec206.controller;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import org.junit.Test;

import br.inatel.ec206.view.CadastroEsporteView;

public class TesteCadEsporte {

	@Test
	public void testGetInstance() 
	{
	
		ActionEvent e = null;
		ListenerCadEsporte esp = new ListenerCadEsporte();
		
		esp.actionPerformed(e);
		e.getActionCommand();
		
		
		
	}

}
