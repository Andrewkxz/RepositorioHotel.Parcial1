package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Servicio;
import co.edu.uniquindio.model.TipoServicio;

import java.util.ArrayList;

public interface ICrudServicio {
    boolean crearServicio(double precio, String codigo, TipoServicio tipoServicio);

    boolean eliminarServicio(String codigo);

    boolean actualizarServicio(double precio, String codigo);

    Servicio getServicio(String codigo);

    ArrayList<Servicio> getServicios();
}
