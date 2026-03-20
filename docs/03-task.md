# Tarefas – Desenvolvimento da Calculadora

## Lista de Tarefas

### 1. Configuração do Projeto
- [ ] Criar estrutura de diretórios (`src/main/java/com/calculadora/`)
- [ ] Criar arquivo `pom.xml` com Maven, configurando o `maven-jar-plugin` para gerar um JAR executável
- [ ] Verificar versão do JDK instalada (mínimo Java 11)

### 2. Implementação da Lógica (`CalculadoraLogica.java`)
- [ ] Criar classe `CalculadoraLogica`
- [ ] Implementar atributos: `primeiroOperando`, `segundoOperando`, `operacaoAtual`
- [ ] Implementar método `somar(double a, double b)`
- [ ] Implementar método `subtrair(double a, double b)`
- [ ] Implementar método `multiplicar(double a, double b)`
- [ ] Implementar método `calcular()` – executa a operação armazenada
- [ ] Implementar método `limpar()` – reinicia todos os estados
- [ ] Escrever testes unitários para `CalculadoraLogica`

### 3. Implementação do Painel de Botões (`CalculadoraPanel.java`)
- [ ] Criar classe `CalculadoraPanel` extendendo `JPanel`
- [ ] Adicionar display (`JTextField`) somente leitura no topo
- [ ] Criar `GridLayout` para os botões
- [ ] Adicionar botões numéricos: `0`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`
- [ ] Adicionar botões de operação: `+`, `-`, `*`, `=`
- [ ] Adicionar botão `Limpar`
- [ ] Registrar `ActionListener` em cada botão
- [ ] Aplicar estilização (fontes e cores conforme `02-plan.md`)

### 4. Implementação do Frame Principal (`CalculadoraFrame.java`)
- [ ] Criar classe `CalculadoraFrame` extendendo `JFrame`
- [ ] Definir título da janela: `"Calculadora"`
- [ ] Definir tamanho: `600 × 800 px`
- [ ] Definir operação de fechamento: `EXIT_ON_CLOSE`
- [ ] Centralizar a janela na tela com `setLocationRelativeTo(null)`
- [ ] Adicionar `CalculadoraPanel` ao frame
- [ ] Tornar o frame não redimensionável (`setResizable(false)`)

### 5. Ponto de Entrada (`Main.java`)
- [ ] Criar classe `Main` com método `main`
- [ ] Instanciar e exibir `CalculadoraFrame` dentro de `SwingUtilities.invokeLater`

### 6. Testes e Validação
- [ ] Testar operação de adição
- [ ] Testar operação de subtração
- [ ] Testar operação de multiplicação
- [ ] Testar botão `Limpar`
- [ ] Testar sequência de operações consecutivas
- [ ] Verificar que zeros à esquerda não aparecem no display
- [ ] Verificar centralização e dimensões da janela (600×800)

### 7. Empacotamento e Documentação
- [ ] Gerar arquivo JAR executável com `mvn clean package`
- [ ] Testar execução do JAR com `java -jar target/calculadora-1.0.jar` em ambiente limpo
- [ ] Criar arquivo `README.md` na raiz do projeto com:
  - Descrição do projeto
  - Pré-requisitos (JDK 11+, Maven)
  - Instruções para empacotar (`mvn clean package`)
  - Instruções para executar (`java -jar target/calculadora-1.0.jar`)

## Prioridade

| Tarefa | Prioridade |
|--------|-----------|
| Configuração do Projeto | Alta |
| Lógica da Calculadora   | Alta |
| Painel de Botões        | Alta |
| Frame Principal         | Alta |
| Ponto de Entrada        | Alta |
| Testes e Validação      | Média |
| Empacotamento           | Baixa |
