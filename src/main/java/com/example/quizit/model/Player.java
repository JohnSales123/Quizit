package com.example.quizit.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    private int id;
    private int score;
    private int name;
}
