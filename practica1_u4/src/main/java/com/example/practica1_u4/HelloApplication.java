package com.example.practica1_u4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //leemos el FXML
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //redimensionamos la ventana
        Scene scene = new Scene(fxmlLoader.load(), 898, 463);
        //agregamos un titulo a la ventana
        stage.setTitle("Aplicacion IES");
        //asignamos la ventana
        stage.setScene(scene);
        //mostramos la ventana
        stage.show();
    }

    // ---- MAIN ----
    public static void main(String[] args) {
        //Lanzamos la la aplicacion
        launch();

    }
}