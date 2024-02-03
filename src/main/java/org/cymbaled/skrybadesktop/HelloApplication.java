package org.cymbaled.skrybadesktop;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws URISyntaxException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.AQUAMARINE);
        Image icon = new Image(HelloApplication.class.getResource("icon.png").toURI().toString());

        Text text = new Text();
        text.setText("А МЫ НЕ ДУУМАЛИИИИ");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.DARKGREEN);
        root.getChildren().add(text);

        Line line = new Line();
        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(200);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.8);
        line.setRotate(69);
        root.getChildren().add(line);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(250);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BISQUE);
        rectangle.setStrokeWidth(10);
        rectangle.setStroke(Color.WHEAT);
        rectangle.setRotate(45);
        root.getChildren().add(rectangle);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                300.0,300.0,
                400.0,400.0,
                300.0,400.0);
        triangle.setFill(Color.YELLOW);
        root.getChildren().add(triangle);

        Circle circle = new Circle();
        circle.setCenterX(500);
        circle.setCenterY(500);
        circle.setRadius(50);
        circle.setStroke(Color.CORAL);
        root.getChildren().add(circle);

        ImageView imageView = new ImageView(icon);
        imageView.setX(400);
        imageView.setY(400);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.setTitle("Skryba");
//        stage.setWidth(420);
//        stage.setHeight(200);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}