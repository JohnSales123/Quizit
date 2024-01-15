package com.example.quizit.controller;

import com.example.quizit.Data.DataRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class QuestionScreenController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    DataRepository data; //Hier werden die daten zur verfügung gestellt



    public void init() throws Exception {
        // Initialize resources or perform setup tasks here
        // This method is called before the start() method
        // You can use it to prepare your application

        data = new DataRepository();
    }

    @FXML
    public void lodaG(ActionEvent event) throws IOException {
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

        //String question 1 = data._questions.;
        //String Anwser1 =
        //String Anwser2 =
    }
}
