package com.awesomequestionnaires.infra.local;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

public class RepositorioDePersistenciaLocal {
    public static void criarDiretorioArquivoQuestionario() throws IOException {
        String nomePasta = "questionarios";
        Path diretorioQuestionario = RepositorioDePersistenciaLocal.criaDiretorioQuestionario(nomePasta);
        long timestamp = System.currentTimeMillis();
        String nomeQuestionario = timestamp + "_" + UUID.randomUUID() + ".json";
        RepositorioDePersistenciaLocal.criaArquivoQuestionario(diretorioQuestionario, nomeQuestionario);
    }

    private static Path criaDiretorioQuestionario(String nomeDiretorio) throws IOException {
        Path raiz = Path.of("").toAbsolutePath();
        Path diretorioQuestionarios = raiz.resolve(nomeDiretorio);
        Files.createDirectories(diretorioQuestionarios);
        return diretorioQuestionarios;
    }

    private static void criaArquivoQuestionario(Path caminhoDiretorioQuestionarios, String nomeArquivoQuestionarios) throws IOException {
        Path caminhoArquivoQuestionario = caminhoDiretorioQuestionarios.resolve(nomeArquivoQuestionarios);
        FileWriter arquivoQuestionario = new FileWriter(caminhoArquivoQuestionario.toString());
        arquivoQuestionario.write("{}");
        arquivoQuestionario.close();
    }
}
