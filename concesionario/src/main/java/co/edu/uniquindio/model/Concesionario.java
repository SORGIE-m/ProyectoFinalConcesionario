package co.edu.uniquindio.model;

import java.util.LinkedList;
import java.util.List;

public class Concesionario {
    private String nombre;
    private List<Empleado> lista_empleados;
    private List<Administrador> lista_administradores;
    private List<Cliente> lista_clientes;
    private List<Vehiculo> lista_vehiculos;
    private List<Moto> lista_motos;

    public Concesionario(String nombre){
        this.nombre = nombre;
        lista_administradores = new LinkedList<>();
        lista_clientes = new LinkedList<>();
        lista_empleados = new LinkedList<>();
        lista_vehiculos = new LinkedList<>();
        lista_motos = new LinkedList<>();
    }

    /**
     * Metodo que busca por usuario y contrase la persona que ya este registrada y la retorna
     * @param usuario
     * @param contra
     * @return
     */
    public Empleado buscarEmpleado(String usuario, String contra){
        for(Empleado p: lista_empleados){
            if (p.getUsuario().equals(usuario) && p.getContra().equals(contra)) {
                return p;
            }
        }
        return null;
    }
    /**
     * Mismo metodo de arriba pero con Administradores
     * @param usuario
     * @param contra
     * @return
     */
    public Administrador buscarAdmin(String usuario, String contra){
        for(Administrador a: lista_administradores){
            if (a.getUsuario().equals(usuario) && a.getContra().equals(contra)) {
                return a;
            }
        }
        return null;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getLista_empleados() {
        return lista_empleados;
    }

    public void setLista_empleados(List<Empleado> lista_empleados) {
        this.lista_empleados = lista_empleados;
    }

    public List<Administrador> getLista_administradores() {
        return lista_administradores;
    }

    public void setLista_administradores(List<Administrador> lista_administradores) {
        this.lista_administradores = lista_administradores;
    }

    public List<Cliente> getLista_clientes() {
        return lista_clientes;
    }

    public void setLista_clientes(List<Cliente> lista_clientes) {
        this.lista_clientes = lista_clientes;
    }

    public List<Vehiculo> getLista_vehiculos() {
        return lista_vehiculos;
    }

    public void setLista_vehiculos(List<Vehiculo> lista_vehiculos) {
        this.lista_vehiculos = lista_vehiculos;
    }

    public List<Moto> getLista_motos() {
        return lista_motos;
    }

    public void setLista_motos(List<Moto> lista_motos) {
        this.lista_motos = lista_motos;
    }
    
}
