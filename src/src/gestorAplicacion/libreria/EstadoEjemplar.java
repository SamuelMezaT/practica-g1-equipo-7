package gestorAplicacion.libreria;

import gestorAplicacion.servicios.Prestamo;
import gestorAplicacion.servicios.Reserva;

public class EstadoEjemplar {
    private boolean prestado;
    private boolean reservado;
    private boolean retraso;
    private Prestamo prestamo;
    private Reserva reserva;

    public EstadoEjemplar(boolean prestado, boolean reservado, boolean retraso, Prestamo prestamo, Reserva reserva) {
        this.prestado = prestado;
        this.reservado = reservado;
        this.retraso = retraso;
        this.prestamo = prestamo;
        this.reserva = reserva;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public boolean isReservado() {
        return reservado;
    }

    public boolean isRetraso() {
        return retraso;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public Reserva getReserva() {
        return reserva;
    }



    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public void setRetraso(boolean retraso) {
        this.retraso = retraso;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
