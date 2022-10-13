package gestorAplicacion.servicios;

import libreria.EjemplarRevistas;
import libreria.EjemplarLibro;
import java.util.ArrayList;

public abstract class Servicio {
    private static ArrayList<EjemplarRevista> ejemplarRevistaDisponibles = new ArrayList<>();
    private static ArrayList<EjemplarLibro> ejemplarLibroDisponibles = new ArrayList<>();
    private Usuario usuario;

    //Constructores

    public Servicio(Usuario usuario) {
        this.usuario = usuario;
    }

    //getters y setters
    public ArrayList<EjemplarRevista> getEjemplarRevistaDisponibles() {
        return ejemplarRevistaDisponibles;
    }

    public void setEjemplarRevistaDisponibles(ArrayList<EjemplarRevista> ejemplarRevistaDisponibles) {
        Servicio.ejemplarRevistaDisponibles = ejemplarRevistaDisponibles;
    }

    public ArrayList<EjemplarLibro> getEjemplarLibroDisponibles() {
        return ejemplarLibroDisponibles;
    }

    public void setEjemplarLibroDisponibles(ArrayList<EjemplarLibro> ejemplarLibroDisponibles) {
        Servicio.ejemplarLibroDisponibles = ejemplarLibroDisponibles;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //metodos


}
