package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.ServicioLimpieza;

public class LimpiezaBuilder extends ServicioBuilder<LimpiezaBuilder> {
    @Override
    protected LimpiezaBuilder self() {
        return this;
    }

    @Override
    public ServicioLimpieza build() {
        return new ServicioLimpieza(precio, codigo);
    }
}
