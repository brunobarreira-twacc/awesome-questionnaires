package com.awesomequestionnaires;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.awesomequestionnaires.domain.Question;
import com.awesomequestionnaires.domain.QuestionTypeOptions;
import com.awesomequestionnaires.domain.Questionnaire;
import com.awesomequestionnaires.domain.QuestionnaireStatus;
import com.awesomequestionnaires.infra.local.RepositorioDePersistenciaLocal;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean loopingMenu = true;

       try {
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
                        Path arquivoquestionario = RepositorioDePersistenciaLocal.criarDiretorioArquivoQuestionario();

                        Questionnaire novoQuestionario = new Questionnaire();
                        loopingMenu = false;
                        
                        System.out.println("1 - Digite o nome do questionario:");
                        String nomeQuestionario = sc.nextLine();
                        novoQuestionario.setNomeQuestionario(nomeQuestionario);

                        System.out.println("2 - Descrição do questionario:");
                        String descricaoQuestionario = sc.nextLine();
                        novoQuestionario.setDescricaoQuestionario(descricaoQuestionario);

                        Boolean preencherStatus = true;
                        while (preencherStatus) {
                            System.out.println("4 - Publicar agora? Sim/Nao");
                            String statusQuestionario = sc.nextLine();
                            preencherStatusQuestionario(statusQuestionario, novoQuestionario);
                            if(novoQuestionario.getStatusQuestionario() != null) {
                                preencherStatus = false;
                            }
                        }

                        System.out.println( novoQuestionario.getNomeQuestionario() + " | " + novoQuestionario.getDescricaoQuestionario() + " | " + novoQuestionario.getStatusQuestionario() + " | " + novoQuestionario.getId() + " | " + novoQuestionario.getQuestions());
                        ObjectMapper mapper = new ObjectMapper();
                        mapper.writeValue(arquivoquestionario.toFile(), novoQuestionario);

                        System.out.println("Questionário criado com sucesso, agora vamos criar uma pergunta.\n1 - Digite o texto que será exibido para a pessoa usuária que vai responder seu questionário. Esse texto deve obrigatoriamente ser uma pergunta:");
                        String questionDisplayText = sc.nextLine();

                        Question novaQuestao = new Question();
                        novaQuestao.setDisplayText(questionDisplayText);

                        System.out.println("\n\n2 - Escolha um tipo de questão:\n" + //
                        "   1 - Opção única, usuário podem selecionar apenas uma opção para essa questão.\n" + //
                        "   2 - Múltiplas opções, usuário podem selecionar uma ou mais opções para essa questão.\n" + //
                        "   3 - Condicional, dada uma resposta condicional, questões adicionais aparecem para o usuário responder.");

                        String questionType = sc.nextLine();
                        preencherQuestionType(questionType, novaQuestao);

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
       } catch (Exception e) {
            throw e;
       }
    }

    private static Boolean validarInputStatusQuestionario(String statusQuestionario) {
        if (!"sim".equalsIgnoreCase(statusQuestionario) && !"não".equalsIgnoreCase(statusQuestionario)){
            return false;
        }
        return true;
    }

    private static void preencherStatusQuestionario(String inputUsuario, Questionnaire questionnaire) {
        Boolean inputValido = validarInputStatusQuestionario(inputUsuario);
        if(inputValido) {
            if (inputUsuario.equals("sim") || inputUsuario.equals("SIM")){
                questionnaire.setStatusQuestionario(QuestionnaireStatus.PUBLISHED);
            }

            if (inputUsuario.equals("não") || inputUsuario.equals("NÃO")){
                questionnaire.setStatusQuestionario(QuestionnaireStatus.DRAFT);
            }
        } else {
            System.out.println("Erro: Input inválido, por favor, digite Sim ou Não");
        }
    }

    private static void preencherQuestionType(String questionType, Question novaQuestao) {
        if("1".equals(questionType)) {
            novaQuestao.setQuestionType(QuestionTypeOptions.SINGLE_OPTION);
            return;
        }
        System.out.println("Erro: opcao não implementada. Rode o programa novamente");
    }
}