module com.example.pentek {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pentek to javafx.fxml;
    exports com.example.pentek;
}