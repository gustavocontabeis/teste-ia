# SDD - Issue #5

```json
{
  "contexto": {
    "titulo": "docs: add README.md requirement, Maven build, and JAR packaging to specs",
    "descricao": "Atualizações nas especificações exigindo Maven como ferramenta de build, gerando um JAR executável e obrigando a inclusão de um README.md com instruções de execução do projeto."
  },
  "requisitos_funcionais": [
    "O projeto deve incluir um arquivo README.md com instruções e pré-requisitos.",
    "O projeto deve ser construído utilizando Maven, gerando um JAR executável.",
    "A estrutura do projeto deve incluir um arquivo pom.xml na raiz."
  ],
  "requisitos_nao_funcionais": [
    "O JAR gerado deve ser executável e contível de fácil uso.",
    "As instruções no README.md devem ser claras e acessíveis."
  ],
  "regras_negocio": [
    "O projeto deve seguir a estrutura padrão exigida pelo Maven.",
    "A geração do JAR deve utilizar a configuração do maven-jar-plugin com o Main-Class definido."
  ],
  "casos_uso": [
    {
      "id": 1,
      "descricao": "Construir o projeto usando Maven",
      "atuadores": [
        "Desenvolvedor"
      ],
      "passos": [
        "Navegar até o diretório raiz do projeto.",
        "Executar o comando `mvn clean package`.",
        "Executar o JAR gerado com `java -jar target/calculadora-1.0.jar`."
      ]
    },
    {
      "id": 2,
      "descricao": "Visualizar instruções do projeto",
      "atuadores": [
        "Usuário",
        "Desenvolvedor"
      ],
      "passos": [
        "Abrir o arquivo README.md.",
        "Seguir as instruções fornecidas para executar o projeto."
      ]
    }
  ],
  "criterios_aceite": [
    "Arquivo README.md incluído e contém todas as instruções exigidas.",
    "Estrutura do projeto conforme especificado, incluindo pom.xml na raiz.",
    "O JAR deve ser gerado corretamente e ser executável sem erros."
  ]
}
```