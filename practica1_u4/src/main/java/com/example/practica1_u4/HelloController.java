package com.example.practica1_u4;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    private List<Persona> listaPersonas = new ArrayList<>();

    /*
     Copiamos desdel el SceneBuilder todos los atributos dirigiendonos a
     View > Show sample controller skeleton
     */

    @FXML
    private Button BotonEliminar;

    @FXML
    private Button botonAgregar;

    @FXML
    private Button botonBuscar;

    @FXML
    private Button botonMostrar;
    @FXML
    private TableColumn<Persona, String> colDNI;

    @FXML
    private TableColumn<Persona, String> colEdad;

    @FXML
    private TableColumn<Persona, String> colNombre;

    @FXML
    private TableColumn<Persona, String> colTlf;

    @FXML
    private Menu menuAbout;

    @FXML
    private Menu menuAlum;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Menu menuCur;

    @FXML
    private Menu menuProfe;

    @FXML
    private TableView<Persona> tablaPersona;

    @FXML
    private TextField textEdad;

    @FXML
    private TextField txtDni;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTlf;

    // ---- LISTENERS ----
    // Boton agregar
    @FXML
    void pulsarAgregar(MouseEvent event) {
        //agregamos a la lista una nueva persona
        listaPersonas.add(new Persona(txtNombre.getText(),txtDni.getText(),txtTlf.getText(),textEdad.getText()));
    }

    // Boton buscar
    @FXML
    void pulsarBuscar(MouseEvent event) {

    }

    // Boton eliminar
    @FXML
    void pulsarEliminar(MouseEvent event) {

    }

    // Boton mostrar
    @FXML
    void pulsarMostrar(MouseEvent event) {
        for (Persona p : listaPersonas) {
            colNombre.setCellValueFactory(new PropertyValueFactory<>(p.getNombre()));
            colDNI.setCellValueFactory(new PropertyValueFactory<>(p.getDNI()));
            colTlf.setCellValueFactory(new PropertyValueFactory<>(String.valueOf(p.getTlf())));
            colEdad.setCellValueFactory(new PropertyValueFactory<>(String.valueOf(p.getEdad())));

            tablaPersona.getColumns().addAll(colNombre,colDNI,colTlf,colEdad);
        }
    }


}

