package model;

public class ServicioTuristico {

    private String nombre;
    private double duracionHoras;

    public ServicioTuristico(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public void mostrarInformacion() {
        System.out.println("Servicio: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }
    public String mostrarResumen(){
        return "Nombre: " + nombre
             + " | Duracion: " + duracionHoras;
    }
    
}
