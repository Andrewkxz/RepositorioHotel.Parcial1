package co.edu.uniquindio.model;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private String codigo;
    private Habitacion habitacion;

    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, String codigo, Habitacion habitacion) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.codigo = codigo;
        this.habitacion = habitacion;
    }

    public Reserva() {
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public boolean verificarFechas() throws Exception {
        if (fechaEntrada.isAfter(fechaSalida) || fechaSalida.isBefore(fechaEntrada)) {
            throw new Exception("Introduzca una fecha válida");
        }
        return true;
    }
}
