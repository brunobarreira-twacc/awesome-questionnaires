package com.awesomequestionnaires.domain;

public class Questionnaire {
    private String nomeQuestionario;
    private String descricaoQuestionario;
    private QuestionnaireStatus statusQuestionario;
    
    public Questionnaire() {}

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
}
