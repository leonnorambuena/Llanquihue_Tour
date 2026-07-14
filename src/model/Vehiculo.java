package model;

public class Vehiculo implements Registrable{

    private String patente;
    private int capacidad;

    public Vehiculo(String patente, int capacidad) {
        this.patente = patente;
        this.capacidad = capacidad;
    }

    public String getPatente() {
        return patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String mostrarResumen() {
        return "Patente del vehiculo: " + patente + " | Capacidad: " + capacidad + " pasajeros";
    }
}
