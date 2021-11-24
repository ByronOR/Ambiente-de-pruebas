
package Controller;

import gestion.ReservaGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelo.Reserva;

@Named(value = "reservaController")
@SessionScoped
public class ReservaController extends Reserva implements Serializable {

    public ReservaController() {
    }
    
    public List<Reserva> getReservas(int idUsuario){
        return ReservaGestion.getReservacionesByUser(idUsuario);
    }
    
    public void insert(int idRuta, int idUsuario){
        if (ReservaGestion.insert(idRuta, idUsuario)){
            
        }else {
            FacesMessage mensaje= new FacesMessage (FacesMessage.SEVERITY_ERROR,
            "Error","Posible identificación duplicada");
            FacesContext.getCurrentInstance().addMessage("rutaList:reservar", mensaje);
        }
    }
    
    public String delete(int id){
        if (ReservaGestion.delete(id)){
            return "reserva.xhtml";
        }else {
            FacesMessage mensaje= new FacesMessage (FacesMessage.SEVERITY_ERROR,
            "Error","Posiblemente el id no exista en base de datos");
            FacesContext.getCurrentInstance().addMessage("editaEsperaForm:identificacion", mensaje);
            
            return "index.xhtml";
        }
    }
}
