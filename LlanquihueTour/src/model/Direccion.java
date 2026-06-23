package model;

public class Direccion {

    //Atributos
    private String calle;
    private String ciudad;
    private String region;
    private int numero;

    public Direccion(String calle, String ciudad, String region, int numero) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Direccion: " + calle + ", Ciudad: " + ciudad + ", Region: " + region + ", #" + numero;
    }

}
