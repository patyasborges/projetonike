package br.inatel.ec206.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.controller.Conecta;

public class AcessoDAO {
	
	Conecta conecta = new Conecta();
	
	public AcessoDAO(){
		conecta.conectaBanco();
	}
	
public List <Acesso> pesquisarAcessoDAO(){
	
	List<Acesso> acessos = null;
	
	//int verifica = 0;
	//int codigoPesquisa = 0;
	try{
		conecta.alteraBanco("select * from Login");
		conecta._rs.first();
		
		do{
			Acesso acesso =  new Acesso();
			
			acesso.setID_Login(conecta._rs.getInt("ID_Login"));
			acesso.setLogin(conecta._rs.getString("Login"));
			acesso.setSenha(conecta._rs.getString("Senha"));
			
			if(acessos == null){
				acessos = new ArrayList<Acesso>();
			}
			
			acessos.add(acesso);
			
		} while (conecta._rs.next());
		
		conecta._rs.close();
	
	} catch(SQLException e){
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "ERRO: "+ e);
	}
	
	return acessos;
	
}

public boolean cadastrarAcessoDAO(Acesso acesso){
	try{
		
		int chave = 0;
		
		conecta.alteraBanco("select * from Usuario");
		conecta._rs.last();
		chave = conecta._rs.getInt("ID_usu");
		
		conecta._pst = conecta._con.prepareStatement("insert into Login (Login, Senha, ID_usu) values(?,?,?)");
		
		conecta._pst.setString(1, acesso.getLogin());
		conecta._pst.setString(2, acesso.getSenha());
		conecta._pst.setInt(3, chave);
		
		conecta._pst.executeUpdate();
		
		JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso. \n O login '" + acesso.getLogin() + "' está cadastrado(a)!");
		
		return true;
	} catch(SQLException ex){
		JOptionPane.showMessageDialog(null, "Erro na inserção Cadastro!!\nErro: " + ex.getMessage());
		
		return false;
	}
}	
public boolean alterarAcessoDAO(Acesso acesso) {
	    try {
	    conecta._pst = conecta._con.prepareStatement("UPDATE acesso SET Login = ?, Senha = ? WHERE ID_Login = ?");
		conecta._pst.setString(1, acesso.getLogin());
		conecta._pst.setString(2, acesso.getSenha());
		conecta._pst.setInt(3, acesso.getID_Login());
		conecta._pst.executeUpdate();
		conecta._pst.close();
				
		JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
				
		return true;
			
	        } catch (SQLException e1) {
	            e1.printStackTrace();
	            JOptionPane.showMessageDialog(null, "ERRO: "+ e1);
	            return false;
		}
			
	}

public boolean excluirOperadorDAO(Acesso acesso) {
	
    try {
	PreparedStatement pst = conecta._con.prepareStatement("delete from acesso where ID_Login=?");
	pst.setInt(1, acesso.getID_Login());
	pst.execute();
	pst.close();
			
			JOptionPane.showMessageDialog(null, "Excluido com sucesso!!");
			
			return true;
			
		} catch (SQLException e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro: "+ e1);
			
			
		}
		return false;
	}
	
}
