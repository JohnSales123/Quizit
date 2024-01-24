package com.example.quizit.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String topic;
    private String question;
    private List<String> anwsers;

    // Constructor annotated with @JsonCreator
    @JsonCreator
    public Question(
            @JsonProperty("topic") String topic,
            @JsonProperty("question") String question,
            @JsonProperty("anwsers") List<String> anwsers) {
        this.topic = topic;
        this.question = question;
        this.anwsers = anwsers;
    }


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return anwsers;
    }

    public void setAnwsers(List<String> options) {
        this.anwsers = options;
    }

}
