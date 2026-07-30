# 4 - Gravar novo questionário em arquivo JSON - CLI

**Eu como:** Como usuário do Awesome-questionnaires.

**Quero:** Gravar um novo questionário em um arquivo na raiz do projeto.

**Para:** Consultar e gerenciar os questionários mais tarde.

**Descrição técnica:**

O objetivo deste item de trabalho é ao acessar o fluxo de criação de questionário:

- O programa deve chegar na raiz do projeto(fora da pasta src) e verificar se a pasta com o nome questionários existe:
    - se SIM: Crie um novo arquivo json dentro dessa pasta com um objeto({}) vazio por hora.
    - se NÃO: Crie uma nova pasta com o nome - questionarios

O conteúdo dos arquivos JSON devem ser preenchidos logo após o usuário digitar se o questionário será publicado ou não. Ao abrir um arquivo de questionário é esperado encontrar a seguinte estrutura: 

```json
{
    "id": "qualquer UUID válido", 
    "title": "qualquer_titulo_valido",
    "description": "qualquer_descricao_valida",
    "status": "PUBLISHED",
    "questions": []
}
```

Observações:

- O nome dos arquivos de questionário deve seguir o seguinte padrão: timestamp + id do questionario(uuid)
- O campo status pode variar o valor de "PUBLISHED" ou "DRAFT" ou "DISCARDED"
- O campo questions em todo questionário tem o valor de uma lista vazia e não será tratado nesta tarefa

**Modelo de dados:** N/A

**Dependências:** N/A

**Critérios de aceite:**
- Pasta questionários sendo criada apenas uma vez na raiz do projeto
- Arquivo de questionário seguindo:
 - Formato JSON
 - Mesma estrutura apresentada no exemplo da descrição técnica.

**Tamanho da tarefa:** 

**Atribuído para:** 
