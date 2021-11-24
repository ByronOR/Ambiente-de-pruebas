
package Controller;

import gestion.ClienteGestion;
import gestion.UsuarioGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelo.Cliente;

@Named(value = "clienteController")
@SessionScoped
public class ClienteController extends Cliente implements Serializable {

    public ClienteController() {
    }
    
    public String insert(String usuario, String password){
        if (ClienteGestion.insert(this)){
            this.setId(ClienteGestion.getLastCliente());
            
            if (UsuarioGestion.insert(this.getId(), usuario, password)){
                
                return "account.xhtml";
            }else {
                FacesMessage mensaje= new FacesMessage (FacesMessage.SEVERITY_ERROR,
                "Error","Posible identificación duplicada");
                FacesContext.getCurrentInstance().addMessage("registroClienteForm:idUsuario", mensaje);
                
                return "index.xhtml";   
            }
        }else {
            FacesMessage mensaje= new FacesMessage (FacesMessage.SEVERITY_ERROR, 
            "Error", "Posible Cédula duplicada...");
            FacesContext.getCurrentInstance().addMessage("registroClienteForm:cedula", mensaje);
            
            return "index.xhtml";      
        }
    }
}
