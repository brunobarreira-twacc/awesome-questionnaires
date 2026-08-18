package com.awesomequestionnaires.commandLineInterface;

import java.io.IOException;
import java.util.Map;

import com.awesomequestionnaires.commandLineInterface.actions.CreateQuestion;
import com.awesomequestionnaires.commandLineInterface.actions.CreateQuestionnaire;
import com.awesomequestionnaires.commandLineInterface.actions.SingleOptionQuestion;
public class Boot {
    
    private String mainMenu = "====================================\nSaudacao do Questionarios Incriveis.\n====================================\n" + 
                                "Digite 0 para criar um novo questionario\n" + 
                                "Digite 1 para gerenciar questionarios\n" + 
                                "Digite 2 para responder questionarios\n" +
                                "Digite 3 para sair\n" +
                                "Por favor, digite sua opcao\n\n";

    public void execute(CliContext context) throws IOException {

      boolean loopingMenu = true;

      //2 - PASSOS DE EXEUÇÃO para INSTANCIAS DAS CLASSES DE PASSOS DE EXECUÇÃO
      Map<ExecutionSteps, MenuAction> actions = Map.of(
        ExecutionSteps.CREATE_QUESTIONNAIRE, new CreateQuestionnaire(),
        ExecutionSteps.CREATE_QUESTION, new CreateQuestion(),
        ExecutionSteps.SINGLE_OPTION_QUESTION, new SingleOptionQuestion()
      );

      //1 - INPUT DO USUÁRIO para PASSOS DE EXEUÇÃO 
      Map<String, ExecutionSteps> menuOptions = Map.of(
        "0", ExecutionSteps.CREATE_QUESTIONNAIRE,
        "1", ExecutionSteps.MANAGE_QUESTIONNAIRE,
        "2", ExecutionSteps.RESPOND_QUESTIONNAIRE,
        "3", ExecutionSteps.EXIT
      );

      while(loopingMenu) {
        String userOption = context.ask(mainMenu);

        ExecutionSteps nextStep = menuOptions.getOrDefault(userOption, ExecutionSteps.MAIN_MENU);

        while(nextStep != null) {
          MenuAction action = actions.get(nextStep);

          if(action == null) {
            break;
          }

          nextStep = action.execute(context);
        }
      }
    }
}