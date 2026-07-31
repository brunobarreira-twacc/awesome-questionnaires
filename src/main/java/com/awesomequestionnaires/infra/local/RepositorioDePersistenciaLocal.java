package com.awesomequestionnaires.infra.local;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

public class RepositorioDePersistenciaLocal {
    public static String criaArquivoQuestionario() throws IOException {

        String nomePasta = "questionarios";
        Path raiz = Path.of("").toAbsolutePath();
        Path diretorioQuestionarios = raiz.resolve(nomePasta);
        // System.out.println(diretorioQuestionarios);
        Files.createDirectories(diretorioQuestionarios);

        String nomeQuestionario = "timestamp_" + UUID.randomUUID() + ".json";
        // System.out.println(nomeQuestionario);
        // Path caminhoArquivoQuestionario = diretorioQuestionarios.resolve(nomeQuestionario);
        // System.out.println(caminhoArquivoQuestionario);
        FileWriter arquivoQuestionario = new FileWriter(nomeQuestionario);
        System.out.println(arquivoQuestionario);

        return "WIP - criaArquivoQuestionario";
    }
}
