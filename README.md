# QUESTIONARIOS INCRIVEIS

## Descricao:

Crie e gerencie questionarios incriveis. Questionarios sao grupos de perguntas e tambem perguntas adicionais(se voce quiser). Voce tambem pode gerenciar os questionarios diretamente por este app, torna-los ativos, desativar e edita-los. Tambem escolha entre diferentes tipos de perguntas ao criar um questionario.

## Stack Tecnologica:

- Java 21
- Gradle

## CLI

Quando usuarios entram no programa:

====================================
Saudacao do Questionarios Incriveis.
====================================

Digite 0 para criar um novo questionario
Digite 1 para gerenciar questionarios
Digite 2 para responder questionarios
Digite 3 para sair

Por favor, digite sua opcao 

---

0 - Criar um novo questionario

**Ha uma acao de I/O aqui, certo? Um arquivo deve ser criado para este questionario.**

    1 - Nome do questionario
    2 - Descricao do questionario
    3 - Adicionar perguntas
    4 - Publicar agora? Sim/Nao

---

1 - Gerenciar questionarios

Digite 1 para gerenciar questionarios em rascunho
 - [Titulo do questionario A]
 - [Titulo do questionario B]
 - [Titulo do questionario C]

Digite pelo menos tres caracteres do titulo do questionario aqui: 

    - [Titulo do questionario A]
        1 - Editar titulo
        2 - Editar descricao
        3 - Adicionar pergunta
        4 - Editar pergunta
        5 - Publicar questionario
        6 - Descartar questionario
        7 - Voltar

Digite 2 para gerenciar questionarios publicados
 - [Titulo do questionario A]
 - [Titulo do questionario B]
 - [Titulo do questionario C]

Digite pelo menos tres caracteres do titulo do questionario aqui: 

---

2 - Responder questionarios

Otimo, aqui estao os seguintes questionarios disponiveis que voce pode responder:

 - [Titulo do questionario A]
 - [Titulo do questionario B]
 - [Titulo do questionario C]

Nao encontrou o questionario que voce esta procurando? Contate o admin.

Digite pelo menos tres caracteres do titulo do questionario aqui: 

---

3 - Sair

========================================
Obrigado por usar Questionarios Incriveis!
========================================


## Modelagem de dados

### Questionario

Questionarios serao persistidos em arquivos com a seguinte regra de nome: questionnaire_<id do questionario>.json

- ID = Identificador unico de um questionario
- TITLE = Todo questionario deve ter um titulo
- DESCRIPTION = Todo questionario deve ter uma descricao de sua intencao
- STATUS =
    - DRAFT = Ainda nao publicado
    - PUBLISHED = Visivel para todos os usuarios
    - DISCARDED = Nao pode ser publicado, mas foi um RASCUNHO em algum momento
- ACTIVE = 
    TRUE = Este questionario esta ativo e pode ser exibido para usuarios
    FALSE = Este questionario esta deletado e nao pode ser exibido para usuarios
- QUESTIONS = Um grupo de perguntas

### Pergunta

Perguntas podem ser de diferentes tipos, por enquanto Questionarios Incriveis suporta os seguintes tipos de pergunta:

- Resposta de opcao unica
- Resposta de multiplas opcoes

Perguntas podem conter perguntas adicionais, sem limite para perguntas adicionais

- ID = Identificador unico de uma pergunta
- DISPLAY_ORDER = Perguntas devem ser colocadas em ordem de exibicao, este campo evidencia em qual ordem cada pergunta e exibida para o usuario como 1, 2, 3 e assim por diante...
- TYPE:
    - SINGLE RESPONSE - Usuario deve selecionar uma resposta e enviar
    - MULTIPLE RESPONSE - Usuario deve selecionar uma ou mais respostas e enviar
- STATUS =
    - DRAFT = Ainda nao publicado
    - PUBLISHED = Visivel para todos os usuarios
    - DISCARDED = Nao pode ser publicado, mas foi um RASCUNHO em algum momento
- ACTIVE = 
    TRUE = Este questionario esta ativo e pode ser exibido para usuarios
    FALSE = Este questionario esta deletado e nao pode ser exibido para usuarios
- DISPLAY_TEXT = Texto com a propria pergunta
- OPTIONS = Uma ou mais opcoes para esta pergunta

### Opcao da pergunta

- ID = Identificador unico para uma opcao de pergunta
- OPTION DISPLAY TEXT = Texto que o usuario lera na tela para esta opcao de pergunta
- CORRECT OPTION = 
    TRUE = Quando esta e a opcao correta para esta pergunta
    FALSE = Quando esta nao e a opcao correta para esta pergunta

### Resposta do questionario

Respostas do questionario serao salvas em um arquivo

Estrutura do nome do arquivo = timestamp + id do questionario

- ID = Identificador unico do ID da resposta
- QUESTIONNAIER ID = Identificador unico para resposta do questionario
- ANSWERS = Para perguntas que o usuario esta respondendo neste questionario
    - QUESTION ID = Id da pergunta que o usuario esta respondendo
    - SELECTED OPTION IDS = Uma ou mais opcoes que o usuario selecionou

## Estrutura de pastas para Questionarios e Perguntas:
```bash
/awesome-questionnaires
    /questionnaires
        questionnaire_101.json
        questionnaire_102.json

    /responses
        response_20260424_101.json
        response_20260424_102.json
```
