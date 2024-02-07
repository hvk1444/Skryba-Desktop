package org.cymbaled.skrybadesktop;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws URISyntaxException, IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Image icon = new Image(getClass().getResource("icon.png").toExternalForm());

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.setTitle("Skryba");
        stage.setOnCloseRequest(event -> {
            event.consume();
            logout(stage);
        });
        stage.show();
    }

    public void logout (Stage stage) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to log out");
        alert.setContentText("Do you want to save before exiting?");

        if(alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You just logged out");
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}