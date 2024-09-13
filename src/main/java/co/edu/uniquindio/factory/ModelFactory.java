package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;
import co.edu.uniquindio.services.ICrudCliente;
import co.edu.uniquindio.services.ICrudReserva;
import co.edu.uniquindio.services.ICrudServicio;

import java.time.LocalDate;
import java.util.ArrayList;

public class ModelFactory implements ICrudCliente, ICrudReserva, ICrudServicio {
    private static ModelFactory instance;
    private static Hotel hotel;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    @Override
    public boolean crearCliente(String nombre, String dni) {
        return hotel.crearCliente(nombre, dni);
    }

    @Override
    public boolean eliminarCliente(String dni) {
        return hotel.eliminarCliente(dni);
    }

    @Override
    public boolean modificarCliente(String dni, String nombre) {
        return hotel.modificarCliente(dni, nombre);
    }

    @Override
    public Cliente getCliente(String dni) {
        return hotel.getCliente(dni);
    }

    @Override
    public ArrayList<Cliente> getClientes() {
        return hotel.getClientes();
    }

    @Override
    public boolean crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida, String codigo, Habitacion habitacion) throws Exception {
        return hotel.crearReserva(fechaEntrada, fechaSalida, codigo, habitacion);
    }

    @Override
    public boolean eliminarReserva(String codigo) throws Exception {
        return hotel.eliminarReserva(codigo);
    }

    @Override
    public boolean modificarReserva(LocalDate fechaEntrada, LocalDate fechaSalida, String codigo) throws Exception {
        return hotel.modificarReserva(fechaEntrada, fechaSalida, codigo);
    }

    @Override
    public Reserva getReserva(String codigo) throws Exception {
        return hotel.getReserva(codigo);
    }

    @Override
    public ArrayList<Reserva> getReservas() {
        return hotel.getReservas();
    }

    @Override
    public boolean crearServicio(double precio, String codigo, TipoServicio tipoServicio) {
        return hotel.crearServicio(precio, codigo, tipoServicio);
    }

    @Override
    public boolean eliminarServicio(String codigo) {
        return hotel.eliminarServicio(codigo);
    }

    @Override
    public boolean actualizarServicio(double precio, String codigo) {
        return hotel.actualizarServicio(precio, codigo);
    }

    @Override
    public Servicio getServicio(String codigo) {
        return hotel.getServicio(codigo);
    }

    @Override
    public ArrayList<Servicio> getServicios() {
        return hotel.getServicios();
    }

    private void inicializarDatos() {
        hotel = new Hotel();
        hotel.setNombre("Hotel My Little Ponny");

        Habitacion habitacion = new Habitacion("09", TipoHabitacion.DOBLE, 5000.0);
        Habitacion habitacion1 = new Habitacion("08", TipoHabitacion.SIMPLE, 5000.0);
        Habitacion habitacion2 = new Habitacion("07", TipoHabitacion.SUITE, 5000.0);

        Cliente cliente = new Cliente("Juan", "109265");
        Cliente cliente1 = new Cliente("Jhan", "109345");
        Cliente cliente2 = new Cliente("Raquel", "107035");

        Reserva reserva = new Reserva(LocalDate.of(2024,2,13),LocalDate.of(2024,3,23), "1032", habitacion);
        Reserva reserva1 = new Reserva(LocalDate.of(2024,2,13),LocalDate.of(2024,4,18), "1033", habitacion1);
        Reserva reserva2 = new Reserva(LocalDate.of(2024,2,13),LocalDate.of(2024,8,29), "1032", habitacion2);

        Servicio servicio1 = new ServicioLimpieza(9000.0, "1233");
        Servicio servicio2 = new ServicioRestaurante(3000.0, "1234");
        Servicio servicio3 = new ServicioSpa(5000.0, "5678");
        Servicio servicio4 = new ServicioHabitacion(3000.0, "6789");
    }
}
