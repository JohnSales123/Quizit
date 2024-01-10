package com.example.quizit;

import com.example.quizit.model.Answer;
import com.example.quizit.model.QAManagement;
import com.example.quizit.model.Question;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WelcomeScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 550);
        stage.setFullScreen(true);
        stage.setTitle("Quizit");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        QAManagement newQuiz = new QAManagement();

        List<Question> geographie = newQuiz.getQuestionToCategory("Geografie");

        for (Question question: geographie) {
            System.out.println("Frage: " + question);

            System.out.println("Antworten:");
            System.out.println(newQuiz.getAnswerMap());

        launch();
    }
}}