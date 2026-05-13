# SDD - Issue #9

```json
{
  "contexto": {
    "titulo": "[US] Calculadora simples em Java Swing",
    "descricao": "Uma calculadora simples com interface gráfica para realizar operações matemáticas básicas."
  },
  "requisitos_funcionais": [
    "Permitir operações de soma, subtração, multiplicação e divisão.",
    "Possuir botões numéricos de 0 a 9.",
    "Exibir resultados em um campo de texto.",
    "Tratar divisão por zero com mensagem de erro."
  ],
  "requisitos_nao_funcionais": [
    "A interface deve ser intuitiva.",
    "A aplicação deve ser responsiva.",
    "Deve ser compatível com sistemas operacionais que suportam Java."
  ],
  "regras_negocio": [
    "As operações só podem ser realizadas se houver números válidos na entrada.",
    "Resultados de operações devem ser sempre exibidos em um formato numérico.",
    "A divisão por zero deve exibir uma mensagem de erro específica ao usuário."
  ],
  "casos_uso": [
    {
      "nome": "Realizar operação de soma",
      "descricao": "Usuário insere dois números e aciona o botão de soma.",
      "fluxo": [
        "Usuário insere primeiro número.",
        "Usuário insere segundo número.",
        "Usuário aciona o botão de soma.",
        "Sistema exibe o resultado da soma."
      ]
    },
    {
      "nome": "Realizar operação de divisão",
      "descricao": "Usuário insere dois números e aciona o botão de divisão.",
      "fluxo": [
        "Usuário insere primeiro número.",
        "Usuário insere segundo número.",
        "Usuário aciona o botão de divisão.",
        "Se o segundo número for zero, exibe mensagem de erro.",
        "Caso contrário, sistema exibe o resultado da divisão."
      ]
    }
  ],
  "criterios_aceite": [
    "A aplicação deve permitir somar, subtrair, multiplicar e dividir.",
    "Devem existir botões numéricos de 0 a 9 visíveis.",
    "O resultado deve ser corretamente exibido em um campo de texto.",
    "Uma mensagem de erro deve ser exibida ao tentar dividir por zero."
  ]
}
```