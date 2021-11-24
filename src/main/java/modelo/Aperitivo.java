
package modelo;

public class Aperitivo {
    private String idPlato;
    private String plato;
    private double precio;

    public Aperitivo() {
    }

    public Aperitivo(String idPlato, String plato, double precio) {
        this.idPlato = idPlato;
        this.plato = plato;
        this.precio = precio;
    }

    public String getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(String idPlato) {
        this.idPlato = idPlato;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
