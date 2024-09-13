package co.edu.uniquindio;

import co.edu.uniquindio.factory.ModelFactory;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        crudEmpleado(modelFactory);
    }

    public static void crudEmpleado(ModelFactory modelFactory) {
        crearEmpleado(modelFactory);
        eliminarEmpleado(modelFactory);
    }

    public static void crearEmpleado(ModelFactory modelFactory) {
        boolean creado = modelFactory.crearCliente("Juan","1234");
        System.out.println("El proceso de creacion ha finalizado con un estado de: " + creado);
    }

    public static void eliminarEmpleado(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarCliente("1234");
        System.out.println("El proceso de eliminacion ha finalizado con un estado de: " + eliminado);
    }
}