package persona.dao;

import curso.crespo.Persona;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexion.BDManager;

public class RRHHDAOImpl extends BDManager {

	@Override
	public boolean buscarTecnicoEficiente(int dias) {
		if(establecerConeccion()) {
	        try {
	            PreparedStatement pstmt = con.prepareStatement("SELECT id from tecnicos where (dias) VALUES (?) sortBy  Limit 1");
	            pstmt.setInt(1, dias);
	           // pstmt.setString(2, persona.getNombre());
	            pstmt.executeUpdate();
	            pstmt.close();
	            return true;
	        } catch (SQLException e) {
	            System.err.println("Ocurrio un error al buscar la información");
	            e.printStackTrace();
	            return false;
	        }
		}
		return false;
	}

}
