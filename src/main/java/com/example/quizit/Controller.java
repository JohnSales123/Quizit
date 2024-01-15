package com.example.quizit;

import com.example.quizit.Data.DataRepository;
import com.example.quizit.model.Question;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.SecureRandom;

public class Controller {
    private Stage stage;
    private Question currentQuestion;
    private Scene scene;
    private Parent root;
    private int answerID;
    @FXML
    private Button submit;
    @FXML
    private Button next;
    @FXML
    public Button answer1;
    @FXML
    public Button answer2;
    @FXML
    public Button answer3;
    @FXML
    public Button answer4;

    @FXML
    public void switchToCategories(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PregameScene.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToQuestionScene(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("QuestionScreen.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        DataRepository.LiteratureLoader();
        loadNextQuestion(event);
    }

    public void checkAnswer(ActionEvent event) throws IOException {
        submit.setVisible(false);
    }

    public void loadNextQuestion(ActionEvent event) throws IOException{
        SecureRandom rand = new SecureRandom();
        int questionID = rand.nextInt(DataRepository.fullPool.size());
        currentQuestion = DataRepository.fullPool.get(questionID);
        answer1.setText("HUnd");

    }









}
