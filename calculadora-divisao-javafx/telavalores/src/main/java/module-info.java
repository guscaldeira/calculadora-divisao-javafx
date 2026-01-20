module com.primeiro.operador {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics; 

    opens com.primeiro.operador to javafx.fxml;
    exports com.primeiro.operador;
}
