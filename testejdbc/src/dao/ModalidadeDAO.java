package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.JDBCConnection;
import domain.Modalidade;

public class ModalidadeDAO implements DAO<Modalidade>{

	@Override
	public void salvar(Modalidade domain) {
		Connection conexao =JDBCConnection.getConnection();
		String sql = "INSERT INTO modalidade(nome_modalidade) VALUES (?)";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, domain.getNomeModalidade() );
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(Modalidade domain) {
		Connection conexao =JDBCConnection.getConnection();
		String sql = "UPDATE modalidade SET nome_modalidade = ? WHERE id_modalidade = ?";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, domain.getNomeModalidade() );
			ps.setInt(2, domain.getIdModalidade());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deletar(Modalidade domain) {
		
		Connection conexao =JDBCConnection.getConnection();
		String sql = "DELETE FROM modalidade WHERE id_modalidade = ?";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, domain.getIdModalidade());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Modalidade> listarTodos() {
		
		Connection conexao =JDBCConnection.getConnection();
		String sql = "SELECT * FROM modalidade";
		List<Modalidade> modalidades = new ArrayList<>();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Modalidade mod = new Modalidade();
				mod.setIdModalidade(rs.getInt("id_modalidade"));
				mod.setNomeModalidade(rs.getString("nome_modalidade"));
				modalidades.add(mod);
			}
			
			return modalidades;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
