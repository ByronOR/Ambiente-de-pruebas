
package Controller;

import gestion.ProvinciaGestion;
import gestion.RutaGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelo.Ruta;

@Named(value = "rutaController")
@SessionScoped
public class RutaController extends Ruta implements Serializable {

    public RutaController() {
    }
    
    public List<Ruta> getRutasSanJose(int idUsuario){
        return RutaGestion.getRutasSanJose(idUsuario);
    }
    
    public List<Ruta> getRutasAlajuela(int idUsuario){
        return RutaGestion.getRutasAlajuela(idUsuario);
    }
    
    public List<Ruta> getRutasCartago(int idUsuario){
        return RutaGestion.getRutasCartago(idUsuario);
    }
    
    public List<Ruta> getRutasHeredia(int idUsuario){
        return RutaGestion.getRutasHeredia(idUsuario);
    }
    
    public List<Ruta> getRutasGuanacaste(int idUsuario){
        return RutaGestion.getRutasGuanacaste(idUsuario);
    }
    
    public List<Ruta> getRutasPuntarenas(int idUsuario){
        return RutaGestion.getRutasPuntarenas(idUsuario);
    }
    
    public List<Ruta> getRutasLimon(int idUsuario){
        return RutaGestion.getRutasLimon(idUsuario);
    }
     
    public String edit(int id){
        Ruta ruta = RutaGestion.getRuta(id);
         
        if (ruta != null){
            this.setId(ruta.getId());
            this.setProvincia(ProvinciaGestion.getProvincia(id));
            this.setNombre(ruta.getNombre());
            this.setHorario(ruta.getHorario());
            this.setFecha(ruta.getFecha());
            this.setDuracion(ruta.getDuracion());
            this.setParada(ruta.getParada());
            this.setPrecio(ruta.getPrecio());
             
            return "edita.xhtml";
         }else{
            FacesMessage mensaje= new FacesMessage (FacesMessage.SEVERITY_ERROR,
            "Error","Posiblemente el id no exista en base de datos");
            FacesContext.getCurrentInstance().addMessage("editaRutaForm:idRuta", mensaje);
            
            return "list.xhtml";
        }
    }
}
