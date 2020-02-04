package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.JDBCConnection;
import domain.Pais;

public class PaisDAO implements DAO<Pais>{

	@Override
	public void salvar(Pais domain) {
		Connection conexao =JDBCConnection.getConnection();
		String sql = "INSERT INTO pais(nome_pais) VALUES (?)";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, domain.getNomePais() );
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(Pais domain) {
		Connection conexao =JDBCConnection.getConnection();
		String sql = "UPDATE pais SET nome_pais = ? WHERE id_pais= ?";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, domain.getNomePais() );
			ps.setInt(2, domain.getIdPais());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deletar(Pais domain) {
		
		Connection conexao =JDBCConnection.getConnection();
		String sql = "DELETE FROM pais WHERE id_pais= ?";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, domain.getIdPais());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Pais> listarTodos() {
		
		Connection conexao =JDBCConnection.getConnection();
		String sql = "SELECT * FROM pais";
		List<Pais> modalidades = new ArrayList<>();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Pais mod = new Pais();
				mod.setIdPais( rs.getInt("id_pais"));
				mod.setNomePais(rs.getString("nome_pais"));
				modalidades.add(mod);
			}
			
			return modalidades;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
