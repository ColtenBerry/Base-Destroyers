package com.example.basedestroyers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {
    @FXML
    private AnchorPane pane;
    @FXML
    private Label title;
    @FXML
    private Button playButton;
    @FXML
    private Button spareButton;
    private Stage stage;
    private Scene scene;
    @FXML
    private void play(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DifficultyMenu.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
