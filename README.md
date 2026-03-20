# Calculadora

Aplicação de calculadora desktop com operações aritméticas básicas, desenvolvida em Java com Swing.

## Pré-requisitos

- **JDK 11** ou superior
- **Apache Maven 3.6** ou superior

## Compilar e empacotar

```bash
mvn clean package
```

Isso gera o arquivo `target/calculadora-1.0.jar`.

## Executar

```bash
java -jar target/calculadora-1.0.jar
```

## Funcionalidades

- Operações de adição (`+`), subtração (`-`) e multiplicação (`*`)
- Botão `=` para calcular o resultado
- Botão `Limpar` para resetar a calculadora
- Suporte a operações consecutivas (ex.: `5 + 3 = 8`, depois `* 2 = 16`)
- Display somente leitura (entrada apenas pelos botões)
- Zeros à esquerda não são acumulados no display

## Estrutura do Projeto

```
pom.xml
README.md
src/
└── main/
    └── java/
        └── com/
            └── calculadora/
                ├── Main.java               # Ponto de entrada
                ├── CalculadoraFrame.java   # JFrame principal (600×800)
                ├── CalculadoraPanel.java   # Painel com botões e display
                └── CalculadoraLogica.java  # Lógica de cálculo
```
