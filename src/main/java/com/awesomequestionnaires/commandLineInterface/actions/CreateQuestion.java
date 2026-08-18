package com.awesomequestionnaires.commandLineInterface.actions;

import java.io.IOException;
import java.util.Map;

import com.awesomequestionnaires.commandLineInterface.CliContext;
import com.awesomequestionnaires.commandLineInterface.ExecutionSteps;
import com.awesomequestionnaires.commandLineInterface.MenuAction;
import com.awesomequestionnaires.domain.Question;
import com.awesomequestionnaires.domain.QuestionTypeOptions;

public class CreateQuestion implements MenuAction {

    private String[] createQuestionMessages = {
        "Questionário criado com sucesso, agora vamos criar uma pergunta.\n1 - Digite o texto que será exibido para a pessoa usuária que vai responder seu questionário. Esse texto deve obrigatoriamente ser uma pergunta:",
            "\n\n2 - Escolha um tipo de questão:\n 1 - Opção única, usuário podem selecionar apenas uma opção para essa questão.\n 2 - Múltiplas opções, usuário podem selecionar uma ou mais opções para essa questão. \n 3 - Condicional, dada uma resposta condicional, questões adicionais aparecem para o usuário responder."
    };

    @Override
    public ExecutionSteps execute(CliContext context) throws IOException {
        Question question = new Question();

        String textoQuestao = context.ask(createQuestionMessages[0]);
        question.setDisplayText(textoQuestao);

        String tipoQuestao = context.ask(createQuestionMessages[1]);

        switch (tipoQuestao) {
            case "1":
                question.setQuestionType(QuestionTypeOptions.SINGLE_OPTION);
                break;
            case "2":
                question.setQuestionType(QuestionTypeOptions.MULTIPLE_OPTION);
                break;
            default:
                System.out.println("Opção inválida. Por favor, digite 1 para uma Questão de opção única ou 2 para uma Questão de múltiplas opções.");
                break;
        }

        context.startNewQuestion(question);

        Map<String, ExecutionSteps> questionTypeOption = Map.of(
                "1", ExecutionSteps.SINGLE_OPTION_QUESTION
        );

        return questionTypeOption.getOrDefault(tipoQuestao, ExecutionSteps.MAIN_MENU);
    }

}
