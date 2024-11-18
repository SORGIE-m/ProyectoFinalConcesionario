package co.edu.uniquindio.model;

import co.edu.uniquindio.services.IElectrico;

public class CamionetaSuv extends Vehiculo implements IElectrico {
    private int pasajeros;
    private int puertas;
    private double maletero;
    private boolean aire;
    private boolean camara;
    private boolean crucero;
    private int bolsas;
    private boolean abs;
    private boolean sensoresColision;
    private boolean sensoresTrafico;
    private boolean asistente;
    private boolean todoTerreno;

    

    public CamionetaSuv(String marca, String estado, String modelo, int cambios, int velocidadMax, int cilindraje,
            int pasajeros, int puertas, double maletero, boolean aire, boolean camara, boolean crucero, int bolsas,
            boolean abs, boolean sensoresColision, boolean sensoresTrafico, boolean asistente, boolean todoTerreno) {
        super(marca, estado, modelo, cambios, velocidadMax, cilindraje);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.maletero = maletero;
        this.aire = aire;
        this.camara = camara;
        this.crucero = crucero;
        this.bolsas = bolsas;
        this.abs = abs;
        this.sensoresColision = sensoresColision;
        this.sensoresTrafico = sensoresTrafico;
        this.asistente = asistente;
        this.todoTerreno = todoTerreno;
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


    public double getMaletero() {
        return maletero;
    }


    public void setMaletero(double maletero) {
        this.maletero = maletero;
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


    public boolean isCrucero() {
        return crucero;
    }


    public void setCrucero(boolean crucero) {
        this.crucero = crucero;
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


    public boolean isSensoresColision() {
        return sensoresColision;
    }


    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }


    public boolean isSensoresTrafico() {
        return sensoresTrafico;
    }


    public void setSensoresTrafico(boolean sensoresTrafico) {
        this.sensoresTrafico = sensoresTrafico;
    }


    public boolean isAsistente() {
        return asistente;
    }


    public void setAsistente(boolean asistente) {
        this.asistente = asistente;
    }


    public boolean isTodoTerreno() {
        return todoTerreno;
    }


    public void setTodoTerreno(boolean todoTerreno) {
        this.todoTerreno = todoTerreno;
    }
    
}
