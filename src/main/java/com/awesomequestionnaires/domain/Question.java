package com.awesomequestionnaires.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Question {
    private UUID id;
    private String displayText;
    private QuestionTypeOptions questionType;
    private List<QuestionOption> questionsOptions;

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

    public List<QuestionOption> getQuestionsOptions() {
        return questionsOptions;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public QuestionTypeOptions getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionTypeOptions questionType) {
        this.questionType = questionType;
    }

    public void setQuestionsOptions(List<QuestionOption> questionsOptions) {
        this.questionsOptions = questionsOptions;
    }
}
