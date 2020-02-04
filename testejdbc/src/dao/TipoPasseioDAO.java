package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.JDBCConnection;
import domain.TipoPasseio;

public class TipoPasseioDAO implements DAO<TipoPasseio>{

	@Override
	public void salvar(TipoPasseio domain) {
		Connection conexao =JDBCConnection.getConnection();
		String sql = "INSERT INTO tipo_passeio (nome_passeio, descricao) VALUES (?, ?)";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, domain.getNomePasseio());
			ps.setString(2, domain.getDescricao());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(TipoPasseio domain) {
		Connection conexao =JDBCConnection.getConnection();
		String sql = "UPDATE tipo_passeio SET nome_passeio = ?, descricao = ? WHERE id_tipo_passeio = ?";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, domain.getNomePasseio() );
			ps.setString(2, domain.getDescricao());
			ps.setInt(3, domain.getIdTipoPasseio());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deletar(TipoPasseio domain) {
		
		Connection conexao =JDBCConnection.getConnection();
		String sql = "DELETE FROM tipo_passeio WHERE id_tipo_passeio = ?";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, domain.getIdTipoPasseio());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public List<TipoPasseio> listarTodos() {
		
		Connection conexao =JDBCConnection.getConnection();
		String sql = "SELECT * FROM tipo_passeio";
		List<TipoPasseio> listaTipoPasseio = new ArrayList<>();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				TipoPasseio tipoPasseio = new TipoPasseio();
				tipoPasseio.setIdTipoPasseio(rs.getInt("id_tipo_passeio"));
				tipoPasseio.setNomePasseio(rs.getString("nome_passeio"));
				tipoPasseio.setDescricao(rs.getString("descricao"));
				listaTipoPasseio.add(tipoPasseio);
			}
			
			return listaTipoPasseio;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
