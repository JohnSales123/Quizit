package com.example.quizit.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Answer {

    public int id;
    public String answer;
    public boolean correct;
    public int fk_question_id;


    public Answer() {

    }
}
