package co.edu.uniquindio.model;

public class Moto {
    private String marca;
    private String estado;
    private String modelo;
    private int cambios;
    private int velocidadMax;
    private int cilindraje;

    public Moto(String marca, String estado, String modelo, int cambios, int velocidadMax, int cilindraje) {
        this.marca = marca;
        this.estado = estado;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMax = velocidadMax;
        this.cilindraje = cilindraje;
    }
     
    public String determinarTransmision(){
        return "";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
}
