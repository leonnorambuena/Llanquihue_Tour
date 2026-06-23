package app;

import data.Datos;
import java.util.ArrayList;
import model.Persona;

public class Main {

    public static void main(String[] args) {
        Datos gestionDatos = new Datos();
        ArrayList<Persona> listaPersonas = gestionDatos.info("datosllanquihue.txt");
         
        System.out.println("Lista de Personas Registradas");
        for (Persona p : listaPersonas) {

            System.out.println("Nombre: " + p.getNombre() + " | RUT: " + p.getRut() + " | Correo: " + p.getCorreo());
        }
    }
}
