
package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import modelo.Cliente;


public class ClienteGestion {
    private static final String SQL_SELECT_CLIENTE = "SELECT * FROM Clientes WHERE id=?";
    
    public static Cliente getCliente(int id){
        Cliente cliente = null;
        
        try {
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_CLIENTE);
            consulta.setInt(1, id);
            ResultSet datos = consulta.executeQuery();
            
            if (datos.next()){
                cliente = new Cliente(
                    datos.getInt(1),
                    datos.getString(2),
                    datos.getString(3),
                    datos.getString(7),
                    datos.getString(8));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cliente;
    }
    
    private static final String SQL_SELECT_LAST_CLIENTE = "SELECT id FROM Clientes ORDER BY id DESC LIMIT 1";
    
    public static int getLastCliente(){
        int idCliente = 0;
        
        try {
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_LAST_CLIENTE);
            ResultSet datos = consulta.executeQuery();
            
            if (datos.next()){
                idCliente = datos.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return idCliente;
    }
    
    private static final String SQL_INSERT_CLIENTE = "INSERT INTO Clientes(cedula, nombre, correo, celular) "
                                                    + "VALUES (?,?,?,?)";
    
    public static boolean insert(Cliente cliente){
        try {
            PreparedStatement sentencia = Conexion.getConexion().prepareCall(SQL_INSERT_CLIENTE);
            
            sentencia.setString(1, cliente.getCedula());
            sentencia.setString(2, cliente.getNombre());
            sentencia.setObject(3, cliente.getCorreo());
            sentencia.setString(4, cliente.getCelular());
            
            return sentencia.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
