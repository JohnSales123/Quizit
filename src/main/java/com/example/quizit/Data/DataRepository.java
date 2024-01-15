package com.example.quizit.Data;

import com.example.quizit.model.Anwser;
import com.example.quizit.model.Player;
import com.example.quizit.model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataRepository {

    public List<Anwser> _anwsers = new ArrayList<>();
    public List<Question> _questions = new ArrayList<>();
    public List<Player> _players = new ArrayList<>();

    public DataRepository(){
        _anwsers = fetchAnwsersfromDB();
    }

    public List<Anwser> fetchAnwsersfromDB(){
        /*
        // Initialize the connection
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            if (connection != null) {
                System.out.println("Connected to the database!");

                // You can now perform database operations using the 'connection' object.
                // For example, you can execute SQL queries, insert, update, or delete records.

                // Don't forget to close the connection when done.
                connection.close();
            } else {
                System.out.println("Failed to connect to the database!");
            }
        } catch (SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
        }
         */

        //return mockAnwsers();
        return null;
    }
/*
    public List<Anwser> mockAnwsers(){
        List<Anwser> _anwsers = new ArrayList<>();

        Anwser a1 = new Anwser();
        a1.setAnwser("Europa");
        a1.setId(1);
        a1.setCorrect(true);
        a1.setFk_question_id(1);

        Anwser a2 = new Anwser();
        a2.setAnwser("Asien");
        a2.setId(2);
        a2.setCorrect(false);
        a2.setFk_question_id(1);

        Anwser a3 = new Anwser();
        a3.setAnwser("Afrika");
        a3.setId(3);
        a3.setCorrect(false);
        a3.setFk_question_id(1);

        Anwser a4 = new Anwser();
        a4.setAnwser("Nordamerika");
        a4.setId(4);
        a4.setCorrect(false);
        a4.setFk_question_id(1);

        _anwsers.add(a1);
        _anwsers.add(a2);
        _anwsers.add(a3);
        _anwsers.add(a4);
        return _anwsers;
    }

 */
}
