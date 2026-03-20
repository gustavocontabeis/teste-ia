package com.calculadora;

import javax.swing.*;

/**
 * Ponto de entrada da aplicação Calculadora.
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraFrame frame = new CalculadoraFrame();
            frame.setVisible(true);
        });
    }
}
