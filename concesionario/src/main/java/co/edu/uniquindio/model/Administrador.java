package co.edu.uniquindio.model;

public class Administrador extends Persona {
    private String idAdmin;
    private String usuario;
    private String contra;

    
    public Administrador(String nombre, String documento, int telefono, String idAdmin, String usuario, String contra) {
        super(nombre, documento, telefono);
        this.idAdmin = idAdmin;
        this.usuario = usuario;
        this.contra = contra;
    }

    /**
     * 
     */
    public void registrarEmpleado(){

    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
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
