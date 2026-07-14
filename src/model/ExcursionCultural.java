package model;

public class ExcursionCultural extends ServicioTuristico{
    
    private String lugarHIstorico;

    public ExcursionCultural(String lugarHIstorico, String nombre, double duracionHoras) {
        super(nombre, duracionHoras);
        this.lugarHIstorico = lugarHIstorico;
    }

    public String getLugarHIstorico() {
        return lugarHIstorico;
    }

    public void setLugarHIstorico(String lugarHIstorico) {
        this.lugarHIstorico = lugarHIstorico;
    }
    
     @Override
    public String toString() {
        return "Lugar historico: " + lugarHIstorico;

    }
    
}