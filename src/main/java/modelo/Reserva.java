
package modelo;

public class Reserva {
    private int id;
    private Usuario usuario;
    private Ruta ruta;

    public Reserva() {
    }

    public Reserva(int id, Usuario usuario, Ruta ruta) {
        this.id = id;
        this.usuario = usuario;
        this.ruta = ruta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
}
