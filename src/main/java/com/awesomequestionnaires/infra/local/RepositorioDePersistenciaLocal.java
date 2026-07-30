package com.awesomequestionnaires.infra.local;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RepositorioDePersistenciaLocal {
    public static String criaArquivoQuestionario() throws IOException {

        String nomePasta = "questionarios";
        Path raiz = Path.of("").toAbsolutePath();
        Path diretorioQuestionarios = raiz.resolve(nomePasta);
        System.out.println(raiz);
        System.out.println(diretorioQuestionarios);
        Files.createDirectory(diretorioQuestionarios);

        return "WIP - criaArquivoQuestionario";
    }
}
