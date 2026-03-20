# Especificação da Calculadora

## Visão Geral

Aplicação de calculadora desktop com as operações aritméticas básicas.

## Interface

### Display

- Campo de texto na parte superior da tela para exibir os números digitados e o resultado das operações.
- O display deve ser somente leitura para o usuário (entrada apenas pelos botões).

### Botões Numéricos

| Botão | Valor |
|-------|-------|
| `0`   | 0     |
| `1`   | 1     |
| `2`   | 2     |
| `3`   | 3     |
| `4`   | 4     |
| `5`   | 5     |
| `6`   | 6     |
| `7`   | 7     |
| `8`   | 8     |
| `9`   | 9     |
| `10`  | 10    |

### Botões de Operação

| Botão     | Função                                      |
|-----------|---------------------------------------------|
| `+`       | Adição                                      |
| `-`       | Subtração                                   |
| `*`       | Multiplicação                               |
| `=`       | Calcular e exibir o resultado               |
| `Limpar`  | Limpar o display e resetar o estado interno |

## Comportamento Esperado

1. Ao pressionar um botão numérico, o número correspondente é concatenado ao display.
2. Ao pressionar um botão de operação (`+`, `-`, `*`), o número atual é armazenado como primeiro operando e a operação selecionada é registrada.
3. Ao pressionar `=`, a operação selecionada é aplicada entre o primeiro e o segundo operando, e o resultado é exibido.
4. Ao pressionar `Limpar`, o display é zerado e todos os estados internos (operandos e operação) são reiniciados.
5. Operações consecutivas devem ser suportadas (ex.: `5 + 3 = 8`, depois `* 2 = 16`).

## Regras de Negócio

- Divisão por zero deve exibir a mensagem `"Erro: divisão por zero"` (caso a divisão seja implementada futuramente).
- O display não deve permitir que zeros à esquerda sejam acumulados (ex.: `007` deve ser exibido como `7`).
- Números decimais podem ser suportados na versão futura.
