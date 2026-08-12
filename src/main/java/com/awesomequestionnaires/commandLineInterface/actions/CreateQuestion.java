package com.awesomequestionnaires.commandLineInterface.actions;

import java.io.IOException;
import java.util.Map;

import com.awesomequestionnaires.commandLineInterface.CliContext;
import com.awesomequestionnaires.commandLineInterface.ExecutionSteps;
import com.awesomequestionnaires.commandLineInterface.MenuAction;
import com.awesomequestionnaires.domain.Question;

public class CreateQuestion implements MenuAction {

    private String[] createQuestionMessages = {
        "Questionário criado com sucesso, agora vamos criar uma pergunta.\n1 - Digite o texto que será exibido para a pessoa usuária que vai responder seu questionário. Esse texto deve obrigatoriamente ser uma pergunta:",
            "2 - Escolha um tipo de questão:\n 1 - Opção única, usuário podem selecionar apenas uma opção para essa questão.\n 2 - Múltiplas opções, usuário podem selecionar uma ou mais opções para essa questão. \n 3 - Condicional, dada uma resposta condicional, questões adicionais aparecem para o usuário responder."
    };

    @Override
    public ExecutionSteps execute(CliContext context) throws IOException {
        String textoQuestao = context.ask(createQuestionMessages[0]);
        Question questionType = new Question();
        questionType.setDisplayText(textoQuestao);

        String tipoQuestao = context.ask(createQuestionMessages[1]);

        Map<String, ExecutionSteps> questionTypeOption = Map.of(
                "1", ExecutionSteps.SINGLE_OPTION_QUESTION
        );

        return questionTypeOption.getOrDefault(tipoQuestao, ExecutionSteps.MAIN_MENU);

    }
}
