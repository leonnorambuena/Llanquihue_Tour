package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Direccion;
import model.Persona;

public class Datos {

    String rutaArchivo = "datosllanquihue.txt";

    public ArrayList<Persona> info(String Archivo) {
        ArrayList<Persona> mostrarInfo = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Archivo))) {
            String lectura;
            while ((lectura = br.readLine()) != null) {
                String[] partes = lectura.split(";");
                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    String rut = partes[1].trim();
                    String correo = partes[2].trim();
                    Direccion direccion = null;
                    Persona nuevaPersona = new Persona(nombre, rut, correo, direccion);
                    mostrarInfo.add(nuevaPersona);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        return mostrarInfo;
    }
}
