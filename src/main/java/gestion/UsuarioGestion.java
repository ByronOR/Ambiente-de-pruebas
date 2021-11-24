
package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Usuario;

public class UsuarioGestion {
    private static final String SQL_SELECT_USUARIO = "SELECT * FROM Usuarios WHERE usuario=?";
    
    public static Usuario getUsuario(int id){
        Usuario usuario = null;
        
        try {
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_USUARIO);
            consulta.setInt(1, id);
            ResultSet datos= consulta.executeQuery();
            
            if (datos.next()){
                Cliente cliente = ClienteGestion.getCliente(datos.getInt(2));
                usuario = new Usuario(
                    id,
                    cliente,
                    datos.getString(3),
                    datos.getString(4),
                    datos.getString(5));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usuario;
    }
    
    private static final String SQL_INSERT_USUARIO = "INSERT INTO Usuarios(idCliente, usuario, password, idRol) "
                                                    + "VALUES (?,?,?,?)";
    
    public static boolean insert(int idCLiente, String user, String password){
        try {
            PreparedStatement sentencia= Conexion.getConexion().prepareCall(SQL_INSERT_USUARIO);
            sentencia.setInt(1, idCLiente);
            sentencia.setString(2, user);
            sentencia.setString(3, password);
            sentencia.setString(4, "comun");
            
            return sentencia.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    private static final String SQL_VALIDA = "SELECT id, idCliente, idRol FROM Usuarios WHERE usuario=? AND password=?";
    
    public static Usuario validate(String user, String password){
        Usuario usuario = null;
        
        try{
            PreparedStatement sentencia =  Conexion.getConexion().prepareStatement(SQL_VALIDA);
            sentencia.setString(1, user);
            sentencia.setString(2, password);
            ResultSet rs = sentencia.executeQuery();
            
            if (rs.next()){
                Cliente cliente = ClienteGestion.getCliente(rs.getInt(2));
                usuario = new Usuario(rs.getInt(1), cliente, user, password, rs.getString(3));
            }
        }catch(SQLException ex){
            Logger.getLogger(UsuarioGestion.class.getName()).log(Level.SEVERE,null, ex);
        }
        
        return usuario;
    }
    
}
