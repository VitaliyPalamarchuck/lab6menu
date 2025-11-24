package org.example.lab6menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloController {
    private Stage newStage;
    @FXML
    private AnchorPane scenePane;
    @FXML
    private MenuItem Exit;

    @FXML
    void exitButton(ActionEvent event) {
        newStage = (Stage) scenePane.getScene().getWindow();
        System.out.println("Success");
        newStage.close();
    }

}
