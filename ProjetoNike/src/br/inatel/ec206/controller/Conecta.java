package br.inatel.ec206.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conecta
{
	    // Abre conexao com o Banco
		 public Connection _con = null;
		 // Recebe a resposta da consulta do banco
		 public ResultSet _rs = null;
		 // Permite o envio de comandos ESTATICOS SQL para o banco
		 public Statement _st = null;
		 // Permite o envio de comandos DINAMICOS SQL para o banco
		 public PreparedStatement _pst = null;
		 // String indicando com qual schema havera conexao
		 // Obs: Cada driver possui uma sintaxe diferente para a url
		 
		String _url = "jdbc:mysql://localhost:3306/projeto_nike"; 
		
		
		// Usuario do Banco
		 String _user = "root";
		 // Senha do Banco
		 String _password = "root";
		 
		 public void alteraBanco(String sql){
		  		
		     try {
		                _st = _con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		                _rs = _st.executeQuery(sql); 
		      		
		      	} catch (SQLException ex) {
		                JOptionPane.showMessageDialog(null,"Erro na consulta:\n Error: " + ex.getMessage());
		            }
		     }

		 // (0) CONNECT: Metodo usado para abrir conexao com o banco.
		 public void conectaBanco()
		 {
			 try 
			 {
				 // Objeto que estabelece uma conexao com o Banco de Dados, usando a URL, usuario e senha
				 _con = DriverManager.getConnection(_url, _user, _password);
				 System.out.println("Conectado");
			 } 
			 catch (SQLException ex) 
			 {
				 System.out.println("Erro aqui: Conexão Banco! :(" + ex.getMessage());
			 }
		 }

	
}