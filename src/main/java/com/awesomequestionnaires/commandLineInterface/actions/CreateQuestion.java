package com.awesomequestionnaires.commandLineInterface.actions;

import java.io.IOException;

import com.awesomequestionnaires.commandLineInterface.CliContext;
import com.awesomequestionnaires.commandLineInterface.ExecutionSteps;
import com.awesomequestionnaires.commandLineInterface.MenuAction;

public class CreateQuestion implements MenuAction {

    private String[] createQuestionMessages = {
        "Questionário criado com sucesso, agora vamos criar uma pergunta.\n1 - Digite o texto que será exibido para a pessoa usuária que vai responder seu questionário. Esse texto deve obrigatoriamente ser uma pergunta:"
    };

    @Override
    public ExecutionSteps execute(CliContext context) throws IOException {
        context.ask(createQuestionMessages[0]);

        return ExecutionSteps.MAIN_MENU;
    }
}
