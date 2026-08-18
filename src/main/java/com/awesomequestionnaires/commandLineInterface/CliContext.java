package com.awesomequestionnaires.commandLineInterface;

import java.util.Scanner;

import com.awesomequestionnaires.domain.Question;

public class CliContext {

    private Scanner scanner;

    private Question currentQuestion;

    public CliContext(Scanner scanner) {
        this.scanner = scanner;
    }
 
    public String ask(String cliMessage) {
        System.out.println(cliMessage);
        return scanner.nextLine();
    }

    public void startNewQuestion(Question newQuestion) {
        this.currentQuestion = newQuestion;
    }

    public Question getCurrentQuestion() {
        return this.currentQuestion;
    }
}
