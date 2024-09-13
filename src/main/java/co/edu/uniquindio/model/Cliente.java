package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cliente {
    private String nombre;
    private String dni;
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Reserva> getReservas() {
        return (ArrayList<Reserva>) reservas;
    }
}
