package com.example.quizit.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Answer {

    private int aid;
    private String answer;
    private boolean isCorrect;
    private int fk_question_id;

    public Answer(int id, String answer, boolean isCorrect){
        this.aid = id;
        this.answer = answer;
        this.isCorrect = isCorrect;
    }

    public int getAid() {
        return aid;
    }
}
