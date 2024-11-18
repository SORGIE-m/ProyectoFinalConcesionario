package co.edu.uniquindio.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.model.Administrador;
import co.edu.uniquindio.model.Camion;
import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Concesionario;
import co.edu.uniquindio.model.Empleado;
import co.edu.uniquindio.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
          * @throws IOException 
          */
         @FXML
         void clickLogin(ActionEvent event) throws IOException {
        if (!txtContra.getText().isEmpty() && !txtUsuario.getText().isEmpty()) {
            if (tipoPersona == "empleado") {
                Empleado p = concesionario.buscarEmpleado(txtUsuario.getText(), txtContra.getText());
                abrirVentanaEmpleado();
                this.empleadoUsando = p;
            }else if (tipoPersona == "admin") {
                Administrador a = concesionario.buscarAdmin(txtUsuario.getText(), txtContra.getText());
                abrirVentanaAdmin();
                this.adminUsando = a;
            }
        }else{
            System.out.println("Este usuario no existe");
            txtContra.clear();
            txtUsuario.clear();
        }
        
    }
    /**
     * Metodo para abrir la ventana con las acciones que puede hacer el empleado
     * @throws IOException 
     */
    public void abrirVentanaEmpleado() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/empleado-view.fxml"));
        Scene scene = new Scene(loader.load(), 600,400);
        Stage stage = new Stage();

        //Se envia el consesionario que se creo aqui
        EmpleadoViewController controller = loader.getController();
        controller.setConcesionario(concesionario);
        controller.setEmpleadoUsando(empleadoUsando);
        controller.inicializar();

        //Cerrar la ventana del login
        Stage stage2 = (Stage) btnAdmin.getScene().getWindow();
        stage2.close();
        
        stage.setScene(scene);
        stage.show();
    }
    /**
     * Metodo para abrir la ventana con las acciones que puede hacer el administrador
     */
    public void abrirVentanaAdmin(){
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
        
        //Creacion de clientes
        Cliente cliente1 = new Cliente("Gus", "Pollos hermanos", 0000000, "01");
        Cliente cliente2 = new Cliente("Sofia", "Pollos", 0000000, "02");

        //Creacion de vehiculos
        Camion camion1 = new Camion("Mazda", "Nuevo", "20219", 70, 900, 10, 500, false, false, false);
        Camion camion2 = new Camion("Samsung", "Nuevecito", "1600", 200, 100, 5, 300, false, true, false);

        concesionario.getLista_administradores().add(admin1);
        concesionario.getLista_empleados().add(empleado1);
        concesionario.getLista_empleados().add(empleado2);
        concesionario.getLista_clientes().add(cliente1);
        concesionario.getLista_clientes().add(cliente2);
        concesionario.getLista_vehiculos().add(camion1);
        concesionario.getLista_vehiculos().add(camion2);


        this.concesionario = concesionario;
    }
}
