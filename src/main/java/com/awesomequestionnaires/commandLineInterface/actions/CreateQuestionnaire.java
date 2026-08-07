package com.awesomequestionnaires.commandLineInterface.actions;

import java.io.IOException;
import java.nio.file.Path;

import com.awesomequestionnaires.commandLineInterface.CliContext;
import com.awesomequestionnaires.commandLineInterface.ExecutionSteps;
import com.awesomequestionnaires.commandLineInterface.MenuAction;
import com.awesomequestionnaires.domain.Questionnaire;
import com.awesomequestionnaires.domain.QuestionnaireStatus;
import com.awesomequestionnaires.infra.local.RepositorioDePersistenciaLocal;

public class CreateQuestionnaire implements MenuAction {

    private String[] criacaoDoQuestionario = {
        "1 - Digite o nome do questionario:",
        "2 - Descrição do questionario:",
        "4 - Publicar agora? Sim/Nao"
    };

    private static Boolean validarInputStatusQuestionario(String statusQuestionario) {
        if (!"sim".equalsIgnoreCase(statusQuestionario) && !"não".equalsIgnoreCase(statusQuestionario)){
            return false;
        }
        return true;
    }

    private  void preencherStatusQuestionario(String inputUsuario, Questionnaire questionnaire) {
        Boolean inputValido = validarInputStatusQuestionario(inputUsuario);
        if(inputValido) {
            if (inputUsuario.equals("sim") || inputUsuario.equals("SIM")){
                questionnaire.setStatusQuestionario(QuestionnaireStatus.PUBLISHED);
            }

            if (inputUsuario.equals("não") || inputUsuario.equals("NÃO")){
                questionnaire.setStatusQuestionario(QuestionnaireStatus.DRAFT);
            }
        } else {
            System.out.println("Erro: Input inválido, por favor, digite Sim ou Não");
        }
    }

    @Override
    public ExecutionSteps execute(CliContext context) throws IOException  {
        Path arquivoquestionario = RepositorioDePersistenciaLocal.criarDiretorioArquivoQuestionario();

        Questionnaire novoQuestionario = new Questionnaire();
        // loopingMenu = false;
        
        String nomeQuestionario = context.ask(criacaoDoQuestionario[0]);
        novoQuestionario.setNomeQuestionario(nomeQuestionario);

        String descricaoQuestionario = context.ask(criacaoDoQuestionario[1]);
        novoQuestionario.setDescricaoQuestionario(descricaoQuestionario);
        
        Boolean ligado = true;
        while (ligado) {
            String statusQuestionario = context.ask(criacaoDoQuestionario[2]);
            preencherStatusQuestionario(statusQuestionario, novoQuestionario); // ocorre validacao
            if(novoQuestionario.getStatusQuestionario() != null) {
                ligado = false;
            }
        }

        System.out.println(novoQuestionario.getNomeQuestionario() + " " + novoQuestionario.getDescricaoQuestionario() + " " + novoQuestionario.getStatusQuestionario());

        RepositorioDePersistenciaLocal.save(arquivoquestionario.toFile(), novoQuestionario);

        return ExecutionSteps.CREATE_QUESTION;
    }
}
