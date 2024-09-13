package co.edu.uniquindio.model;

import java.util.ArrayList;

public class Habitacion {
    private String num;
    private TipoHabitacion tipo;
    private double precio;
    private ArrayList<Servicio> servicios; ;

    public Habitacion() {
    }

    public Habitacion(String num, TipoHabitacion tipo, double precio) {
        this.num = num;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Servicio> getServicios() {
        return (ArrayList<Servicio>) servicios;
    }
}
