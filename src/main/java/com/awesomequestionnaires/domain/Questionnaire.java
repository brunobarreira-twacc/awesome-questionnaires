package com.awesomequestionnaires.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Questionnaire {
    private UUID id;
    private String nomeQuestionario;
    private String descricaoQuestionario;
    private QuestionnaireStatus statusQuestionario;
    private List<Question> questions;

    public Questionnaire() {
        this.id = UUID.randomUUID();
        this.questions = new ArrayList<>();
    }

    public String getNomeQuestionario() {
        return nomeQuestionario;
    }

    public String getDescricaoQuestionario() {
        return descricaoQuestionario;
    }

    public QuestionnaireStatus getStatusQuestionario() {
        return statusQuestionario;
    }

    public void setNomeQuestionario(String nomeQuestionario) {
        this.nomeQuestionario = nomeQuestionario;
    }

    public void setDescricaoQuestionario(String descricaoQuestionario) {
        this.descricaoQuestionario = descricaoQuestionario;
    }

    public void setStatusQuestionario(QuestionnaireStatus statusQuestionario) {
        this.statusQuestionario = statusQuestionario;
    }

    public UUID getId() {
        return id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
