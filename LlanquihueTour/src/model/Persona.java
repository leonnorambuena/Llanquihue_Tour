package model;

public class Persona {

    //Atributos
    private String nombre;
    private String rut;
    private String correo;

    private Direccion direccion;

    public Persona(String nombre, String rut, String correo, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;

        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "No se ingreso Nombre";
        } else {
            this.nombre = nombre;
        }

        if (rut == null || rut.trim().isEmpty()) {
            this.rut = "No se ingreso RUT";
        } else {
            this.rut = rut;
        }

        if (correo == null || correo.trim().isEmpty()) {
            this.correo = "No se ingreso Correo";
        } else {
            this.correo = correo;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Persona(Direccion direccion) {
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nRut: " + rut + "\nCorreo: " + correo;
    }
}
