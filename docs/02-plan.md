# Planejamento Técnico da Calculadora

## Tecnologia

- **Linguagem:** Java (versão 11 ou superior)
- **Framework de UI:** Java Swing

## Dimensões da Janela

| Propriedade | Valor   |
|-------------|---------|
| Largura     | 600 px  |
| Altura      | 800 px  |
| Redimensionável | Não |

## Estrutura de Pacotes

```
src/
└── main/
    └── java/
        └── com/
            └── calculadora/
                ├── Main.java          # Ponto de entrada da aplicação
                ├── CalculadoraFrame.java  # JFrame principal (600×800)
                ├── CalculadoraPanel.java  # Painel com botões e display
                └── CalculadoraLogica.java # Lógica de cálculo (sem dependência de UI)
```

## Layout

- Utilizar `BorderLayout` no `JFrame`.
- Display (`JTextField`) posicionado no topo (`BorderLayout.NORTH`).
- Grade de botões (`JPanel` com `GridLayout`) posicionada no centro (`BorderLayout.CENTER`).
- Sugestão de grade: 4 linhas × 4 colunas para acomodar os 11 dígitos (0–10), operadores (+, -, *, =) e o botão **Limpar** (16 botões no total).

## Componentes Swing Utilizados

| Componente       | Finalidade                          |
|------------------|-------------------------------------|
| `JFrame`         | Janela principal (600×800)          |
| `JTextField`     | Display da calculadora (somente leitura) |
| `JButton`        | Cada botão numérico e de operação   |
| `JPanel`         | Container para a grade de botões    |
| `GridLayout`     | Organização dos botões em grade     |
| `BorderLayout`   | Layout geral do frame               |

## Requisitos Não-Funcionais

- A janela deve ser centralizada na tela ao ser aberta.
- Fonte dos botões: `Arial`, tamanho 18, negrito.
- Fonte do display: `Arial`, tamanho 24.
- Cor de fundo dos botões numéricos: cinza claro (`#D3D3D3`).
- Cor de fundo dos botões de operação: laranja claro (`#FFA500`).
- Cor de fundo do botão **Limpar**: vermelho claro (`#FF6347`).

## Execução

```bash
# Compilar
javac -d out src/main/java/com/calculadora/*.java

# Executar
java -cp out com.calculadora.Main
```
