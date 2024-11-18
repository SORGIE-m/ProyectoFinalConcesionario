package co.edu.uniquindio.model;

public class Camion extends Vehiculo{
    private double carga;
    private boolean aire;
    private boolean abs;
    private boolean frenosAire;
    
    public Camion(String marca, String estado, String modelo, int cambios, int velocidadMax, int cilindraje,
            double carga, boolean aire, boolean abs, boolean frenosAire) {
        super(marca, estado, modelo, cambios, velocidadMax, cilindraje);
        this.carga = carga;
        this.aire = aire;
        this.abs = abs;
        this.frenosAire = frenosAire;
    }

    @Override
    public String determinarTransmision() {
        return "";
    }

    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }
    public boolean isAire() {
        return aire;
    }
    public void setAire(boolean aire) {
        this.aire = aire;
    }
    public boolean isAbs() {
        return abs;
    }
    public void setAbs(boolean abs) {
        this.abs = abs;
    }
    public boolean isFrenosAire() {
        return frenosAire;
    }
    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    
}
