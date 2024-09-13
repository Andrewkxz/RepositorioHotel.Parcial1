package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.ServicioHabitacion;
import co.edu.uniquindio.model.ServicioLimpieza;

public class HabitacionBuilder extends ServicioBuilder<co.edu.uniquindio.model.builder.HabitacionBuilder>{
        @Override
        protected co.edu.uniquindio.model.builder.HabitacionBuilder self() {
            return this;
        }

        @Override
        public ServicioHabitacion build() {
            return new ServicioHabitacion(precio, codigo);
        }
}
