package com.example.practica1_u4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.*;
import javafx.stage.Popup;

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
    private Menu menuPer;

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
        agregarPer();
    }

    // Boton buscar
    @FXML
    void pulsarBuscar(MouseEvent event) {
        buscarPer();
    }

    // Boton eliminar
    @FXML
    void pulsarEliminar(MouseEvent event) {
        eliminarPer();
    }

    // Boton mostrar
    @FXML
    void pulsarMostrar(MouseEvent event) {
        mostrarPer();
    }

    @FXML
    void itemAgregarPer(ActionEvent event) {
        agregarPer();
    }

    @FXML
    void itemBuscarPer(ActionEvent event) {
        buscarPer();
    }

    @FXML
    void itemEliminarPer(ActionEvent event) {
        eliminarPer();
    }

    @FXML
    void itemMostrarPer(ActionEvent event) {
        mostrarPer();
    }

    // ---- METODOS ---
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        colDNI.setCellValueFactory(new PropertyValueFactory<>("DNI"));
        colTlf.setCellValueFactory(new PropertyValueFactory<>("Tlf"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("Edad"));
    }

    /**
     * Metodo para mostrar en la tabla las personas
     */
    private void mostrarPer() {
        //eliminamos todos los items de la tabla
        tablaPersona.getItems().removeAll(tablaPersona.getItems());

        //refrescamos la tabla
        tablaPersona.refresh();

        //añadimnos a las personas en la tabla
        for (Persona p : listaPersonas) {
            tablaPersona.getItems().add(p);
        }
    }

    /**
     * Metodo para eliminar personas cuando seleccionamos una fila en la tabla
     */
    private void eliminarPer() {
        //eliminamos de la tabla el item que tengamos seleccionado
        Persona p = tablaPersona.getSelectionModel().getSelectedItem();

        //lo eliminamos de la lista
        listaPersonas.remove(p);

        //eliminamos todos los items de la tabla
        tablaPersona.getItems().remove(p);

        //refrescamos la tabla
        tablaPersona.refresh();
    }

    /**
     * Metodo para buscar personas a traves de su DNI
     */
    private void buscarPer() {
        //recorremos la lista de personas
        for (Persona p : listaPersonas) {
            //si el dni de la persona es igual al dni del textfield
            if(p.getDNI().equalsIgnoreCase(txtDni.getText())) {
                //eliminamos a todas las personas de la lista de la tabla
                tablaPersona.getItems().removeAll(listaPersonas);
                //añadimos la persona a la tabla
                tablaPersona.getItems().add(p);
            }
        }

        //refrescamos la tabla
        tablaPersona.refresh();
    }

    /**
     * Metodo para agregar personas
     */
    private void agregarPer() {
        if(txtNombre.getText().equals("") || txtDni.getText().equals("")|| txtTlf.getText().equals("") || textEdad.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Error al agregar");
            alert.setContentText("Error, puede que algun campo este vacio. Vuelvelo a intentar");
            alert.showAndWait();
        }else
            //agregamos a la lista una nueva persona
            listaPersonas.add(new Persona(txtNombre.getText(),txtDni.getText(),txtTlf.getText(),textEdad.getText()));
    }

}

