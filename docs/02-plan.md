# Planejamento Técnico da Calculadora

## Tecnologia

- **Linguagem:** Java (versão 11 ou superior)
- **Framework de UI:** Java Swing
- **Build:** Maven (gera arquivo JAR executável)

## Dimensões da Janela

| Propriedade | Valor   |
|-------------|---------|
| Largura     | 600 px  |
| Altura      | 800 px  |
| Redimensionável | Não |

## Estrutura de Pacotes

```
pom.xml
README.md
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

## Build com Maven

O `pom.xml` deve configurar o plugin `maven-jar-plugin` (ou `maven-assembly-plugin`) para empacotar a aplicação como um JAR executável com o `Main-Class` apontando para `com.calculadora.Main`.

## Execução

```bash
# Empacotar (gera o JAR em target/)
mvn clean package

# Executar
java -jar target/calculadora-1.0.jar
```

