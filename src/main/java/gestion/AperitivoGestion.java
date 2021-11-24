
package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import modelo.Aperitivo;

//USEFUL??

public class AperitivoGestion {
    private static final String SQL_SELECT_APERITIVOS = "SELECT * FROM Aperitivos";
    
    public static ArrayList<Aperitivo> getAperitivos(){
        ArrayList<Aperitivo> lista = new ArrayList<>();
        
        try {
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_APERITIVOS);
            ResultSet rs = consulta.executeQuery();
            
            while (rs != null && rs.next()){
                lista.add(new Aperitivo(
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDouble(4)));
            }     
        } catch (SQLException ex) {
            Logger.getLogger(AperitivoGestion.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return lista;
    } 
    
//    private static final String SQL_SELECT_APERITIVO = "SELECT * FROM Aperitivos WHERE codigo=?";
//    
//    public static Aperitivo getAperitivo(String id){
//        Aperitivo aperitivo = null;
//        
//        try {
//            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_APERITIVO);
//            consulta.setString(1, id);
//            ResultSet datos = consulta.executeQuery();
//            
//            if (datos.next()){
//                aperitivo = new Aperitivo(
//                    datos.getString(2),
//                    datos.getString(3),
//                    datos.getDouble(4));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(AperitivoGestion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        return aperitivo;
//    }
//    
//    private static final String SQL_INSERT_APERITIVO = "INSERT INTO Aperitivos (codigo, plato, precio)"
//                                                        + "VALUES (?,?,?) ";
//    
//    public static boolean insert(Aperitivo aperitivo){
//        try {
//            PreparedStatement sentencia = Conexion.getConexion().prepareCall(SQL_INSERT_APERITIVO);
//            sentencia.setString(1,aperitivo.getIdPlato());
//            sentencia.setString(2,aperitivo.getPlato());
//            sentencia.setDouble(3,aperitivo.getPrecio());
//           
//            return sentencia.executeUpdate() > 0;
//
//        } catch (SQLException ex) {
//            Logger.getLogger(AperitivoGestion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        return false;
//    }
    
//    private static final String SQL_UPDATE_MENU = "update menu set plato=?,precio=? where idPlato=?";
//   
//    public static boolean actualiza(Menu menu){
//        
//        try {
//            PreparedStatement sentencia= Conexion.getConexion().prepareCall(SQL_UPDATE_MENU);
//           
//            sentencia.setString(1, menu.getPlato());
//            sentencia.setDouble(2, menu.getPrecio());
//            sentencia.setString(3, menu.getIdPlato());
//            return sentencia.executeUpdate()>0; //retorna true si lo inserta, caso contrario false
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(MenuGestion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        return false;
//    }
}
