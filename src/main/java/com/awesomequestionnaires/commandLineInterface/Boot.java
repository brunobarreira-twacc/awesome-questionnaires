package com.awesomequestionnaires.commandLineInterface;

public class Boot {
    
    private String mainMenu = "====================================\nSaudacao do Questionarios Incriveis.\n====================================\n" + 
                                "Digite 0 para criar um novo questionario\n" + 
                                "Digite 1 para gerenciar questionarios\n" + 
                                "Digite 2 para responder questionarios\n" +
                                "Digite 3 para sair\n" +
                                "Por favor, digite sua opcao\n\n";

    public void execute(CliContext context) {
      context.ask(mainMenu);
    }
}