package gestorAplicacion.servicios;

import java.util.Date;

public class Reserva extends Servicio{
    Date fechaReserva;
    Date fechaDevolucion;

    //Constructores

    public Reserva(Usuario usuario, Date fechaReserva, Date fechaDevolucion) {
        super(usuario);
        this.fechaReserva = fechaReserva;
        this.fechaDevolucion = fechaDevolucion;
    }


    //getters y setters

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    //metodos
}
