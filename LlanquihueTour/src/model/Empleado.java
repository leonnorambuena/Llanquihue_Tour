package model;

public class Empleado extends Persona{
    
    private String ocupacion;
    private Direccion direccion;
    public Empleado(String nombre, String rut, String correo, String ocupacion, Direccion direccion) {
        super(nombre, rut, correo, direccion);
        this.ocupacion = ocupacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    @Override
    public String toString(){
        return "Ocupacion: " + ocupacion;
    }
}
