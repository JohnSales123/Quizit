package com.example.quizit;

//import com.example.quizit.model.QAManagement;
import com.example.quizit.model.Question;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class QuizitApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(QuizitApplication.class.getResource("WelcomeScene2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 550);
        stage.setFullScreen(true);
        stage.setMaximized(true);
        stage.setTitle("Quizit");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
    launch();

}}