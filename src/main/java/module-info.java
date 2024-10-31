module com.example.ejercicioo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicioo to javafx.fxml;
    exports com.example.ejercicioo;
}