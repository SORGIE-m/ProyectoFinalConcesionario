package co.edu.uniquindio.model;


public class Empleado extends Persona{
    private String idEmpleado;
    private String usuario;
    private String contra;
    
    public Empleado(String nombre, String documento, int telefono, String idEmpleado, String usuario, String contra) {
        super(nombre, documento, telefono);
        this.idEmpleado = idEmpleado;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    
}
