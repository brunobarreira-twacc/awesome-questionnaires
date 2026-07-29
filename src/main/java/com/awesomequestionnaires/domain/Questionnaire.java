package com.awesomequestionnaires.domain;

public class Questionnaire {
    private String nomeQuestionario;
    private String descricaoQuestionario;
    private QuestionnaireStatus statusQuestionario;
    
    Questionnaire(String nomeQuestionario, String descricaoQuestionario, QuestionnaireStatus statusQuestionario) {
        this.nomeQuestionario = nomeQuestionario;
        this.descricaoQuestionario = descricaoQuestionario;
        this.statusQuestionario = QuestionnaireStatus.valueOf(descricaoQuestionario);
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
}
