module com.example.practica1_u4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practica1_u4 to javafx.fxml;
    exports com.example.practica1_u4;
}