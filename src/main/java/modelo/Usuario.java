
package modelo;

public class Usuario {
    private int id;
    private Cliente cliente;
    private String usuario;
    private String password;
    private String idRol;

    public Usuario() {

    }

    public Usuario(int id, Cliente cliente, String usuario, String password, String idRol) {
        this.id = id;
        this.cliente = cliente;
        this.usuario = usuario;
        this.password = password;
        this.idRol = idRol;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.cliente = Cliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String toString(Cliente cliente) {
       return "{\n\t\"Usuario\" : {\n" + 
                    "\t\t\"Id\" : \"" + cliente.getId() + "\",\n" + 
                    "\t\t\"Usuario=\" : \"" + usuario + "\",\n" + 
                    "\t\t\"Password\" : \"" + password + "\",\n" + 
                    "\t\t\"IdRol\" : \"comun\",\n" + 
                    "\t\t\"Cliente\" : {\n" + 
                        "\t\t\t\"Id\" : \"" + cliente.getId() + "\",\n" + 
                        "\t\t\t\"Cedula=\" : \"" + cliente.getCedula() + "\",\n" + 
                        "\t\t\t\"Nombre\" : \"" + cliente.getNombre() + "\",\n" + 
                        "\t\t\t\"Correo\" : \"" + cliente.getCorreo() + "\",\n" + 
                        "\t\t\t\"Celular\" : \"" + cliente.getCelular() + "\"\n" + 
                    "\t\t}\n"
               + "\t}\n"
             + "}";
    }
}
