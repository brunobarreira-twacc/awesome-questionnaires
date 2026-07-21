# 3 - Menu interno, criar Questionário - CLI

**Eu como:** Como usuário do Awesome-questionnaires.

**Quero:** Navegar do menu principal para o menu interno de criar questionário.

**Para:** Criar um novo questionário.

**Descrição técnica:**

O objetivo deste item de trabalho é permitir que o usuário navegue do menu principal ao menu interno de criar questionários, nesse menu o usuário pode escolher por preencher os campos de um questionário fora de ordem, ou seja, pode começar por escolher se o Questionário deve ser publicado agora e depois dar um nome para o Questionário.

O menu interno deve ser exibido assim:

0 - Criar um novo questionario
    1 - Nome do questionario

    2 - Descrição do questionario

    4 - Publicar agora? Sim/Nao


Deve haver validação se todos os campos foram preenchidos:

Nome do questionário - texto
Descrição do questionário - texto
Publicar agora? Sim/Não - texto

Após preenchimento dos campos, o programa deve imprimir as opções do usuário no terminal.
Por exemplo:

Este é o titulo do questionário | Esta é a descrição do Questionário | Não


**Modelo de dados:** N/A

**Dependências:** N/A

**Critérios de aceite:**
- Menu interno aparecendo conforme descrição

- Impressão do preenchimento do usuário seguindo a ordem:
 - Titulo
 - Descrição
 - Publicado - Sim/Não

**Tamanho da tarefa:**

**Atribuído para:**