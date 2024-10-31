package com.example.ejercicioo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.IOException;

/**
 * Clase que representa un componente de producto en la interfaz gráfica.
 * Esta clase extiende GridPane y se utiliza para mostrar información sobre un producto,
 * incluyendo su nombre, cantidad en stock y una imagen representativa.
 */
public class ProductoLabel extends GridPane {
    @FXML
    protected Label lblProducto;  // Etiqueta para mostrar el nombre del producto.
    @FXML
    protected Label lblNum;       // Etiqueta para mostrar la cantidad en stock.
    @FXML
    private ImageView img;        // ImageView para mostrar la imagen del producto.

    /**
     * Constructor de la clase ProductoLabel.
     * Carga el archivo FXML correspondiente y establece este objeto como controlador.
     */
    public ProductoLabel() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/ejercicioo/hello-view.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    /**
     * Establece la cantidad de stock del producto y cambia el estilo de la etiqueta
     * en función de la cantidad.
     *
     * @param cantidad La cantidad de stock disponible del producto.
     */
    public void setStock(double cantidad) {
        String style;
        if (cantidad > 100) {
            style = "verde"; // Estilo para stock alto.
        } else if (cantidad > 20) {
            style = "azul";  // Estilo para stock medio.
        } else {
            style = "rojo";  // Estilo para stock bajo.
        }
        lblNum.setText(cantidad + "");
        this.getStyleClass().clear();
        this.getStyleClass().add(style);
    }

    /**
     * Establece la imagen del producto.
     *
     * @param imagen La imagen a mostrar del producto.
     */
    public void setImage(Image imagen) {
        img.setImage(imagen);
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre El nombre del producto a mostrar.
     */
    public void setName(String nombre) {
        lblProducto.setText(nombre + "");
    }
}
