package com.calculadora;

import javax.swing.*;

/**
 * Frame principal da calculadora (600×800 px).
 */
public class CalculadoraFrame extends JFrame {

    public CalculadoraFrame() {
        setTitle("Calculadora");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        add(new CalculadoraPanel());
    }
}
