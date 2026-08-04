package com.awesomequestionnaires.commandLineInterface;

import java.util.Scanner;

public class CliContext {

    private Scanner scanner;

    public CliContext(Scanner scanner) {
        this.scanner = scanner;
    }
 
    public String ask(String cliMessage) {
        System.out.println(cliMessage);
        return scanner.nextLine();
    }
}
