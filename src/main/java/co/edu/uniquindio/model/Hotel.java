package co.edu.uniquindio.model;

import co.edu.uniquindio.services.ICrudCliente;
import co.edu.uniquindio.services.ICrudReserva;
import co.edu.uniquindio.services.ICrudServicio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel implements ICrudCliente, ICrudReserva, ICrudServicio {
    private String nombre;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Servicio> servicios = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public Hotel() {
    }

    private Cliente verificarCliente(String dni) {
        Cliente clienteExistente = null;
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                clienteExistente = cliente;
                break;
            }
        }
        return clienteExistente;
    }

    private Servicio verificarServicio(String codigo) {
        Servicio servicioExistente = null;
        for (Servicio servicio : servicios) {
            if (servicio.getCodigo().equals(codigo)) {
                servicioExistente = servicio;
                break;
            }
        }
        return servicioExistente;
    }

    private Reserva verificarReserva(String codigo) throws Exception {
        Reserva reservaExistente = null;
        if (reservaExistente.verificarFechas()) {
            for (Reserva reserva : reservas) {
                if (reserva.getCodigo().equals(codigo)) {
                    reservaExistente = reserva;
                    break;
                }
            }
        }
        return reservaExistente;
    }

    private Servicio verficiarTipoServicio(TipoServicio tipoServicio) {
        switch (tipoServicio) {
            case SPA -> {
                return new ServicioSpa();
            } case RESTAURANTE -> {
                return new ServicioRestaurante();
            } case LIMPIEZA -> {
                return new ServicioLimpieza();
            }
        } return new ServicioHabitacion();
    }

    private Habitacion verificarTipoHabitacion(TipoHabitacion tipoHabitacion) {
        Habitacion habitacionExistente = new Habitacion();
        switch (tipoHabitacion) {
            case SIMPLE -> habitacionExistente.setPrecio(1500.0);
            case DOBLE -> habitacionExistente.setPrecio(3000.0);
            case SUITE -> habitacionExistente.setPrecio(5000.0);
            default -> habitacionExistente.setPrecio(1500.0);
        }
        return habitacionExistente;
    }

    @Override
    public boolean crearCliente(String nombre, String dni) {
        Cliente cliente = verificarCliente(dni);
        if (cliente == null){
            cliente.setNombre(nombre);
            cliente.setDni(dni);
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(String dni) {
        Cliente cliente = verificarCliente(dni);
        if (cliente != null){
            clientes.remove(cliente);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarCliente(String dni, String nombre) {
        Cliente cliente = verificarCliente(dni);
        if (cliente != null){
            cliente.setNombre(nombre);
            cliente.setDni(dni);
            return true;
        }
        return false;
    }

    @Override
    public Cliente getCliente(String dni) {
        return verificarCliente(dni);
    }

    @Override
    public ArrayList<Cliente> getClientes() {
        return (ArrayList<Cliente>) clientes;
    }

    @Override
    public boolean crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida, String codigo, Habitacion habitacion) throws Exception {
        Reserva reserva = new Reserva();
        Reserva reservaExistente = verificarReserva(codigo);
        if (reservaExistente == null){
            reserva.setCodigo(codigo);
            reserva.setFechaEntrada(fechaEntrada);
            reserva.setFechaSalida(fechaSalida);
            reserva.setHabitacion(habitacion);
            reservas.add(reserva);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarReserva(String codigo) throws Exception {
        Reserva reserva = verificarReserva(codigo);
        if (reserva != null){
            reservas.remove(reserva);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarReserva(LocalDate fechaEntrada, LocalDate fechaSalida, String codigo) throws Exception {
        Reserva reserva = verificarReserva(codigo);
        if (reserva != null){
            reserva.setFechaEntrada(fechaEntrada);
            reserva.setFechaSalida(fechaSalida);
            return true;
        }
        return false;
    }

    @Override
    public Reserva getReserva(String codigo) throws Exception {
        return verificarReserva(codigo);
    }

    @Override
    public ArrayList<Reserva> getReservas() {
        return (ArrayList<Reserva>) reservas;
    }

    @Override
    public boolean crearServicio(double precio, String codigo, TipoServicio tipo) {
        Servicio servicio = verficiarTipoServicio(tipo);
        Servicio servicioExistente = verificarServicio(codigo);
        if (servicioExistente == null){
            servicio.setPrecio(precio);
            servicio.setCodigo(codigo);
            servicios.add(servicio);
        }
        return false;
    }

    @Override
    public boolean eliminarServicio(String codigo) {
        Servicio servicio = verificarServicio(codigo);
        if (servicio != null){
            servicios.remove(servicio);
            return true;
        }
        return false;
    }

    @Override
    public boolean actualizarServicio(double precio, String codigo) {
        Servicio servicio = verificarServicio(codigo);
        if (servicio != null){
            servicio.setPrecio(precio);
            return true;
        }
        return false;
    }

    @Override
    public Servicio getServicio(String codigo) {
        return verificarServicio(codigo);
    }

    @Override
    public ArrayList<Servicio> getServicios() {
        return (ArrayList<Servicio>) servicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
