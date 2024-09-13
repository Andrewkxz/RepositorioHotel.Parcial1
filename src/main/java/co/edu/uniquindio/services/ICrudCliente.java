package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Habitacion;

import java.util.ArrayList;

public interface ICrudCliente {
    boolean crearCliente(String nombre, String dni);

    boolean eliminarCliente(String dni);

    boolean modificarCliente(String dni, String nombre);

    Cliente getCliente(String dni);

    ArrayList<Cliente> getClientes();
}
