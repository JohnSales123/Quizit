package com.example.quizit.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Anwser {

    private int id;
    private String anwser;
    private boolean correct;
    private int fk_question_id;


}
