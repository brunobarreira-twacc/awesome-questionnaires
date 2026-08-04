package com.awesomequestionnaires.commandLineInterface;

import java.util.Map;

import com.awesomequestionnaires.commandLineInterface.actions.CreateQuestionnaire;

public class Boot {
    
    private String mainMenu = "====================================\nSaudacao do Questionarios Incriveis.\n====================================\n" + 
                                "Digite 0 para criar um novo questionario\n" + 
                                "Digite 1 para gerenciar questionarios\n" + 
                                "Digite 2 para responder questionarios\n" +
                                "Digite 3 para sair\n" +
                                "Por favor, digite sua opcao\n\n";

    public void execute(CliContext context) {

      boolean loopingMenu = true;

      Map<ExecutionSteps, MenuAction> actions = Map.of(
        ExecutionSteps.CREATE_QUESTIONNAIRE, new CreateQuestionnaire()
      );

      Map<String, ExecutionSteps> menuOptions = Map.of(
        "0", ExecutionSteps.CREATE_QUESTIONNAIRE,
        "1", ExecutionSteps.MANAGE_QUESTIONNAIRE,
        "2", ExecutionSteps.RESPOND_QUESTIONNAIRE,
        "3", ExecutionSteps.EXIT
      );

      while(loopingMenu) {
        String userOption = context.ask(mainMenu);

        ExecutionSteps nextStep = menuOptions.getOrDefault(userOption, ExecutionSteps.MAIN_MENU); // CREATE_QUESTIONNAIRE

        MenuAction action = actions.get(nextStep);

        action.execute(context);
        }
    }
}