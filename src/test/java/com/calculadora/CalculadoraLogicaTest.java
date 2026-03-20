package com.calculadora;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraLogicaTest {

    private CalculadoraLogica logica;

    @Before
    public void setUp() {
        logica = new CalculadoraLogica();
    }

    @Test
    public void testSomar() {
        assertEquals(8.0, logica.somar(5, 3), 0.0001);
    }

    @Test
    public void testSubtrair() {
        assertEquals(2.0, logica.subtrair(5, 3), 0.0001);
    }

    @Test
    public void testMultiplicar() {
        assertEquals(15.0, logica.multiplicar(5, 3), 0.0001);
    }

    @Test
    public void testCalcularSoma() {
        logica.setPrimeiroOperando(5);
        logica.setOperacaoAtual("+");
        logica.setSegundoOperando(3);
        assertEquals(8.0, logica.calcular(), 0.0001);
    }

    @Test
    public void testCalcularSubtracao() {
        logica.setPrimeiroOperando(10);
        logica.setOperacaoAtual("-");
        logica.setSegundoOperando(4);
        assertEquals(6.0, logica.calcular(), 0.0001);
    }

    @Test
    public void testCalcularMultiplicacao() {
        logica.setPrimeiroOperando(4);
        logica.setOperacaoAtual("*");
        logica.setSegundoOperando(3);
        assertEquals(12.0, logica.calcular(), 0.0001);
    }

    @Test
    public void testCalcularSemOperacao() {
        logica.setPrimeiroOperando(7);
        assertEquals(7.0, logica.calcular(), 0.0001);
    }

    @Test
    public void testLimpar() {
        logica.setPrimeiroOperando(5);
        logica.setSegundoOperando(3);
        logica.setOperacaoAtual("+");
        logica.limpar();
        assertEquals(0.0, logica.getPrimeiroOperando(), 0.0001);
        assertEquals(0.0, logica.getSegundoOperando(), 0.0001);
        assertNull(logica.getOperacaoAtual());
    }

    @Test
    public void testOperacoesConsecutivas() {
        // 5 + 3 = 8, depois * 2 = 16
        logica.setPrimeiroOperando(5);
        logica.setOperacaoAtual("+");
        logica.setSegundoOperando(3);
        double resultado = logica.calcular();
        assertEquals(8.0, resultado, 0.0001);

        // resultado fica em primeiroOperando após calcular
        logica.setOperacaoAtual("*");
        logica.setSegundoOperando(2);
        resultado = logica.calcular();
        assertEquals(16.0, resultado, 0.0001);
    }
}
