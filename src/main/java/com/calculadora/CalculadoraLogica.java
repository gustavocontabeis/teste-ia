package com.calculadora;

/**
 * Lógica de cálculo da calculadora (sem dependência de UI).
 */
public class CalculadoraLogica {

    private double primeiroOperando = 0;
    private double segundoOperando = 0;
    private String operacaoAtual = null;

    public double getPrimeiroOperando() {
        return primeiroOperando;
    }

    public void setPrimeiroOperando(double primeiroOperando) {
        this.primeiroOperando = primeiroOperando;
    }

    public double getSegundoOperando() {
        return segundoOperando;
    }

    public void setSegundoOperando(double segundoOperando) {
        this.segundoOperando = segundoOperando;
    }

    public String getOperacaoAtual() {
        return operacaoAtual;
    }

    public void setOperacaoAtual(String operacaoAtual) {
        this.operacaoAtual = operacaoAtual;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Executa a operação armazenada entre primeiroOperando e segundoOperando.
     * Se nenhuma operação estiver definida, retorna primeiroOperando.
     *
     * @return resultado da operação ou primeiroOperando se não houver operação definida
     * @throws IllegalStateException se a operação armazenada for desconhecida
     */
    public double calcular() {
        if (operacaoAtual == null) {
            return primeiroOperando;
        }
        double resultado;
        switch (operacaoAtual) {
            case "+":
                resultado = somar(primeiroOperando, segundoOperando);
                break;
            case "-":
                resultado = subtrair(primeiroOperando, segundoOperando);
                break;
            case "*":
                resultado = multiplicar(primeiroOperando, segundoOperando);
                break;
            default:
                throw new IllegalStateException("Operação desconhecida: " + operacaoAtual);
        }
        primeiroOperando = resultado;
        operacaoAtual = null;
        return resultado;
    }

    /**
     * Reinicia todos os estados internos.
     */
    public void limpar() {
        primeiroOperando = 0;
        segundoOperando = 0;
        operacaoAtual = null;
    }
}
