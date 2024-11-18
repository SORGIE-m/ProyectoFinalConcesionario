package co.edu.uniquindio.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.model.Administrador;
import co.edu.uniquindio.model.Concesionario;
import co.edu.uniquindio.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class LoginViewController implements Initializable{
    private Concesionario concesionario;

    //Instancia del empleado que inicio sesion
    private Empleado empleadoUsando;
    //Instancia del administrador que inicio sesion
    private Administrador adminUsando;

    private String tipoPersona;

    @FXML
    private Button btnAdmin;

    @FXML
    private Button btnEmpleado;

    @FXML
    private Button btnLogin;

    @FXML
    private Pane paneLogin;

    @FXML
    private Pane paneSeleccion;

    @FXML
    private TextField txtContra;

    @FXML
    private TextField txtUsuario;
    /**
     * Cuando se le da click a administrador cambia de vista para iniciar sesion
     * @param event
     */
    @FXML
    void clickAdmin(ActionEvent event) {
        paneLogin.setVisible(true);
        paneSeleccion.setVisible(false);
        tipoPersona = "admin";
    }
    /**
     * Cuando se le da click a Empleado cambia de vista para iniciar sesion
     * @param event
     */
    @FXML
    void clickEmpleado(ActionEvent event) {
        paneLogin.setVisible(true);
        paneSeleccion.setVisible(false);
        tipoPersona = "empleado";
    }
    /**
     * Cuando se le da click a iniciar sesion, se extrae el texto de los textField y se usa para buscar el usuario dentro del
     * concesionario, si no existe el usuario ingresado, envia un mensaje por consola avisando el error
     * @param event
     */
    @FXML
    void clickLogin(ActionEvent event) {
        if (!txtContra.getText().isEmpty() && !txtUsuario.getText().isEmpty()) {
            if (tipoPersona == "empleado") {
                Empleado p = concesionario.buscarEmpleado(txtUsuario.getText(), txtContra.getText());
                abrirVentanaEmpleado(p);
            }else if (tipoPersona == "admin") {
                Administrador a = concesionario.buscarAdmin(txtUsuario.getText(), txtContra.getText());
                abrirVentanaAdmin(a);
            }
        }else{
            System.out.println("Este usuario no existe");
        }
        
    }
    /**
     * Metodo para abrir la ventana con las acciones que puede hacer el empleado
     */
    public void abrirVentanaEmpleado(Empleado p){
        System.out.println("Inicia Empleado");
    }
    /**
     * Metodo para abrir la ventana con las acciones que puede hacer el administrador
     */
    public void abrirVentanaAdmin(Administrador a){
        System.out.println("Inicia Admin");

    }
    /**
     * Metodo para crear un concesionario con varios empleados, administradores y vehiculos ya creados para probar
     */
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        inicializarDatos();
    }
    /**
     * Metodo anterior dicho
     */
    private void inicializarDatos(){
        Concesionario concesionario = new Concesionario("UQ");

        //Creacion de empleados
        Empleado empleado1 = new Empleado("pepito", "0000", 315656566, "01", "pepito07", "1234");
        Empleado empleado2 = new Empleado("Sorgie", "0001", 0000000, "02", "sorgie", "1234");

        //Creacion de administradores
        Administrador admin1 = new Administrador("Saitama", "11111", 1111111, "01", "admin", "admin");

        concesionario.getLista_administradores().add(admin1);
        concesionario.getLista_empleados().add(empleado1);
        concesionario.getLista_empleados().add(empleado2);

        this.concesionario = concesionario;
    }
}
