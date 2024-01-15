/*
package com.example.quizit.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QAManagement {
    private Map<Integer, Question> questionMap;
    private Map<Integer, Answer> answerMap;

    public QAManagement() {
        this.questionMap = new HashMap<>();
        this.answerMap = new HashMap<>();
        initalizeQA();
    }

    private void initalizeQA() {
        Answer answer1o1 = new Answer(1, "Wien", true);          //stattdessen den Antworten qid zuordnen
        Answer answer2o1 = new Answer(1, "Rom", false);          //und Frage mit allen passenden Antworten auspielen
        Answer answer3o1 = new Answer(1, "England", false);
        Answer answer4o1 = new Answer(1, "Sydney", false);

        List<Answer> answerList1 = List.of(answer1o1, answer2o1, answer3o1, answer4o1);
        Question question1 = new Question(1, "Was ist die Hauptstadt Österreichs?", answerList1, "Geografie");

        //mehr Fragen und Antworten hinzufügen

        questionMap.put(question1.getQid(), question1);
        answerList1.forEach(antwort -> answerMap.put(antwort.getAid(), antwort));
    }

    public List<Question> getQuestionToCategory(String Category) {
        return questionMap.values().stream()
                .filter(question -> question.getCategory().equals(Category))
                .collect(Collectors.toList());
    }

    public Map<Integer, Question> getQuestionMap() {
        return questionMap;
    }

    public Map<Integer, Answer> getAnswerMap() {
        return answerMap;
    }
}
*/