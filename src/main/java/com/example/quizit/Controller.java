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
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.SecureRandom;

public class Controller {
    private Stage stage;
    private Question currentQuestion;
    private Scene scene;
    private Parent root;
    public String correctAnswer = "";
    public String selectedAnswer = "";
    public static int questionNumber = 0;
    @FXML
    private Button submit;
    @FXML
    private Button next;
    @FXML
    private Button answer1;
    @FXML
    private Button answer2;
    @FXML
    private Button answer3;
    @FXML
    private Button answer4;
    @FXML
    private Label numberOfQuestion;
    @FXML
    private Label points;


    @FXML
    public void switchToCategories(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PregameScene.fxml"));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToQuestionScene(ActionEvent event) throws IOException {
        questionNumber++;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("QuestionScreen.fxml"));
        root = loader.load();
        Controller controller = loader.getController();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        DataRepository.LiteratureLoader();
            loadNextQuestion(event);
        controller.numberOfQuestion.setText(String.valueOf(questionNumber));
            if(questionNumber == 11){
                questionNumber = 0;
                switchToEndScene();
            }
    }

    public void switchToEndScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("WelcomeScene.fxml"));    //placeholder for End Scene
        root = loader.load();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void checkAnswer(ActionEvent event) throws IOException {             //TODO: Fix Correct Answer isn't saved
        submit.setVisible(false);
        if(answer1.getText().equals(correctAnswer)){
            answer1.setStyle("-fx-background-color: #6DFA76;");
        }
        if(answer2.getText().equals(correctAnswer)){
            answer2.setStyle("-fx-background-color: #6DFA76;");
        }
        if(answer3.getText().equals(correctAnswer)){
            answer3.setStyle("-fx-background-color: #6DFA76;");
        }
        if(answer4.getText().equals(correctAnswer)){
            answer4.setStyle("-fx-background-color: #6DFA76;");
        }
    }

    public void saveAnswer1(ActionEvent event) throws IOException{
        selectedAnswer = answer1.getText();
    }

    public void saveAnswer2(ActionEvent event) throws IOException{
        selectedAnswer = answer2.getText();
    }
    public void saveAnswer3(ActionEvent event) throws IOException{
        selectedAnswer = answer3.getText();
    }
    public void saveAnswer4(ActionEvent event) throws IOException{
        selectedAnswer = answer4.getText();
    }

    public void loadNextQuestion(ActionEvent event) throws IOException {
        SecureRandom rand = new SecureRandom();
        int questionID = rand.nextInt(DataRepository.fullPool.size());
        currentQuestion = DataRepository.fullPool.get(questionID);
        Label questionText = (Label)root.lookup("#question");
        questionText.setText(currentQuestion.getQuestion());
        correctAnswer = currentQuestion.getAnswers().get(0);
        int questionSelect;
        for (int i = 0; i < 4; i++) {
            questionSelect = rand.nextInt(4 - i);
            Button b = (Button) root.lookup("#answer" + (i + 1));
            b.setText(currentQuestion.getAnswers().get(questionSelect));
            currentQuestion.getAnswers().remove(questionSelect);
        }
        DataRepository.fullPool.remove(questionID);
    }
}
