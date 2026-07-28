package com.awesomequestionnaires;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String nomeQuestionario;
        String descricaoQuestionario;
        String statusQuestionario;
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

            padraoValidacaoInput.matcher(opcao).pattern();


                switch (Integer.parseInt(opcao)) {
                    case 0:
                        loopingMenu = false;
                        System.out.println("1 - Digite o nome do questionario:");
                        nomeQuestionario = sc.nextLine();
                        System.out.println("2 - Descrição do questionario:");
                        descricaoQuestionario = sc.nextLine();
                        System.out.println("4 - Publicar agora? Sim/Nao");
                        statusQuestionario = sc.nextLine();

                        if (!"sim".equalsIgnoreCase(statusQuestionario) && !"não".equalsIgnoreCase(statusQuestionario)){
                            System.out.println("Erro: Valor inválido, tente novamente");
                            System.out.println("4 - Publicar agora? Sim/Nao");
                        }

                        if (statusQuestionario.equals("sim") || statusQuestionario.equals("SIM")){
                        System.out.println("Seu questionario: " + nomeQuestionario + " foi publicado!");
                        statusQuestionario = "PUBLISHED";
                            System.out.println(statusQuestionario);
                    }

                        if (statusQuestionario.equals("não") || statusQuestionario.equals("NÃO")){
                            System.out.println("Seu questionario: " + nomeQuestionario + " não foi publicado!");
                            statusQuestionario = "DRAFT";
                            System.out.println(statusQuestionario);
                        }

                        System.out.println( nomeQuestionario + " | " +descricaoQuestionario+ " | " + statusQuestionario);


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