package co.edu.uniquindio.model;

import co.edu.uniquindio.services.IElectrico;

public class PickUp extends Vehiculo implements IElectrico {
    private int pasajeros;
    private int puertas;
    private boolean aire;
    private boolean camara;
    private int bolsas;
    private boolean abs;
    private boolean todoTerreno;
    private double capacidadCaja;

    

    public PickUp(String marca, String estado, String modelo, int cambios, int velocidadMax, int cilindraje,
            int pasajeros, int puertas, boolean aire, boolean camara, int bolsas, boolean abs, boolean todoTerreno,
            double capacidadCaja) {
        super(marca, estado, modelo, cambios, velocidadMax, cilindraje);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.aire = aire;
        this.camara = camara;
        this.bolsas = bolsas;
        this.abs = abs;
        this.todoTerreno = todoTerreno;
        this.capacidadCaja = capacidadCaja;
    }

    @Override
    public void determinarHibrido() {
        
    }

    @Override
    public void calcularAutonomia() {
        
    }

    @Override
    public void tiempoPromedioCarga() {
        
    }

    @Override
    public void determinarEnchufable() {
        
    }

    @Override
    public String determinarTransmision() {
        return "";
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isAire() {
        return aire;
    }

    public void setAire(boolean aire) {
        this.aire = aire;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    public int getBolsas() {
        return bolsas;
    }

    public void setBolsas(int bolsas) {
        this.bolsas = bolsas;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isTodoTerreno() {
        return todoTerreno;
    }

    public void setTodoTerreno(boolean todoTerreno) {
        this.todoTerreno = todoTerreno;
    }

    public double getCapacidadCaja() {
        return capacidadCaja;
    }

    public void setCapacidadCaja(double capacidadCaja) {
        this.capacidadCaja = capacidadCaja;
    }

     
}
