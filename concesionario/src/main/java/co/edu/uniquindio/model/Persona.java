package co.edu.uniquindio.model;

public class Persona {
    private String nombre;
    private String documento;
    private int telefono;

    
    public Persona(String nombre, String documento, int telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
