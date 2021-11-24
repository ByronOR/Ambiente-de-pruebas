
package Controller;

import java.io.File;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import modelo.Conexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;


@Named(value = "reporteController")
@SessionScoped
public class ReporteController implements Serializable {

    public ReporteController() {
    }
    
    public void show(){
        try {
            File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/lounge/LoungeReport.jasper"));
            
            JasperPrint reporteJasper = JasperFillManager.fillReport(jasper.getPath(), null, Conexion.getConexion());
            HttpServletResponse respuesta = (HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse();
            
            respuesta.setContentType("application/pdf");
            respuesta.addHeader("Content-Type", "application/pdf");
            ServletOutputStream flujo = respuesta.getOutputStream();
            JasperExportManager.exportReportToPdfStream(reporteJasper, flujo);
            FacesContext.getCurrentInstance().responseComplete();
            
        } catch (JRException ex) {
            Logger.getLogger(ReporteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReporteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void download(){
        try {
            File jasper= new File (FacesContext.getCurrentInstance().getExternalContext().getRealPath("/lounge/LoungeReport.jasper"));
            
            JasperPrint reporteJasper = JasperFillManager.fillReport(jasper.getPath(), null, Conexion.getConexion());
            HttpServletResponse respuesta = (HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse();
            
            respuesta.addHeader("Content-disposition", "attachement; filename=Lounge.pdf");
            ServletOutputStream flujo = respuesta.getOutputStream();
            JasperExportManager.exportReportToPdfStream(reporteJasper, flujo);
            FacesContext.getCurrentInstance().responseComplete();
            
        } catch (JRException ex) {
            Logger.getLogger(ReporteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReporteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
