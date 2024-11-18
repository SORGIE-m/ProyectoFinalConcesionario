package co.edu.uniquindio.model;

public class Cliente extends Persona{
    private String idCliente;

    public Cliente(String nombre, String documento, int telefono, String idCliente) {
        super(nombre, documento, telefono);
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    
}
