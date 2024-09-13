package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.ServicioSpa;

public class SpaBuilder extends ServicioBuilder<SpaBuilder> {
    @Override
    protected SpaBuilder self() {
        return this;
    }

    @Override
    public ServicioSpa build() {
        return new ServicioSpa(precio, codigo);
    }
}
