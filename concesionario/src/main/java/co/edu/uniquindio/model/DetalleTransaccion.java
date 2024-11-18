package co.edu.uniquindio.model;

public class DetalleTransaccion {
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private TipoTransaccion tipo;
    
    

    public DetalleTransaccion(Empleado empleado, Cliente cliente, Vehiculo vehiculo, TipoTransaccion tipo) {
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.tipo = tipo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransaccion tipo) {
        this.tipo = tipo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
}
