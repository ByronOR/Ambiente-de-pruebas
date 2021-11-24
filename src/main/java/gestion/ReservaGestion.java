
package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import modelo.Reserva;


public class ReservaGestion {
    private static final String SQL_SELECT_RESERVA = "SELECT * FROM Reservas WHERE id=?";
    
    public static Reserva getReserva(int id){
        Reserva reserva = null;
        
        try {
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_RESERVA);
            consulta.setInt(1, id);
            ResultSet datos = consulta.executeQuery();
            
            if (datos.next()){
                reserva = new Reserva(
                        datos.getInt(1),
                        UsuarioGestion.getUsuario(datos.getInt(2)),
                        RutaGestion.getRuta(datos.getInt(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return reserva;
    }
    
    private static final String SQL_SELECT_RESERVACIONES = "SELECT * FROM Reservas WHERE idUsuario=?";
    
    public static ArrayList<Reserva> getReservacionesByUser(int idUsuario){
        ArrayList<Reserva> lista = new ArrayList<>();
        
        try {
            PreparedStatement consulta= Conexion.getConexion().prepareStatement(SQL_SELECT_RESERVACIONES);
            consulta.setInt(1, idUsuario);
            ResultSet rs= consulta.executeQuery();
            while (rs!=null && rs.next()){
                lista.add(new Reserva(
                        rs.getInt(1),
                        UsuarioGestion.getUsuario(rs.getInt(2)),
                        RutaGestion.getRuta(rs.getInt(3))));
            }     
        } catch (SQLException ex) {
            Logger.getLogger(ReservaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return lista;
    }
    
    private static final String SQL_INSERT_RESERVA = "INSERT INTO Reservas(idUsuario,idRuta) "
                                                        + "VALUES (?,?)";
    
    public static boolean insert(int idRuta, int idUsuario){
        try {
            PreparedStatement sentencia = Conexion.getConexion().prepareCall(SQL_INSERT_RESERVA);
            sentencia.setInt(1, idUsuario);
            sentencia.setInt(2, idRuta);
           
            return sentencia.executeUpdate()>0; 
        } catch (SQLException ex) {
            Logger.getLogger(ReservaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    private static final String SQL_DELETE_RESERVA = "DELETE FROM Reservas WHERE id=?";
    
    public static boolean delete(int id){
        try {
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_DELETE_RESERVA);
            consulta.setInt(1, id);
            
            return consulta.executeUpdate()>0; 
        } catch (SQLException ex) {
            Logger.getLogger(ReservaGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
