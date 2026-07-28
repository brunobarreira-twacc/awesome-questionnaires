# 3 - Menu interno, criar Questionário - CLI - COMMAND LINE INTERFACE

**Eu como:** Como usuário do Awesome-questionnaires.

**Quero:** Navegar do menu principal para o fluxo de criar questionário.

**Para:** Criar um novo questionário.

**Descrição técnica:**

O objetivo deste item de trabalho é permitir que o usuário navegue do menu principal fluxo de criação de questionários, nesse fluxo o usuário preenche a sequência inicial de Nome, Descrição e escolhe se o questionári o será publicado sim ou não.

Após selecionar o item 0(zero) do menu principal, a seguinte sequência aparece ao usuário:

0 - Criar um novo questionario
    1 - Nome do questionario
    (recebe o input do usuário, retorna erro se o input for vazio)

    2 - Descrição do questionario
    (recebe o input do usuário, retorna erro se o input for vazio)

    4 - Publicar agora? Sim/Nao
    (recebe o input do usuário, retorna erro se o input for vazio)

Após preenchimento dos campos, o programa deve imprimir as opções do usuário no terminal.

Por exemplo:
Nome                                Descricao                           publicado?
Este é o titulo do questionário | Esta é a descrição do Questionário | Não


Deve haver validação se todos os campos foram preenchidos:

Nome do questionário - texto, min 5 caracteres - max 250 caracteres;
Descrição do questionário - texto, min 25 caracteres - max 900 caracteres;
Publicar agora? Sim/Não - texto, os valore devem ser estritamente SIM ou NÃO em letras maiusculas/minusculas
    - Quando o valor do campo publicar é igual a sim/SIM então o valor final do campo publicar no questionário deve ser PUBLISHED.
    - Quando o valor do campo publicar é igual a não/NÃO então o valor final do campo publicar no questionário deve ser DRAFT.
    - Quando o usuário digitar qualquer valor diferente de sim ou não, um erro é retornado com a mensagem - Valor inválido, tente novamente - E o passo "4 - Publicar agora? Sim/Nao" deve ser reimpresso na tela. 

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

**Comentários/pensamentos/consideracoes da tarefa**:

- Usar POO para imprimir o menu de questionários
- DTO - Data transfer object, túnel então ele transporta os dados que o usuário final colocou na interface/tela do programa para controller

- DAO - Data access object  