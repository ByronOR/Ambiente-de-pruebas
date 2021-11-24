
package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import modelo.Provincia;

public class ProvinciaGestion {
    private static final String SQL_SELECT_PROVINCIA = "SELECT * FROM Provincias WHERE id=?";
    
    public static Provincia getProvincia(int id){
        Provincia provincia = null;
        
        try {
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_PROVINCIA);
            consulta.setInt(1, id);
            ResultSet datos = consulta.executeQuery();
            
            if (datos.next()){
                provincia = new Provincia(
                    datos.getInt(1),
                    datos.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RutaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return provincia;
    }
}
