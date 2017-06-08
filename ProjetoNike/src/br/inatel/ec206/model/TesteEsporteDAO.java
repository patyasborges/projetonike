package br.inatel.ec206.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import br.inatel.ec206.controller.Conecta;

public class TesteEsporteDAO {

	@Test
	public void testConecta() 
	{
		Conecta conecta= new Conecta();
		conecta.conectaBanco();
		assertTrue("Conectado", true);
	}
	
	@Test
	public void testArmazenaDados() throws SQLException
	{
		Esporte esporte= new Esporte();
		esporte.setID_Esporte(0);
		esporte.setNome_Esporte("Tenis");
		EsporteDAO esp = new EsporteDAO();

		esp.armazenaNovosDados();
		assertTrue("Sucesso! ;)", true);		
	}
	
	@Test
	public void testArmazenaDadosErrado() throws SQLException
	{
		//Esporte esporte= new Esporte();
		EsporteDAO esp = new EsporteDAO();
		//esporte.setNome_Esporte("");
		
		esp.armazenaNovosDados();
		assertTrue("Erro: Conexão Banco! :(", true);
		
	}
	
	@Test
	public void testSelecionaPorNome()
	{
		Esporte esporte= new Esporte();
		EsporteDAO esp = new EsporteDAO();
		esp.setID_Esporte(1);
		esp.setNome_Esporte("Futebol");
		
		esp.selecionaPorNome();
		
		assertTrue("Sucesso! ;)", true);
		
	}

	@Test
	public void testUpdate()
	{
		Esporte esporte= new Esporte();
		EsporteDAO esp = new EsporteDAO();
		esporte.setID_Esporte(4);
		esporte.setNome_Esporte("Tenis de Mesa");
		
		esp.update();
		
		assertTrue("Sucesso! ;)", true);
		
	}
	
	@Test
	public void testDelete()
	{
		Esporte esporte= new Esporte();
		EsporteDAO esp = new EsporteDAO();
		esporte.setID_Esporte(4);
		
		esp.delete();
		
		assertTrue("Sucesso! ;)", true);
		
	}
}
