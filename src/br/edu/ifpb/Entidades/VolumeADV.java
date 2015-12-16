package br.edu.ifpb.Entidades;

import java.sql.*;

import br.edu.ifpb.Conexão.*;

public class VolumeADV {

	private Connection connection;

	public VolumeADV() {
		this.connection = new ConnectionFactory().getConnection();
	}


	public boolean insert (Volume volume) throws SQLException {
		try{
			Connection connection = new ConnectionFactory().getConnection();
		} catch (RuntimeException e){
			System.out.println("Erro de Conexão");
			return false;

		}
		String sql = "insert into tb_volume " +
				"(ANO_PUBLIC,AUTOR,DESCRICAO,EDITORA,NUM_PAG,TIPO_VOLUME,TITULO)" +
				" values (?,?,?,?,?,?,?);";

		try {


			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1,volume.getAno_public());
			stmt.setString(2,volume.getAutor());
			stmt.setString(3,volume.getDescricao());
			stmt.setString(4,volume.getEditora());
			stmt.setString(5,volume.getNum_pag());
			stmt.setString(6,volume.getTipo());
			stmt.setString(7,volume.getTitulo());


			stmt.execute();
			stmt.close();


		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return true;
	}
	public void remove(Volume volume) {
	     try {
	         PreparedStatement stmt = connection.prepareStatement("delete" +
	                 "from tb_volume where TITULO=?");
	         stmt.setString(7, volume.getTitulo());
	         stmt.execute();
	         stmt.close();
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }

	public void disconnect() throws SQLException {
		this.connection.close();	
	}
}
