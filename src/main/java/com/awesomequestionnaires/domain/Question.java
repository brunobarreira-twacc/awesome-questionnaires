package com.awesomequestionnaires.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Question {
    private UUID id;
    private String displayText;
    private List<String> questionsOptions;

    public Question() {
        this.id = UUID.randomUUID();
        this.questionsOptions = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public String getDisplayText() {
        return displayText;
    }

    public List<String> getQuestionsOptions() {
        return questionsOptions;
    }
}
