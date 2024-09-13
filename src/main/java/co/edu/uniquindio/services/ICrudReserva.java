package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Habitacion;
import co.edu.uniquindio.model.Reserva;

import java.time.LocalDate;
import java.util.ArrayList;

public interface ICrudReserva {
    boolean crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida, String codigo, Habitacion habitacion) throws Exception;

    boolean eliminarReserva(String codigo) throws Exception;

    boolean modificarReserva(LocalDate fechaEntrada, LocalDate fechaSalida, String codigo) throws Exception;

    Reserva getReserva(String codigo) throws Exception;

    ArrayList<Reserva> getReservas();
}
