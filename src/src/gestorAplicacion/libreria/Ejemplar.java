package gestorAplicacion.libreria;

public class Ejemplar {
    private int id;
    private EstadoEjemplar estadoEjemplar;

    public Ejemplar(int id, EstadoEjemplar estadoEjemplar) {
        this.id = id;
        this.estadoEjemplar = estadoEjemplar;
    }

    public int getId() {
        return id;
    }

    public EstadoEjemplar getEstadoEjemplar() {
        return estadoEjemplar;
    }


}
