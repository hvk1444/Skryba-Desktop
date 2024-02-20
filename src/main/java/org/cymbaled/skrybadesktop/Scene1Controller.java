package org.cymbaled.skrybadesktop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {

    @FXML
    private Button switchButton;
    @FXML
    private ImageView imgView;

    Image myImage = new Image(getClass().getResourceAsStream("image2.jpg"));

    public void switchImage() {
        imgView.setImage(myImage);
    }

}