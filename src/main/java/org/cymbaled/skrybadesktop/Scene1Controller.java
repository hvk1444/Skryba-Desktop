package org.cymbaled.skrybadesktop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class Scene1Controller {

    @FXML
    private Label myLabel;
    @FXML
    private CheckBox checkbox;

    public void onSwitch(ActionEvent e) {
        if(checkbox.isSelected()) {
            myLabel.setText("ON");
        }
        if(!checkbox.isSelected()) {
            myLabel.setText("OFF");
        }
    }

}