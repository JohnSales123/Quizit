package com.example.quizit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Anwser {

    public int id;
    public String anwser;
    public boolean correct;
    public int fk_question_id;


    public Anwser() {

    }
}
