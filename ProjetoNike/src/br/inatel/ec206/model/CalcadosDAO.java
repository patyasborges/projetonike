package br.inatel.ec206.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.inatel.ec206.controller.Conecta;

public class CalcadosDAO {
		Conecta conecta = new Conecta();

		// --------------------------------------------------------------------
		int ID_calcado;

		String Descricao_calc;
		String Genero_calc;
		String Tipo_calc; // (para qualquer esporte)
		double Preco_calc;
		int Tamanho_calc;
		String Cor_calc;

		// ---------------------------------------------------------------------

		// (1) INSERT
		public void armazenaNovosDados() {
			// Conecto com o Banco
			conecta.conectaBanco();

			try {
				// Preparo a insercao
				conecta._pst = conecta._con.prepareStatement(
						"INSERT INTO usuario(ID_calcado,Descricao_calc,Genero_calc,Tipo_calc, Preco_calc, Tamanho_calc, Cor_calc) VALUES(?,?,?,?,?,?,?)");
				// Cada numero indica a posicao que o valor sera inserido nas ?
				// acima
				conecta._pst.setInt(1, ID_calcado);
				conecta._pst.setString(2, Descricao_calc);
				conecta._pst.setString(3, Genero_calc);
				conecta._pst.setString(4, Tipo_calc);
				conecta._pst.setDouble(5, Preco_calc);
				conecta._pst.setInt(6, Tamanho_calc);
				conecta._pst.setString(7, Cor_calc);

				// Executo a pesquisa
				conecta._pst.executeUpdate();
				System.out.println("Sucesso! ;)");
			} catch (SQLException ex) {
				System.out.println("erro aqui");
				System.out.println("Erro: Conexão Banco! :(");
			} finally {
				// Independente se a conexao deu certo ou errado, fecha as conexoes
				// pendentes
				try {
					if (conecta._rs != null) {
						conecta._rs.close();
					}
					if (conecta._pst != null) {
						conecta._pst.close();
					}
					if (conecta._con != null) {
						conecta._con.close();
					}
				} catch (SQLException ex) {
					System.out.println("Erro: Conexão não pode ser fechada! :(");
				}
			}
		}

		// (2.2) SELECT POR NOME OU POR PARTE DE UM NOME
		public List<Calcados> selecionaPorNome() {
			// Lista que recebera todos os registros desta tabela
			List<Calcados> listaCalcados = new ArrayList<>();
			try {
				// Conecto com o Banco
				conecta.conectaBanco();
				// Preparo a consulta
				conecta._pst = conecta._con.prepareStatement(
						"SELECT * FROM Calcados WHERE ID_calcados in (SELECT ID_calcados from Calcados where Descricao_calc like ?)");
				// Indico que o primeiro ? significa o nome digitado pelo usuario
				conecta._pst.setString(1, "%"+Descricao_calc+"%");
				// O ResultSet gera uma tabela de dados retornados por uma pesquisa
				// SQL.
				conecta._rs = conecta._pst.executeQuery();
				// O metodo next() caminha entre as linhas da tabela de resultados
				// retornada.

				while (conecta._rs.next()) {
					// A cada nova interacao, cria um novo objeto Administrador
					Calcados calcado = new Calcados();
					calcado.setID_calcados(conecta._rs.getInt(1));
					calcado.setDescricao_calc(conecta._rs.getString(2));
					calcado.setGenero_calc(conecta._rs.getString(3));
					calcado.setTipo_calc(conecta._rs.getString(4));
					calcado.setPreco_calc(conecta._rs.getDouble(5));
					calcado.setTamanho_calc(conecta._rs.getInt(6));
					calcado.setCor_calc(conecta._rs.getString(7));

					listaCalcados.add(calcado);
				}
				System.out.println("Sucesso! ;)");
			} catch (SQLException ex) {
				System.out.println("Erro: Conexão Banco! :(");
			} finally {
				// Independente se a conexao deu certo ou errado, fecha as conexoes
				// pendentes
				try {
					if (conecta._rs != null) {
						conecta._rs.close();
					}
					if (conecta._st != null) {
						conecta._st.close();
					}
					if (conecta._con != null) {
						conecta._con.close();
					}
				} catch (SQLException ex) {
					System.out.println("Erro: Conexão não pode ser fechada! :(");
				}
			}
			return listaCalcados;
		}

		// (3) UPDATE
		public void update() {
			// Conecto com o Banco
			conecta.conectaBanco();
			try {
				// Preparo a atualizacao
				conecta._pst = conecta._con.prepareStatement(
						"UPDATE Calcados SET Descricao_calc = ?,Genero_calc = ?,Tipo_calc =?, Preco_calc=?, Tamanho_calc=?,Cor_calc =?  WHERE ID_calcados = ?");

				conecta._pst.setString(1, Descricao_calc);
				conecta._pst.setString(2, Genero_calc);
				conecta._pst.setString(3, Tipo_calc);
				conecta._pst.setDouble(4, Preco_calc);
				conecta._pst.setInt(5, Tamanho_calc);
				conecta._pst.setString(6, Cor_calc);
				System.out.println(ID_calcado);

				// Executo a atualizacao
				conecta._pst.executeUpdate();
				// System.out.println("Sucesso! ;)");

			} catch (SQLException ex) {
				System.out.println("Erro: Conexão Banco! :(");
			} finally {
				// Independente se a conexao deu certo ou errado, fecha as conexoes
				// pendentes
				try {
					if (conecta._rs != null) {
						conecta._rs.close();
					}
					if (conecta._pst != null) {
						conecta._pst.close();
					}
					if (conecta._con != null) {
						conecta._con.close();
					}
				} catch (SQLException ex) {
					System.out.println("Erro: Conexão não pode ser fechada! :(");
				}
			}
		}

		// (4) DELETE
		public void delete() {
			// Conecto com o Banco
			conecta.conectaBanco();
			try {// Preparo a exclusao
				conecta._pst = conecta._con.prepareStatement("DELETE FROM Calcado WHERE ID_calcado = ?");
				conecta._pst.setInt(1, ID_calcado);

				// Executo a exclusao
				conecta._pst.executeUpdate();
				System.out.println("Sucesso! ;)");
			} catch (SQLException ex) {
				System.out.println("Erro: Conexão Banco! :(");
			} finally {
				// Independente se a conexao deu certo ou errado, fecha as conexoes
				// pendentes
				try {
					if (conecta._rs != null) {
						conecta._rs.close();
					}
					if (conecta._pst != null) {
						conecta._pst.close();
					}
					if (conecta._con != null) {
						conecta._con.close();
					}
				} catch (SQLException ex) {
					System.out.println("Erro: Conexão não pode ser fechada! :(");
				}
			}
		}

}
