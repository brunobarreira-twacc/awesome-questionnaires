# 7 - Gravar questão e opções no arquivo de questionário - CLI

**Eu como:** Usuário do awesome-questionnaires.

**Quero:** Salvar um questionário completo com questões e opções de resposta em um arquivo.

**Para:** Consultas e gerenciamento posterior.

**Descrição técnica:**

O objetivo deste item de trabalho é pegar o conteúdo de um Questionário, Questão e opções de respostas criado na tarefa 6 e persistir em um arquivo sem alterar estrutura de dados ou hierarquias da pergunta.

Após a implementação, rode o programa local, acesso o fluxo de criar questionário, vá até o fim e abra o aquivo, o conteúdo deve seguir a estrutura de campos a seguir:

```json
    "id": "qualquer UUID válido", 
    "title": "qualquer_titulo_valido",
    "description": "qualquer_descricao_valida",
    "status": "PUBLISHED",
    "questions": [{
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
    }]
```

A estrutura acima mostra um Questionário contendo uma Questão com três opções de reposta para essa Questão.

**Modelo de dados:** N/A

**Dependências:** N/A

**Critérios de aceite:**
- Persistência do Questionário conforme exemplo acima, seguindo mesmos campos(ignorar valores nos campos)
- Nome de arquivo de maneira consistente, conforme readme

**Tamanho da tarefa:** 

**Atribuído para:** 