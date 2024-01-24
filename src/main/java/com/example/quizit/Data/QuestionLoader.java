package com.example.quizit.Data;

import com.example.quizit.model.Question;
import com.example.quizit.model.QuestionsWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class QuestionLoader {
    private static final String QUESTIONS_FILE_PATH = "/com/example/quizit/Questions.json";

    public static List<Question> loadQuestions() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // File laden als resource stream
            InputStream inputStream = QuestionLoader.class.getResourceAsStream(QUESTIONS_FILE_PATH);

            // Checken ob resource stream null ist
            if (inputStream != null) {
                QuestionsWrapper questionsWrapper = objectMapper.readValue(inputStream, QuestionsWrapper.class);
                return questionsWrapper.getQuestions();
            } else {
                System.err.println("Could not find the resource: " + QUESTIONS_FILE_PATH);
                return null; // Passiert wenn ressource nicht gefunden wird
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}