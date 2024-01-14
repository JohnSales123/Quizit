package com.example.quizit.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.Console;
import java.io.IOException;

public class WelcomeSceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void startGame(ActionEvent event) throws IOException {
        //System.out.println("PAsst");
        /*FXMLLoader loader = new FXMLLoader(getClass().getResource("QuestionScreen.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        //PrgameSceneController pregameSceneController = loader.getController();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        Button playGameButton = new Button();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("QuestionScreen.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) playGameButton.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Scene 2");
    }
}
