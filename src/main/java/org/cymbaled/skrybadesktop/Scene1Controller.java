package org.cymbaled.skrybadesktop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Scene1Controller {

    @FXML
    private Button myButton;
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;

    int age;

    public void submit(ActionEvent event) {
        try {
            age = Integer.parseInt(myTextField.getText());
            System.out.println(age);
            if (age >= 18) {
                myLabel.setText("You are now signed up");
            } else {
                myLabel.setText("You are too young");
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

}