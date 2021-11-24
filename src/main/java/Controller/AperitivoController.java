/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import gestion.AperitivoGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import modelo.Aperitivo;

@Named(value = "aperitivoController")
@SessionScoped
public class AperitivoController extends Aperitivo implements Serializable {

    public AperitivoController() {
    }
    
    public List<Aperitivo> getAperitivos(){
        return AperitivoGestion.getAperitivos();
    }
}
