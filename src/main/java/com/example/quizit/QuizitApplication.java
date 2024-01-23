package com.example.quizit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class QuizitApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(QuizitApplication.class.getResource("WelcomeScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 400);

        stage.setFullScreen(false);
        stage.setMaximized(false);
        stage.setTitle("Quizit");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}