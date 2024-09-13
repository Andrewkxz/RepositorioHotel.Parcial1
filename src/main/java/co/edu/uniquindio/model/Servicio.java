package co.edu.uniquindio.model;

import co.edu.uniquindio.services.IConsumible;

public abstract class Servicio implements IConsumible {
    private double precio;
    private String codigo;

    public Servicio() {
    }

    public Servicio(double precio, String codigo) {
        this.precio = precio;
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
