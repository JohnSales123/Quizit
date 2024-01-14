package com.example.quizit.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Question {
    private int qid;
    private String question;
    private String category;
    List<Answer> answers;

    public Question(int id, String question, List<Answer> answers, String category){
        this.qid = id;
        this.question = question;
        this.answers = answers;
        this.category = category;
    }

    public int getQid() {
        return qid;
    }

    public String getCategory() {
        return category;
    }
}
