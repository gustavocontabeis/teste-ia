package com.calculadora;

import javax.swing.*;
import java.awt.*;

/**
 * Painel principal da calculadora contendo o display e os botões.
 */
public class CalculadoraPanel extends JPanel {

    private final JTextField display;
    private final CalculadoraLogica logica;
    private boolean aguardandoSegundoOperando = false;

    private static final Color COR_BOTAO_NUMERICO = new Color(0xD3D3D3);
    private static final Color COR_BOTAO_OPERACAO = new Color(0xFFA500);
    private static final Color COR_BOTAO_LIMPAR = new Color(0xFF6347);
    private static final Font FONTE_BOTAO = new Font("Arial", Font.BOLD, 18);
    private static final Font FONTE_DISPLAY = new Font("Arial", Font.PLAIN, 24);

    public CalculadoraPanel() {
        this.logica = new CalculadoraLogica();
        this.display = criarDisplay();

        setLayout(new BorderLayout(5, 5));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(display, BorderLayout.NORTH);
        add(criarPainelBotoes(), BorderLayout.CENTER);
    }

    private JTextField criarDisplay() {
        JTextField campo = new JTextField("0");
        campo.setEditable(false);
        campo.setHorizontalAlignment(JTextField.RIGHT);
        campo.setFont(FONTE_DISPLAY);
        campo.setPreferredSize(new Dimension(0, 60));
        return campo;
    }

    private JPanel criarPainelBotoes() {
        JPanel painel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] rotulos = {
            "7",  "8",  "9",  "+",
            "4",  "5",  "6",  "-",
            "1",  "2",  "3",  "*",
            "10", "0",  "=",  "Limpar"
        };

        for (String rotulo : rotulos) {
            painel.add(criarBotao(rotulo));
        }

        return painel;
    }

    private JButton criarBotao(String rotulo) {
        JButton botao = new JButton(rotulo);
        botao.setFont(FONTE_BOTAO);
        botao.setFocusPainted(false);

        switch (rotulo) {
            case "+":
            case "-":
            case "*":
                botao.setBackground(COR_BOTAO_OPERACAO);
                break;
            case "Limpar":
                botao.setBackground(COR_BOTAO_LIMPAR);
                break;
            default:
                botao.setBackground(COR_BOTAO_NUMERICO);
        }

        botao.addActionListener(e -> processarEntrada(rotulo));
        return botao;
    }

    private void processarEntrada(String entrada) {
        switch (entrada) {
            case "+":
            case "-":
            case "*":
                processarOperacao(entrada);
                break;
            case "=":
                processarIgual();
                break;
            case "Limpar":
                processarLimpar();
                break;
            default:
                processarDigito(entrada);
        }
    }

    private void processarDigito(String digito) {
        if (aguardandoSegundoOperando) {
            display.setText(digito);
            aguardandoSegundoOperando = false;
        } else {
            String atual = display.getText();
            if ("0".equals(atual)) {
                display.setText(digito);
            } else {
                display.setText(atual + digito);
            }
        }
    }

    private void processarOperacao(String operacao) {
        double valorAtual = Double.parseDouble(display.getText());
        if (logica.getOperacaoAtual() != null && !aguardandoSegundoOperando) {
            logica.setSegundoOperando(valorAtual);
            double resultado = logica.calcular();
            display.setText(formatarResultado(resultado));
            logica.setPrimeiroOperando(resultado);
        } else {
            logica.setPrimeiroOperando(valorAtual);
        }
        logica.setOperacaoAtual(operacao);
        aguardandoSegundoOperando = true;
    }

    private void processarIgual() {
        if (logica.getOperacaoAtual() == null) {
            return;
        }
        double valorAtual = Double.parseDouble(display.getText());
        logica.setSegundoOperando(valorAtual);
        double resultado = logica.calcular();
        display.setText(formatarResultado(resultado));
        aguardandoSegundoOperando = true;
    }

    private void processarLimpar() {
        logica.limpar();
        display.setText("0");
        aguardandoSegundoOperando = false;
    }

    private String formatarResultado(double valor) {
        if (valor == Math.floor(valor) && !Double.isInfinite(valor)) {
            return String.valueOf((long) valor);
        }
        return String.valueOf(valor);
    }
}
