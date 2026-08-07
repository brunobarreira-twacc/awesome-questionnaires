package com.awesomequestionnaires.commandLineInterface.actions;

import java.io.IOException;
import java.nio.file.Path;

import com.awesomequestionnaires.commandLineInterface.CliContext;
import com.awesomequestionnaires.commandLineInterface.ExecutionSteps;
import com.awesomequestionnaires.commandLineInterface.MenuAction;
import com.awesomequestionnaires.domain.Questionnaire;
import com.awesomequestionnaires.infra.local.RepositorioDePersistenciaLocal;

public class CreateQuestionnaire implements MenuAction {

    private String[] criacaoDoQuestionario = {
        "1 - Digite o nome do questionario:",
        "2 - Descrição do questionario:"
    };

    @Override
    public ExecutionSteps execute(CliContext context) throws IOException {
        Path arquivoquestionario = RepositorioDePersistenciaLocal.criarDiretorioArquivoQuestionario();

        Questionnaire novoQuestionario = new Questionnaire();
        // loopingMenu = false;
        
        String nomeQuestionario = context.ask(criacaoDoQuestionario[0]);
        novoQuestionario.setNomeQuestionario(nomeQuestionario);

        String descricaoQuestionario = context.ask(criacaoDoQuestionario[1]);
        novoQuestionario.setDescricaoQuestionario(descricaoQuestionario);

        System.out.println(novoQuestionario.getNomeQuestionario() + " " + novoQuestionario.getDescricaoQuestionario() + " " + novoQuestionario.getStatusQuestionario());
        
        return ExecutionSteps.MAIN_MENU;
    }
}
