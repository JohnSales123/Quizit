package com.example.quizit.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeSceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void startGame(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("PregameScene.fxml"));
    root = loader.load();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}}
