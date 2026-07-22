package com.awesomequestionnaires;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.printf("====================================\nSaudacao do Questionarios Incriveis.\n====================================\n");
            String menuPrincipal = "Digite 0 para criar um novo questionario\n" + //
                            "Digite 1 para gerenciar questionarios\n" + //
                            "Digite 2 para responder questionarios\n" + //
                            "Digite 3 para sair\n\n";
            System.out.println(menuPrincipal);
            System.out.println("Por favor, digite sua opcao");
            int opcao = sc.nextInt();
            switch (opcao) {
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
                    sc.close();
                    break;
                default:
                    System.out.println("Opção não suportada, por favor, selecione uma opção do menu principal.\n");
                    System.out.println(menuPrincipal);
                    break;
            }
    }
} 