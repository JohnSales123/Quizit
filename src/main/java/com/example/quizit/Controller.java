package com.example.quizit;

import com.example.quizit.Data.DataRepository;
import com.example.quizit.model.Question;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.SecureRandom;

public class Controller {
    private Stage stage;
    private Scene scene;
    private static Parent root;
    private String correctAnswer = "";
    private String selectedAnswer = "";
    private int questionNumber = 0;
    @FXML
    private Button submit;
    @FXML
    private Button answer1;
    @FXML
    private Button answer2;
    @FXML
    private Button answer3;
    @FXML
    private Button answer4;
    @FXML
    private Label question;
    @FXML
    private Label numberOfQuestion;
    private Button selectedButton;


    @FXML
    public void switchToCategories(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PregameScene.fxml"));               //switching to categories
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToQuestionScene(ActionEvent event) throws IOException {                               //starting game
        FXMLLoader loader = new FXMLLoader(getClass().getResource("QuestionScreen.fxml"));
        root = loader.load();
        Controller controller = loader.getController();
        controller.initializeQuestionscreen(event);
    }

    public void initializeQuestionscreen(ActionEvent event) throws IOException {
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        DataRepository.geographyLoader();               //TODO: unterschiedliche Kategorien laden je nach Auswahl (mehrere sollen möglich sein)
        loadNextQuestion(event);
    }

    @FXML
    public void switchToEndScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("WelcomeScene.fxml"));    //placeholder for end scene
        root = loader.load();                                                                     //TODO: ENDSCENE
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void checkAnswer(ActionEvent event) {
        submit.setVisible(false);

        answer1.setMouseTransparent(true);
        answer2.setMouseTransparent(true);
        answer3.setMouseTransparent(true);
        answer4.setMouseTransparent(true);

        if (!selectedAnswer.equals(correctAnswer) && selectedButton != null){                      //show correct answer
            selectedButton.setStyle("-fx-background-color: #E08A8A;");
        }
        if (answer1.getText().equals(correctAnswer)) {
            answer1.setStyle("-fx-background-color: #6DFA76;");
        }
        if (answer2.getText().equals(correctAnswer)) {
            answer2.setStyle("-fx-background-color: #6DFA76;");
        }
        if (answer3.getText().equals(correctAnswer)) {
            answer3.setStyle("-fx-background-color: #6DFA76;");
        }
        if (answer4.getText().equals(correctAnswer)) {
            answer4.setStyle("-fx-background-color: #6DFA76;");
        }
    }

    public void resetQuestionScreen() {
        submit.setVisible(true);
        selectedButton = null;
        answer1.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer2.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer3.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer4.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer1.setMouseTransparent(false);
        answer2.setMouseTransparent(false);
        answer3.setMouseTransparent(false);
        answer4.setMouseTransparent(false);
    }

    public void saveAnswer1(ActionEvent event) {
        selectedAnswer = answer1.getText();
        selectedButton = answer1;
        answer1.setStyle("-fx-background-color: #A2C3FA;");
        answer2.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer3.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer4.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
    }

    public void saveAnswer2(ActionEvent event) {
        selectedAnswer = answer2.getText();
        selectedButton = answer2;
        answer1.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer2.setStyle("-fx-background-color: #A2C3FA;");
        answer3.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer4.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
    }

    public void saveAnswer3(ActionEvent event) {
        selectedAnswer = answer3.getText();
        selectedButton = answer3;
        answer1.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer2.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer3.setStyle("-fx-background-color: #A2C3FA;");
        answer4.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
    }

    public void saveAnswer4(ActionEvent event) {
        selectedAnswer = answer4.getText();
        selectedButton = answer4;
        answer1.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer2.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer3.setStyle("-fx-background-color: transparent; -fx-border-color: black;");
        answer4.setStyle("-fx-background-color: #A2C3FA;");
    }

    public void loadNextQuestion(ActionEvent event) throws IOException {
        resetQuestionScreen();
        questionNumber++;

        SecureRandom rand = new SecureRandom();
        int questionID = rand.nextInt(DataRepository.fullPool.size());                      //randomly choose questions
        Question currentQuestion = DataRepository.fullPool.get(questionID);
        question.setText(currentQuestion.getQuestion());
        correctAnswer = currentQuestion.getAnswers().get(0);
        DataRepository.fullPool.remove(questionID);

        for (int i = 0; i < 4; i++) {                                                       //randomly assign Answers to buttons
            int answerSelect = rand.nextInt(4 - i);
            if (i == 0) {
                answer1.setText(currentQuestion.getAnswers().get(answerSelect));
            } else if (i == 1) {
                answer2.setText(currentQuestion.getAnswers().get(answerSelect));
            } else if (i == 2) {
                answer3.setText(currentQuestion.getAnswers().get(answerSelect));
            } else {
                answer4.setText(currentQuestion.getAnswers().get(answerSelect));
            }
            currentQuestion.getAnswers().remove(answerSelect);
        }

        numberOfQuestion.setText(String.valueOf(questionNumber));                            //add question number
        if (questionNumber == 11) {                                                          //end after 10 questions
            questionNumber = 0;
            switchToEndScene();
        }
    }
}
