package com.awesomequestionnaires;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loopingMenu = true;

        while (loopingMenu) {

            System.out.printf("====================================\nSaudacao do Questionarios Incriveis.\n====================================\n");
            String menuPrincipal = "Digite 0 para criar um novo questionario\n" + //
                            "Digite 1 para gerenciar questionarios\n" + //
                            "Digite 2 para responder questionarios\n" + //
                            "Digite 3 para sair\n\n";
            System.out.println(menuPrincipal);
            System.out.println("Por favor, digite sua opcao");
            String opcao = sc.nextLine();

            Pattern padraoValidacaoInput = Pattern.compile("[0-3]");

            Pattern validacao = padraoValidacaoInput.matcher(opcao).pattern();

            System.out.println(validacao);

                switch (Integer.parseInt(opcao)) {
                    case 0:
                        System.out.println("Opção não implementada, por favor, tente novamente");
                        System.out.println(menuPrincipal);
                        break;
                    case 1:
                        System.out.println("Opção não implementada, por favor, tente novamente");
                        System.out.println(menuPrincipal);
                        break;
                    case 2:
                        System.out.println("Opção não implementada, por favor, tente novamente");
                        System.out.println(menuPrincipal);
                        break;
                    case 3:
                        System.out.printf("""
                                ==========================================
                                Obrigado por usar Questionarios Incriveis!
                                ==========================================
                                """);
                        loopingMenu = false;
                        sc.close();
                        break;
                    default:
                        System.out.println("Opção não suportada, por favor, selecione uma opção do menu principal.\n");
                        System.out.println(menuPrincipal);
                        break;
                }
            }
    }
} 