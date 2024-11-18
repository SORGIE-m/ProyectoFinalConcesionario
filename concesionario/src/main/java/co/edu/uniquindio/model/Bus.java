package co.edu.uniquindio.model;


public class Bus extends Vehiculo{
    private int pasajeros;
    private int puertas;
    private double maletero;
    private boolean aire;
    private boolean camara;
    private int bolsas;
    private boolean abs;
    private int ejes;
    private int salidasEmergencia;

    

    public Bus(String marca, String estado, String modelo, int cambios, int velocidadMax, int cilindraje, int pasajeros,
            int puertas, double maletero, boolean aire, boolean camara, int bolsas, boolean abs, int ejes,
            int salidasEmergencia) {
        super(marca, estado, modelo, cambios, velocidadMax, cilindraje);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.maletero = maletero;
        this.aire = aire;
        this.camara = camara;
        this.bolsas = bolsas;
        this.abs = abs;
        this.ejes = ejes;
        this.salidasEmergencia = salidasEmergencia;
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

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getSalidasEmergencia() {
        return salidasEmergencia;
    }

    public void setSalidasEmergencia(int salidasEmergencia) {
        this.salidasEmergencia = salidasEmergencia;
    }
    
}
