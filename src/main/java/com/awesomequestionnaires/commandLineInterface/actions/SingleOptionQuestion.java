package com.awesomequestionnaires.commandLineInterface.actions;

import com.awesomequestionnaires.commandLineInterface.CliContext;
import com.awesomequestionnaires.commandLineInterface.ExecutionSteps;
import com.awesomequestionnaires.commandLineInterface.MenuAction;
import com.awesomequestionnaires.domain.Question;
import com.awesomequestionnaires.domain.QuestionOption;

import java.io.IOException;

public class SingleOptionQuestion implements MenuAction {

    private String[] createQuestionOptionMessages = {
        "Entre a opção com um texto:",
        "Qual a ordem de exibição desta opção? Utilize um número inteiro:\n"
    };

    @Override
    public ExecutionSteps execute(CliContext context) throws IOException {
        QuestionOption questionOption = new QuestionOption();

        String qoDisplayText = context.ask(createQuestionOptionMessages[0]);
        questionOption.setDisplayText(qoDisplayText);

        String qoDisplayOrder = context.ask(createQuestionOptionMessages[1]);
        questionOption.setDisplayOrder(Integer.parseInt(qoDisplayOrder));

        System.err.println("QUESTION DISPLAY TEXT: " + " " + context.getCurrentQuestion().getDisplayText());
        System.out.println("QUESTION OPTION - DISPLAY TEXT: " + " " + questionOption.getDisplayText());
        System.out.println("QUESTION OPTION - DISPLAY ORDER: " + " " + questionOption.getDisplayOrder());

        return null;
    }
}
