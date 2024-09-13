package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Servicio;

public abstract class ServicioBuilder<T extends ServicioBuilder<T>> {
    protected double precio;
    protected String codigo;

    public T precio(double precio) {
        this.precio = precio;
        return (T) this;
    }

    public T codigo(String codigo) {
        this.codigo = codigo;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public abstract Servicio build();
}
