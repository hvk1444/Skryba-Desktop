package org.cymbaled.skrybadesktop;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
        Group root = new Group();
        Scene scene = new Scene(root, Color.AQUAMARINE);
        Image icon = new Image(HelloApplication.class.getResource("icon.png").toURI().toString());

        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.setTitle("Skryba");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}