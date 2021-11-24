
package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import modelo.Ruta;
import java.net.ConnectException;
import modelo.Provincia;

public class RutaGestion {
    private static final String SQL_SELECT_RUTA = "SELECT * FROM Rutas WHERE id=?";
    
    public static Ruta getRuta(int id){
        Ruta ruta = null;
        
        try {
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_RUTA);
            consulta.setInt(1, id);
            ResultSet datos = consulta.executeQuery();
            
            if (datos.next()){
                Provincia provincia = ProvinciaGestion.getProvincia(datos.getInt(2));
                ruta = new Ruta(
                    datos.getInt(1),
                    provincia,
                    datos.getString(3),
                    datos.getString(4),
                    datos.getString(5),
                    datos.getDate(6),
                    datos.getString(7),
                    datos.getString(8),
                    datos.getDouble(9));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RutaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ruta;
    }
    
    private static final String SQL_SELECT_RUTA_SAN_JOSE = "SELECT * FROM Rutas WHERE idProvincia=1 "
                                                            + "AND id NOT IN "
                                                             + "(SELECT idRuta FROM Reservas WHERE idUsuario =?)";
    
    public static ArrayList<Ruta> getRutasSanJose(int idUsuario){
        ArrayList<Ruta> lista = new ArrayList<>();
        
        try {
            PreparedStatement consulta= Conexion.getConexion().prepareStatement(SQL_SELECT_RUTA_SAN_JOSE);
            consulta.setInt(1, idUsuario);
            ResultSet rs = consulta.executeQuery();
            
            while (rs != null && rs.next()){
                Provincia provincia = ProvinciaGestion.getProvincia(rs.getInt(2));
                lista.add(new Ruta(
                    rs.getInt(1),
                    provincia,
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getDate(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getDouble(9)));
            }     
        } catch (SQLException ex) {
            Logger.getLogger(RutaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return lista;
    }
    
    private static final String SQL_SELECT_RUTA_ALAJUELA = "SELECT * FROM Rutas WHERE idProvincia=2 "
                                                            + "AND id NOT IN "
                                                             + "(SELECT idRuta FROM Reservas WHERE idUsuario =?)";
    
    public static ArrayList<Ruta> getRutasAlajuela(int idUsuario){
        ArrayList<Ruta> lista = new ArrayList<>();
        
        try {
            PreparedStatement consulta= Conexion.getConexion().prepareStatement(SQL_SELECT_RUTA_ALAJUELA);
            consulta.setInt(1, idUsuario);
            ResultSet rs = consulta.executeQuery();
            
            while (rs != null && rs.next()){
                Provincia provincia = ProvinciaGestion.getProvincia(rs.getInt(2));
                lista.add(new Ruta(
                    rs.getInt(1),
                    provincia,
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getDate(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getDouble(9)));
            }     
        } catch (SQLException ex) {
            Logger.getLogger(RutaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return lista;
    }
    
    private static final String SQL_SELECT_RUTA_CARTAGO = "SELECT * FROM Rutas WHERE idProvincia=3 "
                                                            + "AND id NOT IN "
                                                             + "(SELECT idRuta FROM Reservas WHERE idUsuario =?)";
    
    public static ArrayList<Ruta> getRutasCartago(int idUsuario){
        ArrayList<Ruta> lista = new ArrayList<>();
        
        try {
            PreparedStatement consulta= Conexion.getConexion().prepareStatement(SQL_SELECT_RUTA_CARTAGO);
            consulta.setInt(1, idUsuario);
            ResultSet rs = consulta.executeQuery();
            
            while (rs != null && rs.next()){
                Provincia provincia = ProvinciaGestion.getProvincia(rs.getInt(2));
                lista.add(new Ruta(
                    rs.getInt(1),
                    provincia,
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getDate(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getDouble(9)));
            }     
        } catch (SQLException ex) {
            Logger.getLogger(RutaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return lista;
    }
    
    private static final String SQL_SELECT_RUTA_HEREDIA = "SELECT * FROM Rutas WHERE idProvincia=4 "
                                                            + "AND id NOT IN "
                                                             + "(SELECT idRuta FROM Reservas WHERE idUsuario =?)";
    
    public static ArrayList<Ruta> getRutasHeredia(int idUsuario){
        ArrayList<Ruta> lista = new ArrayList<>();
        
        try {
            PreparedStatement consulta= Conexion.getConexion().prepareStatement(SQL_SELECT_RUTA_HEREDIA);
            consulta.setInt(1, idUsuario);
            ResultSet rs = consulta.executeQuery();
            
            while (rs != null && rs.next()){
                Provincia provincia = ProvinciaGestion.getProvincia(rs.getInt(2));
                lista.add(new Ruta(
                    rs.getInt(1),
                    provincia,
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getDate(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getDouble(9)));
            }     
        } catch (SQLException ex) {
            Logger.getLogger(RutaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return lista;
    }
    
    private static final String SQL_SELECT_RUTA_GUANACASTE = "SELECT * FROM Rutas WHERE idProvincia=5 "
                                                            + "AND id NOT IN "
                                                             + "(SELECT idRuta FROM Reservas WHERE idUsuario =?)";
    
    public static ArrayList<Ruta> getRutasGuanacaste(int idUsuario){
        ArrayList<Ruta> lista = new ArrayList<>();
        
        try {
            PreparedStatement consulta= Conexion.getConexion().prepareStatement(SQL_SELECT_RUTA_GUANACASTE);
            consulta.setInt(1, idUsuario);
            ResultSet rs = consulta.executeQuery();
            
            while (rs != null && rs.next()){
                Provincia provincia = ProvinciaGestion.getProvincia(rs.getInt(2));
                lista.add(new Ruta(
                    rs.getInt(1),
                    provincia,
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getDate(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getDouble(9)));
            }     
        } catch (SQLException ex) {
            Logger.getLogger(RutaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return lista;
    }
    
    private static final String SQL_SELECT_RUTA_PUNTARENAS = "SELECT * FROM Rutas WHERE idProvincia=6 "
                                                            + "AND id NOT IN "
                                                             + "(SELECT idRuta FROM Reservas WHERE idUsuario =?)";
    
    public static ArrayList<Ruta> getRutasPuntarenas(int idUsuario){
        ArrayList<Ruta> lista = new ArrayList<>();
        
        try {
            PreparedStatement consulta= Conexion.getConexion().prepareStatement(SQL_SELECT_RUTA_PUNTARENAS);
            consulta.setInt(1, idUsuario);
            ResultSet rs = consulta.executeQuery();
            
            while (rs != null && rs.next()){
                Provincia provincia = ProvinciaGestion.getProvincia(rs.getInt(2));
                lista.add(new Ruta(
                    rs.getInt(1),
                    provincia,
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getDate(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getDouble(9)));
            }     
        } catch (SQLException ex) {
            Logger.getLogger(RutaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return lista;
    }
    
    private static final String SQL_SELECT_RUTA_LIMON = "SELECT * FROM Rutas WHERE idProvincia=7 "
                                                            + "AND id NOT IN "
                                                             + "(SELECT idRuta FROM Reservas WHERE idUsuario =?)";
    
    public static ArrayList<Ruta> getRutasLimon(int idUsuario){
        ArrayList<Ruta> lista = new ArrayList<>();
        
        try {
            PreparedStatement consulta= Conexion.getConexion().prepareStatement(SQL_SELECT_RUTA_LIMON);
            consulta.setInt(1, idUsuario);
            ResultSet rs = consulta.executeQuery();
            
            while (rs != null && rs.next()){
                Provincia provincia = ProvinciaGestion.getProvincia(rs.getInt(2));
                lista.add(new Ruta(
                    rs.getInt(1),
                    provincia,
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getDate(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getDouble(9)));
            }     
        } catch (SQLException ex) {
            Logger.getLogger(RutaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return lista;
    }
}
