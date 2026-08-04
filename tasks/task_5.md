# 5 - Fluxo de criação de questões - questão de opção única - CLI

**Eu como:** Usuário do awesome-questionnaires.

**Quero:** Entrar no fluxo de criação de questões.

**Para:** Selecionar a criação de uma questão de opção única.

**Descrição técnica:**

O objetivo deste item de trabalho é criar o fluxo de criação de questões. Para questões de opção única.

Ao executar a criação de um Questionário de publicá-lo, o usuário deve ser redirecionado ao fluxo de criação de Questões:

"1 - Agora, digite o texto que será exibido para a pessoa usuária que vai responder seu questionário. Esse texto deve obrigatoriamente ser uma pergunta."

"2 - Escolha um tipo de questão:
    1 - Opção única, usuário podem selecionar apenas uma opção para essa questão.
    2 - Múltiplas opções, usuário podem selecionar uma ou mais opções para essa questão.
    3 - Condicional, dada uma resposta condicional, questões adicionais aparecem para o usuário responder.
"

Um novo campo será adicionado a entidade Questão, chamado "options".
Este campo é uma lista de opções(não detalhada nesta tarefa) e deve ser vazio nesta tarefa.

Ao final, deverá ser impresso na tela a pergunta com a lista de opções de resposta:

```json
"id": "qualquer_id_valido_para_uma_questao",
"question_type": "SINGLE",
"display_text": "Em quantas linguagens de programação vc já escreveu hello world?",
"options": []
```

**Modelo de dados:** N/A

**Dependências:** N/A

**Critérios de aceite:**
- A questão é impressa no terminal, conforme descrito na tarefa.
- Campo "options" é preenchido como uma lista vazia

**Tamanho da tarefa:** 5

**Atribuído para:** Bruno e Renata