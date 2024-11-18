package co.edu.uniquindio.model;

import co.edu.uniquindio.services.IElectrico;

public class Deportivo extends Vehiculo implements IElectrico {
    private int pasajeros;
    private int puertas;
    private int bolsas;
    private double caballos;
    private double ceroACien;

    

    public Deportivo(String marca, String estado, String modelo, int cambios, int velocidadMax, int cilindraje,
            int pasajeros, int puertas, int bolsas, double caballos, double ceroACien) {
        super(marca, estado, modelo, cambios, velocidadMax, cilindraje);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.bolsas = bolsas;
        this.caballos = caballos;
        this.ceroACien = ceroACien;
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



    public int getBolsas() {
        return bolsas;
    }



    public void setBolsas(int bolsas) {
        this.bolsas = bolsas;
    }



    public double getCaballos() {
        return caballos;
    }



    public void setCaballos(double caballos) {
        this.caballos = caballos;
    }



    public double getCeroACien() {
        return ceroACien;
    }



    public void setCeroACien(double ceroACien) {
        this.ceroACien = ceroACien;
    }
    
}   
