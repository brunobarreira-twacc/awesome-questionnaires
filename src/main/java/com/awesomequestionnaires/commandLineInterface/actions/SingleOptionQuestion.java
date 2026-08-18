package com.awesomequestionnaires.commandLineInterface.actions;

import com.awesomequestionnaires.commandLineInterface.CliContext;
import com.awesomequestionnaires.commandLineInterface.ExecutionSteps;
import com.awesomequestionnaires.commandLineInterface.MenuAction;
import com.awesomequestionnaires.domain.Question;
import com.awesomequestionnaires.domain.QuestionOption;

import java.io.IOException;

public class SingleOptionQuestion implements MenuAction {

    private String[] createQuestionOptionMessages = {
        "Entre a opção com um texto:", // NOVO, SEMI NOVO
        "Qual a ordem de exibição desta opção? Utilize um número inteiro:\n", // 1, 2
        "Selecione a próxima ação:\n 1 - Adicionar outra opção de resposta\n2 - Revisar o questionário completo"
    };

    // PARA QUEM COMPROU NOSSO SISTEMA - CRIADORES DE QUESTIONÁRIO
    // Você comprou seu carro novo ou seminovo?
        // Novo
        // 1
        // Seminovo
        // 2
        // Meu pai me deu o carro
        // 3
        // Ele apareceu misteriosamente na minha garagem
        // 4
        // N...
        // 5

    @Override
    public ExecutionSteps execute(CliContext context) throws IOException {
        QuestionOption questionOption = new QuestionOption(); // essa instancia depois das linhas 23 até 27 tem texto da opcao e numero de ordenacao

        String qoDisplayText = context.ask(createQuestionOptionMessages[0]);
        questionOption.setDisplayText(qoDisplayText);

        String qoDisplayOrder = context.ask(createQuestionOptionMessages[1]);
        questionOption.setDisplayOrder(Integer.parseInt(qoDisplayOrder));
        
        context.getCurrentQuestion().getQuestionsOptions().add(questionOption);

        String nextStep = context.ask(createQuestionOptionMessages[2]);

        if( "1".equals(nextStep)) {
            Boolean entrarOpcoesQuestao = true;

            while(entrarOpcoesQuestao) {
                System.out.println("ENTREI NO LOOP DE OPCOES DE QUESTÃO - COMEÇOU - ABAIXO OS VALORES DE QUESTIONOPTION DA LINHA 21" );
                context.getCurrentQuestion().getQuestionsOptions().forEach(item -> System.out.println("CURRENT QUESTION OPTION DISPLAY TEXT: " +  item.getDisplayText() + "\n" + " CURRENT QUESTION OPTION DISPLAY ORDER: " + item.getDisplayOrder() + "\n"));

                String qoDisplayTextLoop = context.ask(createQuestionOptionMessages[0]);
                questionOption.setDisplayText(qoDisplayTextLoop);

                String qoDisplayOrderLoop = context.ask(createQuestionOptionMessages[1]);
                questionOption.setDisplayOrder(Integer.parseInt(qoDisplayOrderLoop));

                System.out.println("RECEBI NOVO TEXTO DE OPCAO DE RESPOSTA E DISPLAY ORDER - EM ANDAMENTO - ABAIXO OS VALORES DE QUESTIONOPTION DA LINHA 21" );
                context.getCurrentQuestion().getQuestionsOptions().add(questionOption);
                context.getCurrentQuestion().getQuestionsOptions().forEach(item -> System.out.println("CURRENT QUESTION OPTION DISPLAY TEXT: " +  item.getDisplayText() + "\n" + " CURRENT QUESTION OPTION DISPLAY ORDER: " + item.getDisplayOrder() + "\n"));

                String moreQuestionOptions = context.ask(createQuestionOptionMessages[2]);

                if("2".equals(moreQuestionOptions)) {
                    entrarOpcoesQuestao = false;
                }
            }
        }

        System.err.println("QUESTION DISPLAY TEXT: " + " " + context.getCurrentQuestion().getDisplayText() + "\n");
        context.getCurrentQuestion().getQuestionsOptions().forEach(item -> System.out.println("CURRENT QUESTION OPTION DISPLAY TEXT: " +  item.getDisplayText() + "\n" + " CURRENT QUESTION OPTION DISPLAY ORDER: " + item.getDisplayOrder() + "\n"));

        return null;
    }
}
