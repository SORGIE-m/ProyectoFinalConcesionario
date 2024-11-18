package co.edu.uniquindio.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Concesionario;
import co.edu.uniquindio.model.DetalleTransaccion;
import co.edu.uniquindio.model.Empleado;
import co.edu.uniquindio.model.TipoTransaccion;
import co.edu.uniquindio.model.Vehiculo;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class EmpleadoViewController{
    private Concesionario concesionario;
    private Empleado empleadoUsando;
    private ObservableList<Cliente> clientes;
    private ObservableList<Vehiculo> vehiculos;
    @FXML
    private Pane PaneAlquilar;

    @FXML
    private Pane PaneRegistrar;

    @FXML
    private Pane PaneVender;

    @FXML
    private ComboBox<Cliente> boxUsuario;

    @FXML
    private ComboBox<Vehiculo> boxVehiculo;

    @FXML
    private ComboBox<Cliente> boxVenderUsuario;

    @FXML
    private ComboBox<Vehiculo> boxVenderVehiculo;

    @FXML
    private Button btnAlquilarVehiculo;

    @FXML
    private Button btnRegistrar;

    @FXML
    private Button btnRegistrarCliente;

    @FXML
    private Button btnVender;

    @FXML
    private Button btnVenta;

    @FXML
    private Button btnVentanaAlquilar;

    @FXML
    private Label labelNombreEmpleado;

    @FXML
    private TextField txtDocumento;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;
    /**
     * Metodo que para cuando se le de click al boton del lado derecho de alquilar, se muestren las opcionces de alquilar
     * @param event
     */
    @FXML
    void clickAlquilar(ActionEvent event) {
        PaneAlquilar.setVisible(true);
        PaneRegistrar.setVisible(false);
        PaneVender.setVisible(false);
    }
    /**
     * Lo mismo de arriba pero para registrar
     * @param event
     */
    @FXML
    void clickRegistrarCliente(ActionEvent event) {
        PaneAlquilar.setVisible(false);
        PaneRegistrar.setVisible(true);
        PaneVender.setVisible(false);
    }
    
    /**
     * Lo mismo de arriba pero para Vender
     * @param event
     */
    @FXML
    void clickVender(ActionEvent event) {
        PaneAlquilar.setVisible(false);
        PaneRegistrar.setVisible(false);
        PaneVender.setVisible(true);
    }

    @FXML
    void clickRegistrar(ActionEvent event) {
        if (!txtNombre.getText().isEmpty() && !txtDocumento.getText().isEmpty() && !txtId.getText().isEmpty() && !txtTelefono.getText().isEmpty()) {
            Cliente cliente = new Cliente(txtNombre.getText(), txtDocumento.getText(), Integer.parseInt(txtTelefono.getText()), txtId.getText());
            concesionario.getLista_clientes().add(cliente);
            clientes.add(cliente);

            txtNombre.clear();
            txtDocumento.clear();
            txtId.clear();
            txtTelefono.clear();
            System.out.println("Cliente Registrado!");
        }else{
            System.out.println("Porfavor llene todos los espacios antes de registrar");
        }
    }
    /**
     * Metodo que cuando se le da click a vender, verifica que el empleado haya seleccionado items antes de realizar la transaccion
     * @param event
     */
    @FXML
    void clickVenta(ActionEvent event) {
        if (boxVenderUsuario.getSelectionModel().getSelectedItem() != null && boxVenderVehiculo.getSelectionModel().getSelectedItem() != null) {
            DetalleTransaccion transaccion = new DetalleTransaccion(empleadoUsando, boxVenderUsuario.getSelectionModel().getSelectedItem(), boxVenderVehiculo.getSelectionModel().getSelectedItem(), TipoTransaccion.VENTA);
            concesionario.getLista_transacciones().add(transaccion);
            boxVenderUsuario.getSelectionModel().clearSelection();
            boxVenderVehiculo.getSelectionModel().clearSelection();
            System.out.println("Transaccion de venta realizada con exito!");
        }
    }
    /**
     * Metodo que hace lo mismo que el de arriba pero en la pestana de Alquilar y que genera una transaccion distinta
     * @param event
     */
    @FXML
    void clickVentanaAlquilar(ActionEvent event) {
        if (boxUsuario.getSelectionModel().getSelectedItem() != null && boxVehiculo.getSelectionModel().getSelectedItem() != null) {
            DetalleTransaccion transaccion = new DetalleTransaccion(empleadoUsando, boxUsuario.getSelectionModel().getSelectedItem(), boxVehiculo.getSelectionModel().getSelectedItem(), TipoTransaccion.ALQUILER);
            concesionario.getLista_transacciones().add(transaccion);
            boxVehiculo.getSelectionModel().clearSelection();
            boxUsuario.getSelectionModel().clearSelection();
            System.out.println("Transaccion de alquiler realizada con exito!");
        }
    }
    
    public void inicializar() {
        vehiculos = FXCollections.observableArrayList();
        clientes = FXCollections.observableArrayList();

        vehiculos.addAll(concesionario.getLista_vehiculos()); 
        clientes.addAll(concesionario.getLista_clientes());

        boxUsuario.setItems(FXCollections.observableArrayList(clientes));
        boxVenderUsuario.setItems(FXCollections.observableArrayList(clientes));
        boxVehiculo.setItems(FXCollections.observableArrayList(vehiculos));
        boxVenderVehiculo.setItems(FXCollections.observableArrayList(vehiculos));

        boxUsuario.setCellFactory(lv -> new ListCell<Cliente>(){
            @Override
            protected void updateItem(Cliente item, boolean empty){
                super.updateItem(item, empty);
                setText(empty ? "" : item.getNombre() + "---" + item.getDocumento());
            }
        });

        boxVenderUsuario.setCellFactory(lv -> new ListCell<Cliente>(){
            @Override
            protected void updateItem(Cliente item, boolean empty){
                super.updateItem(item, empty);
                setText(empty ? "" : item.getNombre() + "---" + item.getDocumento());
            }
        });

        boxVehiculo.setCellFactory(lv -> new ListCell<Vehiculo>(){
            @Override
            protected void updateItem(Vehiculo item, boolean empty){
                super.updateItem(item, empty);
                setText(empty ? "" : item.getMarca() + "---" + item.getModelo());
            }
        });

        boxVenderVehiculo.setCellFactory(lv -> new ListCell<Vehiculo>(){
            @Override
            protected void updateItem(Vehiculo item, boolean empty){
                super.updateItem(item, empty);
                setText(empty ? "" : item.getMarca() + "---" + item.getModelo());
            }
        });
        boxUsuario.setButtonCell(boxUsuario.getCellFactory().call(null));
        boxVehiculo.setButtonCell(boxVehiculo.getCellFactory().call(null));
        boxVenderUsuario.setButtonCell(boxVenderUsuario.getCellFactory().call(null));
        boxVenderVehiculo.setButtonCell(boxVenderVehiculo.getCellFactory().call(null));

    }
    public Concesionario getConcesionario() {
        return concesionario;
    }
    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }
    public Empleado getEmpleadoUsando() {
        return empleadoUsando;
    }
    public void setEmpleadoUsando(Empleado empleadoUsando) {
        this.empleadoUsando = empleadoUsando;
    }
    

}