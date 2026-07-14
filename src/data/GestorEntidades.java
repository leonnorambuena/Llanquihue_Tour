package data;

import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;
import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> listaEntidades;

    public GestorEntidades() {
        this.listaEntidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        listaEntidades.add(entidad);
    }

    public String obtenerReporteGeneral() {
        if (listaEntidades.isEmpty()) {
            return "No hay entidades registradas en el sistema.";
        }

        StringBuilder reporte = new StringBuilder();
        reporte.append("  ENTIDADES LLAQUIHUE TOUR  \n\n");

        for (Registrable entidad : listaEntidades) {
            reporte.append(entidad.mostrarResumen()).append("\n");

            if (entidad instanceof GuiaTuristico) {
                GuiaTuristico guia = (GuiaTuristico) entidad;
                reporte.append("   > RUT del Guía: ").append(guia.getIdioma()).append("\n");

            } else if (entidad instanceof Vehiculo) {
                Vehiculo vehiculo = (Vehiculo) entidad;
                reporte.append("   > Patente del Vehículo: ").append(vehiculo.getPatente()).append("\n");
            }

            reporte.append("--------------------------------------------------\n");
        }
        return reporte.toString();
    }
}
