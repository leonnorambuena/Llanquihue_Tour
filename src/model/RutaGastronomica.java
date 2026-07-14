package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroParadas;

    public RutaGastronomica(String nombre, double duracionHoras, int numeroParadas) {
        super(nombre, duracionHoras);
        this.numeroParadas = numeroParadas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    @Override
    public String toString() {
        return "Ruta Gastronomica: " + getNombre() + 
               " | Duracion: " + getDuracionHoras() + " hrs" +
               " | Paradas: " + numeroParadas;
    }
}
