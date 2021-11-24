
package Controller;

import gestion.ClienteGestion;
import gestion.UsuarioGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelo.Cliente;
import modelo.Usuario;

@Named(value = "usuarioController")
@SessionScoped
public class UsuarioController extends Usuario implements Serializable {
   
    public UsuarioController() {
    }
    
    public String valida(){
        Usuario usuario = UsuarioGestion.validate(this.getUsuario(), this.getPassword());
        
        if (usuario != null){
            Cliente cliente = ClienteGestion.getCliente(usuario.getId());

            this.setId(usuario.getId());
            this.setCliente(usuario.getCliente());
            this.setUsuario(usuario.getUsuario());
            this.setPassword(usuario.getPassword());
            this.setIdRol(usuario.getIdRol());
            this.setCliente(cliente);
            
            return "index.xhtml";
        }else{
            FacesMessage msg = new FacesMessage (FacesMessage.SEVERITY_ERROR, "Error", "Usuario o "
                    + "Contraseña inválidas");
            FacesContext.getCurrentInstance().addMessage("loginForm:usuario", msg);
            
            return "logIn.xhtml";
        }
    }
    
}
