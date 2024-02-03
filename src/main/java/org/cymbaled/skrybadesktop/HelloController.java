package org.cymbaled.skrybadesktop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private Circle circle;

    private static final double MOVE_DISTANCE_STEP = 10.0;


    public void up(ActionEvent e) {
        circle.setCenterY(circle.getCenterY() - MOVE_DISTANCE_STEP);
    }

    public void down(ActionEvent e) {
        circle.setCenterY(circle.getCenterY() + MOVE_DISTANCE_STEP);
    }

    public void left(ActionEvent e) {
        circle.setCenterX(circle.getCenterX() - MOVE_DISTANCE_STEP);
    }

    public void right(ActionEvent e) {
        circle.setCenterX(circle.getCenterX() + MOVE_DISTANCE_STEP);
    }

    public void killYourself(ActionEvent e) {
        throw new IllegalStateException("NO");
    }

}