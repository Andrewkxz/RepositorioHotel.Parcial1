package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.ServicioRestaurante;

public class RestauranteBuilder extends ServicioBuilder<RestauranteBuilder> {
    @Override
    protected RestauranteBuilder self() {
        return this;
    }

    @Override
    public ServicioRestaurante build() {
        return new ServicioRestaurante(precio, codigo);
    }
}
