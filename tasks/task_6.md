# 6 - Fluxo de criação de questões - opções de uma questão - CLI

**Eu como:** Usuário do awesome-questionnaires.

**Quero:** Entrar no fluxo de criação de questões.

**Para:** Criar opções de resposta para uma questão.

**Descrição técnica:**

O objetivo deste item de trabalho é criar uma lista de opções para uma questão específica. Para esta tarefa a criação das opções de questão ocorrerá no momento da criação da questão(existem outros fluxos que serão tratados posteriormente, por simplicidade, assuma que todas as opções serão criadas neste momento).

Dada esta parte do fluxo:
"2 - Escolha um tipo de questão:
    1 - Opção única, usuário podem selecionar apenas uma opção para essa questão.
    2 - Múltiplas opções, usuário podem selecionar uma ou mais opções para essa questão.
    3 - Condicional, dada uma resposta condicional, questões adicionais aparecem para o usuário responder.
"

O deve usuário seleciona esta opção(sim, ele pode selecionar outras opções, mas assuma essa opção para essa tarefa):
"
    1 - Opção única, usuário podem selecionar apenas uma opção para essa questão.
"

A seguinte sequência de mensagens deve ser mostrada ao usuário:

"Entre a opção com um texto:"

Após preenchimento:

"Qual a ordem de exibição desta opção? Utilize um número inteiro:"

Após preenchimento:

"
Selecione a próxima ação:
1 - Adicionar outra opção de resposta
2 - Revisar o questionário completo
"

As opções devem ser uma lista, enquanto o usuário quiser entrar opções elas devem ser armazenadas, sua ordem não importa no armazenamento, pois frontenders vão utilizar o valor de display order para mostrar em sequência.

Ao final, deverá ser impresso na tela a pergunta com a lista de opções de resposta:

```json
"id": "qualquer_id_valido_para_uma_questao",
"question_type": "SINGLE",
"display_text": "Em quantas linguagens de programação vc já escreveu hello world?",
"options": [
    {
        "option_text": "Java",
        "display_order": 3
    },
    {
        "option_text": "Rust",
        "display_order": 1
    },
    {
        "option_text": "C#",
        "display_order": 2
    }
]
```

**Modelo de dados:** N/A

**Dependências:** N/A

**Critérios de aceite:**
- Sequência/Fluxo sendo mostrado corretamente em tela
- Lista de opções de resposta sendo armazenada corretamente
- Impressão da pergunta e da lista de opções aparecendo corretamente.

**Tamanho da tarefa:** 

**Atribuído para:** 