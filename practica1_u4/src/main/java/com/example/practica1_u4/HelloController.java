package com.example.practica1_u4;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

// necesitamos implementar el initializable porque es como un main del controlador, para poder tener su metodo
// y poder asi asignarle en el metodo los getters de la columna porque si no, no accede a los getters de Persona
public class HelloController implements Initializable {
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
        System.out.println("Agregado");
    }

    // Boton buscar
    @FXML
    void pulsarBuscar(MouseEvent event) {
        System.out.println("Buscado");
    }

    // Boton eliminar
    @FXML
    void pulsarEliminar(MouseEvent event) {
        System.out.println("Eliminado");
    }

    // Boton mostrar
    @FXML
    void pulsarMostrar(MouseEvent event) {
        System.out.println("Mostrado");
        for (Persona p : listaPersonas) {
            tablaPersona.getItems().add(p);
        }
    }

    // ---- METODOS ---
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        colDNI.setCellValueFactory(new PropertyValueFactory<>("DNI"));
        colTlf.setCellValueFactory(new PropertyValueFactory<>("Tlf"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("Edad"));
    }
}

