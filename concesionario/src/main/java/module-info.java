module co.edu.uniquindio {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.viewController to javafx.fxml;
    exports co.edu.uniquindio;
    exports co.edu.uniquindio.viewController;
    exports co.edu.uniquindio.model;
}
