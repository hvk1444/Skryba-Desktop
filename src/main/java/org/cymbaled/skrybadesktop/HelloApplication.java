package org.cymbaled.skrybadesktop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws URISyntaxException, IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Image icon = new Image(getClass().getResource("icon.png").toURI().toString());

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.setTitle("Skryba");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}