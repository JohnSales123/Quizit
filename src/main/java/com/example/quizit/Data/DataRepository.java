package com.example.quizit.Data;

import com.example.quizit.model.Anwser;
import com.example.quizit.model.Player;
import com.example.quizit.model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataRepository {

    public List<Anwser> _anwsers = new ArrayList<>();
    public ArrayList<Question> _questions = new ArrayList<>();
    public List<Player> _players = new ArrayList<>();

    public ArrayList<Question> geographyPool = new ArrayList<>();
    public ArrayList<Question> mathsPool = new ArrayList<>();
    public ArrayList<Question> historyPool = new ArrayList<>();
    public ArrayList<Question> biologyPool = new ArrayList<>();
    public ArrayList<Question> physicsPool = new ArrayList<>();
    public static ArrayList<Question> fullPool = new ArrayList<>();
    public static ArrayList<Question> literaturePool = new ArrayList<>();

    public static void LiteratureLoader(){
        Question temp = new Question();
        temp.setQuestion("Wer schrieb das Buch namens Faust?");
        temp.getAnswers().add("Johann Wolfgang von Goethe");            //correct answer first!!
        temp.getAnswers().add("Thomas Brezina");
        temp.getAnswers().add("Friedrich Schiller");
        temp.getAnswers().add("Heinrich Heine");
        fullPool.add(temp);

        //copy following for new question:
        temp = new Question();
        temp.setQuestion("Welcher der folgenden ist keine literarische Epoche?");
        temp.getAnswers().add("Rassismus");
        temp.getAnswers().add("Realismus");
        temp.getAnswers().add("Expressionismus");
        temp.getAnswers().add("Romantik");
        fullPool.add(temp);

        temp = new Question();
        temp.setQuestion("Welches Werk stammt von William Shakespeare?");
        temp.getAnswers().add("Romeo und Julia");
        temp.getAnswers().add("Harry Potter");
        temp.getAnswers().add("Der große Gatsby");
        temp.getAnswers().add("Krieg und Frieden");
        fullPool.add(temp);

        temp = new Question();
        temp.setQuestion("Wer schrieb 'Die Odyssee'?");
        temp.getAnswers().add("Homer");
        temp.getAnswers().add("Virgil");
        temp.getAnswers().add("Dante Alighieri");
        temp.getAnswers().add("Hermann Hesse");
        fullPool.add(temp);

        temp = new Question();
        temp.setQuestion("Welches Buch wurde von Jane Austen geschrieben?");
        temp.getAnswers().add("Stolz und Vorurteil");
        temp.getAnswers().add("Der Graf von Monte Christo");
        temp.getAnswers().add("Faust");
        temp.getAnswers().add("Anna Karenina");
        fullPool.add(temp);

        temp = new Question();
        temp.setQuestion("In welchem Land spielt 'Die Verwandlung' von Franz Kafka?");
        temp.getAnswers().add("Tschechien");
        temp.getAnswers().add("Deutschland");
        temp.getAnswers().add("Österreich");
        temp.getAnswers().add("Russland");
        fullPool.add(temp);

        temp = new Question();
        temp.setQuestion("Wer ist der Autor von '1984'?");
        temp.getAnswers().add("George Orwell");
        temp.getAnswers().add("Aldous Huxley");
        temp.getAnswers().add("Ray Bradbury");
        temp.getAnswers().add("Philip K. Dick");
        fullPool.add(temp);

        temp = new Question();
        temp.setQuestion("Welches Buch wird oft als 'Der Große Gatsby' bezeichnet?");
        temp.getAnswers().add("F. Scott Fitzgerald");
        temp.getAnswers().add("Ernest Hemingway");
        temp.getAnswers().add("Mark Twain");
        temp.getAnswers().add("J.D. Salinger");
        fullPool.add(temp);

        temp = new Question();
        temp.setQuestion("Wer schrieb 'Die Leiden des jungen Werthers'?");
        temp.getAnswers().add("Johann Wolfgang von Goethe");
        temp.getAnswers().add("Franz Kafka");
        temp.getAnswers().add("Thomas Mann");
        temp.getAnswers().add("Friedrich Schiller");
        fullPool.add(temp);

        temp = new Question();
        temp.setQuestion("Was ist das bekannteste Werk von Leo Tolstoi?");
        temp.getAnswers().add("Krieg und Frieden");
        temp.getAnswers().add("Anna Karenina");
        temp.getAnswers().add("Auferstehung");
        temp.getAnswers().add("Kinderbuch");
        fullPool.add(temp);

        temp = new Question();
        temp.setQuestion("Welches Buch erzählt die Geschichte von Pip und Magwitch?");
        temp.getAnswers().add("Große Erwartungen");
        temp.getAnswers().add("Sturmhöhe");
        temp.getAnswers().add("Jane Eyre");
        temp.getAnswers().add("David Copperfield");
        fullPool.add(temp);

        temp = new Question();
        temp.setQuestion("Wer schrieb 'Der kleine Prinz'?");
        temp.getAnswers().add("Antoine de Saint-Exupéry");
        temp.getAnswers().add("Jules Verne");
        temp.getAnswers().add("Hans Christian Andersen");
        temp.getAnswers().add("Gabriel García Márquez");
        fullPool.add(temp);




    }

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
