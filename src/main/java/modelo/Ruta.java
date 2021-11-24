
package modelo;

import java.util.Date;

public class Ruta {
    private int id;
    private Provincia provincia;
    private String codigo;
    private String nombre;
    private String horario;
    private Date fecha;
    private String duracion;
    private String parada;
    private double precio;

    public Ruta() {
    }

    public Ruta(int id, Provincia provincia, String codigo, String nombre, String horario, Date fecha, String duracion, String parada, double precio) {
        this.id = id;
        this.provincia = provincia;
        this.codigo = codigo;
        this.nombre = nombre;
        this.horario = horario;
        this.fecha = fecha;
        this.duracion = duracion;
        this.parada = parada;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getParada() {
        return parada;
    }

    public void setParada(String parada) {
        this.parada = parada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}
